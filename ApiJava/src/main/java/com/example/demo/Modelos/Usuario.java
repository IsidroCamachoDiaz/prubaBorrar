package com.example.demo.Modelos;

import java.util.Calendar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
/**
 * Clase de Usuario(DAO) para traer los campos de la base de datos 
 * @author ASMP-16/11/23
 */
@Entity
@Table(name="usuarios", schema="gbp_almacen")
/**
 * @param idUsuario Identificador del usuario
 * @param dniUsuario DNI del Usuario
 * @param nombreUsuario Nombre del usuario
 * @param apellidosUsuario Apellidos del Usuario
 * @param tlfUsuario Telefono del usuario
 * @param emailUsuario Email del Usuario
 * @param claveUsuario contraseña del usuario
 * @param estaBloqueadoUsuario Si el usuario esta bloqueado o no
 * @param fchFinBloqueo Fecha del Boqueo
 * @param fchAltaUsuario Fecha en la que el usuario se dio de alta
 * @param fchBajaUsuario Fecha en la que el usuario se dio de baja
 * 
 */
public class Usuario {	
	

	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_usuario", nullable=false)
	private long idUsuario;
	
	
	@Column(name="dni_usuario", nullable=false)
	private String dniUsuario;
	
	@Column(name="nombre_usuario")
	private String nombreUsuario;
	
	@Column(name="apellidos_usuario")
	private String apellidosUsuario;
	
	@Column(name="tlf_usuario")
	private String tlfUsuario;
	
	@Column(name="email_usuario")
	private String emailUsuario;
	
	@Column(name="clave_usuario")
	private String claveUsuario;
	
	@Column(name="estaBloqueado_usuario")
	private boolean estaBloqueadoUsuario;
	
	@Column(name="fch_fin_bloqueo")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fchFinBloqueo;
	
	@Column(name="fch_alta_usuario")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fchAltaUsuario;
	
	@Column(name="fch_baja_usuario")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fchBajaUsuario;
	
    @ManyToOne
    @JoinColumn(name="id_acceso")
    Acceso acceso;
   
    //GETT
    /**
     * 
     * @return Devuelve el id del usuario
     */
    public long getIdUsuario() {
		return idUsuario;
	}

    /**
     * 
     * @return Devuelve el DNI del usuario
     */
	public String getDniUsuario() {
		return dniUsuario;
	}

	/**
	 * 
	 * @param dniUsuario inserta un DNI al usuario
	 */
	public void setDniUsuario(String dniUsuario) {
		this.dniUsuario = dniUsuario;
	}

	/**
	 * 
	 * @return Devuelve el Nombre
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	/**
	 * 
	 * @param nombreUsuario Inserta el Nombre al usuario
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	/**
	 * 
	 * @return Devuelve el Apellido del usuario
	 */
	public String getApellidosUsuario() {
		return apellidosUsuario;
	}

	/**
	 * 
	 * @param apellidosUsuario inserta apellido al usuario
	 */
	public void setApellidosUsuario(String apellidosUsuario) {
		this.apellidosUsuario = apellidosUsuario;
	}

	/**
	 * 
	 * @return Devuelve el telefono del usuario
	 */
	public String getTlfUsuario() {
		return tlfUsuario;
	}

	/**
	 * 
	 * @param tlfUsuario inserta un telefono al usuario
	 */
	public void setTlfUsuario(String tlfUsuario) {
		this.tlfUsuario = tlfUsuario;
	}

	/**
	 * 
	 * @return Devuelve el Email del Usuario
	 */
	public String getEmailUsuario() {
		return emailUsuario;
	}

	/**
	 * 
	 * @param emailUsuario Inserta Email al usuario
	 */
	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	/**
	 * 
	 * @return Devuelve la Clave del usuario
	 */
	public String getClaveUsuario() {
		return claveUsuario;
	}

	/**
	 * 
	 * @param claveUsuario inserta una contraseña al usuario
	 */
	public void setClaveUsuario(String claveUsuario) {
		this.claveUsuario = claveUsuario;
	}

	/**
	 * 
	 * @return Devuelve si el usuario esta Bloqueado true, o si no esta bloqueado false
	 */
	public boolean isEstaBloqueadoUsuario() {
		return estaBloqueadoUsuario;
	}

	/**
	 * 
	 * @param estaBloqueadoUsuario inserta si el usuario esta bloqueado o no 
	 */
	public void setEstaBloqueadoUsuario(boolean estaBloqueadoUsuario) {
		this.estaBloqueadoUsuario = estaBloqueadoUsuario;
	}

	/**
	 * 
	 * @return Devuelve la fecha de Bloqueo del usuario
	 */
	public Calendar getFchFinBloqueo() {
		return fchFinBloqueo;
	}

	/**
	 * 
	 * @param fchFinBloqueo Devuelve la fecha de fin de Bloqueo del usuario
	 */
	public void setFchFinBloqueo(Calendar fchFinBloqueo) {
		this.fchFinBloqueo = fchFinBloqueo;
	}

	/**
	 * 
	 * @return Devuelve la fecha de alta del usuario
	 */
	public Calendar getFchAltaUsuario() {
		return fchAltaUsuario;
	}

	/**
	 * 
	 * @return Devuelve la fecha de baja del usuario
	 */

	public Calendar getFchBajaUsuario() {
		return fchBajaUsuario;
	}

	/**
	 * 
	 * @param fchBajaUsuario Inserta la fecha de baja del usuario
	 */
	public void setFchBajaUsuario(Calendar fchBajaUsuario) {
		this.fchBajaUsuario = fchBajaUsuario;
	}

	/**
	 * 
	 * @return Devuelve el ACCESO
	 */
	public Acceso getAcceso() {
		return acceso;
	}

	/**
	 * 
	 * @param acceso Inserta el Acceso del usuario
	 */
	public void setAcceso(Acceso acceso) {
		this.acceso = acceso;
	}
	//CONSTRUCTORES

	/**
	 * Constructor Vacio por defecto
	 */
	public Usuario() {
		super();
	}

	/**
	 *  Constructor completo 
	 * @param dniUsuario
	 * @param nombreUsuario
	 * @param apellidosUsuario
	 * @param tlfUsuario
	 * @param emailUsuario
	 * @param claveUsuario
	 * @param estaBloqueadoUsuario
	 * @param fchFinBloqueo
	 * @param fchAltaUsuario
	 * @param fchBajaUsuario
	 * @param acceso
	 */
	public Usuario(String dniUsuario, String nombreUsuario, String apellidosUsuario, String tlfUsuario,
			String emailUsuario, String claveUsuario, boolean estaBloqueadoUsuario, Calendar fchFinBloqueo,
			Calendar fchAltaUsuario, Calendar fchBajaUsuario, Acceso acceso) {
		super();
		this.dniUsuario = dniUsuario;
		this.nombreUsuario = nombreUsuario;
		this.apellidosUsuario = apellidosUsuario;
		this.tlfUsuario = tlfUsuario;
		this.emailUsuario = emailUsuario;
		this.claveUsuario = claveUsuario;
		this.estaBloqueadoUsuario = estaBloqueadoUsuario;
		this.fchFinBloqueo = fchFinBloqueo;
		this.fchAltaUsuario = fchAltaUsuario;
		this.fchBajaUsuario = fchBajaUsuario;
		this.acceso = acceso;
	}
	
	/**
	 * Constructor sin fechas
	 * @param dniUsuario
	 * @param nombreUsuario
	 * @param apellidosUsuario
	 * @param tlfUsuario
	 * @param emailUsuario
	 * @param claveUsuario
	 */
	public Usuario(String dniUsuario, String nombreUsuario, String apellidosUsuario, String tlfUsuario,
			String emailUsuario, String claveUsuario) {
		super();
		this.dniUsuario = dniUsuario;
		this.nombreUsuario = nombreUsuario;
		this.apellidosUsuario = apellidosUsuario;
		this.tlfUsuario = tlfUsuario;
		this.emailUsuario = emailUsuario;
		this.claveUsuario = claveUsuario;
	}
	
}
