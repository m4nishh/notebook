package org.notebook.dao.repo;

import org.notebook.dao.entity.ArticleCategoryMapping;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IArticleCategoryMappingRepo extends MongoRepository<ArticleCategoryMapping, String> {
}
