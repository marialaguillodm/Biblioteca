package model;

import enums.Categorias;
import enums.EstadoRecurso;


/**
 * Clase abstracta que representa un recurso genérico de una biblioteca.
 * Sirve como clase base para recursos específicos como libros, revistas o DVDs.
 * Cada recurso posee un ID único, título, año, estado y categoría.
 */
public abstract class RecursoBiblioteca {

	/** Contador estático para generar IDs únicos de cada recurso. */
	private static int contadorId = 1;
	 /** ID único del recurso. */
	private int id;
	/** Título del recurso. */
	private String titulo;
	/** Año de publicación o lanzamiento del recurso. Pongo year y no año para evitar problemas con la ñ */
	private int year;
	/** Estado actual del recurso (por ejemplo: DISPONIBLE, RETIRADO, RESERVADO). */
	private EstadoRecurso estado;
	/** Categoría del recurso del enum Categorias. */
	private Categorias categoria;
	/**
     * Método abstracto que debe ser implementado por todas las subclases
     * para proporcionar una descripción detallada del recurso.
     * @return Una cadena con la descripción del recurso.
     */
	public abstract String descripcion();
	
	 /**
     * Constructor protegido para inicializar un recurso de biblioteca.
     * Asigna automáticamente un ID único y establece el estado como DISPONIBLE.
     * @param titulo    Título del recurso.
     * @param year      Año del recurso.
     * @param categoria Categoría del recurso.
     */
	protected RecursoBiblioteca(String titulo, int year, Categorias categoria) {
		this.id = generarId();
		this.titulo = titulo;
		this.year = year;
		this.estado = EstadoRecurso.DISPONIBLE;
		this.categoria = categoria;
		
	}
		
	/**
     * Genera un ID único para el recurso incrementando el contador estático.
     * @return Un nuevo ID único.
     */
	private int generarId () {
		return contadorId++;
	}
	
	/**
     * Obtiene el ID del recurso.
     * @return El ID del recurso.
     */
	public int getId() {
		return id;
	}

	/**
     * Establece el ID del recurso.
     * Este método debería usarse con precaución ya que los IDs son generados automáticamente.
     * @param id Nuevo ID del recurso.
     */
	public void setId(int id) {
		this.id = id;
	}

	 /**
     * Obtiene el título del recurso.
     * @return El título del recurso.
     */
	public String getTitulo() {
		return titulo;
	}

	 /**
     * Establece el título del recurso.
     * @param titulo Nuevo título.
     */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
     * Obtiene el año del recurso.
     * @return Año del recurso.
     */
	public int getYear() {
		return year;
	}

	 /**
     * Establece el año del recurso.
     * @param year Nuevo año.
     */
	public void setYear(int year) {
		this.year = year;
	}

	 /**
     * Obtiene el estado actual del recurso.
     * @return Estado del recurso.
     */
	public EstadoRecurso getEstado() {
		return estado;
	}

	 /**
     * Establece el estado del recurso.
     * @param estado Nuevo estado (DISPONIBLE, RESERVADO, etc.).
     */
	public void setEstado(EstadoRecurso estado) {
		this.estado = estado;
	}

	 /**
     * Obtiene la categoría del recurso.
     * @return Categoría del recurso.
     */
	public Categorias getCategoria() {
		return categoria;
	}

	/**
     * Establece la categoría del recurso.
     * @param categoria Nueva categoría.
     */
	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}
}
