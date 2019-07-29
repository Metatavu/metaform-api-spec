package fi.metatavu.metaform.client;

import fi.metatavu.metaform.ApiClient;
import fi.metatavu.metaform.EncodingUtils;

import fi.metatavu.metaform.client.Attachment;
import fi.metatavu.metaform.client.BadRequest;
import fi.metatavu.metaform.client.Forbidden;
import fi.metatavu.metaform.client.InternalServerError;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-29T18:07:31.883+03:00")
public interface AttachmentsApi extends ApiClient.Api {


  /**
   * Find a attachment by id
   * Returns single attachment
    * @param realmId realm id (required)
    * @param attachmentId Attachment id (required)
   * @return Attachment
   */
  @RequestLine("GET /realms/{realmId}/attachments/{attachmentId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Attachment findAttachment(@Param("realmId") String realmId, @Param("attachmentId") UUID attachmentId);

  /**
   * Find a attachment data by id
   * Returns attachment data
    * @param realmId realm id (required)
    * @param attachmentId Attachment id (required)
   * @return byte[]
   */
  @RequestLine("GET /realms/{realmId}/attachments/{attachmentId}/data")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  byte[] findAttachmentData(@Param("realmId") String realmId, @Param("attachmentId") UUID attachmentId);
}
