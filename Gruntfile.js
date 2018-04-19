/*global module:false*/

const _ = require('lodash');
const fs = require('fs');
const path = require('path');

module.exports = function(grunt) {
  require('load-grunt-tasks')(grunt);
  
  const SWAGGER_SRC = "https://oss.sonatype.org/content/repositories/snapshots/io/swagger/swagger-codegen-cli/3.0.0-SNAPSHOT/swagger-codegen-cli-3.0.0-20180112.231857-20.jar";
 
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
          '--artifact-id metaform-spec ' +
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
      }
    }
  });
  
  grunt.registerTask('download-dependencies', 'if-missing:curl:swagger-codegen');
  grunt.registerTask('jaxrs-gen', [ 'download-dependencies', 'clean:jaxrs-spec-sources', 'shell:jaxrs-spec-generate', 'clean:jaxrs-spec-cruft', 'shell:jaxrs-spec-install' ]);
  grunt.registerTask('jaxrs-spec', [ 'jaxrs-gen', 'shell:jaxrs-spec-release' ]);
  
};