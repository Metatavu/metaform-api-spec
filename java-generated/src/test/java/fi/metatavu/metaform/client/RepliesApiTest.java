package fi.metatavu.metaform.client;

import fi.metatavu.metaform.ApiClient;
import fi.metatavu.metaform.client.BadRequest;
import fi.metatavu.metaform.client.Forbidden;
import fi.metatavu.metaform.client.InternalServerError;
import fi.metatavu.metaform.client.NotFound;
import fi.metatavu.metaform.client.Reply;
import java.util.UUID;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RepliesApi
 */
public class RepliesApiTest {

    private RepliesApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(RepliesApi.class);
    }

    
    /**
     * create new form reply
     *
     * Creates new form reply
     */
    @Test
    public void createReplyTest() {
        String realmId = null;
        UUID metaformId = null;
        Reply payload = null;
        Boolean updateExisting = null;
        String replyMode = null;
        // Reply response = api.createReply(realmId, metaformId, payload, updateExisting, replyMode);

        // TODO: test validations
    }

    /**
     * create new form reply
     *
     * Creates new form reply
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void createReplyTestQueryMap() {
        String realmId = null;
        UUID metaformId = null;
        Reply payload = null;
        RepliesApi.CreateReplyQueryParams queryParams = new RepliesApi.CreateReplyQueryParams()
            .updateExisting(null)
            .replyMode(null);
        // Reply response = api.createReply(realmId, metaformId, payload, queryParams);

    // TODO: test validations
    }
    
    /**
     * Deletes a reply
     *
     * Deletes a reply
     */
    @Test
    public void deleteReplyTest() {
        String realmId = null;
        UUID metaformId = null;
        UUID replyId = null;
        // api.deleteReply(realmId, metaformId, replyId);

        // TODO: test validations
    }

    
    /**
     * Exports metaform data
     *
     * Exports metaform data
     */
    @Test
    public void exportTest() {
        String realmId = null;
        UUID metaformId = null;
        String format = null;
        // byte[] response = api.export(realmId, metaformId, format);

        // TODO: test validations
    }

    /**
     * Exports metaform data
     *
     * Exports metaform data
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void exportTestQueryMap() {
        String realmId = null;
        UUID metaformId = null;
        RepliesApi.ExportQueryParams queryParams = new RepliesApi.ExportQueryParams()
            .format(null);
        // byte[] response = api.export(realmId, metaformId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Find a single reply
     *
     * Finds single reply by id
     */
    @Test
    public void findReplyTest() {
        String realmId = null;
        UUID metaformId = null;
        UUID replyId = null;
        // Reply response = api.findReply(realmId, metaformId, replyId);

        // TODO: test validations
    }

    
    /**
     * Lists form replies
     *
     * Lists form replies
     */
    @Test
    public void listRepliesTest() {
        String realmId = null;
        UUID metaformId = null;
        UUID userId = null;
        String createdBefore = null;
        String createdAfter = null;
        String modifiedBefore = null;
        String modifiedAfter = null;
        Boolean includeRevisions = null;
        List<String> fields = null;
        // List<Reply> response = api.listReplies(realmId, metaformId, userId, createdBefore, createdAfter, modifiedBefore, modifiedAfter, includeRevisions, fields);

        // TODO: test validations
    }

    /**
     * Lists form replies
     *
     * Lists form replies
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void listRepliesTestQueryMap() {
        String realmId = null;
        UUID metaformId = null;
        RepliesApi.ListRepliesQueryParams queryParams = new RepliesApi.ListRepliesQueryParams()
            .userId(null)
            .createdBefore(null)
            .createdAfter(null)
            .modifiedBefore(null)
            .modifiedAfter(null)
            .includeRevisions(null)
            .fields(null);
        // List<Reply> response = api.listReplies(realmId, metaformId, queryParams);

    // TODO: test validations
    }
    
    /**
     * Updates reply
     *
     * Updates reply
     */
    @Test
    public void updateReplyTest() {
        String realmId = null;
        UUID metaformId = null;
        UUID replyId = null;
        Reply payload = null;
        // api.updateReply(realmId, metaformId, replyId, payload);

        // TODO: test validations
    }

    
}
