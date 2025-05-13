package com.kenyi.Models;
import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Data
//@Entity
public class Personaje {
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String imagen;
    private String nombre;
    private String vision;
    private String region;

    private List<Map<String, Object>> personaje = new ArrayList<>();

    private void obtenerDirectamenteSql() {
        String url = "jdbc:mysql://localhost:3306/personajesgi";
        String usuario = "root";
        String contrasena = "";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contrasena);
             Statement statement = conexion.createStatement()) {

            String consulta = "SELECT * FROM personajes";
            ResultSet resultSet = statement.executeQuery(consulta);

            while (resultSet.next()) {
                personaje.add(Map.of(
                        "id", resultSet.getLong("id"),
                        "imagen", resultSet.getString("imagen"),
                        "nombre", resultSet.getString("nombre"),
                        "vision", resultSet.getString("vision"),
                        "region", resultSet.getString("region")
                ));

                // Procesar los datos obtenidos
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Map<String,Object>> obteneMap()
    {
        obtenerDirectamenteSql();
        return personaje;
    }

}
