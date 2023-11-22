package gestionBibliotecaWeb.aplicacion.Dtos;

import java.util.Calendar;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UsuarioDTO {

	@JsonProperty("idUsuario")
	private long idUsuarioDto;
	
	@JsonProperty("dniUsuario")
	private String dniUsuarioDto;
	
	@JsonProperty("nombreUsuario")
	private String nombreUsuarioDto;
	
	@JsonProperty("apellidosUsuario")
	private String apellidosUsuarioDto;
	
	@JsonProperty("tlfUsuario")
	private String tlfUsuarioDto;
	
	@JsonProperty("emailUsuario")
	private String emailUsuarioDto;
	
	@JsonProperty("claveUsuario")
	private String claveUsuarioDto;
	
	@JsonProperty("estaBloqueadoUsuario")
	private boolean estaBloqueadoUsuarioDto;
	
	@JsonProperty("fchFinBloqueo")
	private Calendar fchFinBloqueoDto;
	
	@JsonProperty("fchAltaUsuario")
	private Calendar fchAltaUsuarioDto;
	
	@JsonProperty("fchBajaUsuario")
	private Calendar fchBajaUsuarioDto;

    @JsonIgnore // Indica que la propiedad no se serializa y evitar las estructuras de datos recursivas o infinitas en la respuesta JSON
	AccesoDTO acceso;

	public UsuarioDTO() {
		super();
	}

	public UsuarioDTO(String dniUsuario, String nombreUsuario, String apellidosUsuario, String tlfUsuario,
			String emailUsuario, String claveUsuario, boolean estaBloqueadoUsuario, Calendar fchFinBloqueo,
			Calendar fchAltaUsuario, Calendar fchBajaUsuario, AccesoDTO acceso) {
		super();
		this.dniUsuarioDto = dniUsuario;
		this.nombreUsuarioDto = nombreUsuario;
		this.apellidosUsuarioDto = apellidosUsuario;
		this.tlfUsuarioDto = tlfUsuario;
		this.emailUsuarioDto = emailUsuario;
		this.claveUsuarioDto = claveUsuario;
		this.estaBloqueadoUsuarioDto = estaBloqueadoUsuario;
		this.fchFinBloqueoDto = fchFinBloqueo;
		this.fchAltaUsuarioDto = fchAltaUsuario;
		this.fchBajaUsuarioDto = fchBajaUsuario;
		this.acceso = acceso;
	}

	public long getIdUsuario() {
		return idUsuarioDto;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuarioDto = idUsuario;
	}

	public String getDniUsuario() {
		return dniUsuarioDto;
	}

	public void setDniUsuario(String dniUsuario) {
		this.dniUsuarioDto = dniUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuarioDto;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuarioDto = nombreUsuario;
	}

	public String getApellidosUsuario() {
		return apellidosUsuarioDto;
	}

	public void setApellidosUsuario(String apellidosUsuario) {
		this.apellidosUsuarioDto = apellidosUsuario;
	}

	public String getTlfUsuario() {
		return tlfUsuarioDto;
	}

	public void setTlfUsuario(String tlfUsuario) {
		this.tlfUsuarioDto = tlfUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuarioDto;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuarioDto = emailUsuario;
	}

	public String getClaveUsuario() {
		return claveUsuarioDto;
	}

	public void setClaveUsuario(String claveUsuario) {
		this.claveUsuarioDto = claveUsuario;
	}

	public boolean isEstaBloqueadoUsuario() {
		return estaBloqueadoUsuarioDto;
	}

	public void setEstaBloqueadoUsuario(boolean estaBloqueadoUsuario) {
		this.estaBloqueadoUsuarioDto = estaBloqueadoUsuario;
	}

	public Calendar getFchFinBloqueo() {
		return fchFinBloqueoDto;
	}

	public void setFchFinBloqueo(Calendar fchFinBloqueo) {
		this.fchFinBloqueoDto = fchFinBloqueo;
	}

	public Calendar getFchAltaUsuario() {
		return fchAltaUsuarioDto;
	}

	public void setFchAltaUsuario(Calendar fchAltaUsuario) {
		this.fchAltaUsuarioDto = fchAltaUsuario;
	}

	public Calendar getFchBajaUsuario() {
		return fchBajaUsuarioDto;
	}

	public void setFchBajaUsuario(Calendar fchBajaUsuario) {
		this.fchBajaUsuarioDto = fchBajaUsuario;
	}


	public AccesoDTO getAcceso() {
		return acceso;
	}

	public void setAcceso(AccesoDTO acceso) {
		this.acceso = acceso;
	}

	@Override
	public String toString() {
		return "--- Datos Usuario ---\nidUsuario: " + idUsuarioDto + "\ndniUsuario: " + dniUsuarioDto + "\nnombreUsuario: " + nombreUsuarioDto
				+ "\napellidosUsuario: " + apellidosUsuarioDto + "\ntlfUsuario:" + tlfUsuarioDto + ", emailUsuario="
				+ emailUsuarioDto + "\nclaveUsuario: " + claveUsuarioDto + "\nestaBloqueadoUsuario: " + estaBloqueadoUsuarioDto
				+ "\nfchFinBloqueo: " + fchFinBloqueoDto + "\nfchAltaUsuario: " + fchAltaUsuarioDto + "\nfchBajaUsuario: "
				+ fchBajaUsuarioDto + "\nacceso: " + acceso;
	}



}