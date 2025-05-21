package Main;

import controller.ClienteController;
import util.DBConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try (Connection conn = DBConnection.getConnection()) {
            ClienteController clienteController = new ClienteController();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
