import { Attachment } from '../model/attachment';
import { BadRequest } from '../model/badRequest';
import { Forbidden } from '../model/forbidden';
import { InternalServerError } from '../model/internalServerError';
import * as URI from "urijs";
import { ApiUtils } from "./api";

export class AttachmentsService {

  private token: string;
  private basePath: string;

  constructor(basePath: string, token: string) {
    this.token = token;
    this.basePath = basePath;
  }


  /**
   * Returns single attachment
   * @summary Find a attachment by id
   * @param realmId realm id
   * @param attachmentId Attachment id
  */
  public findAttachment(realmId: string, attachmentId: string, ):Promise<Attachment> {
    const uri = new URI(`${this.basePath}/realms/${encodeURIComponent(String(realmId))}/attachments/${encodeURIComponent(String(attachmentId))}`);
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
   * Returns attachment data
   * @summary Find a attachment data by id
   * @param realmId realm id
   * @param attachmentId Attachment id
  */
  public findAttachmentData(realmId: string, attachmentId: string, ):Promise<string> {
    const uri = new URI(`${this.basePath}/realms/${encodeURIComponent(String(realmId))}/attachments/${encodeURIComponent(String(attachmentId))}/data`);
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

}