package apps.proman.api.model;

import java.util.Objects;
import apps.proman.api.model.ProjectTaskSummaryType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProjectTasksSummaryResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-01-28T14:38:46.506+05:30")

public class ProjectTasksSummaryResponse   {
  @JsonProperty("page")
  private Integer page = null;

  @JsonProperty("limit")
  private Integer limit = null;

  @JsonProperty("total_count")
  private Integer totalCount = null;

  @JsonProperty("tasks")
  @Valid
  private List<ProjectTaskSummaryType> tasks = new ArrayList<>();

  public ProjectTasksSummaryResponse page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * page or position of the fetched tasks
   * @return page
  **/
  @ApiModelProperty(required = true, value = "page or position of the fetched tasks")
  @NotNull


  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public ProjectTasksSummaryResponse limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * number of tasks fetched per this request
   * @return limit
  **/
  @ApiModelProperty(required = true, value = "number of tasks fetched per this request")
  @NotNull


  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public ProjectTasksSummaryResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * total number of tasks in the database
   * @return totalCount
  **/
  @ApiModelProperty(required = true, value = "total number of tasks in the database")
  @NotNull


  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public ProjectTasksSummaryResponse tasks(List<ProjectTaskSummaryType> tasks) {
    this.tasks = tasks;
    return this;
  }

  public ProjectTasksSummaryResponse addTasksItem(ProjectTaskSummaryType tasksItem) {
    this.tasks.add(tasksItem);
    return this;
  }

  /**
   * List of tasks
   * @return tasks
  **/
  @ApiModelProperty(required = true, value = "List of tasks")
  @NotNull

  @Valid

  public List<ProjectTaskSummaryType> getTasks() {
    return tasks;
  }

  public void setTasks(List<ProjectTaskSummaryType> tasks) {
    this.tasks = tasks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectTasksSummaryResponse projectTasksSummaryResponse = (ProjectTasksSummaryResponse) o;
    return Objects.equals(this.page, projectTasksSummaryResponse.page) &&
        Objects.equals(this.limit, projectTasksSummaryResponse.limit) &&
        Objects.equals(this.totalCount, projectTasksSummaryResponse.totalCount) &&
        Objects.equals(this.tasks, projectTasksSummaryResponse.tasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, limit, totalCount, tasks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectTasksSummaryResponse {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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

