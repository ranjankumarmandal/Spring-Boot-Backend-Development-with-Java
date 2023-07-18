package apps.proman.api.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Status of the board
 */
public enum BoardStatusType {
  
  OPEN("OPEN"),
  
  CLOSED("CLOSED"),
  
  DELETED("DELETED");

  private String value;

  BoardStatusType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BoardStatusType fromValue(String text) {
    for (BoardStatusType b : BoardStatusType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

