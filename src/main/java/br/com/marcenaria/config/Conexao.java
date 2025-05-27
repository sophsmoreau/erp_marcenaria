package br.com.marcenaria.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.InputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Conexao {

    private static final String CONFIG_FILE = "config.properties";

    public static Connection getConnection() throws SQLException {
        Properties props = new Properties();

        try (InputStream input = Conexao.class.getClassLoader().getResourceAsStream(CONFIG_FILE)) {
            if (input == null) {
                throw new FileNotFoundException("Arquivo " + CONFIG_FILE + " não encontrado no classpath");
            }

            props.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Erro ao carregar config.properties", e);
        }

        String url = props.getProperty("db.url");
        String user = props.getProperty("db.user");
        String pass = props.getProperty("db.password");

        return DriverManager.getConnection(url, user, pass);
    }
}

