package apps.proman.api.model;

import java.util.Objects;
import apps.proman.api.model.TaskWatchersType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreateProjectTaskRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-01-28T14:38:46.506+05:30")

public class CreateProjectTaskRequest   {
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

  @JsonProperty("watchers")
  private TaskWatchersType watchers = null;

  public CreateProjectTaskRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the task
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the task")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateProjectTaskRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the task
   * @return description
  **/
  @ApiModelProperty(value = "Description of the task")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateProjectTaskRequest ownerId(UUID ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * Unique identifier of the board task owner in a standard UUID format
   * @return ownerId
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the board task owner in a standard UUID format")
  @NotNull

  @Valid

  public UUID getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(UUID ownerId) {
    this.ownerId = ownerId;
  }

  public CreateProjectTaskRequest startDate(String startDate) {
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

  public CreateProjectTaskRequest endDate(String endDate) {
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

  public CreateProjectTaskRequest originalEffort(Integer originalEffort) {
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

  public CreateProjectTaskRequest watchers(TaskWatchersType watchers) {
    this.watchers = watchers;
    return this;
  }

  /**
   * List of watchers of this task
   * @return watchers
  **/
  @ApiModelProperty(value = "List of watchers of this task")

  @Valid

  public TaskWatchersType getWatchers() {
    return watchers;
  }

  public void setWatchers(TaskWatchersType watchers) {
    this.watchers = watchers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateProjectTaskRequest createProjectTaskRequest = (CreateProjectTaskRequest) o;
    return Objects.equals(this.name, createProjectTaskRequest.name) &&
        Objects.equals(this.description, createProjectTaskRequest.description) &&
        Objects.equals(this.ownerId, createProjectTaskRequest.ownerId) &&
        Objects.equals(this.startDate, createProjectTaskRequest.startDate) &&
        Objects.equals(this.endDate, createProjectTaskRequest.endDate) &&
        Objects.equals(this.originalEffort, createProjectTaskRequest.originalEffort) &&
        Objects.equals(this.watchers, createProjectTaskRequest.watchers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, ownerId, startDate, endDate, originalEffort, watchers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateProjectTaskRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    originalEffort: ").append(toIndentedString(originalEffort)).append("\n");
    sb.append("    watchers: ").append(toIndentedString(watchers)).append("\n");
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

