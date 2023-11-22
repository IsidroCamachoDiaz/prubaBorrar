package gestionBibliotecaWeb.aplicacion.Servicios;


import org.springframework.stereotype.Service;

import gestionBibliotecaWeb.aplicacion.Dtos.UsuarioDTO;

/**
 * Clase para el nombramiento de los metodos relacionado con el usuario register,login
 */
@Service
public interface InterfaceIntereccionUsuario {
	
	/**
	 * Metodo para registrar a los usuarios
	 * @param UsuarioDTO Objetos usu
	 * @param ASMP-17/11/23
	 */
	public boolean RegistrarUsuario(UsuarioDTO usu);
	
}
