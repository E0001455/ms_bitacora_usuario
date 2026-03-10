package mx.com.abc.bitacora.usuario.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public class ColumnaCampanaDTO {

	@JsonAlias("id")
	private Long idABCCatColumnaCampana;

	/**
	 * @return the idABCCatColumnaCampana
	 */
	public Long getIdABCCatColumnaCampana() {
		return idABCCatColumnaCampana;
	}

	/**
	 * @param idABCCatColumnaCampana the idABCCatColumnaCampana to set
	 */
	public void setIdABCCatColumnaCampana(Long idABCCatColumnaCampana) {
		this.idABCCatColumnaCampana = idABCCatColumnaCampana;
	}






}