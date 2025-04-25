package menu;

import model.Biblioteca;
import model.DVD;
import model.Libro;
import model.Revista;
import model.Usuario;
import model.Usuarios;
import ok.Ok;

/**
* Clase que recoge los diferentes menus que utilizaremos en la aplicación.
*/
public class Menu {
	
	static Biblioteca biblioteca = new Biblioteca();

	 /**
    *Este menu sirve para iniciar sesión, crear un nuevo usuarioo salir
    */
	public static void menuUsuario() {
		int opcion;
        do {
            System.out.println("\n=== LOGING BIBLIOTECA ===");
            System.out.println("1. Iniciar Sesión");
            System.out.println("2. Nuevo Usuario");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = Ok.numero();

            switch (opcion) {
                case 1:
                	Usuario usuario = Usuarios.iniciarSesion();
                	if(usuario != null) {
                		menuInicial(usuario);
                	}
                    break;
                case 2:
                	Usuarios.registrarUsuario();
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);
	}
	
	 /**
    * Menu principal que nos lleva y ejecuta las distintas funcionalidades de la aplicacion.
    *@param usuarioActual con el que nos hemos logeado
    */
	public static void menuInicial(Usuario usuarioActual) {
		int opcion;
        do {
            System.out.println("\n=== MENÚ BIBLIOTECA ===");
            System.out.println("1. Mostrar Recursos");
            System.out.println("2. Agregar Recurso");
            System.out.println("3. Retirar Recurso");
            System.out.println("4. Devolver Recurso");
            System.out.println("5. Reservar Recurso");
            System.out.println("6. Cancelar Reserva");
            System.out.println("7. Estado del usuario");
            System.out.println("0. Atrás");
            System.out.print("Elige una opción: ");
            opcion = Ok.numero();

            switch (opcion) {
                case 1:
                	menuMostrarRecurso();
                    break;
                case 2:
                	menuCrearRecurso();
                    break;
                case 3:
                    biblioteca.retirarRecurso(usuarioActual);
                    break;
                case 4:
                    biblioteca.devolverRecurso(usuarioActual);
                    break;
                case 5:
                    biblioteca.reservarRecurso(usuarioActual);
                    break;
                case 6:
                    biblioteca.cancelarReserva(usuarioActual);
                    break;
                case 7:
                    Biblioteca.mostrarRecursosDelUsuario(usuarioActual);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);
	}
	
	 /**
    * Menu con las distintas opciones para mostrar los recursos de la biblioteca según
    * el orden o grupos que nos convengan.
    */
	public static void menuMostrarRecurso() {
		int opcion;
        do {
            System.out.println("\n=== MENÚ MOSTRAR RECURSOS ===");
            System.out.println("1. Por ID");
            System.out.println("2. Orden Alfabético");
            System.out.println("3. Por Categoría");
            System.out.println("4. Por Tipo");
            System.out.println("0. Atrás");
            System.out.print("Elige una opción: ");
            opcion = Ok.numero();

            switch (opcion) {
                case 1:
                	Ok.mostrarRecursosID();
                    break;
                case 2:
                	Ok.mostrarRecursosALfabetico();
                    break;
                case 3:
                	Ok.mostrarPorCategorias(Ok.categoriaSeleccionada());
                    break;
                case 4:
                	menuMostrarTipo();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

	}
	
	 /**
    * Seleccionamos el tipo para que nos muestre los recursos de ese tipo.
    */
	public static void menuMostrarTipo() {
		int opcion;
        do {
            System.out.println("\n=== MENÚ MOSTRAR RECURSO POR TIPO ===");
            System.out.println("1. Libro");
            System.out.println("2. DVD");
            System.out.println("3. Revista");
            System.out.println("0. Atrás");
            System.out.print("Elige una opción: ");
            opcion = Ok.numero();

            switch (opcion) {
                case 1:
                	Ok.mostrarLibros();
                    break;
                case 2:
                	Ok.mostrarDVD();
                    break;
                case 3:
                	Ok.mostrarRevista();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

	}
	
	 /**
    * menu para seleccionar el tipo de recurso que queremos crear.
    */
	public static void menuCrearRecurso() {
		int opcion;
        do {
            System.out.println("\n=== MENÚ CREAR RECURSO ===");
            System.out.println("1. Libro");
            System.out.println("2. DVD");
            System.out.println("3. Revista");
            System.out.println("0. Atrás");
            System.out.print("Elige una opción: ");
            opcion = Ok.numero();

            switch (opcion) {
                case 1:
                	Libro nuevoLibro = Libro.crearLibro();
                    if (nuevoLibro != null) {
                        Biblioteca.nuevoLibro(nuevoLibro);
                        System.out.println("Libro añadido correctamente.");
                    } else {
                        System.out.println("Creación de libro cancelada.");
                    }
                    break;
                case 2:
                	DVD nuevoDVD = DVD.crearDVD();
                    if (nuevoDVD != null) {
                        Biblioteca.nuevoDVD(nuevoDVD);
                        System.out.println("DVD añadido correctamente.");
                    } else {
                        System.out.println("Creación de DVD cancelada.");
                    }
                    break;
                case 3:
                	Revista nuevaRevista = Revista.crearRevista();
                    if (nuevaRevista != null) {
                        Biblioteca.nuevaRevista(nuevaRevista);
                        System.out.println("Revista añadido correctamente.");
                    } else {
                        System.out.println("Creación de Revista cancelada.");
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

	}
	
}
