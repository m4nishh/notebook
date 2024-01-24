package org.notebook.dao.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "logins")
public class Logins implements Serializable {
    @Id
    public String id;
    @DBRef
    private Organizations organizations;
    private String email;
    private String password;
    private String name;
    private String phone;
    private int loginCount=0;
    private String lastLoginIp;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean emailVerified=false;

    public void setOrganisation(Organizations organizations) {
        this.organizations = organizations;
    }


}
