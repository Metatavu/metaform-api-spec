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
    define(['ApiClient', 'model/MetaformVisibleIf'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./MetaformVisibleIf'));
  } else {
    // Browser globals (root is window)
    if (!root.MetaformApiClient) {
      root.MetaformApiClient = {};
    }
    root.MetaformApiClient.MetaformVisibleIf = factory(root.MetaformApiClient.ApiClient, root.MetaformApiClient.MetaformVisibleIf);
  }
}(this, function(ApiClient, MetaformVisibleIf) {
  'use strict';




  /**
   * The MetaformVisibleIf model module.
   * @module model/MetaformVisibleIf
   * @version 0.0.8
   */

  /**
   * Constructs a new <code>MetaformVisibleIf</code>.
   * Rule that defines whether specified object is visible
   * @alias module:model/MetaformVisibleIf
   * @class
   */
  var exports = function() {
    var _this = this;






  };

  /**
   * Constructs a <code>MetaformVisibleIf</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MetaformVisibleIf} obj Optional instance to populate.
   * @return {module:model/MetaformVisibleIf} The populated <code>MetaformVisibleIf</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('field')) {
        obj['field'] = ApiClient.convertToType(data['field'], 'String');
      }
      if (data.hasOwnProperty('equals')) {
        obj['equals'] = ApiClient.convertToType(data['equals'], 'String');
      }
      if (data.hasOwnProperty('not-equals')) {
        obj['not-equals'] = ApiClient.convertToType(data['not-equals'], 'String');
      }
      if (data.hasOwnProperty('and')) {
        obj['and'] = ApiClient.convertToType(data['and'], [MetaformVisibleIf]);
      }
      if (data.hasOwnProperty('or')) {
        obj['or'] = ApiClient.convertToType(data['or'], [MetaformVisibleIf]);
      }
    }
    return obj;
  }

  /**
   * Field where the visible if rule is relative to
   * @member {String} field
   */
  exports.prototype['field'] = undefined;
  /**
   * Value must be equal to this value. If value is specified \"true\" field must have any value selected
   * @member {String} equals
   */
  exports.prototype['equals'] = undefined;
  /**
   * Value must be not equal to this value.
   * @member {String} not-equals
   */
  exports.prototype['not-equals'] = undefined;
  /**
   * @member {Array.<module:model/MetaformVisibleIf>} and
   */
  exports.prototype['and'] = undefined;
  /**
   * @member {Array.<module:model/MetaformVisibleIf>} or
   */
  exports.prototype['or'] = undefined;



  return exports;
}));


