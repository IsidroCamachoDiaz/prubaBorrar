package com.example.demo.Modelos;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
/**
 * Clase de Acceso(DAO) que representa los campos de la Entidad Acceso de la base de datos 
 * @author ASMP-16/11/23
 * 
 * @param idAcceso Identificador del Objeto
 * @param codigoAcceso Codigo que identifica el Acceso
 * @param descripcion Descripcion del Acceso
 * @param usuariosConAcceso Usuario y su Acceso respectivo
 */
@Entity
@Table(name="accesos", schema="gbp_almacen")
public class Acceso {
	
	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_acceso", nullable=false)
	private long idAcceso;
	
	@Column(name="codigo_acceso", nullable=false)
	private String codigoAcceso;

	@Column(name="descripcion_acceso")
	private String descripcionAcceso;
	
    @OneToMany(mappedBy="acceso")
    List<Usuario> usuariosConAcceso;     

    //GETT
    
    /**
     * 
     * @return Devuelve el id del Acceso
     */
    public long getIdAcceso() {
		return idAcceso;
	}

    /**
     * 
     * @return Devuelve el Codigo de Acceso
     */
    public String getCodigoAcceso() {
		return codigoAcceso;
	}

    /**
     * 
     * @param codigoAcceso inserta un codigo de Acceso
     */
	public void setCodigoAcceso(String codigoAcceso) {
		this.codigoAcceso = codigoAcceso;
	}
	
	/**
	 * 
	 * @return Devuelve la Descripcion de Acceso
	 */
    public String getDescripcionAcceso() {
		return descripcionAcceso;
	}

    /**
     * 
     * @param descripcionAcceso Inserta una Descripcion de Acceso
     */
	public void setDescripcionAcceso(String descripcionAcceso) {
		this.descripcionAcceso = descripcionAcceso;
	}
	//CONSTRUCTORES
	
	/**
	 * Constructor Vacio por defecto
	 */
	public Acceso() {
		super();
	}

	/**
	 * Constructor que crea el objeto con el codigo de Acceso y la descripcion del Acceso indicados
	 * @param codigoAcceso 
	 * @param descripcionAcceso
	 */
	public Acceso(String codigoAcceso, String descripcionAcceso) {
		super();
		
		this.codigoAcceso = codigoAcceso;
		this.descripcionAcceso = descripcionAcceso;
	}	

}
