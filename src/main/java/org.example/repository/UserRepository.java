package org.example.repository;

import org.example.domain.User;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Daniel on 2014-12-09.
 */
@RepositoryRestResource
public interface UserRepository extends GraphRepository<User> {
}
