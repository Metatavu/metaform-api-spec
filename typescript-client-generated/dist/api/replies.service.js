"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var URI = require("urijs");
var api_1 = require("./api");
var RepliesService = /** @class */ (function () {
    function RepliesService(basePath, token) {
        this.token = token;
        this.basePath = basePath;
    }
    /**
     * Exports metaform data
     * @summary Exports metaform data
     * @param realmId realm id
     * @param metaformId Metaform id
     * @param format Export results in specified format (XLSX)
    */
    RepliesService.prototype._export = function (realmId, metaformId, format) {
        var uri = new URI(this.basePath + "/realms/" + encodeURIComponent(String(realmId)) + "/metaforms/" + encodeURIComponent(String(metaformId)) + "/export");
        if (format !== undefined && format !== null) {
            uri.addQuery('format', format);
        }
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
     * Creates new form reply
     * @summary create new form reply
     * @param body Payload
     * @param realmId realm id
     * @param metaformId Metaform id
     * @param updateExisting specifies that existing reply should be updated. DEPRECATED, use replymode instead
     * @param replyMode specifies reply mode that will be used. possible values UPDATE, REVISION, CUMULATIVE
    */
    RepliesService.prototype.createReply = function (body, realmId, metaformId, updateExisting, replyMode) {
        var uri = new URI(this.basePath + "/realms/" + encodeURIComponent(String(realmId)) + "/metaforms/" + encodeURIComponent(String(metaformId)) + "/replies");
        if (updateExisting !== undefined && updateExisting !== null) {
            uri.addQuery('updateExisting', updateExisting);
        }
        if (replyMode !== undefined && replyMode !== null) {
            uri.addQuery('replyMode', replyMode);
        }
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
     * Deletes a reply
     * @summary Deletes a reply
     * @param realmId realm id
     * @param metaformId Metaform id
     * @param replyId Reply id
    */
    RepliesService.prototype.deleteReply = function (realmId, metaformId, replyId) {
        var uri = new URI(this.basePath + "/realms/" + encodeURIComponent(String(realmId)) + "/metaforms/" + encodeURIComponent(String(metaformId)) + "/replies/" + encodeURIComponent(String(replyId)));
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
     * Finds single reply by id
     * @summary Find a single reply
     * @param realmId realm id
     * @param metaformId Metaform id
     * @param replyId Reply id
    */
    RepliesService.prototype.findReply = function (realmId, metaformId, replyId) {
        var uri = new URI(this.basePath + "/realms/" + encodeURIComponent(String(realmId)) + "/metaforms/" + encodeURIComponent(String(metaformId)) + "/replies/" + encodeURIComponent(String(replyId)));
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
     * Lists form replies
     * @summary Lists form replies
     * @param realmId realm id
     * @param metaformId Metaform id
     * @param userId Filter results by user id. If this parameter is not specified all replies are returned, this requires logged user to have proper permission to do so
     * @param createdBefore Filter results created before specified time
     * @param createdAfter Filter results created after specified time
     * @param modifiedBefore Filter results modified before specified time
     * @param modifiedAfter Filter results modified after specified time
     * @param includeRevisions Specifies that revisions should be included into response
     * @param fields Filter results by field values. Format is field:value, multiple values can be added by using comma separator. E.g. field1&#x3D;value,field2&#x3D;another
     * @param firstResult First index of results to be returned
     * @param maxResults How many items to return at one time
    */
    RepliesService.prototype.listReplies = function (realmId, metaformId, userId, createdBefore, createdAfter, modifiedBefore, modifiedAfter, includeRevisions, fields, firstResult, maxResults) {
        var uri = new URI(this.basePath + "/realms/" + encodeURIComponent(String(realmId)) + "/metaforms/" + encodeURIComponent(String(metaformId)) + "/replies");
        if (userId !== undefined && userId !== null) {
            uri.addQuery('userId', userId);
        }
        if (createdBefore !== undefined && createdBefore !== null) {
            uri.addQuery('createdBefore', createdBefore);
        }
        if (createdAfter !== undefined && createdAfter !== null) {
            uri.addQuery('createdAfter', createdAfter);
        }
        if (modifiedBefore !== undefined && modifiedBefore !== null) {
            uri.addQuery('modifiedBefore', modifiedBefore);
        }
        if (modifiedAfter !== undefined && modifiedAfter !== null) {
            uri.addQuery('modifiedAfter', modifiedAfter);
        }
        if (includeRevisions !== undefined && includeRevisions !== null) {
            uri.addQuery('includeRevisions', includeRevisions);
        }
        if (fields) {
            fields.forEach(function (element) {
                uri.addQuery('fields', element);
            });
        }
        if (firstResult !== undefined && firstResult !== null) {
            uri.addQuery('firstResult', firstResult);
        }
        if (maxResults !== undefined && maxResults !== null) {
            uri.addQuery('maxResults', maxResults);
        }
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
     * Exports reply data
     * @summary Exports reply data
     * @param realmId realm id
     * @param metaformId Metaform id
     * @param replyId Reply id
     * @param format Export results in specified format (PDF)
    */
    RepliesService.prototype.replyExport = function (realmId, metaformId, replyId, format) {
        var uri = new URI(this.basePath + "/realms/" + encodeURIComponent(String(realmId)) + "/metaforms/" + encodeURIComponent(String(metaformId)) + "/replies/" + encodeURIComponent(String(replyId)) + "/export");
        if (format !== undefined && format !== null) {
            uri.addQuery('format', format);
        }
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
     * Updates reply
     * @summary Updates reply
     * @param body Payload
     * @param realmId realm id
     * @param metaformId Metaform id
     * @param replyId Reply id
    */
    RepliesService.prototype.updateReply = function (body, realmId, metaformId, replyId) {
        var uri = new URI(this.basePath + "/realms/" + encodeURIComponent(String(realmId)) + "/metaforms/" + encodeURIComponent(String(metaformId)) + "/replies/" + encodeURIComponent(String(replyId)));
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
    return RepliesService;
}());
exports.RepliesService = RepliesService;
