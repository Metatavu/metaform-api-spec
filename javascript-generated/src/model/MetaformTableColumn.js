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
    define(['ApiClient', 'model/MetaformTableColumnType', 'model/MetaformTableColumnValues'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./MetaformTableColumnType'), require('./MetaformTableColumnValues'));
  } else {
    // Browser globals (root is window)
    if (!root.MetaformApiClient) {
      root.MetaformApiClient = {};
    }
    root.MetaformApiClient.MetaformTableColumn = factory(root.MetaformApiClient.ApiClient, root.MetaformApiClient.MetaformTableColumnType, root.MetaformApiClient.MetaformTableColumnValues);
  }
}(this, function(ApiClient, MetaformTableColumnType, MetaformTableColumnValues) {
  'use strict';




  /**
   * The MetaformTableColumn model module.
   * @module model/MetaformTableColumn
   * @version 0.0.18
   */

  /**
   * Constructs a new <code>MetaformTableColumn</code>.
   * @alias module:model/MetaformTableColumn
   * @class
   * @param type {module:model/MetaformTableColumnType} 
   * @param name {String} Column name
   */
  var exports = function(type, name) {
    var _this = this;

    _this['type'] = type;
    _this['name'] = name;











  };

  /**
   * Constructs a <code>MetaformTableColumn</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MetaformTableColumn} obj Optional instance to populate.
   * @return {module:model/MetaformTableColumn} The populated <code>MetaformTableColumn</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('type')) {
        obj['type'] = MetaformTableColumnType.constructFromObject(data['type']);
      }
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('title')) {
        obj['title'] = ApiClient.convertToType(data['title'], 'String');
      }
      if (data.hasOwnProperty('calculate-sum')) {
        obj['calculate-sum'] = ApiClient.convertToType(data['calculate-sum'], 'Boolean');
      }
      if (data.hasOwnProperty('sum-postfix')) {
        obj['sum-postfix'] = ApiClient.convertToType(data['sum-postfix'], 'String');
      }
      if (data.hasOwnProperty('column-width')) {
        obj['column-width'] = ApiClient.convertToType(data['column-width'], 'Number');
      }
      if (data.hasOwnProperty('placeholder')) {
        obj['placeholder'] = ApiClient.convertToType(data['placeholder'], 'String');
      }
      if (data.hasOwnProperty('readonly')) {
        obj['readonly'] = ApiClient.convertToType(data['readonly'], 'Boolean');
      }
      if (data.hasOwnProperty('required')) {
        obj['required'] = ApiClient.convertToType(data['required'], 'Boolean');
      }
      if (data.hasOwnProperty('source-url')) {
        obj['source-url'] = ApiClient.convertToType(data['source-url'], 'String');
      }
      if (data.hasOwnProperty('html')) {
        obj['html'] = ApiClient.convertToType(data['html'], 'String');
      }
      if (data.hasOwnProperty('action')) {
        obj['action'] = ApiClient.convertToType(data['action'], 'String');
      }
      if (data.hasOwnProperty('values')) {
        obj['values'] = MetaformTableColumnValues.constructFromObject(data['values']);
      }
    }
    return obj;
  }

  /**
   * @member {module:model/MetaformTableColumnType} type
   */
  exports.prototype['type'] = undefined;
  /**
   * Column name
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * Column title
   * @member {String} title
   */
  exports.prototype['title'] = undefined;
  /**
   * Defines column should automatically calculate sum
   * @member {Boolean} calculate-sum
   */
  exports.prototype['calculate-sum'] = undefined;
  /**
   * Postfix for calculated sum
   * @member {String} sum-postfix
   */
  exports.prototype['sum-postfix'] = undefined;
  /**
   * Defines column width
   * @member {Number} column-width
   */
  exports.prototype['column-width'] = undefined;
  /**
   * Placeholder for column field
   * @member {String} placeholder
   */
  exports.prototype['placeholder'] = undefined;
  /**
   * Defines column as readonly
   * @member {Boolean} readonly
   */
  exports.prototype['readonly'] = undefined;
  /**
   * Defines column as requires
   * @member {Boolean} required
   */
  exports.prototype['required'] = undefined;
  /**
   * Defines source url for autocomplete columns
   * @member {String} source-url
   */
  exports.prototype['source-url'] = undefined;
  /**
   * Html code for html columns
   * @member {String} html
   */
  exports.prototype['html'] = undefined;
  /**
   * Action for button columns
   * @member {String} action
   */
  exports.prototype['action'] = undefined;
  /**
   * @member {module:model/MetaformTableColumnValues} values
   */
  exports.prototype['values'] = undefined;



  return exports;
}));


