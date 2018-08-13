package fi.metatavu.metaform.client;

import fi.metatavu.metaform.ApiClient;
import fi.metatavu.metaform.client.Attachment;
import fi.metatavu.metaform.client.BadRequest;
import fi.metatavu.metaform.client.Forbidden;
import fi.metatavu.metaform.client.InternalServerError;
import java.util.UUID;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AttachmentsApi
 */
public class AttachmentsApiTest {

    private AttachmentsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(AttachmentsApi.class);
    }

    
    /**
     * Find a attachment by id
     *
     * Returns single attachment
     */
    @Test
    public void findAttachmentTest() {
        UUID attachmentId = null;
        // Attachment response = api.findAttachment(attachmentId);

        // TODO: test validations
    }

    
    /**
     * Find a attachment data by id
     *
     * Returns attachment data
     */
    @Test
    public void findAttachmentDataTest() {
        UUID attachmentId = null;
        // byte[] response = api.findAttachmentData(attachmentId);

        // TODO: test validations
    }

    
}
