package fi.metatavu.metaform.client;

import fi.metatavu.metaform.ApiClient;
import fi.metatavu.metaform.EncodingUtils;

import fi.metatavu.metaform.client.BadRequest;
import fi.metatavu.metaform.client.EmailNotification;
import fi.metatavu.metaform.client.Forbidden;
import fi.metatavu.metaform.client.InternalServerError;
import fi.metatavu.metaform.client.NotFound;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-29T17:41:58.082+03:00")
public interface EmailNotificationsApi extends ApiClient.Api {


  /**
   * create new form email notification
   * Creates new form email notification
    * @param realmId realm id (required)
    * @param metaformId Metaform id (required)
    * @param payload Payload (required)
   * @return EmailNotification
   */
  @RequestLine("POST /realms/{realmId}/metaforms/{metaformId}/emailNotifications")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  EmailNotification createEmailNotification(@Param("realmId") String realmId, @Param("metaformId") UUID metaformId, EmailNotification payload);

  /**
   * Deletes an email notification
   * Deletes an email notification
    * @param realmId realm id (required)
    * @param metaformId Metaform id (required)
    * @param emailNotificationId Email notification id (required)
   */
  @RequestLine("DELETE /realms/{realmId}/metaforms/{metaformId}/emailNotifications/{emailNotificationId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void deleteEmailNotification(@Param("realmId") String realmId, @Param("metaformId") UUID metaformId, @Param("emailNotificationId") UUID emailNotificationId);

  /**
   * Find a single emai notification
   * Finds single email notification by id
    * @param realmId realm id (required)
    * @param metaformId Metaform id (required)
    * @param emailNotificationId EmailNotification id (required)
   * @return EmailNotification
   */
  @RequestLine("GET /realms/{realmId}/metaforms/{metaformId}/emailNotifications/{emailNotificationId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  EmailNotification findEmailNotification(@Param("realmId") String realmId, @Param("metaformId") UUID metaformId, @Param("emailNotificationId") UUID emailNotificationId);

  /**
   * Lists form email notifications
   * Lists email notifications
    * @param realmId realm id (required)
    * @param metaformId Metaform id (required)
   * @return List&lt;EmailNotification&gt;
   */
  @RequestLine("GET /realms/{realmId}/metaforms/{metaformId}/emailNotifications")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<EmailNotification> listEmailNotifications(@Param("realmId") String realmId, @Param("metaformId") UUID metaformId);

  /**
   * Updates email notification
   * Updates email notification
    * @param realmId realm id (required)
    * @param metaformId Metaform id (required)
    * @param emailNotificationId EmailNotification id (required)
    * @param payload Payload (required)
   * @return EmailNotification
   */
  @RequestLine("PUT /realms/{realmId}/metaforms/{metaformId}/emailNotifications/{emailNotificationId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  EmailNotification updateEmailNotification(@Param("realmId") String realmId, @Param("metaformId") UUID metaformId, @Param("emailNotificationId") UUID emailNotificationId, EmailNotification payload);
}
