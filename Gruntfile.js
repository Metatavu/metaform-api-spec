/*global module:false*/

const _ = require('lodash');
const fs = require('fs');
const path = require('path');

module.exports = function(grunt) {
  require('load-grunt-tasks')(grunt);
  
  const SWAGGER_SRC = "https://oss.sonatype.org/content/repositories/snapshots/io/swagger/swagger-codegen-cli/3.0.0-SNAPSHOT/swagger-codegen-cli-3.0.0-20180112.231857-20.jar";
  const PHP_CLIENT_VERSION = "0.1.0";
 
  grunt.initConfig({
    'curl': {
      'swagger-codegen':  {
        src: SWAGGER_SRC,
        dest: 'swagger-codegen-cli.jar'
      }
    },
    'clean': {
      'jaxrs-spec-cruft': [
        'jaxrs-spec-generated/src/main/java/fi/metatavu/metaform/server/RestApplication.java'
      ],
      'jaxrs-spec-sources': ['jaxrs-spec-generated/src'],
      'java-sources': ['java-generated/src']
    },
    'shell': {
      'jaxrs-spec-generate': {
        command : 'mv jaxrs-spec-generated/pom.xml jaxrs-spec-generated/pom.xml.before && ' +
          'java -jar swagger-codegen-cli.jar generate ' +
          '-i ./swagger.yaml ' +
          '-l jaxrs-spec ' +
          '--api-package fi.metatavu.metaform.server.rest ' +
          '--model-package fi.metatavu.metaform.server.rest.model ' +
          '--group-id fi.metatavu.metaform ' +
          '--artifact-id metaform-api-spec ' +
          '--artifact-version `cat jaxrs-spec-generated/pom.xml.before|grep version -m 1|sed -e \'s/.*<version>//\'|sed -e \'s/<.*//\'` ' +
          '--template-dir jaxrs-spec-templates ' +
          '--additional-properties dateLibrary=java8,useBeanValidation=true,sourceFolder=src/main/java,interfaceOnly=true ' +
          '-o jaxrs-spec-generated/'
      },
      'jaxrs-spec-install': {
        command : 'mvn install',
        options: {
          execOptions: {
            cwd: 'jaxrs-spec-generated'
          }
        }
      },
      'jaxrs-spec-release': {
        command : 'git add src pom.xml swagger.json && git commit -m "Generated source" && git push && mvn -B release:clean release:prepare release:perform',
        options: {
          execOptions: {
            cwd: 'jaxrs-spec-generated'
          }
        }
      },

      'java-generate': {
        command : 'mv java-generated/pom.xml java-generated/pom.xml.before && ' +
          'java -jar swagger-codegen-cli.jar generate ' +
          '-i ./swagger.yaml ' +
          '-l java ' +
          '--api-package fi.metatavu.metaform.client ' +
          '--model-package fi.metatavu.metaform.client ' +
          '--group-id fi.metatavu.metaform ' +
          '--artifact-id metaform-api-client ' +
          '--artifact-version `cat java-generated/pom.xml.before|grep version -m 1|sed -e \'s/.*<version>//\'|sed -e \'s/<.*//\'` ' +
          '--template-dir java-templates ' +
          '--additional-properties library=feign,dateLibrary=java8,sourceFolder=src/main/java ' +
          '-o java-generated/'
      },
      'java-install': {
        command : 'mvn install',
        options: {
          execOptions: {
            cwd: 'java-generated'
          }
        }
      },
      'java-release': {
        command : 'git add src pom.xml && git commit -m "Generated source" && git push && mvn -B release:clean release:prepare release:perform',
        options: {
          execOptions: {
            cwd: 'java-generated'
          }
        }
      },

      'php-client-generate': {
        command : 'java -jar swagger-codegen-cli.jar generate ' +
          '-i ./swagger.yaml ' +
          '-l php ' +
          '--template-dir php-templates ' +
          '-o php-generated ' +
          '--additional-properties packagePath=metaform-api-client-php,composerVendorName=metatavu,composerProjectName=metaform-api-client-php,variableNamingConvention=camelCase,invokerPackage=Metatavu\\\\Metaform,apiPackage=Api,modelPackage=Api\\\\Model,artifactVersion=' + PHP_CLIENT_VERSION
      },
      'php-client-publish': {
        command : 'sh git_push.sh',
        options: {
          execOptions: {
            cwd: 'php-generated/metaform-api-client-php'
          }
        }
      },

      'javascript-generate': {
        command : 'java -jar swagger-codegen-cli.jar generate ' +
          '-i ./swagger.yaml ' +
          '-l javascript ' +
          '--template-dir javascript-templates ' +
          '-o javascript-generated/ ' +
          '--additional-properties useES6=false,usePromises=true,projectName=metaform-api-client,projectVersion='  + require('./javascript-generated/package.json').version
      },
      'javascript-bump-version': {
        command: 'npm version patch',
        options: {
          execOptions: {
            cwd: 'javascript-generated'
          }
        }
      },
      'javascript-push': {
        command : 'git add . && git commit -m "Generated javascript source" ; git push',
        options: {
          execOptions: {
            cwd: 'javascript-generated'
          }
        }
      },
      'javascript-publish': {
        command : 'npm publish',
        options: {
          execOptions: {
            cwd: 'javascript-generated'
          }
        }
      }
    }
  });
  
  grunt.registerTask('download-dependencies', 'if-missing:curl:swagger-codegen');
  grunt.registerTask('jaxrs-gen', [ 'download-dependencies', 'clean:jaxrs-spec-sources', 'shell:jaxrs-spec-generate', 'clean:jaxrs-spec-cruft', 'shell:jaxrs-spec-install' ]);
  grunt.registerTask('jaxrs-spec', [ 'jaxrs-gen', 'shell:jaxrs-spec-release' ]);
  grunt.registerTask('java-gen', [ 'download-dependencies', 'clean:java-sources', 'shell:java-generate', 'shell:java-install' ]);
  grunt.registerTask('java', [ 'java-gen', 'shell:java-release' ]);
  grunt.registerTask('php-gen', [ "shell:php-client-generate" ]);
  grunt.registerTask('php', [ "php-gen", "shell:php-client-publish" ]);

  grunt.registerTask('javascript-gen', [ "shell:javascript-generate" ]);
  grunt.registerTask('javascript', [ "javascript-gen", "shell:javascript-bump-version", "shell:javascript-push", "shell:javascript-publish" ]);

  grunt.registerTask('default', [ "jaxrs-spec", "java", "php", "javascript" ]);

};
