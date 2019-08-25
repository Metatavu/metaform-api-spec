import { BadRequest } from '../model/badRequest';
import { EmailNotification } from '../model/emailNotification';
import { Forbidden } from '../model/forbidden';
import { InternalServerError } from '../model/internalServerError';
import { NotFound } from '../model/notFound';
import * as URI from "urijs";
import { ApiUtils } from "./api";

export class EmailNotificationsService {

  private token: string;
  private basePath: string;

  constructor(basePath: string, token: string) {
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
  public createEmailNotification(body: EmailNotification, realmId: string, metaformId: string, ):Promise<EmailNotification> {
    const uri = new URI(`${this.basePath}/realms/${encodeURIComponent(String(realmId))}/metaforms/${encodeURIComponent(String(metaformId))}/emailNotifications`);
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
   * Deletes an email notification
   * @summary Deletes an email notification
   * @param realmId realm id
   * @param metaformId Metaform id
   * @param emailNotificationId Email notification id
  */
  public deleteEmailNotification(realmId: string, metaformId: string, emailNotificationId: string, ):Promise<any> {
    const uri = new URI(`${this.basePath}/realms/${encodeURIComponent(String(realmId))}/metaforms/${encodeURIComponent(String(metaformId))}/emailNotifications/${encodeURIComponent(String(emailNotificationId))}`);
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
   * Finds single email notification by id
   * @summary Find a single emai notification
   * @param realmId realm id
   * @param metaformId Metaform id
   * @param emailNotificationId EmailNotification id
  */
  public findEmailNotification(realmId: string, metaformId: string, emailNotificationId: string, ):Promise<EmailNotification> {
    const uri = new URI(`${this.basePath}/realms/${encodeURIComponent(String(realmId))}/metaforms/${encodeURIComponent(String(metaformId))}/emailNotifications/${encodeURIComponent(String(emailNotificationId))}`);
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
   * Lists email notifications
   * @summary Lists form email notifications
   * @param realmId realm id
   * @param metaformId Metaform id
  */
  public listEmailNotifications(realmId: string, metaformId: string, ):Promise<Array<EmailNotification>> {
    const uri = new URI(`${this.basePath}/realms/${encodeURIComponent(String(realmId))}/metaforms/${encodeURIComponent(String(metaformId))}/emailNotifications`);
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
   * Updates email notification
   * @summary Updates email notification
   * @param body Payload
   * @param realmId realm id
   * @param metaformId Metaform id
   * @param emailNotificationId EmailNotification id
  */
  public updateEmailNotification(body: EmailNotification, realmId: string, metaformId: string, emailNotificationId: string, ):Promise<EmailNotification> {
    const uri = new URI(`${this.basePath}/realms/${encodeURIComponent(String(realmId))}/metaforms/${encodeURIComponent(String(metaformId))}/emailNotifications/${encodeURIComponent(String(emailNotificationId))}`);
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