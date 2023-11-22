package gestionBibliotecaWeb.aplicacion.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import gestionBibliotecaWeb.aplicacion.Servicios.ImplentacionIntereaccionUsuario;
import gestionBibliotecaWeb.aplicacion.Dtos.UsuarioDTO;
import gestionBibliotecaWeb.aplicacion.Dtos.AccesoDTO;

@Controller
public class MenuControladorUsuario {
	@Autowired
	private ImplentacionIntereaccionUsuario servicio;
	
	
	// Vista formulario de introduccion de datos
	@RequestMapping(value = "/matricularAlumno")
	public String mostrarFormularioMatriculacion(Model modelo) {
		modelo.addAttribute("nuevoAlumno", new UsuarioDTO());
		return "menu01matricularAlumno";
	}
	@PostMapping("/savedAlumno")
	public boolean guardarAlumno(@ModelAttribute("nuevoAlumno") UsuarioDTO usuarioDTO, Model modelo) {
		AccesoDTO accesoUsuario=new AccesoDTO(1,"Usu","Esto no lo voy a lanzar");
		usuarioDTO.setAcceso(accesoUsuario);
		boolean a=servicio.RegistrarUsuario(usuarioDTO);
		return a;
	}	

}
