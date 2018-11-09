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
    define(['ApiClient', 'model/MetaformFieldFlags', 'model/MetaformFieldOption', 'model/MetaformFieldPermissioncontexts', 'model/MetaformFieldType', 'model/MetaformTableColumn', 'model/MetaformVisibleIf'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./MetaformFieldFlags'), require('./MetaformFieldOption'), require('./MetaformFieldPermissioncontexts'), require('./MetaformFieldType'), require('./MetaformTableColumn'), require('./MetaformVisibleIf'));
  } else {
    // Browser globals (root is window)
    if (!root.MetaformApiClient) {
      root.MetaformApiClient = {};
    }
    root.MetaformApiClient.MetaformField = factory(root.MetaformApiClient.ApiClient, root.MetaformApiClient.MetaformFieldFlags, root.MetaformApiClient.MetaformFieldOption, root.MetaformApiClient.MetaformFieldPermissioncontexts, root.MetaformApiClient.MetaformFieldType, root.MetaformApiClient.MetaformTableColumn, root.MetaformApiClient.MetaformVisibleIf);
  }
}(this, function(ApiClient, MetaformFieldFlags, MetaformFieldOption, MetaformFieldPermissioncontexts, MetaformFieldType, MetaformTableColumn, MetaformVisibleIf) {
  'use strict';




  /**
   * The MetaformField model module.
   * @module model/MetaformField
   * @version 0.0.22
   */

  /**
   * Constructs a new <code>MetaformField</code>.
   * @alias module:model/MetaformField
   * @class
   * @param type {module:model/MetaformFieldType} 
   */
  var exports = function(type) {
    var _this = this;




    _this['type'] = type;


























  };

  /**
   * Constructs a <code>MetaformField</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MetaformField} obj Optional instance to populate.
   * @return {module:model/MetaformField} The populated <code>MetaformField</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('visible-if')) {
        obj['visible-if'] = MetaformVisibleIf.constructFromObject(data['visible-if']);
      }
      if (data.hasOwnProperty('permission-contexts')) {
        obj['permission-contexts'] = MetaformFieldPermissioncontexts.constructFromObject(data['permission-contexts']);
      }
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('type')) {
        obj['type'] = MetaformFieldType.constructFromObject(data['type']);
      }
      if (data.hasOwnProperty('title')) {
        obj['title'] = ApiClient.convertToType(data['title'], 'String');
      }
      if (data.hasOwnProperty('required')) {
        obj['required'] = ApiClient.convertToType(data['required'], 'Boolean');
      }
      if (data.hasOwnProperty('contexts')) {
        obj['contexts'] = ApiClient.convertToType(data['contexts'], ['String']);
      }
      if (data.hasOwnProperty('flags')) {
        obj['flags'] = MetaformFieldFlags.constructFromObject(data['flags']);
      }
      if (data.hasOwnProperty('placeholder')) {
        obj['placeholder'] = ApiClient.convertToType(data['placeholder'], 'String');
      }
      if (data.hasOwnProperty('class')) {
        obj['class'] = ApiClient.convertToType(data['class'], 'String');
      }
      if (data.hasOwnProperty('readonly')) {
        obj['readonly'] = ApiClient.convertToType(data['readonly'], 'Boolean');
      }
      if (data.hasOwnProperty('help')) {
        obj['help'] = ApiClient.convertToType(data['help'], 'String');
      }
      if (data.hasOwnProperty('default')) {
        obj['default'] = ApiClient.convertToType(data['default'], 'String');
      }
      if (data.hasOwnProperty('min')) {
        obj['min'] = ApiClient.convertToType(data['min'], 'Number');
      }
      if (data.hasOwnProperty('max')) {
        obj['max'] = ApiClient.convertToType(data['max'], 'Number');
      }
      if (data.hasOwnProperty('step')) {
        obj['step'] = ApiClient.convertToType(data['step'], 'Number');
      }
      if (data.hasOwnProperty('checked')) {
        obj['checked'] = ApiClient.convertToType(data['checked'], 'Boolean');
      }
      if (data.hasOwnProperty('printable')) {
        obj['printable'] = ApiClient.convertToType(data['printable'], 'Boolean');
      }
      if (data.hasOwnProperty('options')) {
        obj['options'] = ApiClient.convertToType(data['options'], [MetaformFieldOption]);
      }
      if (data.hasOwnProperty('source-url')) {
        obj['source-url'] = ApiClient.convertToType(data['source-url'], 'String');
      }
      if (data.hasOwnProperty('upload-url')) {
        obj['upload-url'] = ApiClient.convertToType(data['upload-url'], 'String');
      }
      if (data.hasOwnProperty('single-file')) {
        obj['single-file'] = ApiClient.convertToType(data['single-file'], 'Boolean');
      }
      if (data.hasOwnProperty('only-images')) {
        obj['only-images'] = ApiClient.convertToType(data['only-images'], 'Boolean');
      }
      if (data.hasOwnProperty('max-file-size')) {
        obj['max-file-size'] = ApiClient.convertToType(data['max-file-size'], 'Number');
      }
      if (data.hasOwnProperty('add-rows')) {
        obj['add-rows'] = ApiClient.convertToType(data['add-rows'], 'Boolean');
      }
      if (data.hasOwnProperty('draggable')) {
        obj['draggable'] = ApiClient.convertToType(data['draggable'], 'Boolean');
      }
      if (data.hasOwnProperty('columns')) {
        obj['columns'] = ApiClient.convertToType(data['columns'], [MetaformTableColumn]);
      }
      if (data.hasOwnProperty('src')) {
        obj['src'] = ApiClient.convertToType(data['src'], 'String');
      }
      if (data.hasOwnProperty('text')) {
        obj['text'] = ApiClient.convertToType(data['text'], 'String');
      }
      if (data.hasOwnProperty('html')) {
        obj['html'] = ApiClient.convertToType(data['html'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {module:model/MetaformVisibleIf} visible-if
   */
  exports.prototype['visible-if'] = undefined;
  /**
   * @member {module:model/MetaformFieldPermissioncontexts} permission-contexts
   */
  exports.prototype['permission-contexts'] = undefined;
  /**
   * Field name
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * @member {module:model/MetaformFieldType} type
   */
  exports.prototype['type'] = undefined;
  /**
   * @member {String} title
   */
  exports.prototype['title'] = undefined;
  /**
   * @member {Boolean} required
   */
  exports.prototype['required'] = undefined;
  /**
   * @member {Array.<String>} contexts
   */
  exports.prototype['contexts'] = undefined;
  /**
   * @member {module:model/MetaformFieldFlags} flags
   */
  exports.prototype['flags'] = undefined;
  /**
   * @member {String} placeholder
   */
  exports.prototype['placeholder'] = undefined;
  /**
   * @member {String} class
   */
  exports.prototype['class'] = undefined;
  /**
   * @member {Boolean} readonly
   */
  exports.prototype['readonly'] = undefined;
  /**
   * @member {String} help
   */
  exports.prototype['help'] = undefined;
  /**
   * a default value for a field
   * @member {String} default
   */
  exports.prototype['default'] = undefined;
  /**
   * Minimum value for a field. Only for number fields
   * @member {Number} min
   */
  exports.prototype['min'] = undefined;
  /**
   * Maximum value for a field. Only for number fields
   * @member {Number} max
   */
  exports.prototype['max'] = undefined;
  /**
   * Value step for a field. Only for number fields
   * @member {Number} step
   */
  exports.prototype['step'] = undefined;
  /**
   * Whether checkbox should be checked by default. Only for checkbox fields
   * @member {Boolean} checked
   */
  exports.prototype['checked'] = undefined;
  /**
   * Defines whether field is printable or not. Only for table fields
   * @member {Boolean} printable
   */
  exports.prototype['printable'] = undefined;
  /**
   * Options for radio, checklist, select fields
   * @member {Array.<module:model/MetaformFieldOption>} options
   */
  exports.prototype['options'] = undefined;
  /**
   * Source url for autocomplete and autocomplete-multiple fields
   * @member {String} source-url
   */
  exports.prototype['source-url'] = undefined;
  /**
   * Upload url for files field.
   * @member {String} upload-url
   */
  exports.prototype['upload-url'] = undefined;
  /**
   * Defines whether file fields allow multiple files or just one
   * @member {Boolean} single-file
   */
  exports.prototype['single-file'] = undefined;
  /**
   * Defines whether file fields allow only images
   * @member {Boolean} only-images
   */
  exports.prototype['only-images'] = undefined;
  /**
   * Maximum upload size for image filds
   * @member {Number} max-file-size
   */
  exports.prototype['max-file-size'] = undefined;
  /**
   * Defines whether user can add more table rows.
   * @member {Boolean} add-rows
   */
  exports.prototype['add-rows'] = undefined;
  /**
   * Defines whether table rows should be draggable.
   * @member {Boolean} draggable
   */
  exports.prototype['draggable'] = undefined;
  /**
   * Columns for table fields
   * @member {Array.<module:model/MetaformTableColumn>} columns
   */
  exports.prototype['columns'] = undefined;
  /**
   * Url for logo field.
   * @member {String} src
   */
  exports.prototype['src'] = undefined;
  /**
   * Text for small field.
   * @member {String} text
   */
  exports.prototype['text'] = undefined;
  /**
   * Html code for html field.
   * @member {String} html
   */
  exports.prototype['html'] = undefined;



  return exports;
}));


