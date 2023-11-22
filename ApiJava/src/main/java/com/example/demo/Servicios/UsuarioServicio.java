package com.example.demo.Servicios;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.Modelos.Usuario;
import com.example.demo.Modelos.UsuarioRepositorio;
/**
 *  Clase para establecer el accesos a la base de datos y obtener información o modificar, mediante los controladores
 * @author ASMP-16/11/23
 */
@Service
public class UsuarioServicio {

	@Autowired
	UsuarioRepositorio usuarioRepositorio;
	
	/**
	 * Devuelve todos los usuario
	 * @return Iterable<Usuario>
	 * 
	 */
	public Iterable<Usuario> getUsuario()
	{
		return usuarioRepositorio.findAll();
	}
	
	/**
	 * Insertar Usuario
	 * @param Usuario usuario
	 * 
	 */
	public void insertarUsuario(Usuario usuario)
	{
		usuarioRepositorio.save(usuario);
	}
	
	/**
	 * Devuelve un usuario en espeficico
	 * @param id identificador del Usuario
	 * @return Optional<Usuario> Devuelve el usuario o null
	 * 
	 */
	public Optional<Usuario> getUsuarioId(Long id)
	{
		return usuarioRepositorio.findById(id);
	}
	/**
	 * Devuelve un usuario en espeficico
	 * @param dni del Usuario
	 * @return Optional<Usuario> Devuelve el usuario o null
	 * 
	 */
	public Optional<Usuario> getUsuarioDni(String dni)
	{
		return usuarioRepositorio.findByDni(dni);
	}
	/**
	 * Devuelve un usuario en espeficico
	 * @param correo del Usuario
	 * @return Optional<Usuario> Devuelve el usuario o null
	 * 
	 */
	public Optional<Usuario> getUsuarioCorreo(String correo)
	{
		return usuarioRepositorio.findByCorreo(correo);
	}
	/**
	 * Devuelve un usuario en espeficico
	 * @param telefono del Usuario
	 * @return Optional<Usuario> Devuelve el usuario o null
	 * 
	 */
	public Optional<Usuario> getUsuarioTelefono(String telefono)
	{
		return usuarioRepositorio.findByTelefono(telefono);
	}
	/**
	 * Actualizar un usuario especioficado
	 * @param id identificador del usuario
	 * @param Usuario usuario
	 * 
	 */
	public void updateUsuario(Usuario usuario,Long id)
	{
		Usuario usuarioObetnido=usuarioRepositorio.findById(id).get();
		
		usuarioObetnido.setDniUsuario(usuario.getDniUsuario());
		usuarioObetnido.setNombreUsuario(usuario.getNombreUsuario());
		usuarioObetnido.setApellidosUsuario(usuario.getApellidosUsuario());
		usuarioObetnido.setTlfUsuario(usuario.getTlfUsuario());
		usuarioObetnido.setEmailUsuario(usuario.getEmailUsuario());
		usuarioObetnido.setClaveUsuario(usuario.getClaveUsuario());
		usuarioRepositorio.save(usuarioObetnido);
	}
	/**
	 * Eliminar un usuario en especifico
	 * @param id identificador del usuario
	 * @return Devuelve tue si se a eliminado con exito o false si no se a eliminado 
	 * 
	 */
	public Boolean deleteUser(Long id) {
		try {
			usuarioRepositorio.deleteById(id);
			return true;
		}catch(IllegalArgumentException e)
		{
			return false;
		}
		
	}
}