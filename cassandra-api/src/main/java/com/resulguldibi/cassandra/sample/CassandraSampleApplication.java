package com.resulguldibi.cassandra.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)

public class CassandraSampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(CassandraSampleApplication.class, args);
    }
}
