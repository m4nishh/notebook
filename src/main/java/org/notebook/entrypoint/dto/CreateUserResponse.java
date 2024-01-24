package org.notebook.entrypoint.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateUserResponse {
    private String id;
    private String name;
    private Long phoneNo;
    private String email;
    private String createdAt;
    private String updatedAt;

}
