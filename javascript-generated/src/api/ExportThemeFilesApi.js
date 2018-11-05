/**
 * Metaform REST API
 * REST API for Metaform
 *
 * OpenAPI spec version: 0.0.1
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.0-SNAPSHOT
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/BadRequest', 'model/ExportThemeFile', 'model/Forbidden', 'model/InternalServerError', 'model/NotFound'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/BadRequest'), require('../model/ExportThemeFile'), require('../model/Forbidden'), require('../model/InternalServerError'), require('../model/NotFound'));
  } else {
    // Browser globals (root is window)
    if (!root.MetaformApiClient) {
      root.MetaformApiClient = {};
    }
    root.MetaformApiClient.ExportThemeFilesApi = factory(root.MetaformApiClient.ApiClient, root.MetaformApiClient.BadRequest, root.MetaformApiClient.ExportThemeFile, root.MetaformApiClient.Forbidden, root.MetaformApiClient.InternalServerError, root.MetaformApiClient.NotFound);
  }
}(this, function(ApiClient, BadRequest, ExportThemeFile, Forbidden, InternalServerError, NotFound) {
  'use strict';

  /**
   * ExportThemeFiles service.
   * @module api/ExportThemeFilesApi
   * @version 0.0.20
   */

  /**
   * Constructs a new ExportThemeFilesApi. 
   * @alias module:api/ExportThemeFilesApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;



    /**
     * create new export theme file
     * Creates new export theme file
     * @param {String} realmId realm id
     * @param {String} exportThemeId export theme id
     * @param {module:model/ExportThemeFile} payload Payload
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ExportThemeFile} and HTTP response
     */
    this.createExportThemeFileWithHttpInfo = function(realmId, exportThemeId, payload) {
      var postBody = payload;

      // verify the required parameter 'realmId' is set
      if (realmId === undefined || realmId === null) {
        throw new Error("Missing the required parameter 'realmId' when calling createExportThemeFile");
      }

      // verify the required parameter 'exportThemeId' is set
      if (exportThemeId === undefined || exportThemeId === null) {
        throw new Error("Missing the required parameter 'exportThemeId' when calling createExportThemeFile");
      }

      // verify the required parameter 'payload' is set
      if (payload === undefined || payload === null) {
        throw new Error("Missing the required parameter 'payload' when calling createExportThemeFile");
      }


      var pathParams = {
        'realmId': realmId,
        'exportThemeId': exportThemeId
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['bearer'];
      var contentTypes = ['application/json;charset=utf-8'];
      var accepts = ['application/json;charset=utf-8'];
      var returnType = ExportThemeFile;

      return this.apiClient.callApi(
        '/realms/{realmId}/exportThemes/{exportThemeId}/files', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * create new export theme file
     * Creates new export theme file
     * @param {String} realmId realm id
     * @param {String} exportThemeId export theme id
     * @param {module:model/ExportThemeFile} payload Payload
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/ExportThemeFile}
     */
    this.createExportThemeFile = function(realmId, exportThemeId, payload) {
      return this.createExportThemeFileWithHttpInfo(realmId, exportThemeId, payload)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Deletes an export theme file
     * Deletes an export theme file
     * @param {String} realmId realm id
     * @param {String} exportThemeId export theme id
     * @param {String} exportThemeFileId export theme file id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    this.deleteExportThemeFileWithHttpInfo = function(realmId, exportThemeId, exportThemeFileId) {
      var postBody = null;

      // verify the required parameter 'realmId' is set
      if (realmId === undefined || realmId === null) {
        throw new Error("Missing the required parameter 'realmId' when calling deleteExportThemeFile");
      }

      // verify the required parameter 'exportThemeId' is set
      if (exportThemeId === undefined || exportThemeId === null) {
        throw new Error("Missing the required parameter 'exportThemeId' when calling deleteExportThemeFile");
      }

      // verify the required parameter 'exportThemeFileId' is set
      if (exportThemeFileId === undefined || exportThemeFileId === null) {
        throw new Error("Missing the required parameter 'exportThemeFileId' when calling deleteExportThemeFile");
      }


      var pathParams = {
        'realmId': realmId,
        'exportThemeId': exportThemeId,
        'exportThemeFileId': exportThemeFileId
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['bearer'];
      var contentTypes = ['application/json;charset=utf-8'];
      var accepts = ['application/json;charset=utf-8'];
      var returnType = null;

      return this.apiClient.callApi(
        '/realms/{realmId}/exportThemes/{exportThemeId}/files/{exportThemeFileId}', 'DELETE',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Deletes an export theme file
     * Deletes an export theme file
     * @param {String} realmId realm id
     * @param {String} exportThemeId export theme id
     * @param {String} exportThemeFileId export theme file id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    this.deleteExportThemeFile = function(realmId, exportThemeId, exportThemeFileId) {
      return this.deleteExportThemeFileWithHttpInfo(realmId, exportThemeId, exportThemeFileId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Finds single export theme file
     * Finds single export theme file
     * @param {String} realmId realm id
     * @param {String} exportThemeId export theme id
     * @param {String} exportThemeFileId export theme file id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ExportThemeFile} and HTTP response
     */
    this.findExportThemeFileWithHttpInfo = function(realmId, exportThemeId, exportThemeFileId) {
      var postBody = null;

      // verify the required parameter 'realmId' is set
      if (realmId === undefined || realmId === null) {
        throw new Error("Missing the required parameter 'realmId' when calling findExportThemeFile");
      }

      // verify the required parameter 'exportThemeId' is set
      if (exportThemeId === undefined || exportThemeId === null) {
        throw new Error("Missing the required parameter 'exportThemeId' when calling findExportThemeFile");
      }

      // verify the required parameter 'exportThemeFileId' is set
      if (exportThemeFileId === undefined || exportThemeFileId === null) {
        throw new Error("Missing the required parameter 'exportThemeFileId' when calling findExportThemeFile");
      }


      var pathParams = {
        'realmId': realmId,
        'exportThemeId': exportThemeId,
        'exportThemeFileId': exportThemeFileId
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['bearer'];
      var contentTypes = ['application/json;charset=utf-8'];
      var accepts = ['application/json;charset=utf-8'];
      var returnType = ExportThemeFile;

      return this.apiClient.callApi(
        '/realms/{realmId}/exportThemes/{exportThemeId}/files/{exportThemeFileId}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Finds single export theme file
     * Finds single export theme file
     * @param {String} realmId realm id
     * @param {String} exportThemeId export theme id
     * @param {String} exportThemeFileId export theme file id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/ExportThemeFile}
     */
    this.findExportThemeFile = function(realmId, exportThemeId, exportThemeFileId) {
      return this.findExportThemeFileWithHttpInfo(realmId, exportThemeId, exportThemeFileId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Lists files of export theme
     * Lists files of export theme
     * @param {String} realmId realm id
     * @param {String} exportThemeId export theme id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/ExportThemeFile>} and HTTP response
     */
    this.listExportThemeFilesWithHttpInfo = function(realmId, exportThemeId) {
      var postBody = null;

      // verify the required parameter 'realmId' is set
      if (realmId === undefined || realmId === null) {
        throw new Error("Missing the required parameter 'realmId' when calling listExportThemeFiles");
      }

      // verify the required parameter 'exportThemeId' is set
      if (exportThemeId === undefined || exportThemeId === null) {
        throw new Error("Missing the required parameter 'exportThemeId' when calling listExportThemeFiles");
      }


      var pathParams = {
        'realmId': realmId,
        'exportThemeId': exportThemeId
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['bearer'];
      var contentTypes = ['application/json;charset=utf-8'];
      var accepts = ['application/json;charset=utf-8'];
      var returnType = [ExportThemeFile];

      return this.apiClient.callApi(
        '/realms/{realmId}/exportThemes/{exportThemeId}/files', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Lists files of export theme
     * Lists files of export theme
     * @param {String} realmId realm id
     * @param {String} exportThemeId export theme id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/ExportThemeFile>}
     */
    this.listExportThemeFiles = function(realmId, exportThemeId) {
      return this.listExportThemeFilesWithHttpInfo(realmId, exportThemeId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Updates export theme file
     * Updates export theme file
     * @param {String} realmId realm id
     * @param {String} exportThemeId ExportTheme id
     * @param {String} exportThemeFileId ExportThemeFile file id
     * @param {module:model/ExportThemeFile} payload Payload
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ExportThemeFile} and HTTP response
     */
    this.updateExportThemeFileWithHttpInfo = function(realmId, exportThemeId, exportThemeFileId, payload) {
      var postBody = payload;

      // verify the required parameter 'realmId' is set
      if (realmId === undefined || realmId === null) {
        throw new Error("Missing the required parameter 'realmId' when calling updateExportThemeFile");
      }

      // verify the required parameter 'exportThemeId' is set
      if (exportThemeId === undefined || exportThemeId === null) {
        throw new Error("Missing the required parameter 'exportThemeId' when calling updateExportThemeFile");
      }

      // verify the required parameter 'exportThemeFileId' is set
      if (exportThemeFileId === undefined || exportThemeFileId === null) {
        throw new Error("Missing the required parameter 'exportThemeFileId' when calling updateExportThemeFile");
      }

      // verify the required parameter 'payload' is set
      if (payload === undefined || payload === null) {
        throw new Error("Missing the required parameter 'payload' when calling updateExportThemeFile");
      }


      var pathParams = {
        'realmId': realmId,
        'exportThemeId': exportThemeId,
        'exportThemeFileId': exportThemeFileId
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['bearer'];
      var contentTypes = ['application/json;charset=utf-8'];
      var accepts = ['application/json;charset=utf-8'];
      var returnType = ExportThemeFile;

      return this.apiClient.callApi(
        '/realms/{realmId}/exportThemes/{exportThemeId}/files/{exportThemeFileId}', 'PUT',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Updates export theme file
     * Updates export theme file
     * @param {String} realmId realm id
     * @param {String} exportThemeId ExportTheme id
     * @param {String} exportThemeFileId ExportThemeFile file id
     * @param {module:model/ExportThemeFile} payload Payload
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/ExportThemeFile}
     */
    this.updateExportThemeFile = function(realmId, exportThemeId, exportThemeFileId, payload) {
      return this.updateExportThemeFileWithHttpInfo(realmId, exportThemeId, exportThemeFileId, payload)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }
  };

  return exports;
}));
