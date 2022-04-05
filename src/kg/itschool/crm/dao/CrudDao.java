package kg.itschool.crm.dao;

import kg.itschool.crm.dao.daoutil.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public interface CrudDao<Model> {
    Model save(Model model);
    Model findById(Long id);
    List<Model> findAll();

    default Connection getConnection() throws SQLException {
        final String URL = "jdbc:postgresql://ec2-52-73-155-171.compute-1.amazonaws.com";
        final String USERNAME = "voweidmihtnvqw";
        final String PASSWORD = "4068bc9c7437dc12b9b08de55943a5a02642a16c8a487dc512f67408062b8643";

        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    default void close(AutoCloseable closeable) {
        try {
            Log.info(this.getClass().getSimpleName(), closeable.getClass().getSimpleName(), "Closing connection");
            closeable.close();
        } catch (Exception e) {
            Log.error(this.getClass().getSimpleName(), e.getStackTrace()[0].getClass().getSimpleName(), e.getMessage());
            e.printStackTrace();
        }
    }
}
