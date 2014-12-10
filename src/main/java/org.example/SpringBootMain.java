package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.neo4j.config.Neo4jConfiguration;

/**
 * Created by Daniel on 2014-12-09.
 */
@ComponentScan
@EnableAutoConfiguration
public class SpringBootMain extends Neo4jConfiguration {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMain.class, args);
    }
}
