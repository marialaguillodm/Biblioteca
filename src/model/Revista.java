package model;

import enums.Categorias;
import ok.Ok;

/**
 * Clase que representa una Revista en el sistema de recursos de biblioteca.
 * Hereda de {@link RecursoBiblioteca} e incluye atributos y métodos específicos de una revista,
 * como su edición.
 */
public class Revista extends RecursoBiblioteca {
	/** Número de edición de la revista. */
	private int edicion;
	
	/**
     * Constructor privado para crear una instancia de {@code Revista}.
     * Se utiliza el patrón de método fábrica para controlar la creación de instancias.
     * @param titulo   Título de la revista.
     * @param year     Año de publicación de la revista.
     * @param categoria Categoría de la revista.
     * @param edicion  Número de edición de la revista.
     */
	private Revista (String titulo, int year, Categorias categoria, int edicion) {
		super(titulo, year, categoria);
		this.edicion = edicion;
	
	}
	
	/**
     * Método fábrica estático para crear una nueva instancia de {@code Revista}.
     * Permite crear una revista proporcionando todos los datos necesarios.
     * @param titulo    Título de la revista.
     * @param year      Año de publicación.
     * @param categoria Categoría de la revista.
     * @param edicion   Número de edición.
     * @return Una instancia de {@code Revista} con los datos proporcionados.
     */
	 public static Revista crearRevista(String titulo, int year, Categorias categoria, int edicion) {
	        return new Revista(titulo, year, categoria, edicion);
	}
	 
	 /**
	 * Método fábrica estático para crear una nueva instancia de {@code Revista} a través de la interacción con el usuario.
	 * Se solicitan los datos necesarios por consola utilizando la clase {@code Ok}. Si alguno de los datos ingresados es inválido
	 * (por ejemplo, "0" o datos nulos), el método retorna {@code null}.
	 * @return Una instancia de {@code Revista} con los datos ingresados, o {@code null} si se ingresa un dato inválido.
	 */
	 public static Revista crearRevista() {
			System.out.println("Datos de la Revista: ");
			System.out.println("Título: ");
			String titulo = Ok.textoNoVacio();
			if(titulo.equals("0") ) {
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
		    
			System.out.println("Edición: ");
			int edicion = Ok.numero();
			if(edicion == 0 ) {
				return null;
			}
			
			return new Revista(titulo, year, categoria, edicion);
		}

	 /**
	 * Obtiene el número de edición de la revista
	 * @return El número de edición.
	 */
	public int getEdicion() {
		return edicion;
	}

	/**
     * Establece el número de edición de la revista.
     * @param edicion El nuevo número de edición.
     */
	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}
	 
	/**
     * Proporciona una descripción detallada de la revista.
     * Incluye los atributos heredados de {@code RecursoBiblioteca} y los suyos propios
     * @return Una cadena que describe la revista.
     */
	@Override
	public String descripcion() {
	    return "Revista [ID: " + getId() + ", Título: " + getTitulo() +
	           ", Año: " + getYear() + ", Categoría: " + getCategoria() +
	           ", Número de Edición: " + edicion + ", Estado: " + getEstado() + "]";
	}
}
