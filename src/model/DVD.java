package model;

import enums.Categorias;
import ok.Ok;


/**
 * Clase que representa un DVD como recurso dentro del sistema de biblioteca.
 * Hereda de {@link RecursoBiblioteca} e incluye información específica como el director.
 */
public class DVD extends RecursoBiblioteca {
	/** Nombre del director del DVD. */
	private String director;
	
	/**
     * Constructor privado para crear una instancia de {@code DVD}.
     * Se utiliza el patrón de método fábrica para controlar la creación de instancias.
     * @param titulo    Título del DVD.
     * @param year      Año de publicación.
     * @param categoria Categoría del recurso.
     * @param director  Director del DVD.
     */
	private DVD (String titulo, int year, Categorias categoria, String director) {
		super(titulo, year, categoria);
		this.director = director;
		
	}
	
	/**
     *  Método fábrica estático para crear una nueva instancia de {@code DVD}.
     * Permite crear un DVD proporcionando todos los datos necesarios.
     * @param titulo    Título del DVD.
     * @param year      Año de publicación.
     * @param categoria Categoría del recurso.
     * @param director  Nombre del director.
     * @return Una nueva instancia de {@code DVD}.
     */
	public static DVD crearDVD(String titulo, int year, Categorias categoria, String director) {
        return new DVD(titulo, year, categoria, director);
    }
 
	/**
	 * Método fábrica estático para crear una nueva instancia de {@code DVD} a través de la interacción con el usuario.
	 * Se solicitan los datos necesarios por consola utilizando la clase {@code Ok}. Si alguno de los datos ingresados es inválido
	 * (por ejemplo, "0" o datos nulos), el método retorna {@code null}.
	 * @return Una instancia de {@code DVD} con los datos ingresados, o {@code null} si se ingresa un dato inválido.
	 */
	public static DVD crearDVD() {
		System.out.println("Datos del DVD: ");
		System.out.println("Título: ");
		String titulo = Ok.textoNoVacio();
		if(titulo.equals("S") ) {
			return null;
		}
		System.out.println("Año: ");
		int year = Ok.year();
		if(year == 0 ) {
			return null;
		}
		 
		System.out.println("Categoria: ");
		Categorias categoria = Ok.categoriaSeleccionada();
		if(categoria == null ) {
			return null;
		}
	    
		System.out.println("Director: ");
		String director = Ok.nombre();
		if(director.equals("S") ) {
			return null;
		}
		
		return new DVD(titulo, year, categoria, director);
	}
	
	/**
     * Obtiene el nombre del director del DVD.
     * @return Nombre del director.
     */
	 public String getDirector() {
		return director;
	}

	 /**
	 * Establece el nombre del director del DVD.
	 * @param director Nuevo nombre del director.
	 */
	public void setDirector(String director) {
		this.director = director;
	}

	/**
     * Proporciona una descripción detallada del DVD.
     * Incluye los atributos heredados de {@code RecursoBiblioteca} y los suyos propios
     * @return Una cadena que describe el DVD.
     */
	@Override
	 public String descripcion() {
	     return "DVD [ID: " + getId() + ", Título: " + getTitulo() +
	            ", Año: " + getYear() + ", Categoría: " + getCategoria() +
	            ", Director: " + director + ", Estado: " + getEstado() + "]";
	 }
}

