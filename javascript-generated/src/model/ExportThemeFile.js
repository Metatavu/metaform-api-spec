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
    root.MetaformApiClient.ExportThemeFile = factory(root.MetaformApiClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The ExportThemeFile model module.
   * @module model/ExportThemeFile
   * @version 0.1.4
   */

  /**
   * Constructs a new <code>ExportThemeFile</code>.
   * @alias module:model/ExportThemeFile
   * @class
   * @param path {String} 
   * @param themeId {String} 
   * @param content {String} 
   */
  var exports = function(path, themeId, content) {
    var _this = this;


    _this['path'] = path;
    _this['themeId'] = themeId;
    _this['content'] = content;
  };

  /**
   * Constructs a <code>ExportThemeFile</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ExportThemeFile} obj Optional instance to populate.
   * @return {module:model/ExportThemeFile} The populated <code>ExportThemeFile</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('path')) {
        obj['path'] = ApiClient.convertToType(data['path'], 'String');
      }
      if (data.hasOwnProperty('themeId')) {
        obj['themeId'] = ApiClient.convertToType(data['themeId'], 'String');
      }
      if (data.hasOwnProperty('content')) {
        obj['content'] = ApiClient.convertToType(data['content'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * @member {String} path
   */
  exports.prototype['path'] = undefined;
  /**
   * @member {String} themeId
   */
  exports.prototype['themeId'] = undefined;
  /**
   * @member {String} content
   */
  exports.prototype['content'] = undefined;



  return exports;
}));


