package com.resulguldibi.cassandra.sample.controller;

import com.resulguldibi.cassandra.sample.entity.SampleEntity;
import com.resulguldibi.cassandra.sample.repository.cassandra.ICassandraRepository;
import com.resulguldibi.cassandra.sample.repository.cassandra.ICassandraRepositoryProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
public class SampleController {

    @Autowired
    ICassandraRepositoryProvider cassandraRepositoryProvider;

    @GetMapping(path = "/entities", produces = "application/json")
    public List<SampleEntity> getAllEntities() throws SQLException {
        ICassandraRepository cassandraRepository = cassandraRepositoryProvider.GetCassandraRepository();
        return cassandraRepository.GetAllSamples();
    }

}
