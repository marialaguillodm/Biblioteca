package model;

import java.util.ArrayList;
import enums.Categorias;
import enums.EstadoRecurso;
import interfaces.Prestamista;
import ok.Ok;

/**
 * Clase que representa una biblioteca que gestiona una colección de recursos
 * como libros, DVDs y revistas. Implementa la interfaz {@link Prestamista}, lo que
 * permite la gestión de préstamo, reserva y devolución de los recursos.
 */
public class Biblioteca implements Prestamista{
	 /** Colección de recursos que contiene todos los libros, DVDs y revistas de la biblioteca. */
	 public static ArrayList<RecursoBiblioteca> coleccionRecursos;

	 /**
	  * Método con el que iniciamos la coleccion de recursos de nuestra biblioteca y que además usamos para llenarla de recursos
	  */
	    public static void llenarBiblioteca() {
	    	coleccionRecursos = new ArrayList<>();
	    	// LIBROS
	    	coleccionRecursos.add(Libro.crearLibro("CIEN AÑOS DE SOLEDAD", 1967, Categorias.NOVELA, "978-3-16-148410-0", "GABRIEL GARCÍA MÁRQUEZ", 1));
	    	coleccionRecursos.add(Libro.crearLibro("1984", 1949, Categorias.CIENCIA_FICCION, "978-0-452-28423-4", "GEORGE ORWELL", 2));
	    	coleccionRecursos.add(Libro.crearLibro("EL SEÑOR DE LOS ANILLOS", 1954, Categorias.FANTASIA, "978-0-618-00222-8", "J.R.R. TOLKIEN", 3));
	    	coleccionRecursos.add(Libro.crearLibro("DON QUIJOTE", 1605, Categorias.CLASICO, "978-84-376-0494-7", "MIGUEL DE CERVANTES", 4));
	    	coleccionRecursos.add(Libro.crearLibro("LA SOMBRA DEL VIENTO", 2001, Categorias.MISTERIO, "978-84-08-05595-9", "CARLOS RUIZ ZAFÓN", 1));
	    	coleccionRecursos.add(Libro.crearLibro("HARRY POTTER Y LA PIEDRA FILOSOFAL", 1997, Categorias.FANTASIA, "978-0-7475-3269-9", "J.K. ROWLING", 1));
	    	coleccionRecursos.add(Libro.crearLibro("EL NOMBRE DEL VIENTO", 2007, Categorias.FANTASIA, "978-84-01-33612-3", "PATRICK ROTHFUSS", 1));
	    	coleccionRecursos.add(Libro.crearLibro("CRÓNICA DE UNA MUERTE ANUNCIADA", 1981, Categorias.NOVELA, "978-84-376-0495-4", "GABRIEL GARCÍA MÁRQUEZ", 1));
	    	coleccionRecursos.add(Libro.crearLibro("EL CÓDIGO DA VINCI", 2003, Categorias.THRILLER, "978-0-385-50420-8", "DAN BROWN", 1));
	    	coleccionRecursos.add(Libro.crearLibro("LA CARRETERA", 2006, Categorias.DRAMA, "978-0-307-26543-2", "CORMAC MCCARTHY", 1));
	    	coleccionRecursos.add(Libro.crearLibro("FAHRENHEIT 451", 1953, Categorias.CIENCIA_FICCION, "978-0-7432-4722-1", "RAY BRADBURY", 1));
	    	coleccionRecursos.add(Libro.crearLibro("ORGULLO Y PREJUICIO", 1813, Categorias.ROMANCE, "978-0-19-280238-5", "JANE AUSTEN", 1));
	    	coleccionRecursos.add(Libro.crearLibro("MATAR A UN RUISEÑOR", 1960, Categorias.DRAMA, "978-0-06-112008-4", "HARPER LEE", 1));
	    	coleccionRecursos.add(Libro.crearLibro("LA ISLA DEL TESORO", 1883, Categorias.AVENTURA, "978-0-14-043768-3", "ROBERT LOUIS STEVENSON", 1));
	    	coleccionRecursos.add(Libro.crearLibro("EL ALQUIMISTA", 1988, Categorias.FANTASIA, "978-0-06-112241-5", "PAULO COELHO", 1));
	    	coleccionRecursos.add(Libro.crearLibro("DRÁCULA", 1897, Categorias.TERROR, "978-0-14-143984-6", "BRAM STOKER", 1));
	    	coleccionRecursos.add(Libro.crearLibro("FRANKENSTEIN", 1818, Categorias.TERROR, "978-0-14-143947-1", "MARY SHELLEY", 1));
	    	coleccionRecursos.add(Libro.crearLibro("EL PRINCIPITO", 1943, Categorias.FABULA, "978-0-15-601219-5", "ANTOINE DE SAINT-EXUPÉRY", 1));
	    	coleccionRecursos.add(Libro.crearLibro("LOS JUEGOS DEL HAMBRE", 2008, Categorias.DISTOPIA, "978-0-439-02348-1", "SUZANNE COLLINS", 1));
	    	coleccionRecursos.add(Libro.crearLibro("IT", 1986, Categorias.TERROR, "978-0-670-81302-5", "STEPHEN KING", 1));
	    	// DVDS
	    	coleccionRecursos.add(DVD.crearDVD("EL PADRINO", 1972, Categorias.DRAMA, "FRANCIS FORD COPPOLA"));
	    	coleccionRecursos.add(DVD.crearDVD("TITANIC", 1997, Categorias.ROMANCE, "JAMES CAMERON"));
	    	coleccionRecursos.add(DVD.crearDVD("INCEPTION", 2010, Categorias.CIENCIA_FICCION, "CHRISTOPHER NOLAN"));
	    	coleccionRecursos.add(DVD.crearDVD("PULP FICTION", 1994, Categorias.CRIMEN, "QUENTIN TARANTINO"));
	    	coleccionRecursos.add(DVD.crearDVD("FORREST GUMP", 1994, Categorias.DRAMA, "ROBERT ZEMECKIS"));
	    	coleccionRecursos.add(DVD.crearDVD("GLADIADOR", 2000, Categorias.ACCION, "RIDLEY SCOTT"));
	    	coleccionRecursos.add(DVD.crearDVD("EL REY LEÓN", 1994, Categorias.ANIMACION, "ROGER ALLERS"));
	    	coleccionRecursos.add(DVD.crearDVD("LA LA LAND", 2016, Categorias.MUSICA, "DAMIEN CHAZELLE"));
	    	coleccionRecursos.add(DVD.crearDVD("JURASSIC PARK", 1993, Categorias.CIENCIA_FICCION, "STEVEN SPIELBERG"));
	    	coleccionRecursos.add(DVD.crearDVD("STAR WARS: UNA NUEVA ESPERANZA", 1977, Categorias.CIENCIA_FICCION, "GEORGE LUCAS"));
	    	coleccionRecursos.add(DVD.crearDVD("AVATAR", 2009, Categorias.CIENCIA_FICCION, "JAMES CAMERON"));
	    	coleccionRecursos.add(DVD.crearDVD("THE DARK KNIGHT", 2008, Categorias.ACCION, "CHRISTOPHER NOLAN"));
	    	coleccionRecursos.add(DVD.crearDVD("MATRIX", 1999, Categorias.CIENCIA_FICCION, "LANA Y LILLY WACHOWSKI"));
	    	coleccionRecursos.add(DVD.crearDVD("TOY STORY", 1995, Categorias.ANIMACION, "JOHN LASSETER"));
	    	coleccionRecursos.add(DVD.crearDVD("PIRATAS DEL CARIBE: LA MALDICIÓN DE LA PERLA NEGRA", 2003, Categorias.AVENTURA, "GORE VERBINSKI"));
	    	coleccionRecursos.add(DVD.crearDVD("COCO", 2017, Categorias.ANIMACION, "LEE UNKRICH"));
	    	coleccionRecursos.add(DVD.crearDVD("INTENSAMENTE", 2015, Categorias.ANIMACION, "PETE DOCTER"));
	    	coleccionRecursos.add(DVD.crearDVD("AVENGERS: ENDGAME", 2019, Categorias.ACCION, "ANTHONY Y JOE RUSSO"));
	    	coleccionRecursos.add(DVD.crearDVD("AMÉLIE", 2001, Categorias.ROMANCE, "JEAN-PIERRE JEUNET"));
	    	coleccionRecursos.add(DVD.crearDVD("EL LABERINTO DEL FAUNO", 2006, Categorias.FANTASIA, "GUILLERMO DEL TORO"));

	    	// REVISTAS
	    	coleccionRecursos.add(Revista.crearRevista("NATIONAL GEOGRAPHIC", 2022, Categorias.CIENCIA, 150));
	    	coleccionRecursos.add(Revista.crearRevista("TIME", 2023, Categorias.NOTICIAS, 192));
	    	coleccionRecursos.add(Revista.crearRevista("FORBES", 2023, Categorias.ECONOMIA, 180));
	    	coleccionRecursos.add(Revista.crearRevista("SCIENTIFIC AMERICAN", 2022, Categorias.CIENCIA, 310));
	    	coleccionRecursos.add(Revista.crearRevista("MUY INTERESANTE", 2023, Categorias.CULTURA, 290));
	    	coleccionRecursos.add(Revista.crearRevista("VOGUE", 2023, Categorias.MODA, 340));
	    	coleccionRecursos.add(Revista.crearRevista("THE ECONOMIST", 2023, Categorias.ECONOMIA, 210));
	    	coleccionRecursos.add(Revista.crearRevista("QUO", 2022, Categorias.CIENCIA, 278));
	    	coleccionRecursos.add(Revista.crearRevista("NATURE", 2023, Categorias.CIENCIA, 380));
	    	coleccionRecursos.add(Revista.crearRevista("COSMOPOLITAN", 2023, Categorias.MODA, 450));
	    	coleccionRecursos.add(Revista.crearRevista("GQ", 2023, Categorias.MODA, 390));
	    	coleccionRecursos.add(Revista.crearRevista("ROLLING STONE", 2022, Categorias.MUSICA, 560));
	    	coleccionRecursos.add(Revista.crearRevista("PCWORLD", 2022, Categorias.TECNOLOGIA, 210));
	    	coleccionRecursos.add(Revista.crearRevista("SCIENTIFIC WORLD", 2023, Categorias.CIENCIA, 125));
	    	coleccionRecursos.add(Revista.crearRevista("ELLE", 2022, Categorias.MODA, 412));
	    	coleccionRecursos.add(Revista.crearRevista("MEN’S HEALTH", 2023, Categorias.SALUD, 230));
	    	coleccionRecursos.add(Revista.crearRevista("AUTO BILD", 2022, Categorias.AUTOMOVILISMO, 145));
	    	coleccionRecursos.add(Revista.crearRevista("THE NEW YORKER", 2023, Categorias.CULTURA, 378));
	    	coleccionRecursos.add(Revista.crearRevista("CAR AND DRIVER", 2022, Categorias.AUTOMOVILISMO, 410));
	    	coleccionRecursos.add(Revista.crearRevista("WIRED", 2023, Categorias.TECNOLOGIA, 520));
	}
	    
	    /**
	     * Añadimos un nuevo libro a coleccionRecursos (nuestra biblioteca)
	     * @param nuevoLibro el libro que se desea añadir.
	     */
	    public static void nuevoLibro(Libro nuevoLibro) {
	    	coleccionRecursos.add(nuevoLibro);
	    }
	    
	    /**
	     * Añadimos un nuevo DVD a coleccionRecursos (nuestra biblioteca)
	     * @param nuevoDVD el DVD que se desea añadir.
	     */
	    public static void nuevoDVD(DVD nuevoDVD) {
	    	coleccionRecursos.add(nuevoDVD);
	    }
	    
	    /**
	     * Añadimos un nueva nueva revista a coleccionRecursos (nuestra biblioteca)
	     * @param nuevaRevista la revista que se desea añadir.
	     */
	    public static void nuevaRevista(Revista nuevaRevista) {
	    	coleccionRecursos.add(nuevaRevista);
	    }
	    
	    /**
	     * Retiramos un recurso de la biblioteca
	     * @param usuarioActual con el que estamos logeados
	     */
	    public void retirarRecurso(Usuario usuarioActual) {
	    	RecursoBiblioteca recurso = Ok.recursoSeleccionado();
	    	if (recurso == null) {
	    		return;
	    	}
	    	if (Ok.recursoDisponible(recurso)) {        
		    	if(usuarioActual.retirarRecurso(recurso)) {
			        recurso.setEstado(EstadoRecurso.PRESTADO);  // Cambia el estado del recurso
			        System.out.println("Recurso retirado con éxito.");
		        }
	    	}
	    }
	    
	    /**
	     * Reservamos un recurso de la biblioteca
	     * @param usuarioActual con el que estamos logeados
	     */
	    public void reservarRecurso(Usuario usuarioActual) {
	    	RecursoBiblioteca recurso = Ok.recursoSeleccionado();
	    	if (recurso == null) {
	    		return;
	    	}
	    	if (Ok.recursoDisponible(recurso)) {        
		    	if(usuarioActual.reservarRecurso(recurso)) {
			        recurso.setEstado(EstadoRecurso.RESERVADO);  // Cambia el estado del recurso
			        System.out.println("Recurso reservado con éxito.");
		        }
	    	}
	    }
	    
	    /**
	     * Devolvemos un recurso de la biblioteca
	     * @param usuarioActual con el que estamos logeados
	     */
	    public void devolverRecurso(Usuario usuarioActual) {
	    	RecursoBiblioteca recurso = Ok.recursoSeleccionado();
	    	if (recurso == null) {
	    		return;
	    	}
	    	
		    	if(usuarioActual.recursosRetirados.contains(recurso)) {
			        recurso.setEstado(EstadoRecurso.DISPONIBLE);  // Cambia el estado del recurso
			        usuarioActual.recursosRetirados.remove(recurso);
			        System.out.println("Recurso devuelto con éxito.");
		        }
	    	
	    }
	    
	    /**
	     * Cancelamos la reserva de un recurso de la biblioteca
	     * @param usuarioActual con el que estamos logeados
	     */
	    public void cancelarReserva(Usuario usuarioActual) {
	    	RecursoBiblioteca recurso = Ok.recursoSeleccionado();
	    	if (recurso == null) {
	    		return;
	    	}     
		    	if(usuarioActual.recursosReservados.contains(recurso)) {
			        recurso.setEstado(EstadoRecurso.DISPONIBLE);  // Cambia el estado del recurso
			        usuarioActual.recursosReservados.remove(recurso);
			        System.out.println("Reserva cancelada con éxito.");
		        }
	    	}
	    
	    /**
	     * Mostramos tanto los recursos retirados como reservados de nuestro usuario
	     * @param usuarioActual con el que estamos logeados
	     */
	    public static void mostrarRecursosDelUsuario(Usuario usuarioActual) {
	        System.out.println("\nRecursos retirados por " + usuarioActual.getDni() + ":");
	        if (usuarioActual.getRecursosRetirados().isEmpty()) {
	            System.out.println("No has retirado recursos.");
	        } else {
	            for (RecursoBiblioteca recurso : usuarioActual.getRecursosRetirados()) {
	                System.out.println("- " + recurso.descripcion());
	            }
	        }
	        System.out.println("Recursos reservados por " + usuarioActual.getDni() + ":");
	        if (usuarioActual.getRecursosReservados().isEmpty()) {
	            System.out.println("No tienes recursos reservados.");
	        } else {
	            for (RecursoBiblioteca recurso : usuarioActual.getRecursosReservados()) {
	                System.out.println("- " + recurso.descripcion());
	            }
	        }
	    }
	
}
