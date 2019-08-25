import { BadRequest } from '../model/badRequest';
import { ExportTheme } from '../model/exportTheme';
import { ExportThemeFile } from '../model/exportThemeFile';
import { Forbidden } from '../model/forbidden';
import { InternalServerError } from '../model/internalServerError';
import { NotFound } from '../model/notFound';
import * as URI from "urijs";
import { ApiUtils } from "./api";

export class ExportThemesService {

  private token: string;
  private basePath: string;

  constructor(basePath: string, token: string) {
    this.token = token;
    this.basePath = basePath;
  }


  /**
   * Creates new form export theme
   * @summary create new form export theme
   * @param body Payload
   * @param realmId realm id
  */
  public createExportTheme(body: ExportTheme, realmId: string, ):Promise<ExportTheme> {
    const uri = new URI(`${this.basePath}/realms/${encodeURIComponent(String(realmId))}/exportThemes`);
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
   * Creates new export theme file
   * @summary create new export theme file
   * @param body Payload
   * @param realmId realm id
   * @param exportThemeId export theme id
  */
  public createExportThemeFile(body: ExportThemeFile, realmId: string, exportThemeId: string, ):Promise<ExportThemeFile> {
    const uri = new URI(`${this.basePath}/realms/${encodeURIComponent(String(realmId))}/exportThemes/${encodeURIComponent(String(exportThemeId))}/files`);
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
   * Deletes an export theme
   * @summary Deletes an export theme
   * @param realmId realm id
   * @param exportThemeId export theme id
  */
  public deleteExportTheme(realmId: string, exportThemeId: string, ):Promise<any> {
    const uri = new URI(`${this.basePath}/realms/${encodeURIComponent(String(realmId))}/exportThemes/${encodeURIComponent(String(exportThemeId))}`);
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
   * Deletes an export theme file
   * @summary Deletes an export theme file
   * @param realmId realm id
   * @param exportThemeId export theme id
   * @param exportThemeFileId export theme file id
  */
  public deleteExportThemeFile(realmId: string, exportThemeId: string, exportThemeFileId: string, ):Promise<any> {
    const uri = new URI(`${this.basePath}/realms/${encodeURIComponent(String(realmId))}/exportThemes/${encodeURIComponent(String(exportThemeId))}/files/${encodeURIComponent(String(exportThemeFileId))}`);
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
   * Finds single export theme
   * @summary Finds single export theme
   * @param realmId realm id
   * @param exportThemeId export theme id
  */
  public findExportTheme(realmId: string, exportThemeId: string, ):Promise<ExportTheme> {
    const uri = new URI(`${this.basePath}/realms/${encodeURIComponent(String(realmId))}/exportThemes/${encodeURIComponent(String(exportThemeId))}`);
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
   * Finds single export theme file
   * @summary Finds single export theme file
   * @param realmId realm id
   * @param exportThemeId export theme id
   * @param exportThemeFileId export theme file id
  */
  public findExportThemeFile(realmId: string, exportThemeId: string, exportThemeFileId: string, ):Promise<ExportThemeFile> {
    const uri = new URI(`${this.basePath}/realms/${encodeURIComponent(String(realmId))}/exportThemes/${encodeURIComponent(String(exportThemeId))}/files/${encodeURIComponent(String(exportThemeFileId))}`);
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
   * Lists files of export theme
   * @summary Lists files of export theme
   * @param realmId realm id
   * @param exportThemeId export theme id
  */
  public listExportThemeFiles(realmId: string, exportThemeId: string, ):Promise<Array<ExportThemeFile>> {
    const uri = new URI(`${this.basePath}/realms/${encodeURIComponent(String(realmId))}/exportThemes/${encodeURIComponent(String(exportThemeId))}/files`);
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
   * Lists export themes
   * @summary Lists form export themes
   * @param realmId realm id
  */
  public listExportThemes(realmId: string, ):Promise<Array<ExportTheme>> {
    const uri = new URI(`${this.basePath}/realms/${encodeURIComponent(String(realmId))}/exportThemes`);
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
   * Updates export theme
   * @summary Updates export theme
   * @param body Payload
   * @param realmId realm id
   * @param exportThemeId ExportTheme id
  */
  public updateExportTheme(body: ExportTheme, realmId: string, exportThemeId: string, ):Promise<ExportTheme> {
    const uri = new URI(`${this.basePath}/realms/${encodeURIComponent(String(realmId))}/exportThemes/${encodeURIComponent(String(exportThemeId))}`);
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


  /**
   * Updates export theme file
   * @summary Updates export theme file
   * @param body Payload
   * @param realmId realm id
   * @param exportThemeId ExportTheme id
   * @param exportThemeFileId ExportThemeFile file id
  */
  public updateExportThemeFile(body: ExportThemeFile, realmId: string, exportThemeId: string, exportThemeFileId: string, ):Promise<ExportThemeFile> {
    const uri = new URI(`${this.basePath}/realms/${encodeURIComponent(String(realmId))}/exportThemes/${encodeURIComponent(String(exportThemeId))}/files/${encodeURIComponent(String(exportThemeFileId))}`);
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