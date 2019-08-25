"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var URI = require("urijs");
var api_1 = require("./api");
var MetaformsService = /** @class */ (function () {
    function MetaformsService(basePath, token) {
        this.token = token;
        this.basePath = basePath;
    }
    /**
     * Creates new Metaform
     * @summary create new Metaform
     * @param body Payload
     * @param realmId realm id
    */
    MetaformsService.prototype.createMetaform = function (body, realmId) {
        var uri = new URI(this.basePath + "/realms/" + encodeURIComponent(String(realmId)) + "/metaforms");
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
     * Deletes a Metaform
     * @summary Deletes Metaform
     * @param realmId realm id
     * @param metaformId Metaform id
    */
    MetaformsService.prototype.deleteMetaform = function (realmId, metaformId) {
        var uri = new URI(this.basePath + "/realms/" + encodeURIComponent(String(realmId)) + "/metaforms/" + encodeURIComponent(String(metaformId)));
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
     * Finds a single Metaform
     * @summary Finds single Metaform
     * @param realmId realm id
     * @param metaformId Metaform id
    */
    MetaformsService.prototype.findMetaform = function (realmId, metaformId) {
        var uri = new URI(this.basePath + "/realms/" + encodeURIComponent(String(realmId)) + "/metaforms/" + encodeURIComponent(String(metaformId)));
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
     * Lists Metaforms from the realm. User receives only metaforms where he/she has permission to.
     * @summary Lists Metaforms
     * @param realmId realm id
    */
    MetaformsService.prototype.listMetaforms = function (realmId) {
        var uri = new URI(this.basePath + "/realms/" + encodeURIComponent(String(realmId)) + "/metaforms");
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
     * Updates a Metaform
     * @summary Updates Metaform
     * @param body Payload
     * @param realmId realm id
     * @param metaformId Metaform id
    */
    MetaformsService.prototype.updateMetaform = function (body, realmId, metaformId) {
        var uri = new URI(this.basePath + "/realms/" + encodeURIComponent(String(realmId)) + "/metaforms/" + encodeURIComponent(String(metaformId)));
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
    return MetaformsService;
}());
exports.MetaformsService = MetaformsService;
