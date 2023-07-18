package apps.proman.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreateBoardProjectRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-01-28T14:38:46.506+05:30")

public class CreateBoardProjectRequest   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("owner_id")
  private UUID ownerId = null;

  @JsonProperty("start_date")
  private String startDate = null;

  @JsonProperty("end_date")
  private String endDate = null;

  public CreateBoardProjectRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the new project
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the new project")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateBoardProjectRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the new project
   * @return description
  **/
  @ApiModelProperty(value = "Description of the new project")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateBoardProjectRequest ownerId(UUID ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * Unique identifier of the board project owner in a standard UUID format
   * @return ownerId
  **/
  @ApiModelProperty(value = "Unique identifier of the board project owner in a standard UUID format")

  @Valid

  public UUID getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(UUID ownerId) {
    this.ownerId = ownerId;
  }

  public CreateBoardProjectRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Start date of the project
   * @return startDate
  **/
  @ApiModelProperty(required = true, value = "Start date of the project")
  @NotNull


  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public CreateBoardProjectRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * End date of the project
   * @return endDate
  **/
  @ApiModelProperty(required = true, value = "End date of the project")
  @NotNull


  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBoardProjectRequest createBoardProjectRequest = (CreateBoardProjectRequest) o;
    return Objects.equals(this.name, createBoardProjectRequest.name) &&
        Objects.equals(this.description, createBoardProjectRequest.description) &&
        Objects.equals(this.ownerId, createBoardProjectRequest.ownerId) &&
        Objects.equals(this.startDate, createBoardProjectRequest.startDate) &&
        Objects.equals(this.endDate, createBoardProjectRequest.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, ownerId, startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBoardProjectRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

