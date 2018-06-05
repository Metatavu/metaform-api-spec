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
    define(['ApiClient', 'model/MetaformSection'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./MetaformSection'));
  } else {
    // Browser globals (root is window)
    if (!root.MetaformApiClient) {
      root.MetaformApiClient = {};
    }
    root.MetaformApiClient.Metaform = factory(root.MetaformApiClient.ApiClient, root.MetaformApiClient.MetaformSection);
  }
}(this, function(ApiClient, MetaformSection) {
  'use strict';




  /**
   * The Metaform model module.
   * @module model/Metaform
   * @version 0.0.11
   */

  /**
   * Constructs a new <code>Metaform</code>.
   * @alias module:model/Metaform
   * @class
   */
  var exports = function() {
    var _this = this;






  };

  /**
   * Constructs a <code>Metaform</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Metaform} obj Optional instance to populate.
   * @return {module:model/Metaform} The populated <code>Metaform</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('replyStrategy')) {
        obj['replyStrategy'] = ApiClient.convertToType(data['replyStrategy'], 'String');
      }
      if (data.hasOwnProperty('allowAnonymous')) {
        obj['allowAnonymous'] = ApiClient.convertToType(data['allowAnonymous'], 'Boolean');
      }
      if (data.hasOwnProperty('title')) {
        obj['title'] = ApiClient.convertToType(data['title'], 'String');
      }
      if (data.hasOwnProperty('sections')) {
        obj['sections'] = ApiClient.convertToType(data['sections'], [MetaformSection]);
      }
    }
    return obj;
  }

  /**
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * @member {module:model/Metaform.ReplyStrategyEnum} replyStrategy
   */
  exports.prototype['replyStrategy'] = undefined;
  /**
   * Are anonymous replies allowed or not
   * @member {Boolean} allowAnonymous
   */
  exports.prototype['allowAnonymous'] = undefined;
  /**
   * @member {String} title
   */
  exports.prototype['title'] = undefined;
  /**
   * @member {Array.<module:model/MetaformSection>} sections
   */
  exports.prototype['sections'] = undefined;


  /**
   * Allowed values for the <code>replyStrategy</code> property.
   * @enum {String}
   * @readonly
   */
  exports.ReplyStrategyEnum = {
    /**
     * value: "PUBLIC"
     * @const
     */
    "PUBLIC": "PUBLIC",
    /**
     * value: "PRIVATE"
     * @const
     */
    "PRIVATE": "PRIVATE"  };


  return exports;
}));


