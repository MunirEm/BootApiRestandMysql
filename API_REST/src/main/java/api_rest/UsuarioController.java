package api_rest;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping()
	public ArrayList<Usuario> obtenerUsuario(){
		return usuarioService.obtenerUsuario();
		
		
	}
	
	@PostMapping()
	public Usuario guardarUsuario(@RequestBody Usuario usuario) {
		
			return this.usuarioService.guardarUsuario(usuario);
	}
	
	 @GetMapping( path = "/{id}")
	  public Optional<Usuario> obtenerUsuarioPorId(@PathVariable("id") Long id) {
	        return this.usuarioService.obtenerPorId(id);
	    }

	 @GetMapping("/query")
	  public ArrayList<Usuario> obtenerUsuarioPorPrioridad(@RequestParam("prioridad") Integer prioridad){
	        return this.usuarioService.obtenerPorPrioridad(prioridad);
	    }

	 @DeleteMapping( path = "/{id}")
	   public String eliminarPorId(@PathVariable("id") Long id){
	        boolean ok = this.usuarioService.eliminarUsuario(id);
	        if (ok)
	        {
	            return "Se eliminó el usuario con id " + id;
	        }else{
	            return "No pudo eliminar el usuario con id" + id;
	        }
	    }
	

}
