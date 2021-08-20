import Bussiness.Persona;
import Security.Usuario;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.print("PROGRAMA DE PRUEBA");
        System.out.print("\nComenzando las pruebas...\n");

        System.out.print("\nBuenas, buenas! Como andas? Queres registrarte? (Presione 1 para si o 2 para no)\n");

        Scanner opcionElegida = new Scanner(System.in);
        int opcionRecibida = opcionElegida.nextInt();

        Scanner datosACompletar = new Scanner(System.in);
        String usuario;
        String password;
        String nombre;

        if (opcionRecibida == 1){
            System.out.print("\nPerfecto!!\nPor favor cargue los siguientes datos\n     USUARIO:");
            usuario = datosACompletar.nextLine();
            System.out.print("     CLAVE:");
            password = datosACompletar.nextLine();
            System.out.print("     NOMBRE COMPLETO:");
            nombre = datosACompletar.nextLine();
            Usuario usuarioDePrueba = new Usuario(usuario, password, new Persona(nombre));
            while (usuarioDePrueba.getPassword() == ""){
                System.out.print("\nLo lamentamos pero su contraseña no es segura. Por favor intente de nuevo\n");
                usuarioDePrueba.setPassword(datosACompletar.nextLine());
            }
            System.out.print("\nMuy bien! Su usuario ha sido creado con los siguientes datos\n");
            System.out.print("\n     USUARIO:"+ usuarioDePrueba.getNombreUsuario());
            System.out.print("\n     NOMBRE COMPLETO:" + usuarioDePrueba.getPersona().getNombre());
            System.out.print("\n     CLAVE:"+ usuarioDePrueba.getPassword());
        } else {
            Usuario usuarioDePrueba = new Usuario();
            System.out.print("\nQue lastima! Pero no te preocupes, podes anotarte cuando quieras. Con gusto te esperaremos\n");
            System.out.print("\n     USUARIO:"+ usuarioDePrueba.getNombreUsuario());
            System.out.print("\n     NOMBRE COMPLETO:" + usuarioDePrueba.getPersona().getNombre());
            System.out.print("\n     CLAVE:"+ usuarioDePrueba.getPassword());
        }
    }
}
