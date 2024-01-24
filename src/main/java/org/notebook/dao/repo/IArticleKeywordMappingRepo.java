package org.notebook.dao.repo;

import org.notebook.dao.entity.ArticleKeywordMapping;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IArticleKeywordMappingRepo extends MongoRepository<ArticleKeywordMapping, String> {
}
