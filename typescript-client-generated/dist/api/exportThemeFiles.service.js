"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var URI = require("urijs");
var api_1 = require("./api");
var ExportThemeFilesService = /** @class */ (function () {
    function ExportThemeFilesService(basePath, token) {
        this.token = token;
        this.basePath = basePath;
    }
    /**
     * Creates new export theme file
     * @summary create new export theme file
     * @param body Payload
     * @param realmId realm id
     * @param exportThemeId export theme id
    */
    ExportThemeFilesService.prototype.createExportThemeFile = function (body, realmId, exportThemeId) {
        var uri = new URI(this.basePath + "/realms/" + encodeURIComponent(String(realmId)) + "/exportThemes/" + encodeURIComponent(String(exportThemeId)) + "/files");
        var options = {
            method: "post",
            headers: {
                "Content-Type": "application/json",
                "Authorization": "Bearer " + this.token
            },
            body: JSON.stringify(body)
        };
        return fetch(uri.toString(), options).then(function (response) {
            return api_1.ApiUtils.handleResponse(response);
        });
    };
    /**
     * Deletes an export theme file
     * @summary Deletes an export theme file
     * @param realmId realm id
     * @param exportThemeId export theme id
     * @param exportThemeFileId export theme file id
    */
    ExportThemeFilesService.prototype.deleteExportThemeFile = function (realmId, exportThemeId, exportThemeFileId) {
        var uri = new URI(this.basePath + "/realms/" + encodeURIComponent(String(realmId)) + "/exportThemes/" + encodeURIComponent(String(exportThemeId)) + "/files/" + encodeURIComponent(String(exportThemeFileId)));
        var options = {
            method: "delete",
            headers: {
                "Content-Type": "application/json",
                "Authorization": "Bearer " + this.token
            }
        };
        return fetch(uri.toString(), options).then(function (response) {
            return api_1.ApiUtils.handleResponse(response);
        });
    };
    /**
     * Finds single export theme file
     * @summary Finds single export theme file
     * @param realmId realm id
     * @param exportThemeId export theme id
     * @param exportThemeFileId export theme file id
    */
    ExportThemeFilesService.prototype.findExportThemeFile = function (realmId, exportThemeId, exportThemeFileId) {
        var uri = new URI(this.basePath + "/realms/" + encodeURIComponent(String(realmId)) + "/exportThemes/" + encodeURIComponent(String(exportThemeId)) + "/files/" + encodeURIComponent(String(exportThemeFileId)));
        var options = {
            method: "get",
            headers: {
                "Content-Type": "application/json",
                "Authorization": "Bearer " + this.token
            }
        };
        return fetch(uri.toString(), options).then(function (response) {
            return api_1.ApiUtils.handleResponse(response);
        });
    };
    /**
     * Lists files of export theme
     * @summary Lists files of export theme
     * @param realmId realm id
     * @param exportThemeId export theme id
    */
    ExportThemeFilesService.prototype.listExportThemeFiles = function (realmId, exportThemeId) {
        var uri = new URI(this.basePath + "/realms/" + encodeURIComponent(String(realmId)) + "/exportThemes/" + encodeURIComponent(String(exportThemeId)) + "/files");
        var options = {
            method: "get",
            headers: {
                "Content-Type": "application/json",
                "Authorization": "Bearer " + this.token
            }
        };
        return fetch(uri.toString(), options).then(function (response) {
            return api_1.ApiUtils.handleResponse(response);
        });
    };
    /**
     * Updates export theme file
     * @summary Updates export theme file
     * @param body Payload
     * @param realmId realm id
     * @param exportThemeId ExportTheme id
     * @param exportThemeFileId ExportThemeFile file id
    */
    ExportThemeFilesService.prototype.updateExportThemeFile = function (body, realmId, exportThemeId, exportThemeFileId) {
        var uri = new URI(this.basePath + "/realms/" + encodeURIComponent(String(realmId)) + "/exportThemes/" + encodeURIComponent(String(exportThemeId)) + "/files/" + encodeURIComponent(String(exportThemeFileId)));
        var options = {
            method: "put",
            headers: {
                "Content-Type": "application/json",
                "Authorization": "Bearer " + this.token
            },
            body: JSON.stringify(body)
        };
        return fetch(uri.toString(), options).then(function (response) {
            return api_1.ApiUtils.handleResponse(response);
        });
    };
    return ExportThemeFilesService;
}());
exports.ExportThemeFilesService = ExportThemeFilesService;
