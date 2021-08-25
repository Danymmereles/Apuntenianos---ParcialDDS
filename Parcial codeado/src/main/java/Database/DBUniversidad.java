package Database;

import Bussiness.Universidad;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUniversidad {


    public static double buscarId (Universidad universidad){

        String consulta;
        ResultSet resultado = null;
        Connection conexion;
        Statement fraseAEjecutar;

        consulta = "SELECT idUniversidad FROM universidad WHERE nombreUniversidad = '"+ universidad.getName() + "';";

        try {
            conexion = ConexionDB.conectar();

            // Ejecución
            fraseAEjecutar = conexion.createStatement();
            resultado = fraseAEjecutar.executeQuery(consulta);
            resultado.next();

            return resultado.getDouble("idUniversidad");

        } catch (SQLException error) {
            // handle any errors
            error.printStackTrace();
            return -1;
        }

    }

}
