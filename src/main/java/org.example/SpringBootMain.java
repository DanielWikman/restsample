package org.example;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.core.GraphDatabase;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by Daniel on 2014-12-09.
 */
@ComponentScan
@EnableAutoConfiguration
@EnableNeo4jRepositories
@Configuration
@EnableTransactionManagement
public class SpringBootMain extends Neo4jConfiguration {

    public SpringBootMain() {
        setBasePackage("org.example");
    }

    @Bean
    GraphDatabaseService graphDatabaseService() {
        return new GraphDatabaseFactory().newEmbeddedDatabase("build/test/dataneo4j.db");
    }

    @Autowired
    GraphDatabase graphDatabase;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMain.class, args);

    }
}
