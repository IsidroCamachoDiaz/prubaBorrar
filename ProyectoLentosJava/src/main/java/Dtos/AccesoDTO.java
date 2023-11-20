package Dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccesoDTO {
    @JsonProperty("idAcceso")
    private long idAccesoDto;
    @JsonProperty("codigoAcceso")
    private String codigoAccesoDto;
    @JsonProperty("descripcionAcceso")
    private String descripcionAccesoDto;
    @JsonProperty("listaUsuariosConAcceso")
    private List<UsuarioDTO> listaUsuariosConAccesoDto;

    public AccesoDTO() {
        super();
    }
    
    

    public AccesoDTO(long idAccesoDto, String codigoAccesoDto, String descripcionAccesoDto) {
		super();
		this.idAccesoDto = idAccesoDto;
		this.codigoAccesoDto = codigoAccesoDto;
		this.descripcionAccesoDto = descripcionAccesoDto;
	}



	public AccesoDTO(String codigoAcceso, String descripcionAcceso) {
        super();
        this.codigoAccesoDto = codigoAcceso;
        this.descripcionAccesoDto = descripcionAcceso;
    }

    public long getIdAcceso() {
        return idAccesoDto;
    }

    public void setIdAcceso(long idAcceso) {
        this.idAccesoDto = idAcceso;
    }

    public String getCodigoAcceso() {
        return codigoAccesoDto;
    }

    public void setCodigoAcceso(String codigoAcceso) {
        this.codigoAccesoDto = codigoAcceso;
    }

    public String getDescripcionAcceso() {
        return descripcionAccesoDto;
    }

    public void setDescripcionAcceso(String descripcionAcceso) {
        this.descripcionAccesoDto = descripcionAcceso;
    }

    public List<UsuarioDTO> getListaUsuariosConAccesoo() {
        return listaUsuariosConAccesoDto;
    }

    public void setListaUsuariosConAccesoo(List<UsuarioDTO> listaUsuariosConAccesoo) {
        this.listaUsuariosConAccesoDto = listaUsuariosConAccesoo;
    }

    @Override
    public String toString() {
        return "--- Datos Acceso ---\nidAcceso: " + idAccesoDto + "\nCodigoAcceso: " + codigoAccesoDto + "\nDescripcionAcceso: "
                + descripcionAccesoDto + "\nLista Usuarios con Acceso: " + listaUsuariosConAccesoDto.toString();
    }
}
