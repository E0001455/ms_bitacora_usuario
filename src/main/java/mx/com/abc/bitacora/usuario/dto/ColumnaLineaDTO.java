package mx.com.abc.bitacora.usuario.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public  class ColumnaLineaDTO {

	@JsonAlias("id")
	private Long idABCCatColumnaLinea;

	/**
	 * @return the idABCCatColumnaLinea
	 */
	public Long getIdABCCatColumnaLinea() {
		return idABCCatColumnaLinea;
	}

	/**
	 * @param idABCCatColumnaLinea the idABCCatColumnaLinea to set
	 */
	public void setIdABCCatColumnaLinea(Long idABCCatColumnaLinea) {
		this.idABCCatColumnaLinea = idABCCatColumnaLinea;
	}
}