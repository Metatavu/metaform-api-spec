package fi.metatavu.metaform.server.rest.model;

import fi.metatavu.metaform.server.rest.model.MetaformSection;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;


public class Metaform   {
  
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("id") UUID id = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("slug") String slug = null;

public enum ReplyStrategyEnum {

    PUBLIC(String.valueOf("PUBLIC")), PRIVATE(String.valueOf("PRIVATE"));


    private String value;

    ReplyStrategyEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ReplyStrategyEnum fromValue(String v) {
        for (ReplyStrategyEnum b : ReplyStrategyEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("replyStrategy") ReplyStrategyEnum replyStrategy = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("exportThemeId") UUID exportThemeId = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("allowAnonymous") Boolean allowAnonymous = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("allowDrafts") Boolean allowDrafts = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("title") String title = null;
  private @Valid @com.fasterxml.jackson.annotation.JsonProperty("sections") List<MetaformSection> sections = new ArrayList<MetaformSection>();

  /**
   **/
  public Metaform id(UUID id) {
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
  public Metaform slug(String slug) {
    this.slug = slug;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getSlug() {
    return slug;
  }
  public void setSlug(String slug) {
    this.slug = slug;
  }

  /**
   **/
  public Metaform replyStrategy(ReplyStrategyEnum replyStrategy) {
    this.replyStrategy = replyStrategy;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public ReplyStrategyEnum getReplyStrategy() {
    return replyStrategy;
  }
  public void setReplyStrategy(ReplyStrategyEnum replyStrategy) {
    this.replyStrategy = replyStrategy;
  }

  /**
   **/
  public Metaform exportThemeId(UUID exportThemeId) {
    this.exportThemeId = exportThemeId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public UUID getExportThemeId() {
    return exportThemeId;
  }
  public void setExportThemeId(UUID exportThemeId) {
    this.exportThemeId = exportThemeId;
  }

  /**
   * Are anonymous replies allowed or not
   **/
  public Metaform allowAnonymous(Boolean allowAnonymous) {
    this.allowAnonymous = allowAnonymous;
    return this;
  }

  
  @ApiModelProperty(value = "Are anonymous replies allowed or not")
  public Boolean isAllowAnonymous() {
    return allowAnonymous;
  }
  public void setAllowAnonymous(Boolean allowAnonymous) {
    this.allowAnonymous = allowAnonymous;
  }

  /**
   * Are drafts allowed or not
   **/
  public Metaform allowDrafts(Boolean allowDrafts) {
    this.allowDrafts = allowDrafts;
    return this;
  }

  
  @ApiModelProperty(value = "Are drafts allowed or not")
  public Boolean isAllowDrafts() {
    return allowDrafts;
  }
  public void setAllowDrafts(Boolean allowDrafts) {
    this.allowDrafts = allowDrafts;
  }

  /**
   **/
  public Metaform title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  public Metaform sections(List<MetaformSection> sections) {
    this.sections = sections;
    return this;
  }

  
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
    return Objects.equals(id, metaform.id) &&
        Objects.equals(slug, metaform.slug) &&
        Objects.equals(replyStrategy, metaform.replyStrategy) &&
        Objects.equals(exportThemeId, metaform.exportThemeId) &&
        Objects.equals(allowAnonymous, metaform.allowAnonymous) &&
        Objects.equals(allowDrafts, metaform.allowDrafts) &&
        Objects.equals(title, metaform.title) &&
        Objects.equals(sections, metaform.sections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, slug, replyStrategy, exportThemeId, allowAnonymous, allowDrafts, title, sections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metaform {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    replyStrategy: ").append(toIndentedString(replyStrategy)).append("\n");
    sb.append("    exportThemeId: ").append(toIndentedString(exportThemeId)).append("\n");
    sb.append("    allowAnonymous: ").append(toIndentedString(allowAnonymous)).append("\n");
    sb.append("    allowDrafts: ").append(toIndentedString(allowDrafts)).append("\n");
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

