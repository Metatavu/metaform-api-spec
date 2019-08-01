package fi.metatavu.metaform.server.rest.model;

import fi.metatavu.metaform.server.rest.model.ReplyData;
import java.time.OffsetDateTime;
import java.util.UUID;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class Reply   {
  
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("id") UUID id = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("userId") UUID userId = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("revision") OffsetDateTime revision = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("createdAt") OffsetDateTime createdAt = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("modifiedAt") OffsetDateTime modifiedAt = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("data") ReplyData data = null;

  /**
   **/
  public Reply id(UUID id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public UUID getId() {
    return id;
  }
  public void setId(UUID id) {
    this.id = id;
  }

  /**
   **/
  public Reply userId(UUID userId) {
    this.userId = userId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public UUID getUserId() {
    return userId;
  }
  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  /**
   **/
  public Reply revision(OffsetDateTime revision) {
    this.revision = revision;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public OffsetDateTime getRevision() {
    return revision;
  }
  public void setRevision(OffsetDateTime revision) {
    this.revision = revision;
  }

  /**
   **/
  public Reply createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  public Reply modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }
  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  /**
   **/
  public Reply data(ReplyData data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public ReplyData getData() {
    return data;
  }
  public void setData(ReplyData data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reply reply = (Reply) o;
    return Objects.equals(id, reply.id) &&
        Objects.equals(userId, reply.userId) &&
        Objects.equals(revision, reply.revision) &&
        Objects.equals(createdAt, reply.createdAt) &&
        Objects.equals(modifiedAt, reply.modifiedAt) &&
        Objects.equals(data, reply.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, revision, createdAt, modifiedAt, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reply {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

