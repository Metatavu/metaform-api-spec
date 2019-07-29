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
    define(['ApiClient', 'model/ReplyData'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./ReplyData'));
  } else {
    // Browser globals (root is window)
    if (!root.MetaformApiClient) {
      root.MetaformApiClient = {};
    }
    root.MetaformApiClient.Reply = factory(root.MetaformApiClient.ApiClient, root.MetaformApiClient.ReplyData);
  }
}(this, function(ApiClient, ReplyData) {
  'use strict';




  /**
   * The Reply model module.
   * @module model/Reply
   * @version 0.1.5
   */

  /**
   * Constructs a new <code>Reply</code>.
   * @alias module:model/Reply
   * @class
   */
  var exports = function() {
    var _this = this;





  };

  /**
   * Constructs a <code>Reply</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Reply} obj Optional instance to populate.
   * @return {module:model/Reply} The populated <code>Reply</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('userId')) {
        obj['userId'] = ApiClient.convertToType(data['userId'], 'String');
      }
      if (data.hasOwnProperty('revision')) {
        obj['revision'] = ApiClient.convertToType(data['revision'], 'Date');
      }
      if (data.hasOwnProperty('data')) {
        obj['data'] = ReplyData.constructFromObject(data['data']);
      }
    }
    return obj;
  }

  /**
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * @member {String} userId
   */
  exports.prototype['userId'] = undefined;
  /**
   * @member {Date} revision
   */
  exports.prototype['revision'] = undefined;
  /**
   * @member {module:model/ReplyData} data
   */
  exports.prototype['data'] = undefined;



  return exports;
}));


