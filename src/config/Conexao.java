package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexao {
    private static String URL;
    private static String USUARIO;
    private static String SENHA;

    static {
        try {
            Properties props = new Properties();
            props.load(new FileInputStream("config.properties"));
            URL = props.getProperty("db.url");
            USUARIO = props.getProperty("db.user");
            SENHA = props.getProperty("db.password");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }
}

