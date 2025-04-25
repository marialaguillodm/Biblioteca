package model;

/**
 * Clase que representa un libro en la biblioteca.
 * Esta clase extiende de {@link RecursoBiblioteca} y agrega atributos específicos
 * de los libros como el ISBN, el autor y la edición del libro.
 * Permite crear instancias de libros a partir de los datos proporcionados por el usuario
 * y proporciona una descripción detallada del libro.
 */

import enums.Categorias;
import ok.Ok;

/**
 * Clase que representa un Libro en el sistema de recursos de biblioteca.
 * Hereda de {@link RecursoBiblioteca} e incluye atributos y métodos específicos deun libro,
 * como su ISBN, autor y edición.
 */
public class Libro extends RecursoBiblioteca {
    /** El ISBN del libro. */
	private String isbn;
	/** El autor del libro. */
	private String autor;
	/** La edición del libro. */
	private int edicion;

	/**
     * Constructor privado para crear una instancia de {@code Libro}.
     * Se utiliza el patrón de método fábrica para controlar la creación de instancias.
     * @param titulo El título del libro.
     * @param year El año de publicación del libro.
     * @param categoria La categoría del libro.
     * @param isbn El ISBN del libro.
     * @param autor El autor del libro.
     * @param edicion La edición del libro.
     */
	private Libro (String titulo, int year, Categorias categoria, String isbn, String autor, int edicion) {
		super(titulo, year, categoria);
		this.isbn = isbn;
		this.autor = autor;
		this.edicion = edicion;
		
	}
	/**
     * Método fábrica estático para crear una nueva instancia de {@code Libro}.
     * Permite crear un libro proporcionando todos los datos necesarios.
     * @param titulo El título del libro.
     * @param year El año de publicación del libro.
     * @param categoria La categoría del libro.
     * @param isbn El ISBN del libro.
     * @param autor El autor del libro.
     * @param edicion La edición del libro.
     * @return Una nueva instancia de {@code Libro} con los datos proporcionados.
     */
	 public static Libro crearLibro(String titulo, int year, Categorias categoria, String isbn, String autor, int edicion) {
		 return new Libro(titulo, year, categoria, isbn, autor, edicion);
	 }
	 
	 /**
	 * Método fábrica estático para crear una nueva instancia de {@code Libro} a través de la interacción con el usuario.
	 * Se solicitan los datos necesarios por consola utilizando la clase {@code Ok}. Si alguno de los datos ingresados es inválido
	 * (por ejemplo, "0" o datos nulos), el método retorna {@code null}.
	 * @return Una instancia de {@code Libro} con los datos ingresados, o {@code null} si se ingresa un dato inválido.
	 */
	public static Libro crearLibro() {
		System.out.println("Datos del Libro: ");
		// Título
		System.out.println("Título: ");
		String titulo = Ok.textoNoVacio();
		if(titulo.equals("0") ) {
			return null;
		}
		// Año
		System.out.println("Año: ");
		int year = Ok.year();
		if(year == 0 ) {
			return null;
		}
		// Categoría
		System.out.println("Categoria: ");
		Categorias categoria = Ok.categoriaSeleccionada();
		if(categoria == null ) {
			return null;
		}
		// ISBN
		System.out.println("ISBN: ");
		String isbn = Ok.isbn();
		if(isbn.equals("0") ) {
			return null;
		}
		// Autor
		System.out.println("Autor: ");
		String autor = Ok.nombre();
		if(autor.equals("0") ) {
			return null;
		}
		// Edición
		System.out.println("Edición: ");
		int edicion = Ok.numero();
		if(edicion == 0 ) {
			return null;
		}
		// Crear y devolver el libro
		return new Libro(titulo, year, categoria, isbn, autor, edicion);
	}
	 /**
     * Obtiene el ISBN del libro.
     * @return El ISBN del libro.
     */
	 public String getIsbn() {
		return isbn;
	}
	 /**
	 * Establece el ISBN del libro.
	 * @param isbn El nuevo ISBN del libro.
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	/**
     * Obtiene el autor del libro.
     * @return El autor del libro.
     */
	public String getAutor() {
		return autor;
	}
	/**
     * Establece el autor del libro.
     * @param autor El nuevo autor del libro.
     */  
	public void setAutor(String autor) {
		this.autor = autor;
	}
	/**
     * Obtiene la edición del libro.
     * @return La edición del libro.
     */
	public int getEdicion() {
		return edicion;
	}
	/**
     * Establece la edición del libro.
     * @param edicion La nueva edición del libro.
     */
	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}
	/**
     * Proporciona una descripción detallada del libro.
     * Incluye los atributos heredados de {@code RecursoBiblioteca} y los suyos propios.
     * @return Una cadena que describe el libro.
     */
	 @Override
	public String descripcion() {
		    return "Libro [ID: " + getId() + ", Título: " + getTitulo() +
		           ", Año: " + getYear() + ", Categoría: " + getCategoria() +
		           ", Autor: " + autor + ", ISBN: " + isbn + ", Edición: " + edicion +
		           ", Estado: " + getEstado() + "]";
		}
	 
	 
}
