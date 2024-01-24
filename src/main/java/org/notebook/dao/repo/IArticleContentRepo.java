package org.notebook.dao.repo;

import org.notebook.dao.entity.ArticleContent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IArticleContentRepo extends MongoRepository<ArticleContent, String> {
}
