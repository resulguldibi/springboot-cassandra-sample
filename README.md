# springboot-cassandra-sample

This sample consist of components below: 
 * cassandra-api (springboot)
 * cassandra

# cassandra-api (springboot)
cassandra-api list sample entities in cassandra database. List stored samples in cassandra using command below:

<pre><code>curl -kv http://localhost:8080/entities</code></pre>

# cassandra
cassandra stores samples data in samples table (in my_keyspace keyspace)

to create keyspace in cassandra
<pre><code>CREATE KEYSPACE my_keyspace WITH replication = {'class' : 'NetworkTopologyStrategy','my_datacenter' : 1};</code></pre>

to create table called "samples" in "my_keyspace" keyspace: <br/>
<pre><code>CREATE TABLE my_keyspace.samples (id int primary key,name text);</code></pre>
 