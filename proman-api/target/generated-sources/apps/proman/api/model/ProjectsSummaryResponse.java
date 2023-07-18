package apps.proman.api.model;

import java.util.Objects;
import apps.proman.api.model.ProjectSummaryType;
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
 * ProjectsSummaryResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-01-28T14:38:46.506+05:30")

public class ProjectsSummaryResponse   {
  @JsonProperty("page")
  private Integer page = null;

  @JsonProperty("limit")
  private Integer limit = null;

  @JsonProperty("total_count")
  private Integer totalCount = null;

  @JsonProperty("projects")
  @Valid
  private List<ProjectSummaryType> projects = new ArrayList<>();

  public ProjectsSummaryResponse page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * page or position of the fetched members
   * @return page
  **/
  @ApiModelProperty(required = true, value = "page or position of the fetched members")
  @NotNull


  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public ProjectsSummaryResponse limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * number of members fetched `per this request
   * @return limit
  **/
  @ApiModelProperty(required = true, value = "number of members fetched `per this request")
  @NotNull


  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public ProjectsSummaryResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * total number of projects in the database
   * @return totalCount
  **/
  @ApiModelProperty(required = true, value = "total number of projects in the database")
  @NotNull


  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public ProjectsSummaryResponse projects(List<ProjectSummaryType> projects) {
    this.projects = projects;
    return this;
  }

  public ProjectsSummaryResponse addProjectsItem(ProjectSummaryType projectsItem) {
    this.projects.add(projectsItem);
    return this;
  }

  /**
   * List of projects
   * @return projects
  **/
  @ApiModelProperty(required = true, value = "List of projects")
  @NotNull

  @Valid

  public List<ProjectSummaryType> getProjects() {
    return projects;
  }

  public void setProjects(List<ProjectSummaryType> projects) {
    this.projects = projects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectsSummaryResponse projectsSummaryResponse = (ProjectsSummaryResponse) o;
    return Objects.equals(this.page, projectsSummaryResponse.page) &&
        Objects.equals(this.limit, projectsSummaryResponse.limit) &&
        Objects.equals(this.totalCount, projectsSummaryResponse.totalCount) &&
        Objects.equals(this.projects, projectsSummaryResponse.projects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, limit, totalCount, projects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectsSummaryResponse {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
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

