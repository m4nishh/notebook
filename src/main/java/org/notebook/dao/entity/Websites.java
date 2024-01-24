package org.notebook.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Document(collection = "websites")
public class Websites implements Serializable {
    @Id
    private String id;

    @DBRef
    private Organizations organizations;
    private Boolean isCompetitor;
    private String url;
    private Status status;
    private String addedBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public enum Status{
        ADDED,
        CRAWLED,
        KEYWORD_RESEARCHED,
        ARTICLE_GENERATED,
        DISABLED
    }

    public void setOrganisation(Organizations organizations) {
        this.organizations = organizations;
    }


}
