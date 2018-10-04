package fi.metatavu.metaform.client;

import fi.metatavu.metaform.ApiClient;
import fi.metatavu.metaform.EncodingUtils;

import fi.metatavu.metaform.client.BadRequest;
import fi.metatavu.metaform.client.Forbidden;
import fi.metatavu.metaform.client.InternalServerError;
import fi.metatavu.metaform.client.NotFound;
import fi.metatavu.metaform.client.Reply;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-04T09:14:04.433+03:00")
public interface RepliesApi extends ApiClient.Api {


  /**
   * create new form reply
   * Creates new form reply
    * @param realmId realm id (required)
    * @param metaformId Metaform id (required)
    * @param payload Payload (required)
    * @param updateExisting specifies that existing reply should be updated. DEPRECATED, use replymode instead (optional)
    * @param replyMode specifies reply mode that will be used. possible values UPDATE, REVISION, CUMULATIVE (optional)
   * @return Reply
   */
  @RequestLine("POST /realms/{realmId}/metaforms/{metaformId}/replies?updateExisting={updateExisting}&replyMode={replyMode}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Reply createReply(@Param("realmId") String realmId, @Param("metaformId") UUID metaformId, Reply payload, @Param("updateExisting") Boolean updateExisting, @Param("replyMode") String replyMode);

  /**
   * create new form reply
   * Creates new form reply
   * Note, this is equivalent to the other <code>createReply</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreateReplyQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param realmId realm id (required)
   * @param metaformId Metaform id (required)
   * @param payload Payload (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>updateExisting - specifies that existing reply should be updated. DEPRECATED, use replymode instead (optional)</li>
   *   <li>replyMode - specifies reply mode that will be used. possible values UPDATE, REVISION, CUMULATIVE (optional)</li>
   *   </ul>
   * @return Reply
   */
  @RequestLine("POST /realms/{realmId}/metaforms/{metaformId}/replies?updateExisting={updateExisting}&replyMode={replyMode}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  Reply createReply(@Param("realmId") String realmId, @Param("metaformId") UUID metaformId, Reply payload, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>createReply</code> method in a fluent style.
   */
  public static class CreateReplyQueryParams extends HashMap<String, Object> {
    public CreateReplyQueryParams updateExisting(final Boolean value) {
      put("updateExisting", EncodingUtils.encode(value));
      return this;
    }
    public CreateReplyQueryParams replyMode(final String value) {
      put("replyMode", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Deletes a reply
   * Deletes a reply
    * @param realmId realm id (required)
    * @param metaformId Metaform id (required)
    * @param replyId Reply id (required)
   */
  @RequestLine("DELETE /realms/{realmId}/metaforms/{metaformId}/replies/{replyId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void deleteReply(@Param("realmId") String realmId, @Param("metaformId") UUID metaformId, @Param("replyId") UUID replyId);

  /**
   * Exports metaform data
   * Exports metaform data
    * @param realmId realm id (required)
    * @param metaformId Metaform id (required)
    * @param format Export results in specified format (XLSX) (required)
   * @return byte[]
   */
  @RequestLine("GET /realms/{realmId}/metaforms/{metaformId}/export?format={format}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  byte[] export(@Param("realmId") String realmId, @Param("metaformId") UUID metaformId, @Param("format") String format);

  /**
   * Exports metaform data
   * Exports metaform data
   * Note, this is equivalent to the other <code>export</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ExportQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param realmId realm id (required)
   * @param metaformId Metaform id (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>format - Export results in specified format (XLSX) (required)</li>
   *   </ul>
   * @return byte[]
   */
  @RequestLine("GET /realms/{realmId}/metaforms/{metaformId}/export?format={format}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  byte[] export(@Param("realmId") String realmId, @Param("metaformId") UUID metaformId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>export</code> method in a fluent style.
   */
  public static class ExportQueryParams extends HashMap<String, Object> {
    public ExportQueryParams format(final String value) {
      put("format", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Find a single reply
   * Finds single reply by id
    * @param realmId realm id (required)
    * @param metaformId Metaform id (required)
    * @param replyId Reply id (required)
   * @return Reply
   */
  @RequestLine("GET /realms/{realmId}/metaforms/{metaformId}/replies/{replyId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Reply findReply(@Param("realmId") String realmId, @Param("metaformId") UUID metaformId, @Param("replyId") UUID replyId);

  /**
   * Lists form replies
   * Lists form replies
    * @param realmId realm id (required)
    * @param metaformId Metaform id (required)
    * @param userId Filter results by user id. If this parameter is not specified all replies are returned, this requires logged user to have proper permission to do so (optional)
    * @param createdBefore Filter results created before specified time (optional)
    * @param createdAfter Filter results created after specified time (optional)
    * @param modifiedBefore Filter results modified before specified time (optional)
    * @param modifiedAfter Filter results modified after specified time (optional)
    * @param includeRevisions Specifies that revisions should be included into response (optional)
    * @param fields Filter results by field values. Format is field:value, multiple values can be added by using comma separator. E.g. field1&#x3D;value,field2&#x3D;another (optional)
   * @return List&lt;Reply&gt;
   */
  @RequestLine("GET /realms/{realmId}/metaforms/{metaformId}/replies?userId={userId}&createdBefore={createdBefore}&createdAfter={createdAfter}&modifiedBefore={modifiedBefore}&modifiedAfter={modifiedAfter}&includeRevisions={includeRevisions}&fields={fields}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<Reply> listReplies(@Param("realmId") String realmId, @Param("metaformId") UUID metaformId, @Param("userId") UUID userId, @Param("createdBefore") String createdBefore, @Param("createdAfter") String createdAfter, @Param("modifiedBefore") String modifiedBefore, @Param("modifiedAfter") String modifiedAfter, @Param("includeRevisions") Boolean includeRevisions, @Param("fields") List<String> fields);

  /**
   * Lists form replies
   * Lists form replies
   * Note, this is equivalent to the other <code>listReplies</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListRepliesQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param realmId realm id (required)
   * @param metaformId Metaform id (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>userId - Filter results by user id. If this parameter is not specified all replies are returned, this requires logged user to have proper permission to do so (optional)</li>
   *   <li>createdBefore - Filter results created before specified time (optional)</li>
   *   <li>createdAfter - Filter results created after specified time (optional)</li>
   *   <li>modifiedBefore - Filter results modified before specified time (optional)</li>
   *   <li>modifiedAfter - Filter results modified after specified time (optional)</li>
   *   <li>includeRevisions - Specifies that revisions should be included into response (optional)</li>
   *   <li>fields - Filter results by field values. Format is field:value, multiple values can be added by using comma separator. E.g. field1&#x3D;value,field2&#x3D;another (optional)</li>
   *   </ul>
   * @return List&lt;Reply&gt;
   */
  @RequestLine("GET /realms/{realmId}/metaforms/{metaformId}/replies?userId={userId}&createdBefore={createdBefore}&createdAfter={createdAfter}&modifiedBefore={modifiedBefore}&modifiedAfter={modifiedAfter}&includeRevisions={includeRevisions}&fields={fields}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  List<Reply> listReplies(@Param("realmId") String realmId, @Param("metaformId") UUID metaformId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listReplies</code> method in a fluent style.
   */
  public static class ListRepliesQueryParams extends HashMap<String, Object> {
    public ListRepliesQueryParams userId(final UUID value) {
      put("userId", EncodingUtils.encode(value));
      return this;
    }
    public ListRepliesQueryParams createdBefore(final String value) {
      put("createdBefore", EncodingUtils.encode(value));
      return this;
    }
    public ListRepliesQueryParams createdAfter(final String value) {
      put("createdAfter", EncodingUtils.encode(value));
      return this;
    }
    public ListRepliesQueryParams modifiedBefore(final String value) {
      put("modifiedBefore", EncodingUtils.encode(value));
      return this;
    }
    public ListRepliesQueryParams modifiedAfter(final String value) {
      put("modifiedAfter", EncodingUtils.encode(value));
      return this;
    }
    public ListRepliesQueryParams includeRevisions(final Boolean value) {
      put("includeRevisions", EncodingUtils.encode(value));
      return this;
    }
    public ListRepliesQueryParams fields(final List<String> value) {
      put("fields", EncodingUtils.encodeCollection(value, "csv"));
      return this;
    }
  }

  /**
   * Exports reply data
   * Exports reply data
    * @param realmId realm id (required)
    * @param metaformId Metaform id (required)
    * @param replyId Reply id (required)
    * @param format Export results in specified format (PDF) (required)
   * @return byte[]
   */
  @RequestLine("GET /realms/{realmId}/metaforms/{metaformId}/replies/{replyId}/export?format={format}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  byte[] replyExport(@Param("realmId") String realmId, @Param("metaformId") UUID metaformId, @Param("replyId") UUID replyId, @Param("format") String format);

  /**
   * Exports reply data
   * Exports reply data
   * Note, this is equivalent to the other <code>replyExport</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ReplyExportQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param realmId realm id (required)
   * @param metaformId Metaform id (required)
   * @param replyId Reply id (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>format - Export results in specified format (PDF) (required)</li>
   *   </ul>
   * @return byte[]
   */
  @RequestLine("GET /realms/{realmId}/metaforms/{metaformId}/replies/{replyId}/export?format={format}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  byte[] replyExport(@Param("realmId") String realmId, @Param("metaformId") UUID metaformId, @Param("replyId") UUID replyId, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>replyExport</code> method in a fluent style.
   */
  public static class ReplyExportQueryParams extends HashMap<String, Object> {
    public ReplyExportQueryParams format(final String value) {
      put("format", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Updates reply
   * Updates reply
    * @param realmId realm id (required)
    * @param metaformId Metaform id (required)
    * @param replyId Reply id (required)
    * @param payload Payload (required)
   */
  @RequestLine("PUT /realms/{realmId}/metaforms/{metaformId}/replies/{replyId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void updateReply(@Param("realmId") String realmId, @Param("metaformId") UUID metaformId, @Param("replyId") UUID replyId, Reply payload);
}
