package com.resulguldibi.cassandra.sample.client.cassandra.interfaces;

public interface ICassandraCluster {
    ICassandraSession Connect(String keyspace);
}
