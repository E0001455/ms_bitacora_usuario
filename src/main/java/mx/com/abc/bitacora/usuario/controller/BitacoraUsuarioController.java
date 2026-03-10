package mx.com.abc.bitacora.usuario.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import mx.com.abc.bitacora.usuario.dto.BitacoraUsuarioRequestDTO;
import mx.com.abc.bitacora.usuario.service.BitacoraUsuarioService;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/profuturo/api/v1")
public class BitacoraUsuarioController {
	
	@Autowired
	public BitacoraUsuarioService bitacoraUsuarioService;
	
	
	
	@PostMapping("/bitacoras/eventos")
	public ResponseEntity<?> registrarBitacoraUsuario(@Valid @RequestBody BitacoraUsuarioRequestDTO bitacoraUsuarioRequestDTO ) {
		
				
		Long idBitacoraUsuario;
		idBitacoraUsuario=bitacoraUsuarioService.registrarBitacoraUsuario(bitacoraUsuarioRequestDTO);
		
		if(idBitacoraUsuario!=null) {
			
			return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("id",idBitacoraUsuario));
			
		}else {
			
			return ResponseEntity.badRequest().build();
			
		}
		
		
	}
	
	

	


	
	
}
