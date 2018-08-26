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
    define(['ApiClient', 'model/Attachment', 'model/BadRequest', 'model/Forbidden', 'model/InternalServerError'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/Attachment'), require('../model/BadRequest'), require('../model/Forbidden'), require('../model/InternalServerError'));
  } else {
    // Browser globals (root is window)
    if (!root.MetaformApiClient) {
      root.MetaformApiClient = {};
    }
    root.MetaformApiClient.AttachmentsApi = factory(root.MetaformApiClient.ApiClient, root.MetaformApiClient.Attachment, root.MetaformApiClient.BadRequest, root.MetaformApiClient.Forbidden, root.MetaformApiClient.InternalServerError);
  }
}(this, function(ApiClient, Attachment, BadRequest, Forbidden, InternalServerError) {
  'use strict';

  /**
   * Attachments service.
   * @module api/AttachmentsApi
   * @version 0.0.16
   */

  /**
   * Constructs a new AttachmentsApi. 
   * @alias module:api/AttachmentsApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;



    /**
     * Find a attachment by id
     * Returns single attachment
     * @param {String} realmId realm id
     * @param {String} attachmentId Attachment id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/Attachment} and HTTP response
     */
    this.findAttachmentWithHttpInfo = function(realmId, attachmentId) {
      var postBody = null;

      // verify the required parameter 'realmId' is set
      if (realmId === undefined || realmId === null) {
        throw new Error("Missing the required parameter 'realmId' when calling findAttachment");
      }

      // verify the required parameter 'attachmentId' is set
      if (attachmentId === undefined || attachmentId === null) {
        throw new Error("Missing the required parameter 'attachmentId' when calling findAttachment");
      }


      var pathParams = {
        'realmId': realmId,
        'attachmentId': attachmentId
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
      var returnType = Attachment;

      return this.apiClient.callApi(
        '/realms/{realmId}/attachments/{attachmentId}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Find a attachment by id
     * Returns single attachment
     * @param {String} realmId realm id
     * @param {String} attachmentId Attachment id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/Attachment}
     */
    this.findAttachment = function(realmId, attachmentId) {
      return this.findAttachmentWithHttpInfo(realmId, attachmentId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Find a attachment data by id
     * Returns attachment data
     * @param {String} realmId realm id
     * @param {String} attachmentId Attachment id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link 'Blob'} and HTTP response
     */
    this.findAttachmentDataWithHttpInfo = function(realmId, attachmentId) {
      var postBody = null;

      // verify the required parameter 'realmId' is set
      if (realmId === undefined || realmId === null) {
        throw new Error("Missing the required parameter 'realmId' when calling findAttachmentData");
      }

      // verify the required parameter 'attachmentId' is set
      if (attachmentId === undefined || attachmentId === null) {
        throw new Error("Missing the required parameter 'attachmentId' when calling findAttachmentData");
      }


      var pathParams = {
        'realmId': realmId,
        'attachmentId': attachmentId
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
      var returnType = 'Blob';

      return this.apiClient.callApi(
        '/realms/{realmId}/attachments/{attachmentId}/data', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Find a attachment data by id
     * Returns attachment data
     * @param {String} realmId realm id
     * @param {String} attachmentId Attachment id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link 'Blob'}
     */
    this.findAttachmentData = function(realmId, attachmentId) {
      return this.findAttachmentDataWithHttpInfo(realmId, attachmentId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }
  };

  return exports;
}));
