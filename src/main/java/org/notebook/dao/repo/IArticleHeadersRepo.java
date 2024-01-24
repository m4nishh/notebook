package org.notebook.dao.repo;

import org.notebook.dao.entity.ArticleHeaders;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IArticleHeadersRepo extends MongoRepository<ArticleHeaders, String>{
}
