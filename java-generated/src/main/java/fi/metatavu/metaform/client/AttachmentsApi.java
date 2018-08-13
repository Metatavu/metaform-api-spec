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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-13T14:43:50.131+03:00")
public interface AttachmentsApi extends ApiClient.Api {


  /**
   * Find a attachment by id
   * Returns single attachment
    * @param attachmentId Attachment id (required)
   * @return Attachment
   */
  @RequestLine("GET /attachments/{attachmentId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Attachment findAttachment(@Param("attachmentId") UUID attachmentId);

  /**
   * Find a attachment data by id
   * Returns attachment data
    * @param attachmentId Attachment id (required)
   * @return byte[]
   */
  @RequestLine("GET /attachments/{attachmentId}/data")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  byte[] findAttachmentData(@Param("attachmentId") UUID attachmentId);
}
