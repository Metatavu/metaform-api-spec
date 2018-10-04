package fi.metatavu.metaform.server.rest;

import fi.metatavu.metaform.server.rest.model.Attachment;
import fi.metatavu.metaform.server.rest.model.BadRequest;
import fi.metatavu.metaform.server.rest.model.EmailNotification;
import fi.metatavu.metaform.server.rest.model.ExportTheme;
import fi.metatavu.metaform.server.rest.model.ExportThemeFile;
import fi.metatavu.metaform.server.rest.model.Forbidden;
import fi.metatavu.metaform.server.rest.model.InternalServerError;
import fi.metatavu.metaform.server.rest.model.Metaform;
import fi.metatavu.metaform.server.rest.model.NotFound;
import fi.metatavu.metaform.server.rest.model.Reply;
import java.util.UUID;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
import java.lang.Exception;

@Path("/realms")

@Api(description = "the realms API")
@Consumes({ "application/json;charset=utf-8" })
@Produces({ "application/json;charset=utf-8" })
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2018-10-04T09:12:22.179+03:00")


public interface RealmsApi  {

    @POST
    @Path("/{realmId}/metaforms/{metaformId}/emailNotifications")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "create new form email notification", notes = "Creates new form email notification", response = EmailNotification.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "EmailNotifications",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Created email notification", response = EmailNotification.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 404, message = "Attempted to make a call to an non existant metaform", response = NotFound.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response createEmailNotification(@PathParam("realmId") @ApiParam("realm id") String realmId,@PathParam("metaformId") @ApiParam("Metaform id") UUID metaformId,@Valid EmailNotification payload) throws Exception;

    @POST
    @Path("/{realmId}/exportThemes")
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
    public Response createExportTheme(@PathParam("realmId") @ApiParam("realm id") String realmId,@Valid ExportTheme payload) throws Exception;

    @POST
    @Path("/{realmId}/exportThemes/{exportThemeId}/files")
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
    public Response createExportThemeFile(@PathParam("realmId") @ApiParam("realm id") String realmId,@PathParam("exportThemeId") @ApiParam("export theme id") UUID exportThemeId,@Valid ExportThemeFile payload) throws Exception;

    @POST
    @Path("/{realmId}/metaforms")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "create new Metaform", notes = "Creates new Metaform", response = Metaform.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Metaforms",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Created Metaform", response = Metaform.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 404, message = "Attempted to make a call to an non existant metaform", response = NotFound.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response createMetaform(@PathParam("realmId") @ApiParam("realm id") String realmId,@Valid Metaform payload) throws Exception;

    @POST
    @Path("/{realmId}/metaforms/{metaformId}/replies")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "create new form reply", notes = "Creates new form reply", response = Reply.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Replies",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Created reply", response = Reply.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 404, message = "Attempted to make a call to an non existant metaform", response = NotFound.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response createReply(@PathParam("realmId") @ApiParam("realm id") String realmId,@PathParam("metaformId") @ApiParam("Metaform id") UUID metaformId,@Valid Reply payload,@QueryParam("updateExisting")   @ApiParam("specifies that existing reply should be updated. DEPRECATED, use replymode instead")  Boolean updateExisting,@QueryParam("replyMode")   @ApiParam("specifies reply mode that will be used. possible values UPDATE, REVISION, CUMULATIVE")  String replyMode) throws Exception;

    @DELETE
    @Path("/{realmId}/metaforms/{metaformId}/emailNotifications/{emailNotificationId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Deletes an email notification", notes = "Deletes an email notification", response = Void.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "EmailNotifications",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Empty response indicating a successful removal", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 404, message = "Attempted to make a call to an non existant metaform", response = NotFound.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response deleteEmailNotification(@PathParam("realmId") @ApiParam("realm id") String realmId,@PathParam("metaformId") @ApiParam("Metaform id") UUID metaformId,@PathParam("emailNotificationId") @ApiParam("Email notification id") UUID emailNotificationId) throws Exception;

    @DELETE
    @Path("/{realmId}/exportThemes/{exportThemeId}")
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
    public Response deleteExportTheme(@PathParam("realmId") @ApiParam("realm id") String realmId,@PathParam("exportThemeId") @ApiParam("export theme id") UUID exportThemeId) throws Exception;

    @DELETE
    @Path("/{realmId}/exportThemes/{exportThemeId}/files/{exportThemeFileId}")
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
    public Response deleteExportThemeFile(@PathParam("realmId") @ApiParam("realm id") String realmId,@PathParam("exportThemeId") @ApiParam("export theme id") UUID exportThemeId,@PathParam("exportThemeFileId") @ApiParam("export theme file id") UUID exportThemeFileId) throws Exception;

    @DELETE
    @Path("/{realmId}/metaforms/{metaformId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Deletes Metaform", notes = "Deletes a Metaform", response = Void.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Metaforms",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Empty content indicating a successful removal", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 404, message = "Attempted to make a call to an non existant metaform", response = NotFound.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response deleteMetaform(@PathParam("realmId") @ApiParam("realm id") String realmId,@PathParam("metaformId") @ApiParam("Metaform id") UUID metaformId) throws Exception;

    @DELETE
    @Path("/{realmId}/metaforms/{metaformId}/replies/{replyId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Deletes a reply", notes = "Deletes a reply", response = Void.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Replies",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Empty content indicating a successful removal", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 404, message = "Attempted to make a call to an non existant metaform", response = NotFound.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response deleteReply(@PathParam("realmId") @ApiParam("realm id") String realmId,@PathParam("metaformId") @ApiParam("Metaform id") UUID metaformId,@PathParam("replyId") @ApiParam("Reply id") UUID replyId) throws Exception;

    @GET
    @Path("/{realmId}/metaforms/{metaformId}/export")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Exports metaform data", notes = "Exports metaform data", response = byte[].class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Replies",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Exported Metaform", response = byte[].class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 404, message = "Attempted to make a call to an non existant metaform", response = NotFound.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response export(@PathParam("realmId") @ApiParam("realm id") String realmId,@PathParam("metaformId") @ApiParam("Metaform id") UUID metaformId,@QueryParam("format") @NotNull   @ApiParam("Export results in specified format (XLSX)")  String format) throws Exception;

    @GET
    @Path("/{realmId}/attachments/{attachmentId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Find a attachment by id", notes = "Returns single attachment", response = Attachment.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Attachments",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "an attachment", response = Attachment.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response findAttachment(@PathParam("realmId") @ApiParam("realm id") String realmId,@PathParam("attachmentId") @ApiParam("Attachment id") UUID attachmentId) throws Exception;

    @GET
    @Path("/{realmId}/attachments/{attachmentId}/data")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Find a attachment data by id", notes = "Returns attachment data", response = byte[].class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Attachments",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns an attachment data", response = byte[].class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response findAttachmentData(@PathParam("realmId") @ApiParam("realm id") String realmId,@PathParam("attachmentId") @ApiParam("Attachment id") UUID attachmentId) throws Exception;

    @GET
    @Path("/{realmId}/metaforms/{metaformId}/emailNotifications/{emailNotificationId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Find a single emai notification", notes = "Finds single email notification by id", response = EmailNotification.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "EmailNotifications",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "an email notification", response = EmailNotification.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 404, message = "Attempted to make a call to an non existant metaform", response = NotFound.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response findEmailNotification(@PathParam("realmId") @ApiParam("realm id") String realmId,@PathParam("metaformId") @ApiParam("Metaform id") UUID metaformId,@PathParam("emailNotificationId") @ApiParam("EmailNotification id") UUID emailNotificationId) throws Exception;

    @GET
    @Path("/{realmId}/exportThemes/{exportThemeId}")
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
    public Response findExportTheme(@PathParam("realmId") @ApiParam("realm id") String realmId,@PathParam("exportThemeId") @ApiParam("export theme id") UUID exportThemeId) throws Exception;

    @GET
    @Path("/{realmId}/exportThemes/{exportThemeId}/files/{exportThemeFileId}")
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
    public Response findExportThemeFile(@PathParam("realmId") @ApiParam("realm id") String realmId,@PathParam("exportThemeId") @ApiParam("export theme id") UUID exportThemeId,@PathParam("exportThemeFileId") @ApiParam("export theme file id") UUID exportThemeFileId) throws Exception;

    @GET
    @Path("/{realmId}/metaforms/{metaformId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Finds single Metaform", notes = "Finds a single Metaform", response = Metaform.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Metaforms",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A metaform", response = Metaform.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 404, message = "Attempted to make a call to an non existant metaform", response = NotFound.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response findMetaform(@PathParam("realmId") @ApiParam("realm id") String realmId,@PathParam("metaformId") @ApiParam("Metaform id") UUID metaformId) throws Exception;

    @GET
    @Path("/{realmId}/metaforms/{metaformId}/replies/{replyId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Find a single reply", notes = "Finds single reply by id", response = Reply.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Replies",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A reply", response = Reply.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 404, message = "Attempted to make a call to an non existant metaform", response = NotFound.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response findReply(@PathParam("realmId") @ApiParam("realm id") String realmId,@PathParam("metaformId") @ApiParam("Metaform id") UUID metaformId,@PathParam("replyId") @ApiParam("Reply id") UUID replyId) throws Exception;

    @GET
    @Path("/{realmId}/metaforms/{metaformId}/emailNotifications")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Lists form email notifications", notes = "Lists email notifications", response = EmailNotification.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "EmailNotifications",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of email notifications", response = EmailNotification.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 404, message = "Attempted to make a call to an non existant metaform", response = NotFound.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response listEmailNotifications(@PathParam("realmId") @ApiParam("realm id") String realmId,@PathParam("metaformId") @ApiParam("Metaform id") UUID metaformId) throws Exception;

    @GET
    @Path("/{realmId}/exportThemes/{exportThemeId}/files")
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
    public Response listExportThemeFiles(@PathParam("realmId") @ApiParam("realm id") String realmId,@PathParam("exportThemeId") @ApiParam("export theme id") UUID exportThemeId) throws Exception;

    @GET
    @Path("/{realmId}/exportThemes")
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
    public Response listExportThemes(@PathParam("realmId") @ApiParam("realm id") String realmId) throws Exception;

    @GET
    @Path("/{realmId}/metaforms")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Lists Metaforms", notes = "Lists Metaforms from the realm. User receives only metaforms where he/she has permission to.", response = Metaform.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Metaforms",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of metaforms", response = Metaform.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response listMetaforms(@PathParam("realmId") @ApiParam("realm id") String realmId) throws Exception;

    @GET
    @Path("/{realmId}/metaforms/{metaformId}/replies")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Lists form replies", notes = "Lists form replies", response = Reply.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Replies",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of replies", response = Reply.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 404, message = "Attempted to make a call to an non existant metaform", response = NotFound.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response listReplies(@PathParam("realmId") @ApiParam("realm id") String realmId,@PathParam("metaformId") @ApiParam("Metaform id") UUID metaformId,@QueryParam("userId")   @ApiParam("Filter results by user id. If this parameter is not specified all replies are returned, this requires logged user to have proper permission to do so")  UUID userId,@QueryParam("createdBefore")   @ApiParam("Filter results created before specified time")  String createdBefore,@QueryParam("createdAfter")   @ApiParam("Filter results created after specified time")  String createdAfter,@QueryParam("modifiedBefore")   @ApiParam("Filter results modified before specified time")  String modifiedBefore,@QueryParam("modifiedAfter")   @ApiParam("Filter results modified after specified time")  String modifiedAfter,@QueryParam("includeRevisions")   @ApiParam("Specifies that revisions should be included into response")  Boolean includeRevisions,@QueryParam("fields")   @ApiParam("Filter results by field values. Format is field:value, multiple values can be added by using comma separator. E.g. field1&#x3D;value,field2&#x3D;another")  List<String> fields) throws Exception;

    @GET
    @Path("/{realmId}/metaforms/{metaformId}/replies/{replyId}/export")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Exports reply data", notes = "Exports reply data", response = byte[].class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Replies",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Exported reply", response = byte[].class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 404, message = "Attempted to make a call to an non existant metaform", response = NotFound.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response replyExport(@PathParam("realmId") @ApiParam("realm id") String realmId,@PathParam("metaformId") @ApiParam("Metaform id") UUID metaformId,@PathParam("replyId") @ApiParam("Reply id") UUID replyId,@QueryParam("format") @NotNull   @ApiParam("Export results in specified format (PDF)")  String format) throws Exception;

    @PUT
    @Path("/{realmId}/metaforms/{metaformId}/emailNotifications/{emailNotificationId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Updates email notification", notes = "Updates email notification", response = EmailNotification.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "EmailNotifications",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "an email notification", response = EmailNotification.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 404, message = "Attempted to make a call to an non existant metaform", response = NotFound.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response updateEmailNotification(@PathParam("realmId") @ApiParam("realm id") String realmId,@PathParam("metaformId") @ApiParam("Metaform id") UUID metaformId,@PathParam("emailNotificationId") @ApiParam("EmailNotification id") UUID emailNotificationId,@Valid EmailNotification payload) throws Exception;

    @PUT
    @Path("/{realmId}/exportThemes/{exportThemeId}")
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
    public Response updateExportTheme(@PathParam("realmId") @ApiParam("realm id") String realmId,@PathParam("exportThemeId") @ApiParam("ExportTheme id") UUID exportThemeId,@Valid ExportTheme payload) throws Exception;

    @PUT
    @Path("/{realmId}/exportThemes/{exportThemeId}/files/{exportThemeFileId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Updates export theme file", notes = "Updates export theme file", response = ExportThemeFile.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "ExportThemes", "ExportThemeFiles",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "an updated export theme file", response = ExportThemeFile.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 404, message = "Attempted to make a call to an non existant metaform", response = NotFound.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response updateExportThemeFile(@PathParam("realmId") @ApiParam("realm id") String realmId,@PathParam("exportThemeId") @ApiParam("ExportTheme id") UUID exportThemeId,@PathParam("exportThemeFileId") @ApiParam("ExportThemeFile file id") UUID exportThemeFileId,@Valid ExportThemeFile payload) throws Exception;

    @PUT
    @Path("/{realmId}/metaforms/{metaformId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Updates Metaform", notes = "Updates a Metaform", response = Metaform.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Metaforms",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Updated Metaform", response = Metaform.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 404, message = "Attempted to make a call to an non existant metaform", response = NotFound.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response updateMetaform(@PathParam("realmId") @ApiParam("realm id") String realmId,@PathParam("metaformId") @ApiParam("Metaform id") UUID metaformId,@Valid Metaform payload) throws Exception;

    @PUT
    @Path("/{realmId}/metaforms/{metaformId}/replies/{replyId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Updates reply", notes = "Updates reply", response = Void.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Replies" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Empty response indicating a succesful update", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 404, message = "Attempted to make a call to an non existant metaform", response = NotFound.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response updateReply(@PathParam("realmId") @ApiParam("realm id") String realmId,@PathParam("metaformId") @ApiParam("Metaform id") UUID metaformId,@PathParam("replyId") @ApiParam("Reply id") UUID replyId,@Valid Reply payload) throws Exception;
}
