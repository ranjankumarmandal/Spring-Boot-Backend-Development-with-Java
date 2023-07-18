package apps.proman.api.model;

import java.util.Objects;
import apps.proman.api.model.BoardOwnerType;
import apps.proman.api.model.BoardStatusType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BoardSummaryType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-01-28T14:38:46.506+05:30")

public class BoardSummaryType   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("owner")
  private BoardOwnerType owner = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("status")
  private BoardStatusType status = null;

  public BoardSummaryType id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the board in a standard UUID format
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the board in a standard UUID format")
  @NotNull

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public BoardSummaryType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the board
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the board")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BoardSummaryType owner(BoardOwnerType owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Name of the board owner
   * @return owner
  **/
  @ApiModelProperty(required = true, value = "Name of the board owner")
  @NotNull

  @Valid

  public BoardOwnerType getOwner() {
    return owner;
  }

  public void setOwner(BoardOwnerType owner) {
    this.owner = owner;
  }

  public BoardSummaryType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the board
   * @return description
  **/
  @ApiModelProperty(value = "Description of the board")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BoardSummaryType status(BoardStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BoardStatusType getStatus() {
    return status;
  }

  public void setStatus(BoardStatusType status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoardSummaryType boardSummaryType = (BoardSummaryType) o;
    return Objects.equals(this.id, boardSummaryType.id) &&
        Objects.equals(this.name, boardSummaryType.name) &&
        Objects.equals(this.owner, boardSummaryType.owner) &&
        Objects.equals(this.description, boardSummaryType.description) &&
        Objects.equals(this.status, boardSummaryType.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, owner, description, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardSummaryType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

