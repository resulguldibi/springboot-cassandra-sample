package com.resulguldibi.cassandra.sample.client.cassandra;

import com.datastax.driver.core.Cluster;
import com.resulguldibi.cassandra.sample.client.cassandra.interfaces.ICassandraCluster;
import com.resulguldibi.cassandra.sample.client.cassandra.interfaces.ICassandraConnectionInfo;
import com.resulguldibi.cassandra.sample.client.cassandra.interfaces.ICassandraSession;

public class CassandraCluster implements ICassandraCluster {

    private Cluster cluster;

    public CassandraCluster(ICassandraConnectionInfo cassandraConnectionInfo)
    {
        this.cluster = Cluster.builder()
                .addContactPoints(cassandraConnectionInfo.GetHosts())
                .withPort(cassandraConnectionInfo.GetPort())
                .withoutJMXReporting()
                .build();
    }

    @Override
    public ICassandraSession Connect(String keyspace) {
        return new CassandraSession(cluster.connect(keyspace));
    }
}
