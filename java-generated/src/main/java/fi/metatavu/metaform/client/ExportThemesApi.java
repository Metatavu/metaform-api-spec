package fi.metatavu.metaform.client;

import fi.metatavu.metaform.ApiClient;
import fi.metatavu.metaform.EncodingUtils;

import fi.metatavu.metaform.client.BadRequest;
import fi.metatavu.metaform.client.ExportTheme;
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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-13T14:43:50.131+03:00")
public interface ExportThemesApi extends ApiClient.Api {


  /**
   * create new form export theme
   * Creates new form export theme
    * @param payload Payload (required)
   * @return ExportTheme
   */
  @RequestLine("POST /exportThemes")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ExportTheme createExportTheme(ExportTheme payload);

  /**
   * create new export theme file
   * Creates new export theme file
    * @param exportThemeId export theme id (required)
    * @param payload Payload (required)
   * @return ExportThemeFile
   */
  @RequestLine("POST /exportThemes/{exportThemeId}/files")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ExportThemeFile createExportThemeFile(@Param("exportThemeId") UUID exportThemeId, ExportThemeFile payload);

  /**
   * Deletes an export theme
   * Deletes an export theme
    * @param exportThemeId export theme id (required)
   */
  @RequestLine("DELETE /exportThemes/{exportThemeId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void deleteExportTheme(@Param("exportThemeId") UUID exportThemeId);

  /**
   * Deletes an export theme file
   * Deletes an export theme file
    * @param exportThemeId export theme id (required)
    * @param exportThemeFileId export theme file id (required)
   */
  @RequestLine("DELETE /exportThemes/{exportThemeId}/files/{exportThemeFileId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  void deleteExportThemeFile(@Param("exportThemeId") UUID exportThemeId, @Param("exportThemeFileId") UUID exportThemeFileId);

  /**
   * Finds single export theme
   * Finds single export theme
    * @param exportThemeId export theme id (required)
   * @return ExportTheme
   */
  @RequestLine("GET /exportThemes/{exportThemeId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ExportTheme findExportTheme(@Param("exportThemeId") UUID exportThemeId);

  /**
   * Finds single export theme file
   * Finds single export theme file
    * @param exportThemeId export theme id (required)
    * @param exportThemeFileId export theme file id (required)
   * @return ExportThemeFile
   */
  @RequestLine("GET /exportThemes/{exportThemeId}/files/{exportThemeFileId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ExportThemeFile findExportThemeFile(@Param("exportThemeId") UUID exportThemeId, @Param("exportThemeFileId") UUID exportThemeFileId);

  /**
   * Lists files of export theme
   * Lists files of export theme
    * @param exportThemeId export theme id (required)
   * @return List&lt;ExportThemeFile&gt;
   */
  @RequestLine("GET /exportThemes/{exportThemeId}/files")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ExportThemeFile> listExportThemeFiles(@Param("exportThemeId") UUID exportThemeId);

  /**
   * Lists form export themes
   * Lists export themes
   * @return List&lt;ExportTheme&gt;
   */
  @RequestLine("GET /exportThemes")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  List<ExportTheme> listExportThemes();

  /**
   * Updates export theme
   * Updates export theme
    * @param exportThemeId ExportTheme id (required)
    * @param payload Payload (required)
   * @return ExportTheme
   */
  @RequestLine("PUT /exportThemes/{exportThemeId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ExportTheme updateExportTheme(@Param("exportThemeId") UUID exportThemeId, ExportTheme payload);

  /**
   * Updates export theme file
   * Updates export theme file
    * @param exportThemeId ExportTheme id (required)
    * @param exportThemeFileId ExportThemeFile file id (required)
    * @param payload Payload (required)
   * @return ExportThemeFile
   */
  @RequestLine("PUT /exportThemes/{exportThemeId}/files/{exportThemeFileId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ExportThemeFile updateExportThemeFile(@Param("exportThemeId") UUID exportThemeId, @Param("exportThemeFileId") UUID exportThemeFileId, ExportThemeFile payload);
}
