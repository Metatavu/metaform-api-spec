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
    define(['ApiClient', 'model/BadRequest', 'model/EmailNotification', 'model/Forbidden', 'model/InternalServerError', 'model/NotFound'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/BadRequest'), require('../model/EmailNotification'), require('../model/Forbidden'), require('../model/InternalServerError'), require('../model/NotFound'));
  } else {
    // Browser globals (root is window)
    if (!root.MetaformApiClient) {
      root.MetaformApiClient = {};
    }
    root.MetaformApiClient.EmailNotificationsApi = factory(root.MetaformApiClient.ApiClient, root.MetaformApiClient.BadRequest, root.MetaformApiClient.EmailNotification, root.MetaformApiClient.Forbidden, root.MetaformApiClient.InternalServerError, root.MetaformApiClient.NotFound);
  }
}(this, function(ApiClient, BadRequest, EmailNotification, Forbidden, InternalServerError, NotFound) {
  'use strict';

  /**
   * EmailNotifications service.
   * @module api/EmailNotificationsApi
   * @version 0.1.2
   */

  /**
   * Constructs a new EmailNotificationsApi. 
   * @alias module:api/EmailNotificationsApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;



    /**
     * create new form email notification
     * Creates new form email notification
     * @param {String} realmId realm id
     * @param {String} metaformId Metaform id
     * @param {module:model/EmailNotification} payload Payload
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/EmailNotification} and HTTP response
     */
    this.createEmailNotificationWithHttpInfo = function(realmId, metaformId, payload) {
      var postBody = payload;

      // verify the required parameter 'realmId' is set
      if (realmId === undefined || realmId === null) {
        throw new Error("Missing the required parameter 'realmId' when calling createEmailNotification");
      }

      // verify the required parameter 'metaformId' is set
      if (metaformId === undefined || metaformId === null) {
        throw new Error("Missing the required parameter 'metaformId' when calling createEmailNotification");
      }

      // verify the required parameter 'payload' is set
      if (payload === undefined || payload === null) {
        throw new Error("Missing the required parameter 'payload' when calling createEmailNotification");
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
      var returnType = EmailNotification;

      return this.apiClient.callApi(
        '/realms/{realmId}/metaforms/{metaformId}/emailNotifications', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * create new form email notification
     * Creates new form email notification
     * @param {String} realmId realm id
     * @param {String} metaformId Metaform id
     * @param {module:model/EmailNotification} payload Payload
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/EmailNotification}
     */
    this.createEmailNotification = function(realmId, metaformId, payload) {
      return this.createEmailNotificationWithHttpInfo(realmId, metaformId, payload)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Deletes an email notification
     * Deletes an email notification
     * @param {String} realmId realm id
     * @param {String} metaformId Metaform id
     * @param {String} emailNotificationId Email notification id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing HTTP response
     */
    this.deleteEmailNotificationWithHttpInfo = function(realmId, metaformId, emailNotificationId) {
      var postBody = null;

      // verify the required parameter 'realmId' is set
      if (realmId === undefined || realmId === null) {
        throw new Error("Missing the required parameter 'realmId' when calling deleteEmailNotification");
      }

      // verify the required parameter 'metaformId' is set
      if (metaformId === undefined || metaformId === null) {
        throw new Error("Missing the required parameter 'metaformId' when calling deleteEmailNotification");
      }

      // verify the required parameter 'emailNotificationId' is set
      if (emailNotificationId === undefined || emailNotificationId === null) {
        throw new Error("Missing the required parameter 'emailNotificationId' when calling deleteEmailNotification");
      }


      var pathParams = {
        'realmId': realmId,
        'metaformId': metaformId,
        'emailNotificationId': emailNotificationId
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
        '/realms/{realmId}/metaforms/{metaformId}/emailNotifications/{emailNotificationId}', 'DELETE',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Deletes an email notification
     * Deletes an email notification
     * @param {String} realmId realm id
     * @param {String} metaformId Metaform id
     * @param {String} emailNotificationId Email notification id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}
     */
    this.deleteEmailNotification = function(realmId, metaformId, emailNotificationId) {
      return this.deleteEmailNotificationWithHttpInfo(realmId, metaformId, emailNotificationId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Find a single emai notification
     * Finds single email notification by id
     * @param {String} realmId realm id
     * @param {String} metaformId Metaform id
     * @param {String} emailNotificationId EmailNotification id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/EmailNotification} and HTTP response
     */
    this.findEmailNotificationWithHttpInfo = function(realmId, metaformId, emailNotificationId) {
      var postBody = null;

      // verify the required parameter 'realmId' is set
      if (realmId === undefined || realmId === null) {
        throw new Error("Missing the required parameter 'realmId' when calling findEmailNotification");
      }

      // verify the required parameter 'metaformId' is set
      if (metaformId === undefined || metaformId === null) {
        throw new Error("Missing the required parameter 'metaformId' when calling findEmailNotification");
      }

      // verify the required parameter 'emailNotificationId' is set
      if (emailNotificationId === undefined || emailNotificationId === null) {
        throw new Error("Missing the required parameter 'emailNotificationId' when calling findEmailNotification");
      }


      var pathParams = {
        'realmId': realmId,
        'metaformId': metaformId,
        'emailNotificationId': emailNotificationId
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
      var returnType = EmailNotification;

      return this.apiClient.callApi(
        '/realms/{realmId}/metaforms/{metaformId}/emailNotifications/{emailNotificationId}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Find a single emai notification
     * Finds single email notification by id
     * @param {String} realmId realm id
     * @param {String} metaformId Metaform id
     * @param {String} emailNotificationId EmailNotification id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/EmailNotification}
     */
    this.findEmailNotification = function(realmId, metaformId, emailNotificationId) {
      return this.findEmailNotificationWithHttpInfo(realmId, metaformId, emailNotificationId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Lists form email notifications
     * Lists email notifications
     * @param {String} realmId realm id
     * @param {String} metaformId Metaform id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/EmailNotification>} and HTTP response
     */
    this.listEmailNotificationsWithHttpInfo = function(realmId, metaformId) {
      var postBody = null;

      // verify the required parameter 'realmId' is set
      if (realmId === undefined || realmId === null) {
        throw new Error("Missing the required parameter 'realmId' when calling listEmailNotifications");
      }

      // verify the required parameter 'metaformId' is set
      if (metaformId === undefined || metaformId === null) {
        throw new Error("Missing the required parameter 'metaformId' when calling listEmailNotifications");
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
      var returnType = [EmailNotification];

      return this.apiClient.callApi(
        '/realms/{realmId}/metaforms/{metaformId}/emailNotifications', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Lists form email notifications
     * Lists email notifications
     * @param {String} realmId realm id
     * @param {String} metaformId Metaform id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/EmailNotification>}
     */
    this.listEmailNotifications = function(realmId, metaformId) {
      return this.listEmailNotificationsWithHttpInfo(realmId, metaformId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Updates email notification
     * Updates email notification
     * @param {String} realmId realm id
     * @param {String} metaformId Metaform id
     * @param {String} emailNotificationId EmailNotification id
     * @param {module:model/EmailNotification} payload Payload
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/EmailNotification} and HTTP response
     */
    this.updateEmailNotificationWithHttpInfo = function(realmId, metaformId, emailNotificationId, payload) {
      var postBody = payload;

      // verify the required parameter 'realmId' is set
      if (realmId === undefined || realmId === null) {
        throw new Error("Missing the required parameter 'realmId' when calling updateEmailNotification");
      }

      // verify the required parameter 'metaformId' is set
      if (metaformId === undefined || metaformId === null) {
        throw new Error("Missing the required parameter 'metaformId' when calling updateEmailNotification");
      }

      // verify the required parameter 'emailNotificationId' is set
      if (emailNotificationId === undefined || emailNotificationId === null) {
        throw new Error("Missing the required parameter 'emailNotificationId' when calling updateEmailNotification");
      }

      // verify the required parameter 'payload' is set
      if (payload === undefined || payload === null) {
        throw new Error("Missing the required parameter 'payload' when calling updateEmailNotification");
      }


      var pathParams = {
        'realmId': realmId,
        'metaformId': metaformId,
        'emailNotificationId': emailNotificationId
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
      var returnType = EmailNotification;

      return this.apiClient.callApi(
        '/realms/{realmId}/metaforms/{metaformId}/emailNotifications/{emailNotificationId}', 'PUT',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Updates email notification
     * Updates email notification
     * @param {String} realmId realm id
     * @param {String} metaformId Metaform id
     * @param {String} emailNotificationId EmailNotification id
     * @param {module:model/EmailNotification} payload Payload
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/EmailNotification}
     */
    this.updateEmailNotification = function(realmId, metaformId, emailNotificationId, payload) {
      return this.updateEmailNotificationWithHttpInfo(realmId, metaformId, emailNotificationId, payload)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }
  };

  return exports;
}));
