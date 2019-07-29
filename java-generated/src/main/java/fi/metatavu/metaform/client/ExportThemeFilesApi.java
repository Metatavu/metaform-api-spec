package fi.metatavu.metaform.client;

import fi.metatavu.metaform.ApiClient;
import fi.metatavu.metaform.EncodingUtils;

import fi.metatavu.metaform.client.BadRequest;
import fi.metatavu.metaform.client.ExportThemeFile;
import fi.metatavu.metaform.client.Forbidden;
import fi.metatavu.metaform.client.InternalServerError;
import fi.metatavu.metaform.client.NotFound;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-29T18:07:31.883+03:00")
public interface ExportThemeFilesApi extends ApiClient.Api {


  /**
   * create new export theme file
   * Creates new export theme file
    * @param realmId realm id (required)
    * @param exportThemeId export theme id (required)
    * @param payload Payload (required)
   * @return ExportThemeFile
   */
  @RequestLine("POST /realms/{realmId}/exportThemes/{exportThemeId}/files")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ExportThemeFile createExportThemeFile(@Param("realmId") String realmId, @Param("exportThemeId") UUID exportThemeId, ExportThemeFile payload);

  /**
   * Deletes an export theme file
   * Deletes an export theme file
    * @param realmId realm id (required)
    * @param exportThemeId export theme id (required)
    * @param exportThemeFileId export theme file id (required)
   */
  @RequestLine("DELETE /realms/{realmId}/exportThemes/{exportThemeId}/files/{exportThemeFileId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void deleteExportThemeFile(@Param("realmId") String realmId, @Param("exportThemeId") UUID exportThemeId, @Param("exportThemeFileId") UUID exportThemeFileId);

  /**
   * Finds single export theme file
   * Finds single export theme file
    * @param realmId realm id (required)
    * @param exportThemeId export theme id (required)
    * @param exportThemeFileId export theme file id (required)
   * @return ExportThemeFile
   */
  @RequestLine("GET /realms/{realmId}/exportThemes/{exportThemeId}/files/{exportThemeFileId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ExportThemeFile findExportThemeFile(@Param("realmId") String realmId, @Param("exportThemeId") UUID exportThemeId, @Param("exportThemeFileId") UUID exportThemeFileId);

  /**
   * Lists files of export theme
   * Lists files of export theme
    * @param realmId realm id (required)
    * @param exportThemeId export theme id (required)
   * @return List&lt;ExportThemeFile&gt;
   */
  @RequestLine("GET /realms/{realmId}/exportThemes/{exportThemeId}/files")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ExportThemeFile> listExportThemeFiles(@Param("realmId") String realmId, @Param("exportThemeId") UUID exportThemeId);

  /**
   * Updates export theme file
   * Updates export theme file
    * @param realmId realm id (required)
    * @param exportThemeId ExportTheme id (required)
    * @param exportThemeFileId ExportThemeFile file id (required)
    * @param payload Payload (required)
   * @return ExportThemeFile
   */
  @RequestLine("PUT /realms/{realmId}/exportThemes/{exportThemeId}/files/{exportThemeFileId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ExportThemeFile updateExportThemeFile(@Param("realmId") String realmId, @Param("exportThemeId") UUID exportThemeId, @Param("exportThemeFileId") UUID exportThemeFileId, ExportThemeFile payload);
}
