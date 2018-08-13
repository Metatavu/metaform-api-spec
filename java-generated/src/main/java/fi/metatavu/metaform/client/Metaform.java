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
import fi.metatavu.metaform.client.MetaformSection;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Metaform
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-13T12:38:59.598+03:00")
public class Metaform {
  @JsonProperty("id")
  private UUID id = null;

  /**
   * Gets or Sets replyStrategy
   */
  public enum ReplyStrategyEnum {
    PUBLIC("PUBLIC"),
    
    PRIVATE("PRIVATE");

    private String value;

    ReplyStrategyEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ReplyStrategyEnum fromValue(String text) {
      for (ReplyStrategyEnum b : ReplyStrategyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("replyStrategy")
  private ReplyStrategyEnum replyStrategy = null;

  @JsonProperty("allowAnonymous")
  private Boolean allowAnonymous = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("sections")
  private List<MetaformSection> sections = null;

  public Metaform id(UUID id) {
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

  public Metaform replyStrategy(ReplyStrategyEnum replyStrategy) {
    this.replyStrategy = replyStrategy;
    return this;
  }

   /**
   * Get replyStrategy
   * @return replyStrategy
  **/
  @ApiModelProperty(value = "")
  public ReplyStrategyEnum getReplyStrategy() {
    return replyStrategy;
  }

  public void setReplyStrategy(ReplyStrategyEnum replyStrategy) {
    this.replyStrategy = replyStrategy;
  }

  public Metaform allowAnonymous(Boolean allowAnonymous) {
    this.allowAnonymous = allowAnonymous;
    return this;
  }

   /**
   * Are anonymous replies allowed or not
   * @return allowAnonymous
  **/
  @ApiModelProperty(value = "Are anonymous replies allowed or not")
  public Boolean isAllowAnonymous() {
    return allowAnonymous;
  }

  public void setAllowAnonymous(Boolean allowAnonymous) {
    this.allowAnonymous = allowAnonymous;
  }

  public Metaform title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Metaform sections(List<MetaformSection> sections) {
    this.sections = sections;
    return this;
  }

  public Metaform addSectionsItem(MetaformSection sectionsItem) {
    if (this.sections == null) {
      this.sections = new ArrayList<MetaformSection>();
    }
    this.sections.add(sectionsItem);
    return this;
  }

   /**
   * Get sections
   * @return sections
  **/
  @ApiModelProperty(value = "")
  public List<MetaformSection> getSections() {
    return sections;
  }

  public void setSections(List<MetaformSection> sections) {
    this.sections = sections;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metaform metaform = (Metaform) o;
    return Objects.equals(this.id, metaform.id) &&
        Objects.equals(this.replyStrategy, metaform.replyStrategy) &&
        Objects.equals(this.allowAnonymous, metaform.allowAnonymous) &&
        Objects.equals(this.title, metaform.title) &&
        Objects.equals(this.sections, metaform.sections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, replyStrategy, allowAnonymous, title, sections);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metaform {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    replyStrategy: ").append(toIndentedString(replyStrategy)).append("\n");
    sb.append("    allowAnonymous: ").append(toIndentedString(allowAnonymous)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
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

