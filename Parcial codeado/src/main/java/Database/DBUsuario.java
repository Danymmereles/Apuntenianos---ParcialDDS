package Database;

import Bussiness.Universidad;
import Security.Usuario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUsuario {


    public static void agregarUsuario (Usuario nuevoUsuario){
        String consulta;
        ResultSet resultado = null;
        Connection conexion;
        Statement fraseAEjecutar;

        consulta = "INSERT INTO Usuario VALUES (NULL, '"+ nuevoUsuario.getMail() +"'"+";";

        try {
            conexion = ConexionDB.conectar();

            // Ejecución
            fraseAEjecutar = conexion.createStatement();
            resultado = fraseAEjecutar.executeQuery(consulta);
            resultado.next();

        } catch (SQLException error) {
            // handle any errors
            error.printStackTrace();
        }
    }

    public static void eliminarUsuario (Usuario usuarioAEliminar){
        String consulta;
        ResultSet resultado = null;
        Connection conexion;
        Statement fraseAEjecutar;

        consulta = "DELETE FROM Usuario WHERE mailUsuario = '"+ usuarioAEliminar.getMail() +"';";

        try {
            conexion = ConexionDB.conectar();

            // Ejecución
            fraseAEjecutar = conexion.createStatement();
            resultado = fraseAEjecutar.executeQuery(consulta);
            resultado.next();

        } catch (SQLException error) {
            // handle any errors
            error.printStackTrace();
        }


    }

    public static void actualizarUsuario (Usuario usuarioAModificar){
        String consulta;
        ResultSet resultado = null;
        Connection conexion;
        Statement fraseAEjecutar;

        consulta = "UPDATE Usuario SET tipoUsuario = '" + usuarioAModificar.rolUsuario() + "' estado = '"+ usuarioAModificar.getPersona().getEstadoUsuario() +"' WHERE mailUsuario = '"+ usuarioAModificar.getMail() +"';";

        try {
            conexion = ConexionDB.conectar();

            // Ejecución
            fraseAEjecutar = conexion.createStatement();
            resultado = fraseAEjecutar.executeQuery(consulta);
            resultado.next();

        } catch (SQLException error) {
            // handle any errors
            error.printStackTrace();
        }

    }

}
