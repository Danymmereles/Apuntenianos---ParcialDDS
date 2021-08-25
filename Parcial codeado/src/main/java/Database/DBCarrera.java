package Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class DBCarrera {

    public static double buscarId(String carrera) {
        String consulta;
        ResultSet resultado = null;
        Connection conexion;
        Statement fraseAEjecutar;

        consulta = "SELECT idCarrera FROM carrera WHERE nombreCarrera = '"+ carrera + "';";

        try {
            conexion = ConexionDB.conectar();

            // Ejecución
            fraseAEjecutar = conexion.createStatement();
            resultado = fraseAEjecutar.executeQuery(consulta);
            resultado.next();

            return resultado.getDouble("idCarrera");

        } catch (SQLException error) {
            // handle any errors
            error.printStackTrace();
            return -1;
        }
    }

}
