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
    define(['ApiClient', 'model/MetaformField', 'model/MetaformVisibleIf'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./MetaformField'), require('./MetaformVisibleIf'));
  } else {
    // Browser globals (root is window)
    if (!root.MetaformApiClient) {
      root.MetaformApiClient = {};
    }
    root.MetaformApiClient.MetaformSection = factory(root.MetaformApiClient.ApiClient, root.MetaformApiClient.MetaformField, root.MetaformApiClient.MetaformVisibleIf);
  }
}(this, function(ApiClient, MetaformField, MetaformVisibleIf) {
  'use strict';




  /**
   * The MetaformSection model module.
   * @module model/MetaformSection
   * @version 0.0.20
   */

  /**
   * Constructs a new <code>MetaformSection</code>.
   * @alias module:model/MetaformSection
   * @class
   */
  var exports = function() {
    var _this = this;




  };

  /**
   * Constructs a <code>MetaformSection</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MetaformSection} obj Optional instance to populate.
   * @return {module:model/MetaformSection} The populated <code>MetaformSection</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('title')) {
        obj['title'] = ApiClient.convertToType(data['title'], 'String');
      }
      if (data.hasOwnProperty('visible-if')) {
        obj['visible-if'] = MetaformVisibleIf.constructFromObject(data['visible-if']);
      }
      if (data.hasOwnProperty('fields')) {
        obj['fields'] = ApiClient.convertToType(data['fields'], [MetaformField]);
      }
    }
    return obj;
  }

  /**
   * @member {String} title
   */
  exports.prototype['title'] = undefined;
  /**
   * @member {module:model/MetaformVisibleIf} visible-if
   */
  exports.prototype['visible-if'] = undefined;
  /**
   * @member {Array.<module:model/MetaformField>} fields
   */
  exports.prototype['fields'] = undefined;



  return exports;
}));


