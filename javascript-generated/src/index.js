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

(function(factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/BadRequest', 'model/EmailNotification', 'model/ExportTheme', 'model/ExportThemeFile', 'model/Forbidden', 'model/InternalServerError', 'model/Metaform', 'model/MetaformField', 'model/MetaformFieldFlags', 'model/MetaformFieldOption', 'model/MetaformFieldType', 'model/MetaformSection', 'model/MetaformTableColumn', 'model/MetaformTableColumnType', 'model/MetaformTableColumnValues', 'model/MetaformVisibleIf', 'model/NotFound', 'model/NotImplemented', 'model/Reply', 'model/ReplyData', 'model/ReplyExportFormat', 'api/EmailNotificationsApi', 'api/ExportThemeFilesApi', 'api/ExportThemesApi', 'api/MetaformsApi', 'api/RepliesApi'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('./ApiClient'), require('./model/BadRequest'), require('./model/EmailNotification'), require('./model/ExportTheme'), require('./model/ExportThemeFile'), require('./model/Forbidden'), require('./model/InternalServerError'), require('./model/Metaform'), require('./model/MetaformField'), require('./model/MetaformFieldFlags'), require('./model/MetaformFieldOption'), require('./model/MetaformFieldType'), require('./model/MetaformSection'), require('./model/MetaformTableColumn'), require('./model/MetaformTableColumnType'), require('./model/MetaformTableColumnValues'), require('./model/MetaformVisibleIf'), require('./model/NotFound'), require('./model/NotImplemented'), require('./model/Reply'), require('./model/ReplyData'), require('./model/ReplyExportFormat'), require('./api/EmailNotificationsApi'), require('./api/ExportThemeFilesApi'), require('./api/ExportThemesApi'), require('./api/MetaformsApi'), require('./api/RepliesApi'));
  }
}(function(ApiClient, BadRequest, EmailNotification, ExportTheme, ExportThemeFile, Forbidden, InternalServerError, Metaform, MetaformField, MetaformFieldFlags, MetaformFieldOption, MetaformFieldType, MetaformSection, MetaformTableColumn, MetaformTableColumnType, MetaformTableColumnValues, MetaformVisibleIf, NotFound, NotImplemented, Reply, ReplyData, ReplyExportFormat, EmailNotificationsApi, ExportThemeFilesApi, ExportThemesApi, MetaformsApi, RepliesApi) {
  'use strict';

  /**
   * REST_API_for_Metaform.<br>
   * The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
   * <p>
   * An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
   * <pre>
   * var MetaformApiClient = require('index'); // See note below*.
   * var xxxSvc = new MetaformApiClient.XxxApi(); // Allocate the API class we're going to use.
   * var yyyModel = new MetaformApiClient.Yyy(); // Construct a model instance.
   * yyyModel.someProperty = 'someValue';
   * ...
   * var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
   * ...
   * </pre>
   * <em>*NOTE: For a top-level AMD script, use require(['index'], function(){...})
   * and put the application logic within the callback function.</em>
   * </p>
   * <p>
   * A non-AMD browser application (discouraged) might do something like this:
   * <pre>
   * var xxxSvc = new MetaformApiClient.XxxApi(); // Allocate the API class we're going to use.
   * var yyy = new MetaformApiClient.Yyy(); // Construct a model instance.
   * yyyModel.someProperty = 'someValue';
   * ...
   * var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
   * ...
   * </pre>
   * </p>
   * @module index
   * @version 0.0.13
   */
  var exports = {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient: ApiClient,
    /**
     * The BadRequest model constructor.
     * @property {module:model/BadRequest}
     */
    BadRequest: BadRequest,
    /**
     * The EmailNotification model constructor.
     * @property {module:model/EmailNotification}
     */
    EmailNotification: EmailNotification,
    /**
     * The ExportTheme model constructor.
     * @property {module:model/ExportTheme}
     */
    ExportTheme: ExportTheme,
    /**
     * The ExportThemeFile model constructor.
     * @property {module:model/ExportThemeFile}
     */
    ExportThemeFile: ExportThemeFile,
    /**
     * The Forbidden model constructor.
     * @property {module:model/Forbidden}
     */
    Forbidden: Forbidden,
    /**
     * The InternalServerError model constructor.
     * @property {module:model/InternalServerError}
     */
    InternalServerError: InternalServerError,
    /**
     * The Metaform model constructor.
     * @property {module:model/Metaform}
     */
    Metaform: Metaform,
    /**
     * The MetaformField model constructor.
     * @property {module:model/MetaformField}
     */
    MetaformField: MetaformField,
    /**
     * The MetaformFieldFlags model constructor.
     * @property {module:model/MetaformFieldFlags}
     */
    MetaformFieldFlags: MetaformFieldFlags,
    /**
     * The MetaformFieldOption model constructor.
     * @property {module:model/MetaformFieldOption}
     */
    MetaformFieldOption: MetaformFieldOption,
    /**
     * The MetaformFieldType model constructor.
     * @property {module:model/MetaformFieldType}
     */
    MetaformFieldType: MetaformFieldType,
    /**
     * The MetaformSection model constructor.
     * @property {module:model/MetaformSection}
     */
    MetaformSection: MetaformSection,
    /**
     * The MetaformTableColumn model constructor.
     * @property {module:model/MetaformTableColumn}
     */
    MetaformTableColumn: MetaformTableColumn,
    /**
     * The MetaformTableColumnType model constructor.
     * @property {module:model/MetaformTableColumnType}
     */
    MetaformTableColumnType: MetaformTableColumnType,
    /**
     * The MetaformTableColumnValues model constructor.
     * @property {module:model/MetaformTableColumnValues}
     */
    MetaformTableColumnValues: MetaformTableColumnValues,
    /**
     * The MetaformVisibleIf model constructor.
     * @property {module:model/MetaformVisibleIf}
     */
    MetaformVisibleIf: MetaformVisibleIf,
    /**
     * The NotFound model constructor.
     * @property {module:model/NotFound}
     */
    NotFound: NotFound,
    /**
     * The NotImplemented model constructor.
     * @property {module:model/NotImplemented}
     */
    NotImplemented: NotImplemented,
    /**
     * The Reply model constructor.
     * @property {module:model/Reply}
     */
    Reply: Reply,
    /**
     * The ReplyData model constructor.
     * @property {module:model/ReplyData}
     */
    ReplyData: ReplyData,
    /**
     * The ReplyExportFormat model constructor.
     * @property {module:model/ReplyExportFormat}
     */
    ReplyExportFormat: ReplyExportFormat,
    /**
     * The EmailNotificationsApi service constructor.
     * @property {module:api/EmailNotificationsApi}
     */
    EmailNotificationsApi: EmailNotificationsApi,
    /**
     * The ExportThemeFilesApi service constructor.
     * @property {module:api/ExportThemeFilesApi}
     */
    ExportThemeFilesApi: ExportThemeFilesApi,
    /**
     * The ExportThemesApi service constructor.
     * @property {module:api/ExportThemesApi}
     */
    ExportThemesApi: ExportThemesApi,
    /**
     * The MetaformsApi service constructor.
     * @property {module:api/MetaformsApi}
     */
    MetaformsApi: MetaformsApi,
    /**
     * The RepliesApi service constructor.
     * @property {module:api/RepliesApi}
     */
    RepliesApi: RepliesApi
  };

  return exports;
}));
