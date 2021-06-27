#build and package cassandra-api
cd cassandra-api
rm -rf target
mvn package
cd target
jar xf cassandra-api-1.0.0.jar
mkdir dependency
mv BOOT-INF dependency
mv META-INF dependency
cd ../../
#build Dockerfile
docker build -t resulguldibi/cassandra-api .
#run cassandra and spring-boot containers
docker-compose up -d
#create database and table in cassandra
#create database in cassandra
docker exec -it cassandra cqlsh -e "CREATE KEYSPACE my_keyspace WITH replication = {'class' : 'NetworkTopologyStrategy','my_datacenter' : 1};"
#create table in cassandra in my_database
docker exec -it cassandra cqlsh -e "CREATE TABLE my_keyspace.samples (id int primary key,name text);"
#insert sample record
docker exec -it cassandra cqlsh -e "insert into my_keyspace.samples(id,name) values(1,'sample');"

