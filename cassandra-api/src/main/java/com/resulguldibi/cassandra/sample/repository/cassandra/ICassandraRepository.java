package com.resulguldibi.cassandra.sample.repository.cassandra;

import com.resulguldibi.cassandra.sample.entity.SampleEntity;

import java.sql.SQLException;
import java.util.List;

public interface ICassandraRepository {
    List<SampleEntity> GetAllSamples() throws SQLException;
}
