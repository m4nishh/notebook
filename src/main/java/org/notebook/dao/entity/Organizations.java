package org.notebook.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "organizations")
public class Organizations implements Serializable {

    @Id
    private String id;

    private String name;
    private String primaryLogin;
    private String description;
    private String phone;
    private ProfileStage profileStage;
    private String address;
    private Boolean isActive = true;
    private String SignupIp;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    public enum ProfileStage{
        CREATED,
        EMAIL_VERIFIED,
        WEBSITE_ADDED,
        DIAGNOSIS_DONE
    }


}
