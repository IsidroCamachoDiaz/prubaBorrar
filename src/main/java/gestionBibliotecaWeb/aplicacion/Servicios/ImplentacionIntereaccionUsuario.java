package gestionBibliotecaWeb.aplicacion.Servicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import gestionBibliotecaWeb.aplicacion.Dtos.UsuarioDTO;




/**
 * Clase para implentar la interfez de register,login del usuario que implenta de la interfaz
 * 
 */
@Service
public class ImplentacionIntereaccionUsuario implements InterfaceIntereccionUsuario {

	@Override
	public boolean RegistrarUsuario(UsuarioDTO usu) {
		try{
			ObjectMapper objectMapper = new ObjectMapper();
			String cadena="/usuarioSelectDni/"+usu.getDniUsuario();
			 UsuarioDTO usuarios=hacerGets(cadena);
			if(!usuarios.getDniUsuario().equals(usu.getDniUsuario()))
			{
				cadena="/usuarioSelectTelefono/"+usu.getTlfUsuario();
				usuarios=hacerGets(cadena);
				if(!usuarios.getTlfUsuario().equals(usu.getTlfUsuario()))
				{	
					cadena="/usuarioSelectCorreo/"+usu.getEmailUsuario();
					 usuarios=hacerGets(cadena);
					if(!usuarios.getEmailUsuario().equals(usu.getEmailUsuario()))
						{
							// Convertimos el usuario a formato json
							String usuarioJson = objectMapper.writeValueAsString(usu);
							
							URL url = new URL("http://localhost:8080/usuarioApi/usuarioInsertar");
							HttpURLConnection connection = (HttpURLConnection) url.openConnection();
							//Mediante la coneccion a http hace una peticion por post con la aquitectura json
							connection.setRequestMethod("POST");
							connection.setRequestProperty("Content-Type", "application/json");
							connection.setDoOutput(true);
						   //Es una clase que reprenseta un flujo de salia de byte
						   OutputStream os = connection.getOutputStream();
						   byte[] input = usuarioJson.getBytes("utf-8");
						   os.write(input, 0, input.length);
						}
				}
			}
			
			return true;
			} catch (JsonProcessingException e) {
				System.err.println();
			} catch (IOException e) {
				System.err.println();
			}catch (IllegalStateException e) {
				System.err.println();
			}catch (NullPointerException e) {
				System.err.println();
			}catch (SecurityException e) {
				System.err.println();
			}catch (IndexOutOfBoundsException e) {
				System.err.println();
			}
			
	return false;
	}
	/**
	 * 
	 * @param queDar
	 * @return UsuarioDTO devuelve un objeto usuario
	 */
	private UsuarioDTO hacerGets(String queDar)
	{
		try{
			
			URL url = new URL("http://localhost:8080/usuarioApi/"+queDar);
	        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	        connection.setRequestMethod("GET");

	        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	        ObjectMapper objectMapper = new ObjectMapper();
	        String line;
	        UsuarioDTO usuarios = null;
	        while ((line = reader.readLine()) != null) {
	        	usuarios = objectMapper.readValue(line, new TypeReference<UsuarioDTO>() {});
	        }
	        
	        return usuarios;
		} catch (JsonProcessingException e) {
			System.err.println();
		} catch (IOException e) {
			System.err.println();
		}catch (IllegalStateException e) {
			System.err.println();
		}catch (NullPointerException e) {
			System.err.println();
		}catch (SecurityException e) {
			System.err.println();
		}catch (IndexOutOfBoundsException e) {
			System.err.println();
			
		}
		
		return null;
	}
}

