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

@Document(collection = "article_keyword_mapping")
public class ArticleKeywordMapping {

    @Id
    private String id;

    @Indexed
    private String keywordId;

    @Indexed
    private String articleId;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    public void setCategoryId(String keywordId) {
        this.keywordId = keywordId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }
}
