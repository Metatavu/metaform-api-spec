"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var URI = require("urijs");
var api_1 = require("./api");
var AttachmentsService = /** @class */ (function () {
    function AttachmentsService(basePath, token) {
        this.token = token;
        this.basePath = basePath;
    }
    /**
     * Returns single attachment
     * @summary Find a attachment by id
     * @param realmId realm id
     * @param attachmentId Attachment id
    */
    AttachmentsService.prototype.findAttachment = function (realmId, attachmentId) {
        var uri = new URI(this.basePath + "/realms/" + encodeURIComponent(String(realmId)) + "/attachments/" + encodeURIComponent(String(attachmentId)));
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
     * Returns attachment data
     * @summary Find a attachment data by id
     * @param realmId realm id
     * @param attachmentId Attachment id
    */
    AttachmentsService.prototype.findAttachmentData = function (realmId, attachmentId) {
        var uri = new URI(this.basePath + "/realms/" + encodeURIComponent(String(realmId)) + "/attachments/" + encodeURIComponent(String(attachmentId)) + "/data");
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
    return AttachmentsService;
}());
exports.AttachmentsService = AttachmentsService;
