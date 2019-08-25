/*global module:false*/

const _ = require('lodash');
const fs = require('fs');

module.exports = function(grunt) {
  require('load-grunt-tasks')(grunt);
  
  const SWAGGER_VERSION = "3.0.4";
  const SWAGGER_JAR = `swagger-codegen-cli-${SWAGGER_VERSION}.jar`;
  const SWAGGER_URL = `https://search.maven.org/remotecontent?filepath=io/swagger/codegen/v3/swagger-codegen-cli/${SWAGGER_VERSION}/${SWAGGER_JAR}`;
  const TYPESCRIPT_CLIENT_PACKAGE = "metaform-api-client";
  const TYPESCRIPT_CLIENT_VERSION = require("./typescript-client-generated/package.json").version;
  
  grunt.registerMultiTask('typescript-client-reply-post-process', 'Post process typescript client reply', function () {
    const file = `${this.data.folder}/model/replyData.ts`;
    const contents = fs.readFileSync(file, "utf8");
    fs.writeFileSync(file, contents.replace(/Map/g, 'any'));
  });

  grunt.initConfig({
    "curl": {
      "swagger-codegen":  {
        src: SWAGGER_URL,
        dest: SWAGGER_JAR
      }
    },
    "clean": {
      "typescript-client": [
        "typescript-client-generated/typings.json",
        "typescript-client-generated/api.module.ts",
        "typescript-client-generated/variables.ts",
        "typescript-client-generated/encoder.ts",
        "typescript-client-generated/configuration.ts"
      ]
    },
    "typescript-api-post-process": {
      "api": {
        "folder": "typescript-model-generated"
      }
    },
    "typescript-client-reply-post-process": {
      "process": {
        "folder": "typescript-client-generated"
      }
    },
    "shell": {
      "typescript-client-generate": {
        command : `java -jar ${SWAGGER_JAR} generate ` +
          "-i ./swagger.yaml " +
          "-l typescript-angular " +
          "-t typescript-client-template/ " +
          "-o typescript-client-generated/ " +
          "--template-engine mustache " +
          `--additional-properties projectName=${TYPESCRIPT_CLIENT_PACKAGE},npmName=${TYPESCRIPT_CLIENT_PACKAGE},npmVersion=${TYPESCRIPT_CLIENT_VERSION}`
      },
      'typescript-client-bump-version': {
        command: 'npm version patch',
        options: {
          execOptions: {
            cwd: 'typescript-client-generated'
          }
        }
      },
      'typescript-client-push': {
        command : 'git add . && git commit -m "Generated javascript source" && git push',
        options: {
          execOptions: {
            cwd: 'typescript-client-generated'
          }
        }
      },
      "typescript-client-publish": {
        command : 'npm install && npm run build && npm publish',
        options: {
          execOptions: {
            cwd: 'typescript-client-generated'
          }
        }
      },
    }
  });

  grunt.registerTask('download-dependencies', 'if-missing:curl:swagger-codegen');
  grunt.registerTask('typescript-client-gen', [ 'download-dependencies', 'shell:typescript-client-generate', 'typescript-client-reply-post-process:process', 'clean:typescript-client']);
  grunt.registerTask('typescript-client', [ 'typescript-client-gen', "shell:typescript-client-bump-version", "shell:typescript-client-push", "shell:typescript-client-publish" ]);
  
};