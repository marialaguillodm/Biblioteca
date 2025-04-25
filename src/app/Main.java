package app;


import menu.Menu;
import model.Biblioteca;
import model.Usuarios;


/**
*El main de este proyecto llena la biblioteca, inicia los usuarios y llama al menu de loging.
* @author María Laguillo del Moral
*/
public class Main {
	public static void main(String[] args) {
		Biblioteca.llenarBiblioteca();
		Usuarios.listaUsuarios();
        Menu.menuUsuario();
    }
}
