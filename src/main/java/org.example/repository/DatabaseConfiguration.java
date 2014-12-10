package org.example.repository;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.core.GraphDatabase;

/**
 * Created by Daniel on 2014-12-10.
 */
@Configuration
@EnableNeo4jRepositories(basePackages={ "org.example.repository" })
public class DatabaseConfiguration extends Neo4jConfiguration {

    public DatabaseConfiguration() {
        setBasePackage("org.example.domain");
    }

    @Bean
    GraphDatabaseService graphDatabaseService() {
        return new GraphDatabaseFactory().newEmbeddedDatabase("build/test/dataneo4j.db");
    }

    @Autowired
    GraphDatabase graphDatabase;

}
