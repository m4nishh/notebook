package org.notebook.dao.repo;

import org.notebook.dao.entity.WebsiteArticleCategories;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IWebsiteArticleCategoriesRepo extends MongoRepository<WebsiteArticleCategories, String> {
}
