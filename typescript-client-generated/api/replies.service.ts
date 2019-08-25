import { BadRequest } from '../model/badRequest';
import { Forbidden } from '../model/forbidden';
import { InternalServerError } from '../model/internalServerError';
import { NotFound } from '../model/notFound';
import { Reply } from '../model/reply';
import * as URI from "urijs";
import { ApiUtils } from "./api";

export class RepliesService {

  private token: string;
  private basePath: string;

  constructor(basePath: string, token: string) {
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
  public _export(realmId: string, metaformId: string, format: string, ):Promise<string> {
    const uri = new URI(`${this.basePath}/realms/${encodeURIComponent(String(realmId))}/metaforms/${encodeURIComponent(String(metaformId))}/export`);
    if (format !== undefined && format !== null) {
        uri.addQuery('format', <any>format);
    }
    const options = {
      method: "get",
      headers: {
        "Content-Type": "application/json",
        "Authorization": `Bearer ${this.token}`
      }
    };

    return fetch(uri.toString(), options).then((response) => {
      return ApiUtils.handleResponse(response);
    });
  }


  /**
   * Creates new form reply
   * @summary create new form reply
   * @param body Payload
   * @param realmId realm id
   * @param metaformId Metaform id
   * @param updateExisting specifies that existing reply should be updated. DEPRECATED, use replymode instead
   * @param replyMode specifies reply mode that will be used. possible values UPDATE, REVISION, CUMULATIVE
  */
  public createReply(body: Reply, realmId: string, metaformId: string, updateExisting?: boolean, replyMode?: string, ):Promise<Reply> {
    const uri = new URI(`${this.basePath}/realms/${encodeURIComponent(String(realmId))}/metaforms/${encodeURIComponent(String(metaformId))}/replies`);
    if (updateExisting !== undefined && updateExisting !== null) {
        uri.addQuery('updateExisting', <any>updateExisting);
    }
    if (replyMode !== undefined && replyMode !== null) {
        uri.addQuery('replyMode', <any>replyMode);
    }
    const options = {
      method: "post",
      headers: {
        "Content-Type": "application/json",
        "Authorization": `Bearer ${this.token}`
      },
      body: JSON.stringify(body)
    };

    return fetch(uri.toString(), options).then((response) => {
      return ApiUtils.handleResponse(response);
    });
  }


  /**
   * Deletes a reply
   * @summary Deletes a reply
   * @param realmId realm id
   * @param metaformId Metaform id
   * @param replyId Reply id
  */
  public deleteReply(realmId: string, metaformId: string, replyId: string, ):Promise<any> {
    const uri = new URI(`${this.basePath}/realms/${encodeURIComponent(String(realmId))}/metaforms/${encodeURIComponent(String(metaformId))}/replies/${encodeURIComponent(String(replyId))}`);
    const options = {
      method: "delete",
      headers: {
        "Content-Type": "application/json",
        "Authorization": `Bearer ${this.token}`
      }
    };

    return fetch(uri.toString(), options).then((response) => {
      return ApiUtils.handleResponse(response);
    });
  }


  /**
   * Finds single reply by id
   * @summary Find a single reply
   * @param realmId realm id
   * @param metaformId Metaform id
   * @param replyId Reply id
  */
  public findReply(realmId: string, metaformId: string, replyId: string, ):Promise<Reply> {
    const uri = new URI(`${this.basePath}/realms/${encodeURIComponent(String(realmId))}/metaforms/${encodeURIComponent(String(metaformId))}/replies/${encodeURIComponent(String(replyId))}`);
    const options = {
      method: "get",
      headers: {
        "Content-Type": "application/json",
        "Authorization": `Bearer ${this.token}`
      }
    };

    return fetch(uri.toString(), options).then((response) => {
      return ApiUtils.handleResponse(response);
    });
  }


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
  public listReplies(realmId: string, metaformId: string, userId?: string, createdBefore?: string, createdAfter?: string, modifiedBefore?: string, modifiedAfter?: string, includeRevisions?: boolean, fields?: Array<string>, firstResult?: number, maxResults?: number, ):Promise<Array<Reply>> {
    const uri = new URI(`${this.basePath}/realms/${encodeURIComponent(String(realmId))}/metaforms/${encodeURIComponent(String(metaformId))}/replies`);
    if (userId !== undefined && userId !== null) {
        uri.addQuery('userId', <any>userId);
    }
    if (createdBefore !== undefined && createdBefore !== null) {
        uri.addQuery('createdBefore', <any>createdBefore);
    }
    if (createdAfter !== undefined && createdAfter !== null) {
        uri.addQuery('createdAfter', <any>createdAfter);
    }
    if (modifiedBefore !== undefined && modifiedBefore !== null) {
        uri.addQuery('modifiedBefore', <any>modifiedBefore);
    }
    if (modifiedAfter !== undefined && modifiedAfter !== null) {
        uri.addQuery('modifiedAfter', <any>modifiedAfter);
    }
    if (includeRevisions !== undefined && includeRevisions !== null) {
        uri.addQuery('includeRevisions', <any>includeRevisions);
    }
    if (fields) {
        fields.forEach((element) => {
          uri.addQuery('fields', <any>element);
        })
    }
    if (firstResult !== undefined && firstResult !== null) {
        uri.addQuery('firstResult', <any>firstResult);
    }
    if (maxResults !== undefined && maxResults !== null) {
        uri.addQuery('maxResults', <any>maxResults);
    }
    const options = {
      method: "get",
      headers: {
        "Content-Type": "application/json",
        "Authorization": `Bearer ${this.token}`
      }
    };

    return fetch(uri.toString(), options).then((response) => {
      return ApiUtils.handleResponse(response);
    });
  }


  /**
   * Exports reply data
   * @summary Exports reply data
   * @param realmId realm id
   * @param metaformId Metaform id
   * @param replyId Reply id
   * @param format Export results in specified format (PDF)
  */
  public replyExport(realmId: string, metaformId: string, replyId: string, format: string, ):Promise<string> {
    const uri = new URI(`${this.basePath}/realms/${encodeURIComponent(String(realmId))}/metaforms/${encodeURIComponent(String(metaformId))}/replies/${encodeURIComponent(String(replyId))}/export`);
    if (format !== undefined && format !== null) {
        uri.addQuery('format', <any>format);
    }
    const options = {
      method: "get",
      headers: {
        "Content-Type": "application/json",
        "Authorization": `Bearer ${this.token}`
      }
    };

    return fetch(uri.toString(), options).then((response) => {
      return ApiUtils.handleResponse(response);
    });
  }


  /**
   * Updates reply
   * @summary Updates reply
   * @param body Payload
   * @param realmId realm id
   * @param metaformId Metaform id
   * @param replyId Reply id
  */
  public updateReply(body: Reply, realmId: string, metaformId: string, replyId: string, ):Promise<any> {
    const uri = new URI(`${this.basePath}/realms/${encodeURIComponent(String(realmId))}/metaforms/${encodeURIComponent(String(metaformId))}/replies/${encodeURIComponent(String(replyId))}`);
    const options = {
      method: "put",
      headers: {
        "Content-Type": "application/json",
        "Authorization": `Bearer ${this.token}`
      },
      body: JSON.stringify(body)
    };

    return fetch(uri.toString(), options).then((response) => {
      return ApiUtils.handleResponse(response);
    });
  }

}