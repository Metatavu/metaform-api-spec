"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var URI = require("urijs");
var api_1 = require("./api");
var ExportThemesService = /** @class */ (function () {
    function ExportThemesService(basePath, token) {
        this.token = token;
        this.basePath = basePath;
    }
    /**
     * Creates new form export theme
     * @summary create new form export theme
     * @param body Payload
     * @param realmId realm id
    */
    ExportThemesService.prototype.createExportTheme = function (body, realmId) {
        var uri = new URI(this.basePath + "/realms/" + encodeURIComponent(String(realmId)) + "/exportThemes");
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
     * Creates new export theme file
     * @summary create new export theme file
     * @param body Payload
     * @param realmId realm id
     * @param exportThemeId export theme id
    */
    ExportThemesService.prototype.createExportThemeFile = function (body, realmId, exportThemeId) {
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
     * Deletes an export theme
     * @summary Deletes an export theme
     * @param realmId realm id
     * @param exportThemeId export theme id
    */
    ExportThemesService.prototype.deleteExportTheme = function (realmId, exportThemeId) {
        var uri = new URI(this.basePath + "/realms/" + encodeURIComponent(String(realmId)) + "/exportThemes/" + encodeURIComponent(String(exportThemeId)));
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
     * Deletes an export theme file
     * @summary Deletes an export theme file
     * @param realmId realm id
     * @param exportThemeId export theme id
     * @param exportThemeFileId export theme file id
    */
    ExportThemesService.prototype.deleteExportThemeFile = function (realmId, exportThemeId, exportThemeFileId) {
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
     * Finds single export theme
     * @summary Finds single export theme
     * @param realmId realm id
     * @param exportThemeId export theme id
    */
    ExportThemesService.prototype.findExportTheme = function (realmId, exportThemeId) {
        var uri = new URI(this.basePath + "/realms/" + encodeURIComponent(String(realmId)) + "/exportThemes/" + encodeURIComponent(String(exportThemeId)));
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
     * Finds single export theme file
     * @summary Finds single export theme file
     * @param realmId realm id
     * @param exportThemeId export theme id
     * @param exportThemeFileId export theme file id
    */
    ExportThemesService.prototype.findExportThemeFile = function (realmId, exportThemeId, exportThemeFileId) {
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
    ExportThemesService.prototype.listExportThemeFiles = function (realmId, exportThemeId) {
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
     * Lists export themes
     * @summary Lists form export themes
     * @param realmId realm id
    */
    ExportThemesService.prototype.listExportThemes = function (realmId) {
        var uri = new URI(this.basePath + "/realms/" + encodeURIComponent(String(realmId)) + "/exportThemes");
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
     * Updates export theme
     * @summary Updates export theme
     * @param body Payload
     * @param realmId realm id
     * @param exportThemeId ExportTheme id
    */
    ExportThemesService.prototype.updateExportTheme = function (body, realmId, exportThemeId) {
        var uri = new URI(this.basePath + "/realms/" + encodeURIComponent(String(realmId)) + "/exportThemes/" + encodeURIComponent(String(exportThemeId)));
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
    /**
     * Updates export theme file
     * @summary Updates export theme file
     * @param body Payload
     * @param realmId realm id
     * @param exportThemeId ExportTheme id
     * @param exportThemeFileId ExportThemeFile file id
    */
    ExportThemesService.prototype.updateExportThemeFile = function (body, realmId, exportThemeId, exportThemeFileId) {
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
    return ExportThemesService;
}());
exports.ExportThemesService = ExportThemesService;
