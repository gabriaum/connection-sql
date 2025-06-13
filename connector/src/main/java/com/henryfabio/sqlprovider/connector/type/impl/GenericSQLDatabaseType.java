package com.henryfabio.sqlprovider.connector.type.impl;

import com.henryfabio.sqlprovider.connector.type.RemoteDatabaseType;

public final class GenericSQLDatabaseType extends RemoteDatabaseType {

    /**
     * @param driverClass e.g. com.mysql.jdbc.Driver, org.postgresql.Driver
     * @param jdbcUrl Example jdbc:mysql://localhost/db, jdbc:postgresql://localhost/db
     * @param username e.g. root, postgres
     * @param password e.g. empty string, postgres
     */
    public GenericSQLDatabaseType(String driverClass, String jdbcUrl, String username, String password) {
        super(driverClass, jdbcUrl,
                username != null ? username : "root",
                password != null ? password : "");
    }
}