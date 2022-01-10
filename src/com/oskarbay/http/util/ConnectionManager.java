package com.oskarbay.http.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionManager {
    public static final String URL_KEY = "db.url";
    public static final String USER_KEY = "db.user";
    public static final String PASSWORD_KEY = "db.password";

    private ConnectionManager() {

    }

    public static Connection get() {
        try {
            return DriverManager.getConnection(
                    PropertiesUtil.get(URL_KEY),
                    PropertiesUtil.get(USER_KEY),
                    PropertiesUtil.get(PASSWORD_KEY)
            );
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }
}
