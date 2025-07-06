package api_rest;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public ArrayList<Usuario> obtenerUsuario(){
		return (ArrayList<Usuario>) usuarioRepository.findAll();
		
	}
	
	public Usuario guardarUsuario(Usuario usuario) {
		
		return usuarioRepository.save(usuario);
	}
    public Optional<Usuario> obtenerPorId(Long id){
        return usuarioRepository.findById(id);
    }


    public ArrayList<Usuario>  obtenerPorPrioridad(Integer prioridad) {
        return usuarioRepository.findByPrioridad(prioridad);
    }

    public boolean eliminarUsuario(Long id) {
        try{
            usuarioRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }

	
	

}
