package org.notebook.dao.repo;

import org.notebook.dao.entity.ScrapedContent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IScrapedContentRepo extends MongoRepository<ScrapedContent, String> {
}
