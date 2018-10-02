/*
 * Metaform REST API
 * REST API for Metaform
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package fi.metatavu.metaform.client;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Email notification
 */
@ApiModel(description = "Email notification")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-02T18:24:54.049+03:00")
public class EmailNotification {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("subjectTemplate")
  private String subjectTemplate = null;

  @JsonProperty("contentTemplate")
  private String contentTemplate = null;

  @JsonProperty("emails")
  private List<String> emails = new ArrayList<String>();

  public EmailNotification id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public EmailNotification subjectTemplate(String subjectTemplate) {
    this.subjectTemplate = subjectTemplate;
    return this;
  }

   /**
   * Get subjectTemplate
   * @return subjectTemplate
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSubjectTemplate() {
    return subjectTemplate;
  }

  public void setSubjectTemplate(String subjectTemplate) {
    this.subjectTemplate = subjectTemplate;
  }

  public EmailNotification contentTemplate(String contentTemplate) {
    this.contentTemplate = contentTemplate;
    return this;
  }

   /**
   * Get contentTemplate
   * @return contentTemplate
  **/
  @ApiModelProperty(required = true, value = "")
  public String getContentTemplate() {
    return contentTemplate;
  }

  public void setContentTemplate(String contentTemplate) {
    this.contentTemplate = contentTemplate;
  }

  public EmailNotification emails(List<String> emails) {
    this.emails = emails;
    return this;
  }

  public EmailNotification addEmailsItem(String emailsItem) {
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * Get emails
   * @return emails
  **/
  @ApiModelProperty(required = true, value = "")
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
    return Objects.equals(this.id, emailNotification.id) &&
        Objects.equals(this.subjectTemplate, emailNotification.subjectTemplate) &&
        Objects.equals(this.contentTemplate, emailNotification.contentTemplate) &&
        Objects.equals(this.emails, emailNotification.emails);
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

