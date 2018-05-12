package fi.metatavu.metaform.client;

import fi.metatavu.metaform.ApiClient;
import fi.metatavu.metaform.client.BadRequest;
import fi.metatavu.metaform.client.Forbidden;
import fi.metatavu.metaform.client.InternalServerError;
import fi.metatavu.metaform.client.Metaform;
import fi.metatavu.metaform.client.NotFound;
import java.util.UUID;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MetaformsApi
 */
public class MetaformsApiTest {

    private MetaformsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(MetaformsApi.class);
    }

    
    /**
     * create new Metaform
     *
     * Creates new Metaform
     */
    @Test
    public void createMetaformTest() {
        String realmId = null;
        Metaform payload = null;
        // Metaform response = api.createMetaform(realmId, payload);

        // TODO: test validations
    }

    
    /**
     * Deletes Metaform
     *
     * Deletes a Metaform
     */
    @Test
    public void deleteMetaformTest() {
        String realmId = null;
        UUID metaformId = null;
        // api.deleteMetaform(realmId, metaformId);

        // TODO: test validations
    }

    
    /**
     * Finds single Metaform
     *
     * Finds a single Metaform
     */
    @Test
    public void findMetaformTest() {
        String realmId = null;
        UUID metaformId = null;
        // Metaform response = api.findMetaform(realmId, metaformId);

        // TODO: test validations
    }

    
    /**
     * Lists Metaforms
     *
     * Lists Metaforms from the realm. User receives only metaforms where he/she has permission to.
     */
    @Test
    public void listMetaformsTest() {
        String realmId = null;
        // List<Metaform> response = api.listMetaforms(realmId);

        // TODO: test validations
    }

    
    /**
     * Updates Metaform
     *
     * Updates a Metaform
     */
    @Test
    public void updateMetaformTest() {
        String realmId = null;
        UUID metaformId = null;
        Metaform payload = null;
        // Metaform response = api.updateMetaform(realmId, metaformId, payload);

        // TODO: test validations
    }

    
}
