package apps.proman.api.model;

import java.util.Objects;
import apps.proman.api.model.BoardOwnerDetailsType;
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
 * BoardDetailsResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-01-28T14:38:46.506+05:30")

public class BoardDetailsResponse   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("owner")
  private BoardOwnerDetailsType owner = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("status")
  private BoardStatusType status = null;

  @JsonProperty("total_projects")
  private Integer totalProjects = null;

  public BoardDetailsResponse id(UUID id) {
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

  public BoardDetailsResponse name(String name) {
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

  public BoardDetailsResponse owner(BoardOwnerDetailsType owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Details of the board owner
   * @return owner
  **/
  @ApiModelProperty(required = true, value = "Details of the board owner")
  @NotNull

  @Valid

  public BoardOwnerDetailsType getOwner() {
    return owner;
  }

  public void setOwner(BoardOwnerDetailsType owner) {
    this.owner = owner;
  }

  public BoardDetailsResponse description(String description) {
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

  public BoardDetailsResponse status(BoardStatusType status) {
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

  public BoardDetailsResponse totalProjects(Integer totalProjects) {
    this.totalProjects = totalProjects;
    return this;
  }

  /**
   * Total number of projects in the board
   * @return totalProjects
  **/
  @ApiModelProperty(required = true, value = "Total number of projects in the board")
  @NotNull


  public Integer getTotalProjects() {
    return totalProjects;
  }

  public void setTotalProjects(Integer totalProjects) {
    this.totalProjects = totalProjects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoardDetailsResponse boardDetailsResponse = (BoardDetailsResponse) o;
    return Objects.equals(this.id, boardDetailsResponse.id) &&
        Objects.equals(this.name, boardDetailsResponse.name) &&
        Objects.equals(this.owner, boardDetailsResponse.owner) &&
        Objects.equals(this.description, boardDetailsResponse.description) &&
        Objects.equals(this.status, boardDetailsResponse.status) &&
        Objects.equals(this.totalProjects, boardDetailsResponse.totalProjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, owner, description, status, totalProjects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardDetailsResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    totalProjects: ").append(toIndentedString(totalProjects)).append("\n");
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

