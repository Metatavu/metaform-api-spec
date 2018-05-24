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
    define(['ApiClient', 'model/BadRequest', 'model/Forbidden', 'model/InternalServerError', 'model/Metaform', 'model/NotFound'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/BadRequest'), require('../model/Forbidden'), require('../model/InternalServerError'), require('../model/Metaform'), require('../model/NotFound'));
  } else {
    // Browser globals (root is window)
    if (!root.MetaformApiClient) {
      root.MetaformApiClient = {};
    }
    root.MetaformApiClient.MetaformsApi = factory(root.MetaformApiClient.ApiClient, root.MetaformApiClient.BadRequest, root.MetaformApiClient.Forbidden, root.MetaformApiClient.InternalServerError, root.MetaformApiClient.Metaform, root.MetaformApiClient.NotFound);
  }
}(this, function(ApiClient, BadRequest, Forbidden, InternalServerError, Metaform, NotFound) {
  'use strict';

  /**
   * Metaforms service.
   * @module api/MetaformsApi
   * @version 0.0.3
   */

  /**
   * Constructs a new MetaformsApi. 
   * @alias module:api/MetaformsApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;



    /**
     * create new Metaform
     * Creates new Metaform
     * @param {String} realmId realm id
     * @param {module:model/Metaform} payload Payload
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/Metaform} and HTTP response
     */
    this.createMetaformWithHttpInfo = function(realmId, payload) {
      var postBody = payload;

      // verify the required parameter 'realmId' is set
      if (realmId === undefined || realmId === null) {
        throw new Error("Missing the required parameter 'realmId' when calling createMetaform");
      }

      // verify the required parameter 'payload' is set
      if (payload === undefined || payload === null) {
        throw new Error("Missing the required parameter 'payload' when calling createMetaform");
      }


      var pathParams = {
        'realmId': realmId
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
      var returnType = Metaform;

      return this.apiClient.callApi(
        '/realms/{realmId}/metaforms', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * create new Metaform
     * Creates new Metaform
     * @param {String} realmId realm id
     * @param {module:model/Metaform} payload Payload
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/Metaform}
     */
    this.createMetaform = function(realmId, payload) {
      return this.createMetaformWithHttpInfo(realmId, payload)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Deletes Metaform
     * Deletes a Metaform
     * @param {String} realmId realm id
     * @param {String} metaformId Metaform id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    this.deleteMetaformWithHttpInfo = function(realmId, metaformId) {
      var postBody = null;

      // verify the required parameter 'realmId' is set
      if (realmId === undefined || realmId === null) {
        throw new Error("Missing the required parameter 'realmId' when calling deleteMetaform");
      }

      // verify the required parameter 'metaformId' is set
      if (metaformId === undefined || metaformId === null) {
        throw new Error("Missing the required parameter 'metaformId' when calling deleteMetaform");
      }


      var pathParams = {
        'realmId': realmId,
        'metaformId': metaformId
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
        '/realms/{realmId}/metaforms/{metaformId}', 'DELETE',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Deletes Metaform
     * Deletes a Metaform
     * @param {String} realmId realm id
     * @param {String} metaformId Metaform id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    this.deleteMetaform = function(realmId, metaformId) {
      return this.deleteMetaformWithHttpInfo(realmId, metaformId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Finds single Metaform
     * Finds a single Metaform
     * @param {String} realmId realm id
     * @param {String} metaformId Metaform id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/Metaform} and HTTP response
     */
    this.findMetaformWithHttpInfo = function(realmId, metaformId) {
      var postBody = null;

      // verify the required parameter 'realmId' is set
      if (realmId === undefined || realmId === null) {
        throw new Error("Missing the required parameter 'realmId' when calling findMetaform");
      }

      // verify the required parameter 'metaformId' is set
      if (metaformId === undefined || metaformId === null) {
        throw new Error("Missing the required parameter 'metaformId' when calling findMetaform");
      }


      var pathParams = {
        'realmId': realmId,
        'metaformId': metaformId
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
      var returnType = Metaform;

      return this.apiClient.callApi(
        '/realms/{realmId}/metaforms/{metaformId}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Finds single Metaform
     * Finds a single Metaform
     * @param {String} realmId realm id
     * @param {String} metaformId Metaform id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/Metaform}
     */
    this.findMetaform = function(realmId, metaformId) {
      return this.findMetaformWithHttpInfo(realmId, metaformId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Lists Metaforms
     * Lists Metaforms from the realm. User receives only metaforms where he/she has permission to.
     * @param {String} realmId realm id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/Metaform>} and HTTP response
     */
    this.listMetaformsWithHttpInfo = function(realmId) {
      var postBody = null;

      // verify the required parameter 'realmId' is set
      if (realmId === undefined || realmId === null) {
        throw new Error("Missing the required parameter 'realmId' when calling listMetaforms");
      }


      var pathParams = {
        'realmId': realmId
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
      var returnType = [Metaform];

      return this.apiClient.callApi(
        '/realms/{realmId}/metaforms', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Lists Metaforms
     * Lists Metaforms from the realm. User receives only metaforms where he/she has permission to.
     * @param {String} realmId realm id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/Metaform>}
     */
    this.listMetaforms = function(realmId) {
      return this.listMetaformsWithHttpInfo(realmId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Updates Metaform
     * Updates a Metaform
     * @param {String} realmId realm id
     * @param {String} metaformId Metaform id
     * @param {module:model/Metaform} payload Payload
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/Metaform} and HTTP response
     */
    this.updateMetaformWithHttpInfo = function(realmId, metaformId, payload) {
      var postBody = payload;

      // verify the required parameter 'realmId' is set
      if (realmId === undefined || realmId === null) {
        throw new Error("Missing the required parameter 'realmId' when calling updateMetaform");
      }

      // verify the required parameter 'metaformId' is set
      if (metaformId === undefined || metaformId === null) {
        throw new Error("Missing the required parameter 'metaformId' when calling updateMetaform");
      }

      // verify the required parameter 'payload' is set
      if (payload === undefined || payload === null) {
        throw new Error("Missing the required parameter 'payload' when calling updateMetaform");
      }


      var pathParams = {
        'realmId': realmId,
        'metaformId': metaformId
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
      var returnType = Metaform;

      return this.apiClient.callApi(
        '/realms/{realmId}/metaforms/{metaformId}', 'PUT',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Updates Metaform
     * Updates a Metaform
     * @param {String} realmId realm id
     * @param {String} metaformId Metaform id
     * @param {module:model/Metaform} payload Payload
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/Metaform}
     */
    this.updateMetaform = function(realmId, metaformId, payload) {
      return this.updateMetaformWithHttpInfo(realmId, metaformId, payload)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }
  };

  return exports;
}));
