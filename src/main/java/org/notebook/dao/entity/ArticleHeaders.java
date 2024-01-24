package org.notebook.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Document(collection = "article_headers")
public class ArticleHeaders {
    @Id
    private String id;

    @Indexed
    private String websiteId;

    @Indexed
    private String categoryId;
    private String title;
    private Status status;
    private String meta_json;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    public enum Status{
        INITIATED,
        DRAFT,
        PUBLISHED
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public void setWebsiteId(String websiteId) {
        this.websiteId = websiteId;
    }
}
