package apps.proman.api.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Status of the project
 */
public enum ProjectStatusType {
  
  OPEN("OPEN"),
  
  IN_PROGRESS("IN PROGRESS"),
  
  ON_HOLD("ON HOLD"),
  
  COMPLETED("COMPLETED"),
  
  DELETED("DELETED");

  private String value;

  ProjectStatusType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ProjectStatusType fromValue(String text) {
    for (ProjectStatusType b : ProjectStatusType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

