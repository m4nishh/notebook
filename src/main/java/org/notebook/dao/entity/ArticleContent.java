package org.notebook.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Document(collection = "article_content")
public class ArticleContent {

    @Id
    private String id;

    @Indexed
    private String acMapId;

    private Platform platform;
    private String content;
    private String images;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    public enum Platform {
        BLOG,
        FACEBOOK,
        LINKEDIN,
        INSTAGRAM,
        TWITTER
    }

    public void setAcMapId(String acMapId) {
        this.acMapId = acMapId;
    }
}
