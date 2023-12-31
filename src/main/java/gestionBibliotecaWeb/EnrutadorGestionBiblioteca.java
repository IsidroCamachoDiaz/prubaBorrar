package gestionBibliotecaWeb;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import gestionBibliotecaWeb.aplicacion.AplicacionConfiguracionContexto;
import gestionBibliotecaWeb.web.controladores.WebConfiguracionContexto;

public class EnrutadorGestionBiblioteca extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected Class<?>[] getRootConfigClasses() {
       return new Class<?>[] { AplicacionConfiguracionContexto.class };
	}
	@Override
	protected Class<?>[] getServletConfigClasses() {
       return new Class<?>[] { WebConfiguracionContexto.class };
	}
	@Override
	protected String[] getServletMappings() {
       return new String[] { "/" };
	}
}

