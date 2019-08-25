export * from './attachments.service';
import { AttachmentsService } from './attachments.service';
export * from './emailNotifications.service';
import { EmailNotificationsService } from './emailNotifications.service';
export * from './exportThemeFiles.service';
import { ExportThemeFilesService } from './exportThemeFiles.service';
export * from './exportThemes.service';
import { ExportThemesService } from './exportThemes.service';
export * from './metaforms.service';
import { MetaformsService } from './metaforms.service';
export * from './replies.service';
import { RepliesService } from './replies.service';

export class ApiUtils {
  /**
   * Handles response from API
   * 
   * @param response response object
   */
  public static handleResponse(response: any) {
    switch (response.status) {
      case 204:
        return {};
      default:
        return response.json();
    }
  }
}

export default new class Api {

  private apiUrl = "http://localhost";

  /**
   * Configures api endpoint
   *
   */
  public configure(baseUrl: string) {
    this.apiUrl = baseUrl;
  }

  
  public getAttachmentsService(token: string): AttachmentsService {
    return new AttachmentsService(this.apiUrl, token);
  }
  
  public getEmailNotificationsService(token: string): EmailNotificationsService {
    return new EmailNotificationsService(this.apiUrl, token);
  }
  
  public getExportThemeFilesService(token: string): ExportThemeFilesService {
    return new ExportThemeFilesService(this.apiUrl, token);
  }
  
  public getExportThemesService(token: string): ExportThemesService {
    return new ExportThemesService(this.apiUrl, token);
  }
  
  public getMetaformsService(token: string): MetaformsService {
    return new MetaformsService(this.apiUrl, token);
  }
  
  public getRepliesService(token: string): RepliesService {
    return new RepliesService(this.apiUrl, token);
  }
  
}
