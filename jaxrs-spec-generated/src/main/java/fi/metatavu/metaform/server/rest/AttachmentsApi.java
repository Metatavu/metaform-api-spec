package fi.metatavu.metaform.server.rest;

import fi.metatavu.metaform.server.rest.model.Attachment;
import fi.metatavu.metaform.server.rest.model.BadRequest;
import fi.metatavu.metaform.server.rest.model.Forbidden;
import fi.metatavu.metaform.server.rest.model.InternalServerError;
import java.util.UUID;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
import java.lang.Exception;

@Path("/attachments")

@Api(description = "the attachments API")
@Consumes({ "application/json;charset=utf-8" })
@Produces({ "application/json;charset=utf-8" })
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2018-08-13T14:41:50.989+03:00")


public interface AttachmentsApi  {

    @GET
    @Path("/{attachmentId}")
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
    public Response findAttachment(@PathParam("attachmentId") @ApiParam("Attachment id") UUID attachmentId) throws Exception;

    @GET
    @Path("/{attachmentId}/data")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Find a attachment data by id", notes = "Returns attachment data", response = byte[].class, authorizations = {
        @Authorization(value = "bearer")
    }, tags={ "Attachments" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns an attachment data", response = byte[].class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response findAttachmentData(@PathParam("attachmentId") @ApiParam("Attachment id") UUID attachmentId) throws Exception;
}
