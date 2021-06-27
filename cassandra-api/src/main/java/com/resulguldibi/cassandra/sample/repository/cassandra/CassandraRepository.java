package com.resulguldibi.cassandra.sample.repository.cassandra;

import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.resulguldibi.cassandra.sample.client.cassandra.interfaces.ICassandraClient;
import com.resulguldibi.cassandra.sample.entity.SampleEntity;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CassandraRepository implements ICassandraRepository{

    private ICassandraClient client;

    public CassandraRepository(ICassandraClient client){
        this.client = client;
    }

    @Override
    public List<SampleEntity> GetAllSamples() throws SQLException {
        ResultSet rs = this.client.execute("SELECT id,name from samples;");
        List<SampleEntity> list = new ArrayList<>();

        List<Row> all = rs.all();
        if (all == null || all.size() == 0) {
            return null;
        }

        for (Row row: all) {
            list.add(new SampleEntity(row.getInt(0), row.getString(1)));
        }
        return list;
    }
}
