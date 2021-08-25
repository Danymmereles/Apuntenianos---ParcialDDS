package Database;

import Bussiness.Universidad;
import Security.Usuario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUsuario {


    public static void agregarUsuario (Usuario nuevoUsuario){

    }

    public static void eliminarUsuario (Usuario usuarioAEliminar){

    }

    public static void cambiarDatosSinMail (Usuario usuarioAModificar){
        String consulta;
        ResultSet resultado = null;
        Connection conexion;
        Statement fraseAEjecutar;

        consulta = "UPDATE usuario SET tipoUsuario = '" + usuarioAModificar.rolUsuario() + "' WHERE mailUsuario = '"+ usuarioAModificar.getMail() +"';";

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
