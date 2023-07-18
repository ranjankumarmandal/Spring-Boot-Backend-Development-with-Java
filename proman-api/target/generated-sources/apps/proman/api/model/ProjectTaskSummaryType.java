package apps.proman.api.model;

import java.util.Objects;
import apps.proman.api.model.TaskOwnerType;
import apps.proman.api.model.TaskProjectSummaryType;
import apps.proman.api.model.TaskStatusType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProjectTaskSummaryType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-01-28T14:38:46.506+05:30")

public class ProjectTaskSummaryType   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("project")
  private TaskProjectSummaryType project = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("owner")
  private TaskOwnerType owner = null;

  @JsonProperty("original_effort")
  private Integer originalEffort = null;

  @JsonProperty("logged_effort")
  private Integer loggedEffort = null;

  @JsonProperty("remaining_effort")
  private Integer remainingEffort = null;

  @JsonProperty("status")
  private TaskStatusType status = null;

  public ProjectTaskSummaryType id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the board member in a standard UUID format generated by API backend
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the board member in a standard UUID format generated by API backend")
  @NotNull

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public ProjectTaskSummaryType project(TaskProjectSummaryType project) {
    this.project = project;
    return this;
  }

  /**
   * Project that this task belongs to
   * @return project
  **/
  @ApiModelProperty(value = "Project that this task belongs to")

  @Valid

  public TaskProjectSummaryType getProject() {
    return project;
  }

  public void setProject(TaskProjectSummaryType project) {
    this.project = project;
  }

  public ProjectTaskSummaryType name(String name) {
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

  public ProjectTaskSummaryType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the task
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description of the task")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProjectTaskSummaryType owner(TaskOwnerType owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Owner (user) of this task
   * @return owner
  **/
  @ApiModelProperty(required = true, value = "Owner (user) of this task")
  @NotNull

  @Valid

  public TaskOwnerType getOwner() {
    return owner;
  }

  public void setOwner(TaskOwnerType owner) {
    this.owner = owner;
  }

  public ProjectTaskSummaryType originalEffort(Integer originalEffort) {
    this.originalEffort = originalEffort;
    return this;
  }

  /**
   * Estimated effort (in seconds) for this task
   * @return originalEffort
  **/
  @ApiModelProperty(required = true, value = "Estimated effort (in seconds) for this task")
  @NotNull


  public Integer getOriginalEffort() {
    return originalEffort;
  }

  public void setOriginalEffort(Integer originalEffort) {
    this.originalEffort = originalEffort;
  }

  public ProjectTaskSummaryType loggedEffort(Integer loggedEffort) {
    this.loggedEffort = loggedEffort;
    return this;
  }

  /**
   * Logged effort (in seconds) for this task
   * @return loggedEffort
  **/
  @ApiModelProperty(required = true, value = "Logged effort (in seconds) for this task")
  @NotNull


  public Integer getLoggedEffort() {
    return loggedEffort;
  }

  public void setLoggedEffort(Integer loggedEffort) {
    this.loggedEffort = loggedEffort;
  }

  public ProjectTaskSummaryType remainingEffort(Integer remainingEffort) {
    this.remainingEffort = remainingEffort;
    return this;
  }

  /**
   * Remaining effort (in seconds) for this task
   * @return remainingEffort
  **/
  @ApiModelProperty(required = true, value = "Remaining effort (in seconds) for this task")
  @NotNull


  public Integer getRemainingEffort() {
    return remainingEffort;
  }

  public void setRemainingEffort(Integer remainingEffort) {
    this.remainingEffort = remainingEffort;
  }

  public ProjectTaskSummaryType status(TaskStatusType status) {
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

  public TaskStatusType getStatus() {
    return status;
  }

  public void setStatus(TaskStatusType status) {
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
    ProjectTaskSummaryType projectTaskSummaryType = (ProjectTaskSummaryType) o;
    return Objects.equals(this.id, projectTaskSummaryType.id) &&
        Objects.equals(this.project, projectTaskSummaryType.project) &&
        Objects.equals(this.name, projectTaskSummaryType.name) &&
        Objects.equals(this.description, projectTaskSummaryType.description) &&
        Objects.equals(this.owner, projectTaskSummaryType.owner) &&
        Objects.equals(this.originalEffort, projectTaskSummaryType.originalEffort) &&
        Objects.equals(this.loggedEffort, projectTaskSummaryType.loggedEffort) &&
        Objects.equals(this.remainingEffort, projectTaskSummaryType.remainingEffort) &&
        Objects.equals(this.status, projectTaskSummaryType.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, project, name, description, owner, originalEffort, loggedEffort, remainingEffort, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectTaskSummaryType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    originalEffort: ").append(toIndentedString(originalEffort)).append("\n");
    sb.append("    loggedEffort: ").append(toIndentedString(loggedEffort)).append("\n");
    sb.append("    remainingEffort: ").append(toIndentedString(remainingEffort)).append("\n");
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

