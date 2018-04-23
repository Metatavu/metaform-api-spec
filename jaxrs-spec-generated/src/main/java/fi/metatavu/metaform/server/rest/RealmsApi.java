package fi.metatavu.metaform.server.rest;

import fi.metatavu.metaform.server.rest.model.BadRequest;
import fi.metatavu.metaform.server.rest.model.Forbidden;
import fi.metatavu.metaform.server.rest.model.InternalServerError;
import fi.metatavu.metaform.server.rest.model.Metaform;
import fi.metatavu.metaform.server.rest.model.NotFound;
import fi.metatavu.metaform.server.rest.model.Reply;
import fi.metatavu.metaform.server.rest.model.ReplyMeta;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2018-04-23T19:00:36.621+03:00")


public interface RealmsApi  {

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
    @ApiOperation(value = "create new form reply", notes = "Creates new form reply", response = Void.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Replies",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Empty response indicating a succesful update", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 404, message = "Attempted to make a call to an non existant metaform", response = NotFound.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response createReply(@PathParam("realmId") @ApiParam("realm id") String realmId,@PathParam("metaformId") @ApiParam("Metaform id") UUID metaformId,@Valid Reply payload) throws Exception;

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
    @Path("/{realmId}/metaforms/{metaformId}/replies/{replyId}/meta")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Returns reply meta", notes = "Returns meta data from the reply", response = ReplyMeta.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Replies",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A reply meta", response = ReplyMeta.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 404, message = "Attempted to make a call to an non existant metaform", response = NotFound.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response findReplyMeta(@PathParam("realmId") @ApiParam("realm id") String realmId,@PathParam("metaformId") @ApiParam("Metaform id") UUID metaformId,@PathParam("replyId") @ApiParam("Reply id") UUID replyId) throws Exception;

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
    @ApiOperation(value = "Lists form replies", notes = "Lists form replies", response = Reply.class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Replies",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A reply", response = Reply.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 404, message = "Attempted to make a call to an non existant metaform", response = NotFound.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response listReplies(@PathParam("realmId") @ApiParam("realm id") String realmId,@PathParam("metaformId") @ApiParam("Metaform id") UUID metaformId,@QueryParam("userId")   @ApiParam("Filter results by user id. If this parameter is not specified all replies are returned, this requires logged user to have proper permission to do so")  UUID userId) throws Exception;

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
