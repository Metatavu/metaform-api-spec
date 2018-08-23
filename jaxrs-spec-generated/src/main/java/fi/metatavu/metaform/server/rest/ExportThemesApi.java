package fi.metatavu.metaform.server.rest;

import fi.metatavu.metaform.server.rest.model.BadRequest;
import fi.metatavu.metaform.server.rest.model.ExportTheme;
import fi.metatavu.metaform.server.rest.model.ExportThemeFile;
import fi.metatavu.metaform.server.rest.model.Forbidden;
import fi.metatavu.metaform.server.rest.model.InternalServerError;
import fi.metatavu.metaform.server.rest.model.NotFound;
import java.util.UUID;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
import java.lang.Exception;

@Path("/exportThemes")

@Api(description = "the exportThemes API")
@Consumes({ "application/json;charset=utf-8" })
@Produces({ "application/json;charset=utf-8" })
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2018-08-23T09:14:44.221+03:00")


public interface ExportThemesApi  {

    @POST
    
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "create new form export theme", notes = "Creates new form export theme", response = ExportTheme.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "ExportThemes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Created export theme", response = ExportTheme.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 404, message = "Attempted to make a call to an non existant metaform", response = NotFound.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response createExportTheme(@Valid ExportTheme payload) throws Exception;

    @POST
    @Path("/{exportThemeId}/files")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "create new export theme file", notes = "Creates new export theme file", response = ExportThemeFile.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "ExportThemes", "ExportThemeFiles",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Created export theme file", response = ExportThemeFile.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 404, message = "Attempted to make a call to an non existant metaform", response = NotFound.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response createExportThemeFile(@PathParam("exportThemeId") @ApiParam("export theme id") UUID exportThemeId,@Valid ExportThemeFile payload) throws Exception;

    @DELETE
    @Path("/{exportThemeId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Deletes an export theme", notes = "Deletes an export theme", response = Void.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "ExportThemes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Empty response indicating a successful removal", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 404, message = "Attempted to make a call to an non existant metaform", response = NotFound.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response deleteExportTheme(@PathParam("exportThemeId") @ApiParam("export theme id") UUID exportThemeId) throws Exception;

    @DELETE
    @Path("/{exportThemeId}/files/{exportThemeFileId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Deletes an export theme file", notes = "Deletes an export theme file", response = Void.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "ExportThemes", "ExportThemeFiles",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Empty response indicating a successful removal", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 404, message = "Attempted to make a call to an non existant metaform", response = NotFound.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response deleteExportThemeFile(@PathParam("exportThemeId") @ApiParam("export theme id") UUID exportThemeId,@PathParam("exportThemeFileId") @ApiParam("export theme file id") UUID exportThemeFileId) throws Exception;

    @GET
    @Path("/{exportThemeId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Finds single export theme", notes = "Finds single export theme", response = ExportTheme.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "ExportThemes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "single export theme", response = ExportTheme.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 404, message = "Attempted to make a call to an non existant metaform", response = NotFound.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response findExportTheme(@PathParam("exportThemeId") @ApiParam("export theme id") UUID exportThemeId) throws Exception;

    @GET
    @Path("/{exportThemeId}/files/{exportThemeFileId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Finds single export theme file", notes = "Finds single export theme file", response = ExportThemeFile.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "ExportThemes", "ExportThemeFiles",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "single export theme file", response = ExportThemeFile.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 404, message = "Attempted to make a call to an non existant metaform", response = NotFound.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response findExportThemeFile(@PathParam("exportThemeId") @ApiParam("export theme id") UUID exportThemeId,@PathParam("exportThemeFileId") @ApiParam("export theme file id") UUID exportThemeFileId) throws Exception;

    @GET
    @Path("/{exportThemeId}/files")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Lists files of export theme", notes = "Lists files of export theme", response = ExportThemeFile.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "ExportThemes", "ExportThemeFiles",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of export theme files", response = ExportThemeFile.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 404, message = "Attempted to make a call to an non existant metaform", response = NotFound.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response listExportThemeFiles(@PathParam("exportThemeId") @ApiParam("export theme id") UUID exportThemeId) throws Exception;

    @GET
    
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Lists form export themes", notes = "Lists export themes", response = ExportTheme.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "ExportThemes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of export themes", response = ExportTheme.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 404, message = "Attempted to make a call to an non existant metaform", response = NotFound.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response listExportThemes() throws Exception;

    @PUT
    @Path("/{exportThemeId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Updates export theme", notes = "Updates export theme", response = ExportTheme.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "ExportThemes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "an updated export theme", response = ExportTheme.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 404, message = "Attempted to make a call to an non existant metaform", response = NotFound.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response updateExportTheme(@PathParam("exportThemeId") @ApiParam("ExportTheme id") UUID exportThemeId,@Valid ExportTheme payload) throws Exception;

    @PUT
    @Path("/{exportThemeId}/files/{exportThemeFileId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Updates export theme file", notes = "Updates export theme file", response = ExportThemeFile.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "ExportThemes", "ExportThemeFiles" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "an updated export theme file", response = ExportThemeFile.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 404, message = "Attempted to make a call to an non existant metaform", response = NotFound.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response updateExportThemeFile(@PathParam("exportThemeId") @ApiParam("ExportTheme id") UUID exportThemeId,@PathParam("exportThemeFileId") @ApiParam("ExportThemeFile file id") UUID exportThemeFileId,@Valid ExportThemeFile payload) throws Exception;
}
