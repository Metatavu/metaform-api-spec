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
    define(['ApiClient', 'model/BadRequest', 'model/Forbidden', 'model/InternalServerError', 'model/NotFound', 'model/Reply'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/BadRequest'), require('../model/Forbidden'), require('../model/InternalServerError'), require('../model/NotFound'), require('../model/Reply'));
  } else {
    // Browser globals (root is window)
    if (!root.MetaformApiClient) {
      root.MetaformApiClient = {};
    }
    root.MetaformApiClient.RepliesApi = factory(root.MetaformApiClient.ApiClient, root.MetaformApiClient.BadRequest, root.MetaformApiClient.Forbidden, root.MetaformApiClient.InternalServerError, root.MetaformApiClient.NotFound, root.MetaformApiClient.Reply);
  }
}(this, function(ApiClient, BadRequest, Forbidden, InternalServerError, NotFound, Reply) {
  'use strict';

  /**
   * Replies service.
   * @module api/RepliesApi
   * @version 0.0.22
   */

  /**
   * Constructs a new RepliesApi. 
   * @alias module:api/RepliesApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;



    /**
     * Exports metaform data
     * Exports metaform data
     * @param {String} realmId realm id
     * @param {String} metaformId Metaform id
     * @param {String} format Export results in specified format (XLSX)
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link 'Blob'} and HTTP response
     */
    this.callExportWithHttpInfo = function(realmId, metaformId, format) {
      var postBody = null;

      // verify the required parameter 'realmId' is set
      if (realmId === undefined || realmId === null) {
        throw new Error("Missing the required parameter 'realmId' when calling callExport");
      }

      // verify the required parameter 'metaformId' is set
      if (metaformId === undefined || metaformId === null) {
        throw new Error("Missing the required parameter 'metaformId' when calling callExport");
      }

      // verify the required parameter 'format' is set
      if (format === undefined || format === null) {
        throw new Error("Missing the required parameter 'format' when calling callExport");
      }


      var pathParams = {
        'realmId': realmId,
        'metaformId': metaformId
      };
      var queryParams = {
        'format': format,
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
      var returnType = 'Blob';

      return this.apiClient.callApi(
        '/realms/{realmId}/metaforms/{metaformId}/export', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Exports metaform data
     * Exports metaform data
     * @param {String} realmId realm id
     * @param {String} metaformId Metaform id
     * @param {String} format Export results in specified format (XLSX)
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link 'Blob'}
     */
    this.callExport = function(realmId, metaformId, format) {
      return this.callExportWithHttpInfo(realmId, metaformId, format)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * create new form reply
     * Creates new form reply
     * @param {String} realmId realm id
     * @param {String} metaformId Metaform id
     * @param {module:model/Reply} payload Payload
     * @param {Object} opts Optional parameters
     * @param {Boolean} opts.updateExisting specifies that existing reply should be updated. DEPRECATED, use replymode instead
     * @param {String} opts.replyMode specifies reply mode that will be used. possible values UPDATE, REVISION, CUMULATIVE
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/Reply} and HTTP response
     */
    this.createReplyWithHttpInfo = function(realmId, metaformId, payload, opts) {
      opts = opts || {};
      var postBody = payload;

      // verify the required parameter 'realmId' is set
      if (realmId === undefined || realmId === null) {
        throw new Error("Missing the required parameter 'realmId' when calling createReply");
      }

      // verify the required parameter 'metaformId' is set
      if (metaformId === undefined || metaformId === null) {
        throw new Error("Missing the required parameter 'metaformId' when calling createReply");
      }

      // verify the required parameter 'payload' is set
      if (payload === undefined || payload === null) {
        throw new Error("Missing the required parameter 'payload' when calling createReply");
      }


      var pathParams = {
        'realmId': realmId,
        'metaformId': metaformId
      };
      var queryParams = {
        'updateExisting': opts['updateExisting'],
        'replyMode': opts['replyMode'],
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
      var returnType = Reply;

      return this.apiClient.callApi(
        '/realms/{realmId}/metaforms/{metaformId}/replies', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * create new form reply
     * Creates new form reply
     * @param {String} realmId realm id
     * @param {String} metaformId Metaform id
     * @param {module:model/Reply} payload Payload
     * @param {Object} opts Optional parameters
     * @param {Boolean} opts.updateExisting specifies that existing reply should be updated. DEPRECATED, use replymode instead
     * @param {String} opts.replyMode specifies reply mode that will be used. possible values UPDATE, REVISION, CUMULATIVE
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/Reply}
     */
    this.createReply = function(realmId, metaformId, payload, opts) {
      return this.createReplyWithHttpInfo(realmId, metaformId, payload, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Deletes a reply
     * Deletes a reply
     * @param {String} realmId realm id
     * @param {String} metaformId Metaform id
     * @param {String} replyId Reply id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    this.deleteReplyWithHttpInfo = function(realmId, metaformId, replyId) {
      var postBody = null;

      // verify the required parameter 'realmId' is set
      if (realmId === undefined || realmId === null) {
        throw new Error("Missing the required parameter 'realmId' when calling deleteReply");
      }

      // verify the required parameter 'metaformId' is set
      if (metaformId === undefined || metaformId === null) {
        throw new Error("Missing the required parameter 'metaformId' when calling deleteReply");
      }

      // verify the required parameter 'replyId' is set
      if (replyId === undefined || replyId === null) {
        throw new Error("Missing the required parameter 'replyId' when calling deleteReply");
      }


      var pathParams = {
        'realmId': realmId,
        'metaformId': metaformId,
        'replyId': replyId
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
        '/realms/{realmId}/metaforms/{metaformId}/replies/{replyId}', 'DELETE',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Deletes a reply
     * Deletes a reply
     * @param {String} realmId realm id
     * @param {String} metaformId Metaform id
     * @param {String} replyId Reply id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    this.deleteReply = function(realmId, metaformId, replyId) {
      return this.deleteReplyWithHttpInfo(realmId, metaformId, replyId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Find a single reply
     * Finds single reply by id
     * @param {String} realmId realm id
     * @param {String} metaformId Metaform id
     * @param {String} replyId Reply id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/Reply} and HTTP response
     */
    this.findReplyWithHttpInfo = function(realmId, metaformId, replyId) {
      var postBody = null;

      // verify the required parameter 'realmId' is set
      if (realmId === undefined || realmId === null) {
        throw new Error("Missing the required parameter 'realmId' when calling findReply");
      }

      // verify the required parameter 'metaformId' is set
      if (metaformId === undefined || metaformId === null) {
        throw new Error("Missing the required parameter 'metaformId' when calling findReply");
      }

      // verify the required parameter 'replyId' is set
      if (replyId === undefined || replyId === null) {
        throw new Error("Missing the required parameter 'replyId' when calling findReply");
      }


      var pathParams = {
        'realmId': realmId,
        'metaformId': metaformId,
        'replyId': replyId
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
      var returnType = Reply;

      return this.apiClient.callApi(
        '/realms/{realmId}/metaforms/{metaformId}/replies/{replyId}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Find a single reply
     * Finds single reply by id
     * @param {String} realmId realm id
     * @param {String} metaformId Metaform id
     * @param {String} replyId Reply id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/Reply}
     */
    this.findReply = function(realmId, metaformId, replyId) {
      return this.findReplyWithHttpInfo(realmId, metaformId, replyId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Lists form replies
     * Lists form replies
     * @param {String} realmId realm id
     * @param {String} metaformId Metaform id
     * @param {Object} opts Optional parameters
     * @param {String} opts.userId Filter results by user id. If this parameter is not specified all replies are returned, this requires logged user to have proper permission to do so
     * @param {String} opts.createdBefore Filter results created before specified time
     * @param {String} opts.createdAfter Filter results created after specified time
     * @param {String} opts.modifiedBefore Filter results modified before specified time
     * @param {String} opts.modifiedAfter Filter results modified after specified time
     * @param {Boolean} opts.includeRevisions Specifies that revisions should be included into response
     * @param {Array.<String>} opts.fields Filter results by field values. Format is field:value, multiple values can be added by using comma separator. E.g. field1&#x3D;value,field2&#x3D;another
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/Reply>} and HTTP response
     */
    this.listRepliesWithHttpInfo = function(realmId, metaformId, opts) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'realmId' is set
      if (realmId === undefined || realmId === null) {
        throw new Error("Missing the required parameter 'realmId' when calling listReplies");
      }

      // verify the required parameter 'metaformId' is set
      if (metaformId === undefined || metaformId === null) {
        throw new Error("Missing the required parameter 'metaformId' when calling listReplies");
      }


      var pathParams = {
        'realmId': realmId,
        'metaformId': metaformId
      };
      var queryParams = {
        'userId': opts['userId'],
        'createdBefore': opts['createdBefore'],
        'createdAfter': opts['createdAfter'],
        'modifiedBefore': opts['modifiedBefore'],
        'modifiedAfter': opts['modifiedAfter'],
        'includeRevisions': opts['includeRevisions'],
      };
      var collectionQueryParams = {
        'fields': {
          value: opts['fields'],
          collectionFormat: 'csv'
        },
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['bearer'];
      var contentTypes = ['application/json;charset=utf-8'];
      var accepts = ['application/json;charset=utf-8'];
      var returnType = [Reply];

      return this.apiClient.callApi(
        '/realms/{realmId}/metaforms/{metaformId}/replies', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Lists form replies
     * Lists form replies
     * @param {String} realmId realm id
     * @param {String} metaformId Metaform id
     * @param {Object} opts Optional parameters
     * @param {String} opts.userId Filter results by user id. If this parameter is not specified all replies are returned, this requires logged user to have proper permission to do so
     * @param {String} opts.createdBefore Filter results created before specified time
     * @param {String} opts.createdAfter Filter results created after specified time
     * @param {String} opts.modifiedBefore Filter results modified before specified time
     * @param {String} opts.modifiedAfter Filter results modified after specified time
     * @param {Boolean} opts.includeRevisions Specifies that revisions should be included into response
     * @param {Array.<String>} opts.fields Filter results by field values. Format is field:value, multiple values can be added by using comma separator. E.g. field1&#x3D;value,field2&#x3D;another
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/Reply>}
     */
    this.listReplies = function(realmId, metaformId, opts) {
      return this.listRepliesWithHttpInfo(realmId, metaformId, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Exports reply data
     * Exports reply data
     * @param {String} realmId realm id
     * @param {String} metaformId Metaform id
     * @param {String} replyId Reply id
     * @param {String} format Export results in specified format (PDF)
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link 'Blob'} and HTTP response
     */
    this.replyExportWithHttpInfo = function(realmId, metaformId, replyId, format) {
      var postBody = null;

      // verify the required parameter 'realmId' is set
      if (realmId === undefined || realmId === null) {
        throw new Error("Missing the required parameter 'realmId' when calling replyExport");
      }

      // verify the required parameter 'metaformId' is set
      if (metaformId === undefined || metaformId === null) {
        throw new Error("Missing the required parameter 'metaformId' when calling replyExport");
      }

      // verify the required parameter 'replyId' is set
      if (replyId === undefined || replyId === null) {
        throw new Error("Missing the required parameter 'replyId' when calling replyExport");
      }

      // verify the required parameter 'format' is set
      if (format === undefined || format === null) {
        throw new Error("Missing the required parameter 'format' when calling replyExport");
      }


      var pathParams = {
        'realmId': realmId,
        'metaformId': metaformId,
        'replyId': replyId
      };
      var queryParams = {
        'format': format,
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
      var returnType = 'Blob';

      return this.apiClient.callApi(
        '/realms/{realmId}/metaforms/{metaformId}/replies/{replyId}/export', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Exports reply data
     * Exports reply data
     * @param {String} realmId realm id
     * @param {String} metaformId Metaform id
     * @param {String} replyId Reply id
     * @param {String} format Export results in specified format (PDF)
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link 'Blob'}
     */
    this.replyExport = function(realmId, metaformId, replyId, format) {
      return this.replyExportWithHttpInfo(realmId, metaformId, replyId, format)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Updates reply
     * Updates reply
     * @param {String} realmId realm id
     * @param {String} metaformId Metaform id
     * @param {String} replyId Reply id
     * @param {module:model/Reply} payload Payload
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    this.updateReplyWithHttpInfo = function(realmId, metaformId, replyId, payload) {
      var postBody = payload;

      // verify the required parameter 'realmId' is set
      if (realmId === undefined || realmId === null) {
        throw new Error("Missing the required parameter 'realmId' when calling updateReply");
      }

      // verify the required parameter 'metaformId' is set
      if (metaformId === undefined || metaformId === null) {
        throw new Error("Missing the required parameter 'metaformId' when calling updateReply");
      }

      // verify the required parameter 'replyId' is set
      if (replyId === undefined || replyId === null) {
        throw new Error("Missing the required parameter 'replyId' when calling updateReply");
      }

      // verify the required parameter 'payload' is set
      if (payload === undefined || payload === null) {
        throw new Error("Missing the required parameter 'payload' when calling updateReply");
      }


      var pathParams = {
        'realmId': realmId,
        'metaformId': metaformId,
        'replyId': replyId
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
        '/realms/{realmId}/metaforms/{metaformId}/replies/{replyId}', 'PUT',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Updates reply
     * Updates reply
     * @param {String} realmId realm id
     * @param {String} metaformId Metaform id
     * @param {String} replyId Reply id
     * @param {module:model/Reply} payload Payload
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    this.updateReply = function(realmId, metaformId, replyId, payload) {
      return this.updateReplyWithHttpInfo(realmId, metaformId, replyId, payload)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }
  };

  return exports;
}));
