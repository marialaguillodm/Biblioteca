package model;

import java.util.ArrayList;
import java.util.List;
import ok.Ok;

public class Usuarios {
	
	private static List<Usuario> listaUsuarios;

	/**
	 * Creamos lista de usuarios, dejo comentado un usuario nuevo que podemos usar durante
	 * las pruebas para no estar teniendo que crear usuario y logearnos.
	 */
	 public static void listaUsuarios() {
	        listaUsuarios = new ArrayList<>();
	        //Usuario nuevo = new Usuario("77934708J", "123456Ab");
            //listaUsuarios.add(nuevo);
	    }

	    /**
	     * Registra un nuevo usuario, comprobando previamente que no existe ninguno con ese mismo dni
	     */
	    public static void registrarUsuario() {
	    	String dni = Ok.dni();
	    	if(dni.equals("0")) {
	    		return;
	    	}
	    	if (buscarUsuarioPorDni(dni) != null) {
	    		throw new IllegalArgumentException("Ya existe un usuario con ese DNI.");
	        }
	    	String contrasena = Ok.contrasena();
	    	if(contrasena.equals("0")) {
	    		return;
	    	}
	        try {
	            Usuario nuevo = new Usuario(dni, contrasena);
	            listaUsuarios.add(nuevo);
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	            System.out.println("Pulsa \"0\" para salir.");
	        }
	    }

	   /**
	    * Logeamos el usuario usando su dni y contraseña
	    * @return el usuario logeado
	    */
	    public static Usuario iniciarSesion() {
	    	String dni = Ok.dni();
	    	if(dni.equals("0")) {
	    		return null;
	    	}
	    	String contrasena = Ok.contrasena();
	    	if(contrasena.equals("0")) {
	    		return null;
	    	}
	        Usuario u = buscarUsuarioPorDni(dni);
	        if (u != null && u.getContrasena().equals(contrasena)) {
	            return u;
	        } else {
	            System.err.println("DNI o contraseña incorrectos.");
	            System.out.println("Pulsa \"0\" para salir.");
	            return null;
	        }
	    }

	    /**
	     *  Método privado de ayuda para buscar un usuario por su DNI
	     * @param dni
	     * @return usuario encontrado
	     */
	    private static Usuario buscarUsuarioPorDni(String dni) {
	        for (Usuario u : listaUsuarios) {
	            if (u.getDni().equals(dni)) {
	                return u;
	            }
	        }
	        return null;
	    }
}
