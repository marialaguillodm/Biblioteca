package interfaces;

import model.Usuario;

/**
 * Interface que implementaremos en Biblioteca para poder realidar las funciones
 * relacionadas con los prestamos de los recursos.
 */
public interface Prestamista {
	void retirarRecurso(Usuario usuario);
	void devolverRecurso(Usuario usuario);
	void reservarRecurso(Usuario usuario);
	void cancelarReserva(Usuario usuario);
}
