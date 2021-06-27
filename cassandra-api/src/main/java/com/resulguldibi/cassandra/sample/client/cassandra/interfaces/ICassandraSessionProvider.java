package com.resulguldibi.cassandra.sample.client.cassandra.interfaces;

import org.springframework.stereotype.Repository;

@Repository
public interface ICassandraSessionProvider {
    ICassandraSession GetCassandraSession(String id, String keyspace);
}
