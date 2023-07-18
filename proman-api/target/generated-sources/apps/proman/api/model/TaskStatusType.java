package apps.proman.api.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Status of the task
 */
public enum TaskStatusType {
  
  OPEN("OPEN"),
  
  IN_PROGRESS("IN PROGRESS"),
  
  ON_HOLD("ON HOLD"),
  
  COMPLETED("COMPLETED"),
  
  REOPENED("REOPENED"),
  
  CLOSED("CLOSED"),
  
  DELETED("DELETED");

  private String value;

  TaskStatusType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TaskStatusType fromValue(String text) {
    for (TaskStatusType b : TaskStatusType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

