package mx.com.abc.bitacora.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import mx.com.abc.bitacora.usuario.entity.BitacoraUsuarioEntity;

@Repository
public interface  BitacoraUsarioRepository extends JpaRepository<BitacoraUsuarioEntity, Long> {

}
