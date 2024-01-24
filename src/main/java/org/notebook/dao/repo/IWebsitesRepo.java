package org.notebook.dao.repo;

import org.notebook.dao.entity.Websites;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IWebsitesRepo extends MongoRepository<Websites, String> {
}
