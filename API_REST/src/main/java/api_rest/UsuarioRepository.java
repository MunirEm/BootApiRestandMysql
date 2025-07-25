package api_rest;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	public abstract ArrayList<Usuario> findByPrioridad (Integer Prioridad);

}
