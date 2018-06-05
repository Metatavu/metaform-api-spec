package fi.metatavu.metaform.client;

import fi.metatavu.metaform.ApiClient;
import fi.metatavu.metaform.client.BadRequest;
import fi.metatavu.metaform.client.EmailNotification;
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
 * API tests for EmailNotificationsApi
 */
public class EmailNotificationsApiTest {

    private EmailNotificationsApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(EmailNotificationsApi.class);
    }

    
    /**
     * create new form email notification
     *
     * Creates new form email notification
     */
    @Test
    public void createEmailNotificationTest() {
        String realmId = null;
        UUID metaformId = null;
        EmailNotification payload = null;
        // EmailNotification response = api.createEmailNotification(realmId, metaformId, payload);

        // TODO: test validations
    }

    
    /**
     * Deletes an email notification
     *
     * Deletes an email notification
     */
    @Test
    public void deleteEmailNotificationTest() {
        String realmId = null;
        UUID metaformId = null;
        UUID emailNotificationId = null;
        // api.deleteEmailNotification(realmId, metaformId, emailNotificationId);

        // TODO: test validations
    }

    
    /**
     * Find a single emai notification
     *
     * Finds single email notification by id
     */
    @Test
    public void findEmailNotificationTest() {
        String realmId = null;
        UUID metaformId = null;
        UUID emailNotificationId = null;
        // EmailNotification response = api.findEmailNotification(realmId, metaformId, emailNotificationId);

        // TODO: test validations
    }

    
    /**
     * Lists form email notifications
     *
     * Lists email notifications
     */
    @Test
    public void listEmailNotificationsTest() {
        String realmId = null;
        UUID metaformId = null;
        // List<EmailNotification> response = api.listEmailNotifications(realmId, metaformId);

        // TODO: test validations
    }

    
    /**
     * Updates email notification
     *
     * Updates email notification
     */
    @Test
    public void updateEmailNotificationTest() {
        String realmId = null;
        UUID metaformId = null;
        UUID emailNotificationId = null;
        EmailNotification payload = null;
        // EmailNotification response = api.updateEmailNotification(realmId, metaformId, emailNotificationId, payload);

        // TODO: test validations
    }

    
}
