package fi.metatavu.metaform.client;

import fi.metatavu.metaform.ApiClient;
import fi.metatavu.metaform.client.BadRequest;
import fi.metatavu.metaform.client.ExportTheme;
import fi.metatavu.metaform.client.ExportThemeFile;
import fi.metatavu.metaform.client.Forbidden;
import fi.metatavu.metaform.client.InternalServerError;
import fi.metatavu.metaform.client.NotFound;
import java.util.UUID;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExportThemesApi
 */
public class ExportThemesApiTest {

    private ExportThemesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ExportThemesApi.class);
    }

    
    /**
     * create new form export theme
     *
     * Creates new form export theme
     */
    @Test
    public void createExportThemeTest() {
        String realmId = null;
        ExportTheme payload = null;
        // ExportTheme response = api.createExportTheme(realmId, payload);

        // TODO: test validations
    }

    
    /**
     * create new export theme file
     *
     * Creates new export theme file
     */
    @Test
    public void createExportThemeFileTest() {
        String realmId = null;
        UUID exportThemeId = null;
        ExportThemeFile payload = null;
        // ExportThemeFile response = api.createExportThemeFile(realmId, exportThemeId, payload);

        // TODO: test validations
    }

    
    /**
     * Deletes an export theme
     *
     * Deletes an export theme
     */
    @Test
    public void deleteExportThemeTest() {
        String realmId = null;
        UUID exportThemeId = null;
        // api.deleteExportTheme(realmId, exportThemeId);

        // TODO: test validations
    }

    
    /**
     * Deletes an export theme file
     *
     * Deletes an export theme file
     */
    @Test
    public void deleteExportThemeFileTest() {
        String realmId = null;
        UUID exportThemeId = null;
        UUID exportThemeFileId = null;
        // api.deleteExportThemeFile(realmId, exportThemeId, exportThemeFileId);

        // TODO: test validations
    }

    
    /**
     * Finds single export theme
     *
     * Finds single export theme
     */
    @Test
    public void findExportThemeTest() {
        String realmId = null;
        UUID exportThemeId = null;
        // ExportTheme response = api.findExportTheme(realmId, exportThemeId);

        // TODO: test validations
    }

    
    /**
     * Finds single export theme file
     *
     * Finds single export theme file
     */
    @Test
    public void findExportThemeFileTest() {
        String realmId = null;
        UUID exportThemeId = null;
        UUID exportThemeFileId = null;
        // ExportThemeFile response = api.findExportThemeFile(realmId, exportThemeId, exportThemeFileId);

        // TODO: test validations
    }

    
    /**
     * Lists files of export theme
     *
     * Lists files of export theme
     */
    @Test
    public void listExportThemeFilesTest() {
        String realmId = null;
        UUID exportThemeId = null;
        // List<ExportThemeFile> response = api.listExportThemeFiles(realmId, exportThemeId);

        // TODO: test validations
    }

    
    /**
     * Lists form export themes
     *
     * Lists export themes
     */
    @Test
    public void listExportThemesTest() {
        String realmId = null;
        // List<ExportTheme> response = api.listExportThemes(realmId);

        // TODO: test validations
    }

    
    /**
     * Updates export theme
     *
     * Updates export theme
     */
    @Test
    public void updateExportThemeTest() {
        String realmId = null;
        UUID exportThemeId = null;
        ExportTheme payload = null;
        // ExportTheme response = api.updateExportTheme(realmId, exportThemeId, payload);

        // TODO: test validations
    }

    
    /**
     * Updates export theme file
     *
     * Updates export theme file
     */
    @Test
    public void updateExportThemeFileTest() {
        String realmId = null;
        UUID exportThemeId = null;
        UUID exportThemeFileId = null;
        ExportThemeFile payload = null;
        // ExportThemeFile response = api.updateExportThemeFile(realmId, exportThemeId, exportThemeFileId, payload);

        // TODO: test validations
    }

    
}
