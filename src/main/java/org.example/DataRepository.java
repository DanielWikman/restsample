package org.example;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;

/**
 * Created by Daniel on 2014-12-09.
 */
@RepositoryRestResource(collectionResourceRel="data", itemResourceRel="data", path="data")
public interface DataRepository  extends GraphRepository<Data> {

    //     @Query("MATCH (u:User{username:'danne'}) -- (n:Data) RETURN n")
//     This works in CLI but not here...
    //@Query("MATCH (u:User{username:{username}}) -- (n:Data) RETURN n")
    public Collection<Data> findByUserUsername(@Param("username") String username);
}