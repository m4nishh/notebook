package org.notebook.entrypoint.dto;

import lombok.*;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateUserRequest {

    private String name;

    @NotEmpty(message = "EMAIL_REQUIRED")
    @Email(message = "Invalid email")
    private String email;

    @NotNull(message = "Password Required")
    @Size(min = 6, max = 20, message = "Password must be between 6 and 20 characters")
    private String password;

}