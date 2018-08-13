package fi.metatavu.metaform.client;

import fi.metatavu.metaform.ApiClient;
import fi.metatavu.metaform.client.BadRequest;
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
 * API tests for ExportThemeFilesApi
 */
public class ExportThemeFilesApiTest {

    private ExportThemeFilesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ExportThemeFilesApi.class);
    }

    
    /**
     * create new export theme file
     *
     * Creates new export theme file
     */
    @Test
    public void createExportThemeFileTest() {
        UUID exportThemeId = null;
        ExportThemeFile payload = null;
        // ExportThemeFile response = api.createExportThemeFile(exportThemeId, payload);

        // TODO: test validations
    }

    
    /**
     * Deletes an export theme file
     *
     * Deletes an export theme file
     */
    @Test
    public void deleteExportThemeFileTest() {
        UUID exportThemeId = null;
        UUID exportThemeFileId = null;
        // api.deleteExportThemeFile(exportThemeId, exportThemeFileId);

        // TODO: test validations
    }

    
    /**
     * Finds single export theme file
     *
     * Finds single export theme file
     */
    @Test
    public void findExportThemeFileTest() {
        UUID exportThemeId = null;
        UUID exportThemeFileId = null;
        // ExportThemeFile response = api.findExportThemeFile(exportThemeId, exportThemeFileId);

        // TODO: test validations
    }

    
    /**
     * Lists files of export theme
     *
     * Lists files of export theme
     */
    @Test
    public void listExportThemeFilesTest() {
        UUID exportThemeId = null;
        // List<ExportThemeFile> response = api.listExportThemeFiles(exportThemeId);

        // TODO: test validations
    }

    
    /**
     * Updates export theme file
     *
     * Updates export theme file
     */
    @Test
    public void updateExportThemeFileTest() {
        UUID exportThemeId = null;
        UUID exportThemeFileId = null;
        ExportThemeFile payload = null;
        // ExportThemeFile response = api.updateExportThemeFile(exportThemeId, exportThemeFileId, payload);

        // TODO: test validations
    }

    
}
