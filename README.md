### This is an implementation of [sql-to-jdl](https://github.com/Blackdread/sql-to-jdl) using PostgreSQL

- [JHipster Domain Language](https://www.jhipster.tech/jdl/intro)
- Additional PostgreSQL references
    - [Install PostgreSQL Linux](https://www.postgresqltutorial.com/install-postgresql-linux/)
    - [PostgreSQL Sample Database](https://www.postgresqltutorial.com/postgresql-sample-database/)
    - [Create new local server in pgadmin](https://stackoverflow.com/questions/53267642/create-new-local-server-in-pgadmin)
    - [How to install pgcrypto module on a postgres DB](https://stackoverflow.com/questions/52630876/how-to-install-pgcrypto-module-on-a-postgres-db/52637460)

- Sample postgres data sets
    - [Load PostgreSQL Sample Database](https://www.postgresqltutorial.com/load-postgresql-sample-database/)
```bash
  unzip ~/Downloads/dvdrental.zip
  psql
```
```postgresql
  postgres=# create database dvdrental;
  postgres=# \q
```
```bash
  pg_restore -h localhost -U postgres -d dvdrental ~/Downloads/dvdrental.tar
```

[![Build Status](https://travis-ci.org/Blackdread/sql-to-jdl.svg?branch=master)](https://travis-ci.org/Blackdread/sql-to-jdl)
[![StackShare](https://img.shields.io/badge/tech-stack-0690fa.svg?style=flat)](https://stackshare.io/Blackdread/sql-to-jdl)

# sql-to-jdl
Tool to translate SQL databases to JDL format of jHipster (Created due to existing databases to be generated with jHipster and build angular-java web)


# Compatibility
This implementation works with mysql 5.7+ and mysql 8+.

Only few changes are required to make it work with oracle db, POSTGRES, etc; Changes should be made on Repository used, probably remove jooq maven generation, use pure SQL with jdbc and have one repository implementation per database type supported then define the appropriate bean based on connection string or other.

# Why not use tools like UML provided on jHipster?
- JDL from web is ok for a few entities but not for more than 100 entities and relations
- UML software and xml exporters could have worked (other tools on jHipster) but:
  - already many databases in production to be exported in JDL (faster to generate the JDL from it)
  - already working UML design with MySQL Workbench

# An alternative for REST filter and sort
Different criterias, support for JPA and jOOQ dynamic filtering and sorting

https://github.com/Blackdread/rest-filter

# How to use
<s>Run "mvn compile" at least once to let jOOQ generate some required tables (see [Issue solved](https://github.com/Blackdread/sql-to-jdl/issues/2)).</s> I have removed generated code, it is directly part of the codebase.

Just execute the code from IDE or use "mvn" to run the code, it will connect to your DB (see application config yml) and it will generate the JDL.

Set properties file:
- Schema name to export
- Tables names to be ignored
- Path of export file

# After JDL file is generated
Still have some manual steps to do:
- review relations:
  - ManyToMany
  - Owner side display field
  - Inverse side field name and display field
  - Bidirectional or not
- add values to enums
- review validations of entities

# Use of
- jOOQ
- Spring boot

# Default specific rules
Table is treated as enum if only 2 columns and both are: "id" AND ("code" OR "name")

Table is treated as ManyToMany if only 2 columns and both are foreign keys

# Links
[jHipster JDL](http://www.jhipster.tech/jdl/)
