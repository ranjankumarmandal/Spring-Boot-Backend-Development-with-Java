package apps.proman.api.model;

import java.util.Objects;
import apps.proman.api.model.ProjectMemberSummaryType;
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
 * ProjectMembersSummaryResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-01-28T14:38:46.506+05:30")

public class ProjectMembersSummaryResponse   {
  @JsonProperty("total_count")
  private Integer totalCount = null;

  @JsonProperty("members")
  @Valid
  private List<ProjectMemberSummaryType> members = new ArrayList<>();

  public ProjectMembersSummaryResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * total number of members in the database
   * @return totalCount
  **/
  @ApiModelProperty(required = true, value = "total number of members in the database")
  @NotNull


  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public ProjectMembersSummaryResponse members(List<ProjectMemberSummaryType> members) {
    this.members = members;
    return this;
  }

  public ProjectMembersSummaryResponse addMembersItem(ProjectMemberSummaryType membersItem) {
    this.members.add(membersItem);
    return this;
  }

  /**
   * List of members
   * @return members
  **/
  @ApiModelProperty(required = true, value = "List of members")
  @NotNull

  @Valid

  public List<ProjectMemberSummaryType> getMembers() {
    return members;
  }

  public void setMembers(List<ProjectMemberSummaryType> members) {
    this.members = members;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectMembersSummaryResponse projectMembersSummaryResponse = (ProjectMembersSummaryResponse) o;
    return Objects.equals(this.totalCount, projectMembersSummaryResponse.totalCount) &&
        Objects.equals(this.members, projectMembersSummaryResponse.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, members);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectMembersSummaryResponse {\n");
    
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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

