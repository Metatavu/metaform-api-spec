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
    root.MetaformApiClient.EmailNotification = factory(root.MetaformApiClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The EmailNotification model module.
   * @module model/EmailNotification
   * @version 0.0.11
   */

  /**
   * Constructs a new <code>EmailNotification</code>.
   * Email notification
   * @alias module:model/EmailNotification
   * @class
   * @param subjectTemplate {String} 
   * @param contentTemplate {String} 
   * @param emails {Array.<String>} 
   */
  var exports = function(subjectTemplate, contentTemplate, emails) {
    var _this = this;


    _this['subjectTemplate'] = subjectTemplate;
    _this['contentTemplate'] = contentTemplate;
    _this['emails'] = emails;
  };

  /**
   * Constructs a <code>EmailNotification</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/EmailNotification} obj Optional instance to populate.
   * @return {module:model/EmailNotification} The populated <code>EmailNotification</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('subjectTemplate')) {
        obj['subjectTemplate'] = ApiClient.convertToType(data['subjectTemplate'], 'String');
      }
      if (data.hasOwnProperty('contentTemplate')) {
        obj['contentTemplate'] = ApiClient.convertToType(data['contentTemplate'], 'String');
      }
      if (data.hasOwnProperty('emails')) {
        obj['emails'] = ApiClient.convertToType(data['emails'], ['String']);
      }
    }
    return obj;
  }

  /**
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * @member {String} subjectTemplate
   */
  exports.prototype['subjectTemplate'] = undefined;
  /**
   * @member {String} contentTemplate
   */
  exports.prototype['contentTemplate'] = undefined;
  /**
   * @member {Array.<String>} emails
   */
  exports.prototype['emails'] = undefined;



  return exports;
}));


