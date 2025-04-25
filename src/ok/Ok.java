package ok;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

import enums.Categorias;
import enums.EstadoRecurso;
import model.Biblioteca;
import model.DVD;
import model.Libro;
import model.RecursoBiblioteca;
import model.Revista;


/**
 * Clase utilitaria que contiene métodos estáticos para validación de datos,
 * entrada de usuario y operaciones de visualización sobre recursos de la biblioteca.
 */

public class Ok {
	static Scanner scanner = new Scanner(System.in);

	/**
     * Solicita al usuario un número entero.
     * Y comprueba que este no está vacío llamando al método tectoNoVacio().
     * @return el número introducido o 0 si el usuario decide salir.
     */
	public static int numero() {
		boolean continuar = true;
		do {
			try {
				int numero = Integer.parseInt(textoNoVacio());
				if(numero == 0) {
					continuar = false;
					return 0;
				}
				else if(numero < 0) {
					throw new NumberFormatException("Valores fuera de rango.");
				}
				else {
				return numero;
				}
			} catch (NumberFormatException e) {
				System.err.println("Introduzca un número entero positivos.");
				System.out.println("Pulsa \"0\" para salir.");
			}
		} while (continuar);
		return 0;
	}
	
	 /**
     * Solicita al usuario un año entre 1472 y el actual.
     * Utilizo 1472 ya que según lo que he buscado es la fecha del primer libro publicado.
     * @return el año válido introducido o 0 si el usuario decide salir.
     */
	public static int year() {
		boolean continuar = true;
		int yearActual = LocalDate.now().getYear();
		while (continuar) {
			try {
				int year = Integer.parseInt(textoNoVacio()); // Seguro convertir
				if(year == 0) {
					continuar = false;
					return 0;
				}
				else if(year < 1472 || year > yearActual){
					throw new InputMismatchException("Valores fuera de rango.");
				}
				else {
				continuar = false;
				return year;
				}
			 } catch (NumberFormatException e) {
		            System.err.println("Debes introducir un número entero válido.");
		     } catch (InputMismatchException e) {
		            System.err.println(e.getMessage());
		     }
		} 
		return 0;
	}
	
	/**
     * Solicita y valida un nombre completo.
     * @return el nombre completo o "0" si el usuario decide salir.
     */
	public static String nombre() {
		boolean continuar = true;
		while (continuar) {
			try {
				System.out.println("Introduzca nombre completo y sus apellidos:");
                String nombre = scanner.nextLine().toUpperCase().trim();
                if (nombre.equals("0")) return "0";
                if (nombre.length() < 6 || nombre.length() > 100) {
                    throw new InputMismatchException("El nombre debe contener entre 6 y 100 caracteres.");
                }
                if (!nombre.matches("^[\\p{IsLatin}’'\\- ]+$")) {
                    throw new InputMismatchException("Solo puede contener caracteres del alfabeto latín.");
                }
                if (!nombre.contains(" ")) {
                    throw new InputMismatchException("Debe incluir al menos un apellido.");
                }
                return nombre;
            } catch (InputMismatchException e) {
                System.err.println(e.getMessage());
                System.out.println("Pulsa \"0\" para salir.");
            }
		} 
		return "0";
	}
	
	/**
     * Asegura que la entrada del usuario no esté vacía.
     * @return el texto ingresado o "0" si el usuario decide salir.
     */
	public static String textoNoVacio() {
		boolean continuar = true;
		while (continuar) {
			try {
				String nombre = scanner.nextLine().toUpperCase().trim();
				if(nombre.equals("0")){
					continuar = false;
					return "0";
				}
				else if(nombre.isEmpty()) {
					throw new InputMismatchException("Campo vacío.");
				}
				else {
					continuar = false;
					return nombre;
				}
			} catch (Exception e) {
				System.err.println(e.getMessage());
				System.out.println("Pulsa \"0\" para salir.");
			}
		} 
		return "0";
	}
	
	/**
     * Solicita al usuario un ISBN13 en formato válido con guiones.
     * He decidido usar ISBN13 solo, ya que es el único que se usa actualmente con código de barras.
     * @return el ISBN válido o "0" si el usuario decide salir.
     */
	public static String isbn() {
	    boolean continuar = true;
	    while (continuar) {
	        try {
	            System.out.println("Introduce el ISBN con guiones:");
	            String isbn = scanner.nextLine().toUpperCase().trim();
	            if (isbn.equals("0")) {
	                return "0";
	            }
	            // Validar formato con guiones (ej. 978-3-16-148410-0)
	            else if(!isbn.matches("\\d{3}-\\d{1,5}-\\d{1,7}-\\d{1,7}-\\d")) {
	            	throw new InputMismatchException("Formato incorrecto.");
	            }
	            else {
	            continuar = false;
	            return isbn;
	            }
	        } catch (Exception e) {
	        	System.err.println(e.getMessage());
	            System.out.println("Pulsa \"0\" para salir.");
	        }
	    } 
	    return "0";
	}
	
	 /**
     * Muestra todas las categorías disponibles del enum Categorias.
     * @return array de categorías disponibles.
     */
	public static Categorias[] mostrarCategorias() {
	    System.out.println("Categorías disponibles:");
	    Categorias[] categorias = Categorias.values();
	    for (int i = 0; i < categorias.length; i++) {
	        System.out.println((i + 1) + ". " + categorias[i]);
	    }
	    return categorias;
	}
	
	 /**
     * Permite seleccionar una categoría entre las disponibles.
     * Antes de seleccionar te muestra las opciones disponibles.
     * @return la categoría seleccionada o null si el usuario decide salir.
     */
	public static Categorias categoriaSeleccionada() {
		Categorias[] categorias = mostrarCategorias();
        Categorias categoriaSeleccionada = null;
        boolean continuar = true;
        while (continuar) {
            try {
                System.out.print("Seleccione una categoría (número) o pulse 0 para salir: ");
                int opcion = numero();
                if (opcion == 0) return null;
                if (opcion > 0 && opcion <= categorias.length) {
                    categoriaSeleccionada = categorias[opcion - 1];
                    continuar = false;
                } else {
                    System.err.println("Opción inválida. Intente de nuevo.");
                }
            } catch (Exception e) {
                System.err.println("Error al seleccionar categoría. Intente nuevamente.");
            }
        }
        return categoriaSeleccionada;
    }
	
	/**
     * Muestra todos los recursos por ID.
     */
	public static void mostrarRecursosID() {
		for (RecursoBiblioteca recurso : Biblioteca.coleccionRecursos) {
            System.out.println(recurso.descripcion());
        }
		
	}
	
	/**
     * Muestra todos los recursos ordenados alfabéticamente por título.
     */
	public static void mostrarRecursosALfabetico() {
		Biblioteca.coleccionRecursos.stream()
	    .sorted(Comparator.comparing(RecursoBiblioteca::getTitulo, String.CASE_INSENSITIVE_ORDER))
	    .forEach(recurso -> System.out.println(recurso.descripcion()));
		
	}
	
	
	/**
     * Muestra los recursos que pertenecen a una categoría específica.
     * @param categoria La categoría a filtrar.
     */
	public static void mostrarPorCategorias(Categorias categoria) {
	    long count = Biblioteca.coleccionRecursos.stream()
	        .filter(recurso -> recurso.getCategoria() == categoria)
	        .count();  
	    if (count == 0) {
	        System.out.println("No hay recursos disponibles en la categoría: " + categoria);
	    } else {
	        Biblioteca.coleccionRecursos.stream()
	            .filter(recurso -> recurso.getCategoria() == categoria)
	            .sorted(Comparator
	                .comparing(RecursoBiblioteca::getTitulo, String.CASE_INSENSITIVE_ORDER))
	            .forEach(recurso -> System.out.println(recurso.descripcion()));
	    }
	}
	
	/**
     * Muestra todos los libros de la biblioteca ordenados por título.
     */
	public static void mostrarLibros() {
		Biblioteca.coleccionRecursos.stream()
	    .filter(recurso -> recurso instanceof Libro)
	    .map(recurso -> (Libro) recurso)  // Cast explícito
	    .sorted(Comparator.comparing((Libro libro) -> libro.getTitulo(), String.CASE_INSENSITIVE_ORDER))
	    .forEach(libro -> System.out.println(libro.descripcion()));
	}
	
	/**
     * Muestra todos los DVDs de la biblioteca ordenados por título.
     */
	public static void mostrarDVD() {
		Biblioteca.coleccionRecursos.stream()
	    .filter(recurso -> recurso instanceof DVD)
	    .map(recurso -> (DVD) recurso)  // Cast explícito
	    .sorted(Comparator.comparing((DVD dvd) -> dvd.getTitulo(), String.CASE_INSENSITIVE_ORDER))
	    .forEach(DVD -> System.out.println(DVD.descripcion()));
	}
	
	 /**
     * Muestra todas las revistas de la biblioteca ordenadas por título.
     */
	public static void mostrarRevista() {
		Biblioteca.coleccionRecursos.stream()
	    .filter(recurso -> recurso instanceof Revista)
	    .map(recurso -> (Revista) recurso)  // Cast explícito
	    .sorted(Comparator.comparing((Revista revista) -> revista.getTitulo(), String.CASE_INSENSITIVE_ORDER))
	    .forEach(Revista -> System.out.println(Revista.descripcion()));
	}
	
	 /**
     * Solicita al usuario que introduzca un DNI válido.
     * @return El DNI ingresado o "0" para salir.
     */
	public static String dni() {
	    boolean continuar = true;
	    while (continuar) {
	        try {
	            System.out.println("Introduce DNI sin guion:");
	            String dni = scanner.nextLine().toUpperCase().trim();
	            if (dni.equals("0")) {
	                return "0";
	            }
	            else if(!dni.matches("\\d{8}[A-Za-z]")) {
	            	throw new InputMismatchException("Formato incorrecto. Introduce DNI si guion.");
	            }
	            else {
	            continuar = false;
	            return dni;
	            }
	        } catch (InputMismatchException e) {
	        	System.err.println(e.getMessage());
	            System.out.println("Pulsa \"0\" para salir.");
	        }
	    } 
	    return "0";
	}
	
	 /**
     * Solicita al usuario una contraseña válida.
     * @return La contraseña o "0" para salir.
     */
	public static String contrasena() {
	    boolean continuar = true;
	    while (continuar) {
	        try {
	            System.out.println("Introduce tu contraseña:");
	            String contrasena = scanner.nextLine();
	            if (contrasena.equals("0")) {
	                return "0";
	            }
	            else if(contrasena.length() < 8 || !contrasena.matches(".*[A-Z].*") || !contrasena.matches(".*[0-9].*")) {
	                throw new Exception("La contraseña debe tener al menos 8 caracteres, una mayúscula y un número.");
	            }
	            else {
	            continuar = false;
	            return contrasena;
	            }
	        } catch (Exception e) {
	        	System.err.println(e.getMessage());
	            System.out.println("Pulsa \"0\" para salir.");
	        }
	    } 
	    return "0";
	}
	
	/**
     * Busca un recurso por su ID.
     * @param id ID del recurso.
     * @return El recurso encontrado o null si no existe.
     */
	public static RecursoBiblioteca recursoPorID(int id) {
		RecursoBiblioteca recurso = null;
		for (int i = 0; i < Biblioteca.coleccionRecursos.size(); i++) {
			if (Biblioteca.coleccionRecursos.get(i).getId()== id) {
				recurso = Biblioteca.coleccionRecursos.get(i);
				break;
			}
		}
		return recurso;
	}
	
	/**
     * Verifica si un recurso está disponible.
     * @param recurso El recurso a verificar.
     * @return true si está disponible, false en caso contrario.
     */
	public static boolean recursoDisponible(RecursoBiblioteca recurso) {
    	if (recurso.getEstado() == EstadoRecurso.DISPONIBLE) {        
	    	return true;
    	}
        System.out.println("El recurso no está disponible.");
        return false;
    }
	
	 /**
     * Permite al usuario seleccionar un recurso por su ID.
     * @return El recurso seleccionado o null si se cancela.
     */
	public static RecursoBiblioteca recursoSeleccionado() {
	    boolean continuar = true;
	    RecursoBiblioteca recurso = null;
	    while(continuar) {
	        System.out.print("Seleccione el recurso por ID o pulse 0 para salir:");
	        int id = Ok.numero();
	        if (id == 0) return null;
	        if (id > 0 && id <= Biblioteca.coleccionRecursos.size()) {
	            recurso = recursoPorID(id);
	            continuar = false;
	        } else {
	            System.err.println("Opción inválida. Intente de nuevo. Si tiene dudas sobre el ID del recurso pulse mostrar en el menú.");
	        }
	    }
	    return recurso;
	}
	
}
