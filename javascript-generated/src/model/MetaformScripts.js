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
    define(['ApiClient', 'model/MetaformScript'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./MetaformScript'));
  } else {
    // Browser globals (root is window)
    if (!root.MetaformApiClient) {
      root.MetaformApiClient = {};
    }
    root.MetaformApiClient.MetaformScripts = factory(root.MetaformApiClient.ApiClient, root.MetaformApiClient.MetaformScript);
  }
}(this, function(ApiClient, MetaformScript) {
  'use strict';




  /**
   * The MetaformScripts model module.
   * @module model/MetaformScripts
   * @version 0.1.5
   */

  /**
   * Constructs a new <code>MetaformScripts</code>.
   * @alias module:model/MetaformScripts
   * @class
   */
  var exports = function() {
    var _this = this;



  };

  /**
   * Constructs a <code>MetaformScripts</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MetaformScripts} obj Optional instance to populate.
   * @return {module:model/MetaformScripts} The populated <code>MetaformScripts</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('afterCreateReply')) {
        obj['afterCreateReply'] = ApiClient.convertToType(data['afterCreateReply'], [MetaformScript]);
      }
      if (data.hasOwnProperty('afterUpdateReply')) {
        obj['afterUpdateReply'] = ApiClient.convertToType(data['afterUpdateReply'], [MetaformScript]);
      }
    }
    return obj;
  }

  /**
   * List of scripts run after new reply is created
   * @member {Array.<module:model/MetaformScript>} afterCreateReply
   */
  exports.prototype['afterCreateReply'] = undefined;
  /**
   * List of scripts run after a reply is updated
   * @member {Array.<module:model/MetaformScript>} afterUpdateReply
   */
  exports.prototype['afterUpdateReply'] = undefined;



  return exports;
}));


