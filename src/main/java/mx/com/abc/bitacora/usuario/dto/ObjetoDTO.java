package mx.com.abc.bitacora.usuario.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public class ObjetoDTO {

	@JsonAlias("id")
	private Long idABCCatObjeto;

	/**
	 * @return the idABCCatObjeto
	 */
	public Long getIdABCCatObjeto() {
		return idABCCatObjeto;
	}

	/**
	 * @param idABCCatObjeto the idABCCatObjeto to set
	 */
	public void setIdABCCatObjeto(Long idABCCatObjeto) {
		this.idABCCatObjeto = idABCCatObjeto;
	}



}
