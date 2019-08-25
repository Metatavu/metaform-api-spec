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
export declare class ApiUtils {
    /**
     * Handles response from API
     *
     * @param response response object
     */
    static handleResponse(response: any): any;
}
declare const _default: {
    apiUrl: string;
    /**
     * Configures api endpoint
     *
     */
    configure(baseUrl: string): void;
    getAttachmentsService(token: string): AttachmentsService;
    getEmailNotificationsService(token: string): EmailNotificationsService;
    getExportThemeFilesService(token: string): ExportThemeFilesService;
    getExportThemesService(token: string): ExportThemesService;
    getMetaformsService(token: string): MetaformsService;
    getRepliesService(token: string): RepliesService;
};
export default _default;
