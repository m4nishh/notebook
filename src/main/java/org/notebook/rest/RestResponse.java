package org.notebook.rest;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RestResponse<T> {

    private T data;
    private String message;
    private Integer statusCode;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime timestamp;
    private Set<Error> errors;

    public RestResponse(String message, Integer statusCode, LocalDateTime timestamp, Set<Error> errors) {
        super();
        this.message = message;
        this.statusCode = statusCode;
        this.timestamp = timestamp;
        this.errors = errors;

    }

    public static <T> RestResponse<T> of(String message, Integer statusCode, LocalDateTime timestamp,
                                         Set<Error> errors) {
        return new RestResponse<>(message, statusCode, timestamp, errors);
    }

    public static <T> RestResponse<T> of(String message, Integer statusCode) {
        return new RestResponse<>(message, statusCode, LocalDateTime.now(), Collections.emptySet());
    }

    public static <T> RestResponse<T> of(T data, String message, Integer statusCode) {
        return new RestResponse<>(data, message, statusCode, LocalDateTime.now(), Collections.emptySet());
    }

    public static <T> RestResponse<T> of(T data, String message, Integer statusCode, LocalDateTime timestamp,
                                         Set<Error> errors) {
        return new RestResponse<>(data, message, statusCode, timestamp, errors);
    }

    public static <T> RestResponse<T> of(String message) {
        return new RestResponse<>(message, RestAPICode.OK_STATUS_CODE, LocalDateTime.now(), Collections.emptySet());
    }

    public static <T> RestResponse<T> of(String message, int code) {
        return new RestResponse<>(message, code, LocalDateTime.now(), Collections.emptySet());
    }

    public static <T> RestResponse<T> of(T data, String message, int code) {
        return new RestResponse<>(data, message, code, LocalDateTime.now(), Collections.emptySet());
    }

    public static <T> RestResponse<T> of(String message, int statusCode, LocalDateTime timestamp, Set<Error> errors) {
        return new RestResponse<>(message, statusCode, timestamp, errors);
    }

    public static <T> RestResponse<T> of(String message, int statusCode, LocalDateTime timestamp, Error error) {
        return new RestResponse<>(message, statusCode, timestamp, Set.of(error));
    }
}
