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
 * UpdateProjectTaskRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-01-28T14:38:46.506+05:30")

public class UpdateProjectTaskRequest   {
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

  @JsonProperty("original_effort")
  private Integer originalEffort = null;

  public UpdateProjectTaskRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Modified name of the task
   * @return name
  **/
  @ApiModelProperty(value = "Modified name of the task")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateProjectTaskRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Modified description of the task
   * @return description
  **/
  @ApiModelProperty(value = "Modified description of the task")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UpdateProjectTaskRequest ownerId(UUID ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * Unique identifier of the board task owner in a standard UUID format
   * @return ownerId
  **/
  @ApiModelProperty(value = "Unique identifier of the board task owner in a standard UUID format")

  @Valid

  public UUID getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(UUID ownerId) {
    this.ownerId = ownerId;
  }

  public UpdateProjectTaskRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Start date of the board
   * @return startDate
  **/
  @ApiModelProperty(value = "Start date of the board")


  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public UpdateProjectTaskRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * End date of the board
   * @return endDate
  **/
  @ApiModelProperty(value = "End date of the board")


  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public UpdateProjectTaskRequest originalEffort(Integer originalEffort) {
    this.originalEffort = originalEffort;
    return this;
  }

  /**
   * Estimated effort (in seconds) for this task
   * @return originalEffort
  **/
  @ApiModelProperty(value = "Estimated effort (in seconds) for this task")


  public Integer getOriginalEffort() {
    return originalEffort;
  }

  public void setOriginalEffort(Integer originalEffort) {
    this.originalEffort = originalEffort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateProjectTaskRequest updateProjectTaskRequest = (UpdateProjectTaskRequest) o;
    return Objects.equals(this.name, updateProjectTaskRequest.name) &&
        Objects.equals(this.description, updateProjectTaskRequest.description) &&
        Objects.equals(this.ownerId, updateProjectTaskRequest.ownerId) &&
        Objects.equals(this.startDate, updateProjectTaskRequest.startDate) &&
        Objects.equals(this.endDate, updateProjectTaskRequest.endDate) &&
        Objects.equals(this.originalEffort, updateProjectTaskRequest.originalEffort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, ownerId, startDate, endDate, originalEffort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateProjectTaskRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    originalEffort: ").append(toIndentedString(originalEffort)).append("\n");
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

