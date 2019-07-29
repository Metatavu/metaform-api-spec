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
    root.MetaformApiClient.MetaformScript = factory(root.MetaformApiClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The MetaformScript model module.
   * @module model/MetaformScript
   * @version 0.1.6
   */

  /**
   * Constructs a new <code>MetaformScript</code>.
   * @alias module:model/MetaformScript
   * @class
   * @param name {String} 
   * @param language {String} 
   * @param content {String} 
   */
  var exports = function(name, language, content) {
    var _this = this;

    _this['name'] = name;
    _this['language'] = language;
    _this['content'] = content;
  };

  /**
   * Constructs a <code>MetaformScript</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MetaformScript} obj Optional instance to populate.
   * @return {module:model/MetaformScript} The populated <code>MetaformScript</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('language')) {
        obj['language'] = ApiClient.convertToType(data['language'], 'String');
      }
      if (data.hasOwnProperty('content')) {
        obj['content'] = ApiClient.convertToType(data['content'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * @member {String} language
   */
  exports.prototype['language'] = undefined;
  /**
   * @member {String} content
   */
  exports.prototype['content'] = undefined;



  return exports;
}));


