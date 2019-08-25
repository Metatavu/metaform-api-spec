"use strict";
function __export(m) {
    for (var p in m) if (!exports.hasOwnProperty(p)) exports[p] = m[p];
}
Object.defineProperty(exports, "__esModule", { value: true });
__export(require("./attachments.service"));
var attachments_service_1 = require("./attachments.service");
__export(require("./emailNotifications.service"));
var emailNotifications_service_1 = require("./emailNotifications.service");
__export(require("./exportThemeFiles.service"));
var exportThemeFiles_service_1 = require("./exportThemeFiles.service");
__export(require("./exportThemes.service"));
var exportThemes_service_1 = require("./exportThemes.service");
__export(require("./metaforms.service"));
var metaforms_service_1 = require("./metaforms.service");
__export(require("./replies.service"));
var replies_service_1 = require("./replies.service");
var ApiUtils = /** @class */ (function () {
    function ApiUtils() {
    }
    /**
     * Handles response from API
     *
     * @param response response object
     */
    ApiUtils.handleResponse = function (response) {
        switch (response.status) {
            case 204:
                return {};
            default:
                return response.json();
        }
    };
    return ApiUtils;
}());
exports.ApiUtils = ApiUtils;
exports.default = new /** @class */ (function () {
    function Api() {
        this.apiUrl = "http://localhost";
    }
    /**
     * Configures api endpoint
     *
     */
    Api.prototype.configure = function (baseUrl) {
        this.apiUrl = baseUrl;
    };
    Api.prototype.getAttachmentsService = function (token) {
        return new attachments_service_1.AttachmentsService(this.apiUrl, token);
    };
    Api.prototype.getEmailNotificationsService = function (token) {
        return new emailNotifications_service_1.EmailNotificationsService(this.apiUrl, token);
    };
    Api.prototype.getExportThemeFilesService = function (token) {
        return new exportThemeFiles_service_1.ExportThemeFilesService(this.apiUrl, token);
    };
    Api.prototype.getExportThemesService = function (token) {
        return new exportThemes_service_1.ExportThemesService(this.apiUrl, token);
    };
    Api.prototype.getMetaformsService = function (token) {
        return new metaforms_service_1.MetaformsService(this.apiUrl, token);
    };
    Api.prototype.getRepliesService = function (token) {
        return new replies_service_1.RepliesService(this.apiUrl, token);
    };
    return Api;
}());
