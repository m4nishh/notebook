package org.notebook.dao.repo;

import org.notebook.dao.entity.Organizations;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IOrganizationsRepo extends MongoRepository<Organizations, String> {
}
