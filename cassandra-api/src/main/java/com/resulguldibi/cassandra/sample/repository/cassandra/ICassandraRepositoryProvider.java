package com.resulguldibi.cassandra.sample.repository.cassandra;

import java.sql.SQLException;

public interface ICassandraRepositoryProvider {

    ICassandraRepository GetCassandraRepository() throws SQLException;
}
