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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.MetaformApiClient) {
      root.MetaformApiClient = {};
    }
    root.MetaformApiClient.Attachment = factory(root.MetaformApiClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The Attachment model module.
   * @module model/Attachment
   * @version 0.0.22
   */

  /**
   * Constructs a new <code>Attachment</code>.
   * @alias module:model/Attachment
   * @class
   */
  var exports = function() {
    var _this = this;




  };

  /**
   * Constructs a <code>Attachment</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Attachment} obj Optional instance to populate.
   * @return {module:model/Attachment} The populated <code>Attachment</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('contentType')) {
        obj['contentType'] = ApiClient.convertToType(data['contentType'], 'String');
      }
    }
    return obj;
  }

  /**
   * Entity identifier
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * Attachment's name
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * Attachment's content type (e.g. application/pdf)
   * @member {String} contentType
   */
  exports.prototype['contentType'] = undefined;



  return exports;
}));


