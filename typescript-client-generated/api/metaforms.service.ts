import { BadRequest } from '../model/badRequest';
import { Forbidden } from '../model/forbidden';
import { InternalServerError } from '../model/internalServerError';
import { Metaform } from '../model/metaform';
import { NotFound } from '../model/notFound';
import * as URI from "urijs";
import { ApiUtils } from "./api";

export class MetaformsService {

  private token: string;
  private basePath: string;

  constructor(basePath: string, token: string) {
    this.token = token;
    this.basePath = basePath;
  }


  /**
   * Creates new Metaform
   * @summary create new Metaform
   * @param body Payload
   * @param realmId realm id
  */
  public createMetaform(body: Metaform, realmId: string, ):Promise<Metaform> {
    const uri = new URI(`${this.basePath}/realms/${encodeURIComponent(String(realmId))}/metaforms`);
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
   * Deletes a Metaform
   * @summary Deletes Metaform
   * @param realmId realm id
   * @param metaformId Metaform id
  */
  public deleteMetaform(realmId: string, metaformId: string, ):Promise<any> {
    const uri = new URI(`${this.basePath}/realms/${encodeURIComponent(String(realmId))}/metaforms/${encodeURIComponent(String(metaformId))}`);
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
   * Finds a single Metaform
   * @summary Finds single Metaform
   * @param realmId realm id
   * @param metaformId Metaform id
  */
  public findMetaform(realmId: string, metaformId: string, ):Promise<Metaform> {
    const uri = new URI(`${this.basePath}/realms/${encodeURIComponent(String(realmId))}/metaforms/${encodeURIComponent(String(metaformId))}`);
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
   * Lists Metaforms from the realm. User receives only metaforms where he/she has permission to.
   * @summary Lists Metaforms
   * @param realmId realm id
  */
  public listMetaforms(realmId: string, ):Promise<Array<Metaform>> {
    const uri = new URI(`${this.basePath}/realms/${encodeURIComponent(String(realmId))}/metaforms`);
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
   * Updates a Metaform
   * @summary Updates Metaform
   * @param body Payload
   * @param realmId realm id
   * @param metaformId Metaform id
  */
  public updateMetaform(body: Metaform, realmId: string, metaformId: string, ):Promise<Metaform> {
    const uri = new URI(`${this.basePath}/realms/${encodeURIComponent(String(realmId))}/metaforms/${encodeURIComponent(String(metaformId))}`);
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