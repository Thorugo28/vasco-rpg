package br.com.example.vasco_rpg_api.core.handler;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.List;

@JsonInclude(Include.NON_NULL)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "Error")
public class Error {

    @Schema(example = "400")
    private Integer status;

    @Schema(example = "Invalid data")
    private String title;

    @Schema(example = "2022-07-15T11:21:50.902245498Z")
    private OffsetDateTime timestamp;

    @Schema(example = "One or more fields are invalid. Please fill in correctly and try again.")
    private String detail;

    @Schema(example = "One or more fields are invalid. Please fill in correctly and try again.")
    private String userMessage;

    @Schema(description = "List of objects or fields that generated the error")
    private List<ValidationError> validationErrors;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Schema(name = "validationError")
    public static class ValidationError {

        @Schema(example = "name")
        private String name;

        @Schema(example = "Invalid name")
        private String userMessage;

    }
}
