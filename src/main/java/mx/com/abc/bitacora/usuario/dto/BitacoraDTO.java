package mx.com.abc.bitacora.usuario.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotNull;

public class BitacoraDTO {

	@JsonProperty("evento")
	@NotNull
	private EventoDTO 	EventoDTO;

	@JsonProperty("objeto")
	@NotNull
	private ObjetoDTO 	ObjetoDTO;

	@JsonProperty("columnaLinea")
	private ColumnaLineaDTO 	columnaLineaDTO;

	@JsonProperty("columnaCampana")
	private ColumnaCampanaDTO 	columnaCampanaDTO;


	private String 		detalle;
	
	@NotNull
	private String 		ip;
	
	@NotNull
	private String 		navegador;

	/**
	 * @return the eventoDTO
	 */
	public EventoDTO getEventoDTO() {
		return EventoDTO;
	}

	/**
	 * @param eventoDTO the eventoDTO to set
	 */
	public void setEventoDTO(EventoDTO eventoDTO) {
		EventoDTO = eventoDTO;
	}

	/**
	 * @return the objetoDTO
	 */
	public ObjetoDTO getObjetoDTO() {
		return ObjetoDTO;
	}

	/**
	 * @param objetoDTO the objetoDTO to set
	 */
	public void setObjetoDTO(ObjetoDTO objetoDTO) {
		ObjetoDTO = objetoDTO;
	}



	/**
	 * @return the detalle
	 */
	public String getDetalle() {
		return detalle;
	}

	/**
	 * @param detalle the detalle to set
	 */
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	/**
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * @param ip the ip to set
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * @return the navegador
	 */
	public String getNavegador() {
		return navegador;
	}

	/**
	 * @param navegador the navegador to set
	 */
	public void setNavegador(String navegador) {
		this.navegador = navegador;
	}

	/**
	 * @return the columnaLineaDTO
	 */
	public ColumnaLineaDTO getColumnaLineaDTO() {
		return columnaLineaDTO;
	}

	/**
	 * @param columnaLineaDTO the columnaLineaDTO to set
	 */
	public void setColumnaLineaDTO(ColumnaLineaDTO columnaLineaDTO) {
		this.columnaLineaDTO = columnaLineaDTO;
	}

	/**
	 * @return the columnaCampanaDTO
	 */
	public ColumnaCampanaDTO getColumnaCampanaDTO() {
		return columnaCampanaDTO;
	}

	/**
	 * @param columnaCampanaDTO the columnaCampanaDTO to set
	 */
	public void setColumnaCampanaDTO(ColumnaCampanaDTO columnaCampanaDTO) {
		this.columnaCampanaDTO = columnaCampanaDTO;
	}


}
