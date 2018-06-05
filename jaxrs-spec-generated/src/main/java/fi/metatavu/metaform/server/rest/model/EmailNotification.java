package fi.metatavu.metaform.server.rest.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Email notification
 **/
import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "Email notification")

public class EmailNotification   {
  
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("id") UUID id = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("subjectTemplate") String subjectTemplate = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("contentTemplate") String contentTemplate = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("emails") List<String> emails = new ArrayList<String>();

  /**
   **/
  public EmailNotification id(UUID id) {
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
  public EmailNotification subjectTemplate(String subjectTemplate) {
    this.subjectTemplate = subjectTemplate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getSubjectTemplate() {
    return subjectTemplate;
  }
  public void setSubjectTemplate(String subjectTemplate) {
    this.subjectTemplate = subjectTemplate;
  }

  /**
   **/
  public EmailNotification contentTemplate(String contentTemplate) {
    this.contentTemplate = contentTemplate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getContentTemplate() {
    return contentTemplate;
  }
  public void setContentTemplate(String contentTemplate) {
    this.contentTemplate = contentTemplate;
  }

  /**
   **/
  public EmailNotification emails(List<String> emails) {
    this.emails = emails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public List<String> getEmails() {
    return emails;
  }
  public void setEmails(List<String> emails) {
    this.emails = emails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailNotification emailNotification = (EmailNotification) o;
    return Objects.equals(id, emailNotification.id) &&
        Objects.equals(subjectTemplate, emailNotification.subjectTemplate) &&
        Objects.equals(contentTemplate, emailNotification.contentTemplate) &&
        Objects.equals(emails, emailNotification.emails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, subjectTemplate, contentTemplate, emails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    subjectTemplate: ").append(toIndentedString(subjectTemplate)).append("\n");
    sb.append("    contentTemplate: ").append(toIndentedString(contentTemplate)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
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

