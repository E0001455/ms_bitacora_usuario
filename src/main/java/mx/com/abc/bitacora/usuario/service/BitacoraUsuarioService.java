package mx.com.abc.bitacora.usuario.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.abc.bitacora.usuario.dto.BitacoraUsuarioRequestDTO;
import mx.com.abc.bitacora.usuario.entity.BitacoraUsuarioEntity;
import mx.com.abc.bitacora.usuario.repository.BitacoraUsarioRepository;

@Service
public class BitacoraUsuarioService {

	@Autowired
	public BitacoraUsarioRepository bitacoraUsarioRepository;

	public Long  registrarBitacoraUsuario(BitacoraUsuarioRequestDTO bitacoraUsuarioRequestDTO) {
		Long idBitacoraUsuario = 0L;
		
		
			BitacoraUsuarioEntity bitacoraUsuarioEntity = new BitacoraUsuarioEntity();
			bitacoraUsuarioEntity.setIdABCUsuario(bitacoraUsuarioRequestDTO.getIdABCUsuario());
			bitacoraUsuarioEntity.setIdABCCatEvento(bitacoraUsuarioRequestDTO.getBitacoraDTO().getEventoDTO().getIdABCCatEvento());
			bitacoraUsuarioEntity.setIdABCCatObjeto(bitacoraUsuarioRequestDTO.getBitacoraDTO().getObjetoDTO().getIdABCCatObjeto());
			bitacoraUsuarioEntity.setIdABCCatColumnaLinea(bitacoraUsuarioRequestDTO.getBitacoraDTO().getColumnaLineaDTO()!=null
					?bitacoraUsuarioRequestDTO.getBitacoraDTO().getColumnaLineaDTO().getIdABCCatColumnaLinea():null);
			bitacoraUsuarioEntity.setIdABCCatColumnaCampana(bitacoraUsuarioRequestDTO.getBitacoraDTO().getColumnaCampanaDTO()!=null
					?bitacoraUsuarioRequestDTO.getBitacoraDTO().getColumnaCampanaDTO().getIdABCCatColumnaCampana():null);
			bitacoraUsuarioEntity.setDetalle(bitacoraUsuarioRequestDTO.getBitacoraDTO().getDetalle());
			bitacoraUsuarioEntity.setIp(bitacoraUsuarioRequestDTO.getBitacoraDTO().getIp());
			bitacoraUsuarioEntity.setNavegador(bitacoraUsuarioRequestDTO.getBitacoraDTO().getNavegador());
			bitacoraUsuarioEntity.setFecCreacion(new Date());


			idBitacoraUsuario=bitacoraUsarioRepository.save(bitacoraUsuarioEntity).getIdABCBitacoraUsuario();




	
		return	idBitacoraUsuario;	

	}



}
