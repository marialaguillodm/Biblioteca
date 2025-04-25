package model;

import java.util.ArrayList;

/**
 * Clase que representa un usuario del sistema de biblioteca.
 * Contiene la información personal del usuario, así como los recursos retirados y reservados.
 */
public class Usuario {
	private String dni;
    private String contrasena;
    ArrayList<RecursoBiblioteca> recursosRetirados;
    ArrayList<RecursoBiblioteca> recursosReservados;

    /**
     * Constructor para crear un nuevo usuario.
     * 
     * @param dni        Documento Nacional de Identidad del usuario.
     * @param contrasena Contraseña del usuario.
     */
    public Usuario(String dni, String contrasena) {
        this.dni = dni;
        this.contrasena = contrasena;
        this.recursosRetirados = new ArrayList<>();
        this.recursosReservados = new ArrayList<>();
    }

    /**
     * Obtiene el DNI del usuario.
     * 
     * @return El DNI del usuario.
     */
    public String getDni() {
		return dni;
	}


    /**
     * Establece el DNI del usuario.
     * 
     * @param dni El nuevo DNI.
     */
	public void setDni(String dni) {
		this.dni = dni;
	}

	 /**
     * Obtiene la contraseña del usuario.
     * 
     * @return La contraseña del usuario.
     */
	public String getContrasena() {
		return contrasena;
	}


	 /**
     * Establece la contraseña del usuario.
     * 
     * @param contrasena La nueva contraseña.
     */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	/**
     * Obtiene la lista de recursos retirados por el usuario.
     * 
     * @return Lista de recursos retirados.
     */
	public ArrayList<RecursoBiblioteca> getRecursosRetirados() {
		return recursosRetirados;
	}

	/**
     * Establece la lista de recursos retirados del usuario.
     * 
     * @param recursosRetirados Nueva lista de recursos retirados.
     */
	public void setRecursosRetirados(ArrayList<RecursoBiblioteca> recursosRetirados) {
		this.recursosRetirados = recursosRetirados;
	}

	 /**
     * Obtiene la lista de recursos reservados por el usuario.
     * 
     * @return Lista de recursos reservados.
     */
	public ArrayList<RecursoBiblioteca> getRecursosReservados() {
		return recursosReservados;
	}

	 /**
     * Establece la lista de recursos reservados del usuario.
     * 
     * @param recursosReservados Nueva lista de recursos reservados.
     */
	public void setRecursosReservados(ArrayList<RecursoBiblioteca> recursosReservados) {
		this.recursosReservados = recursosReservados;
	}

	/**
     * Intenta retirar un recurso para el usuario y establece un tope de 5 recursos retirados.
     * @param recurso Recurso a retirar.
     * @return true si el recurso fue retirado con éxito; false si se excede el límite.
     */
	public boolean retirarRecurso(RecursoBiblioteca recurso) {
        if (recursosRetirados.size() < 5) {
            recursosRetirados.add(recurso);
            return true;
        } else {
            System.out.println("No se pueden retirar más de 5 recursos.");
            return false;
        }
    }
	
	/**
     * Intenta reservar un recurso para el usuario y establece un tope de 3 recursos reservados.
     * @param recurso Recurso a reservar.
     * @return true si el recurso fue reservado con éxito; false si se excede el límite.
     */
	public boolean reservarRecurso(RecursoBiblioteca recurso) {
        if (recursosReservados.size() < 3) {
        	recursosReservados.add(recurso);
            return true;
        } else {
            System.out.println("No se pueden reservar más de 3 recursos.");
            return false;
        }
    }
}
