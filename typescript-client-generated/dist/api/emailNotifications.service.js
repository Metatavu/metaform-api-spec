"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var URI = require("urijs");
var api_1 = require("./api");
var EmailNotificationsService = /** @class */ (function () {
    function EmailNotificationsService(basePath, token) {
        this.token = token;
        this.basePath = basePath;
    }
    /**
     * Creates new form email notification
     * @summary create new form email notification
     * @param body Payload
     * @param realmId realm id
     * @param metaformId Metaform id
    */
    EmailNotificationsService.prototype.createEmailNotification = function (body, realmId, metaformId) {
        var uri = new URI(this.basePath + "/realms/" + encodeURIComponent(String(realmId)) + "/metaforms/" + encodeURIComponent(String(metaformId)) + "/emailNotifications");
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
     * Deletes an email notification
     * @summary Deletes an email notification
     * @param realmId realm id
     * @param metaformId Metaform id
     * @param emailNotificationId Email notification id
    */
    EmailNotificationsService.prototype.deleteEmailNotification = function (realmId, metaformId, emailNotificationId) {
        var uri = new URI(this.basePath + "/realms/" + encodeURIComponent(String(realmId)) + "/metaforms/" + encodeURIComponent(String(metaformId)) + "/emailNotifications/" + encodeURIComponent(String(emailNotificationId)));
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
     * Finds single email notification by id
     * @summary Find a single emai notification
     * @param realmId realm id
     * @param metaformId Metaform id
     * @param emailNotificationId EmailNotification id
    */
    EmailNotificationsService.prototype.findEmailNotification = function (realmId, metaformId, emailNotificationId) {
        var uri = new URI(this.basePath + "/realms/" + encodeURIComponent(String(realmId)) + "/metaforms/" + encodeURIComponent(String(metaformId)) + "/emailNotifications/" + encodeURIComponent(String(emailNotificationId)));
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
     * Lists email notifications
     * @summary Lists form email notifications
     * @param realmId realm id
     * @param metaformId Metaform id
    */
    EmailNotificationsService.prototype.listEmailNotifications = function (realmId, metaformId) {
        var uri = new URI(this.basePath + "/realms/" + encodeURIComponent(String(realmId)) + "/metaforms/" + encodeURIComponent(String(metaformId)) + "/emailNotifications");
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
     * Updates email notification
     * @summary Updates email notification
     * @param body Payload
     * @param realmId realm id
     * @param metaformId Metaform id
     * @param emailNotificationId EmailNotification id
    */
    EmailNotificationsService.prototype.updateEmailNotification = function (body, realmId, metaformId, emailNotificationId) {
        var uri = new URI(this.basePath + "/realms/" + encodeURIComponent(String(realmId)) + "/metaforms/" + encodeURIComponent(String(metaformId)) + "/emailNotifications/" + encodeURIComponent(String(emailNotificationId)));
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
    return EmailNotificationsService;
}());
exports.EmailNotificationsService = EmailNotificationsService;
