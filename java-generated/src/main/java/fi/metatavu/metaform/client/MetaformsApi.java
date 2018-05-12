package fi.metatavu.metaform.client;

import fi.metatavu.metaform.ApiClient;
import fi.metatavu.metaform.EncodingUtils;

import fi.metatavu.metaform.client.BadRequest;
import fi.metatavu.metaform.client.Forbidden;
import fi.metatavu.metaform.client.InternalServerError;
import fi.metatavu.metaform.client.Metaform;
import fi.metatavu.metaform.client.NotFound;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-12T23:24:04.872+03:00")
public interface MetaformsApi extends ApiClient.Api {


  /**
   * create new Metaform
   * Creates new Metaform
    * @param realmId realm id (required)
    * @param payload Payload (required)
   * @return Metaform
   */
  @RequestLine("POST /realms/{realmId}/metaforms")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Metaform createMetaform(@Param("realmId") String realmId, Metaform payload);

  /**
   * Deletes Metaform
   * Deletes a Metaform
    * @param realmId realm id (required)
    * @param metaformId Metaform id (required)
   */
  @RequestLine("DELETE /realms/{realmId}/metaforms/{metaformId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void deleteMetaform(@Param("realmId") String realmId, @Param("metaformId") UUID metaformId);

  /**
   * Finds single Metaform
   * Finds a single Metaform
    * @param realmId realm id (required)
    * @param metaformId Metaform id (required)
   * @return Metaform
   */
  @RequestLine("GET /realms/{realmId}/metaforms/{metaformId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Metaform findMetaform(@Param("realmId") String realmId, @Param("metaformId") UUID metaformId);

  /**
   * Lists Metaforms
   * Lists Metaforms from the realm. User receives only metaforms where he/she has permission to.
    * @param realmId realm id (required)
   * @return List&lt;Metaform&gt;
   */
  @RequestLine("GET /realms/{realmId}/metaforms")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<Metaform> listMetaforms(@Param("realmId") String realmId);

  /**
   * Updates Metaform
   * Updates a Metaform
    * @param realmId realm id (required)
    * @param metaformId Metaform id (required)
    * @param payload Payload (required)
   * @return Metaform
   */
  @RequestLine("PUT /realms/{realmId}/metaforms/{metaformId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Metaform updateMetaform(@Param("realmId") String realmId, @Param("metaformId") UUID metaformId, Metaform payload);
}
