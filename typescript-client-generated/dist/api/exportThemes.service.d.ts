import { ExportTheme } from '../model/exportTheme';
import { ExportThemeFile } from '../model/exportThemeFile';
export declare class ExportThemesService {
    private token;
    private basePath;
    constructor(basePath: string, token: string);
    /**
     * Creates new form export theme
     * @summary create new form export theme
     * @param body Payload
     * @param realmId realm id
    */
    createExportTheme(body: ExportTheme, realmId: string): Promise<ExportTheme>;
    /**
     * Creates new export theme file
     * @summary create new export theme file
     * @param body Payload
     * @param realmId realm id
     * @param exportThemeId export theme id
    */
    createExportThemeFile(body: ExportThemeFile, realmId: string, exportThemeId: string): Promise<ExportThemeFile>;
    /**
     * Deletes an export theme
     * @summary Deletes an export theme
     * @param realmId realm id
     * @param exportThemeId export theme id
    */
    deleteExportTheme(realmId: string, exportThemeId: string): Promise<any>;
    /**
     * Deletes an export theme file
     * @summary Deletes an export theme file
     * @param realmId realm id
     * @param exportThemeId export theme id
     * @param exportThemeFileId export theme file id
    */
    deleteExportThemeFile(realmId: string, exportThemeId: string, exportThemeFileId: string): Promise<any>;
    /**
     * Finds single export theme
     * @summary Finds single export theme
     * @param realmId realm id
     * @param exportThemeId export theme id
    */
    findExportTheme(realmId: string, exportThemeId: string): Promise<ExportTheme>;
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
     * Lists export themes
     * @summary Lists form export themes
     * @param realmId realm id
    */
    listExportThemes(realmId: string): Promise<Array<ExportTheme>>;
    /**
     * Updates export theme
     * @summary Updates export theme
     * @param body Payload
     * @param realmId realm id
     * @param exportThemeId ExportTheme id
    */
    updateExportTheme(body: ExportTheme, realmId: string, exportThemeId: string): Promise<ExportTheme>;
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
