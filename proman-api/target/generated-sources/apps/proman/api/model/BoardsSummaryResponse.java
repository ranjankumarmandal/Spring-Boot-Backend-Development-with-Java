package apps.proman.api.model;

import java.util.Objects;
import apps.proman.api.model.BoardSummaryType;
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
 * BoardsSummaryResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-01-28T14:38:46.506+05:30")

public class BoardsSummaryResponse   {
  @JsonProperty("page")
  private Integer page = null;

  @JsonProperty("limit")
  private Integer limit = null;

  @JsonProperty("total_count")
  private Integer totalCount = null;

  @JsonProperty("boards")
  @Valid
  private List<BoardSummaryType> boards = new ArrayList<>();

  public BoardsSummaryResponse page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * page or position of the fetched boards
   * @return page
  **/
  @ApiModelProperty(required = true, value = "page or position of the fetched boards")
  @NotNull


  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public BoardsSummaryResponse limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * number of boards fetched per this request
   * @return limit
  **/
  @ApiModelProperty(required = true, value = "number of boards fetched per this request")
  @NotNull


  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public BoardsSummaryResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * total number of boards in the database
   * @return totalCount
  **/
  @ApiModelProperty(required = true, value = "total number of boards in the database")
  @NotNull


  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public BoardsSummaryResponse boards(List<BoardSummaryType> boards) {
    this.boards = boards;
    return this;
  }

  public BoardsSummaryResponse addBoardsItem(BoardSummaryType boardsItem) {
    this.boards.add(boardsItem);
    return this;
  }

  /**
   * List of boards
   * @return boards
  **/
  @ApiModelProperty(required = true, value = "List of boards")
  @NotNull

  @Valid

  public List<BoardSummaryType> getBoards() {
    return boards;
  }

  public void setBoards(List<BoardSummaryType> boards) {
    this.boards = boards;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoardsSummaryResponse boardsSummaryResponse = (BoardsSummaryResponse) o;
    return Objects.equals(this.page, boardsSummaryResponse.page) &&
        Objects.equals(this.limit, boardsSummaryResponse.limit) &&
        Objects.equals(this.totalCount, boardsSummaryResponse.totalCount) &&
        Objects.equals(this.boards, boardsSummaryResponse.boards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, limit, totalCount, boards);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardsSummaryResponse {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    boards: ").append(toIndentedString(boards)).append("\n");
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

