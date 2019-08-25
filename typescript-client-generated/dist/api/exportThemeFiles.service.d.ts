import { ExportThemeFile } from '../model/exportThemeFile';
export declare class ExportThemeFilesService {
    private token;
    private basePath;
    constructor(basePath: string, token: string);
    /**
     * Creates new export theme file
     * @summary create new export theme file
     * @param body Payload
     * @param realmId realm id
     * @param exportThemeId export theme id
    */
    createExportThemeFile(body: ExportThemeFile, realmId: string, exportThemeId: string): Promise<ExportThemeFile>;
    /**
     * Deletes an export theme file
     * @summary Deletes an export theme file
     * @param realmId realm id
     * @param exportThemeId export theme id
     * @param exportThemeFileId export theme file id
    */
    deleteExportThemeFile(realmId: string, exportThemeId: string, exportThemeFileId: string): Promise<any>;
    /**
     * Finds single export theme file
     * @summary Finds single export theme file
     * @param realmId realm id
     * @param exportThemeId export theme id
     * @param exportThemeFileId export theme file id
    */
    findExportThemeFile(realmId: string, exportThemeId: string, exportThemeFileId: string): Promise<ExportThemeFile>;
    /**
     * Lists files of export theme
     * @summary Lists files of export theme
     * @param realmId realm id
     * @param exportThemeId export theme id
    */
    listExportThemeFiles(realmId: string, exportThemeId: string): Promise<Array<ExportThemeFile>>;
    /**
     * Updates export theme file
     * @summary Updates export theme file
     * @param body Payload
     * @param realmId realm id
     * @param exportThemeId ExportTheme id
     * @param exportThemeFileId ExportThemeFile file id
    */
    updateExportThemeFile(body: ExportThemeFile, realmId: string, exportThemeId: string, exportThemeFileId: string): Promise<ExportThemeFile>;
}
