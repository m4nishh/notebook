package org.notebook.dao.repo;

import org.notebook.dao.entity.Keywords;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IKeywordsRepo extends MongoRepository<Keywords, String>{
}
