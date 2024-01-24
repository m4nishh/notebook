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
@AllArgsConstructor
@NoArgsConstructor

@Document(collection = "article_category_mapping")
public class ArticleCategoryMapping {
    @Id
    private String id;

    @Indexed
    private String categoryId;

    @Indexed
    private String articleId;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }
}
