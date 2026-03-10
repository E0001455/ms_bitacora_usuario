package mx.com.abc.bitacora.usuario.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class BitacoraUsuarioRequestDTO {
	
	
	@JsonProperty("idUsuario")
	@NotNull
	private Long 	idABCUsuario;
	
	@JsonProperty("bitacora")
	private BitacoraDTO bitacoraDTO;
	
	
	
	
	/**
	 * @return the bitacoraDTO
	 */
	public BitacoraDTO getBitacoraDTO() {
		return bitacoraDTO;
	}
	/**
	 * @param bitacoraDTO the bitacoraDTO to set
	 */
	public void setBitacoraDTO(BitacoraDTO bitacoraDTO) {
		this.bitacoraDTO = bitacoraDTO;
	}
	/**
	 * @return the idABCUsuario
	 */
	public Long getIdABCUsuario() {
		return idABCUsuario;
	}
	/**
	 * @param idABCUsuario the idABCUsuario to set
	 */
	public void setIdABCUsuario(Long idABCUsuario) {
		this.idABCUsuario = idABCUsuario;
	}
	
	
	
	
	
	

}
