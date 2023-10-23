package co.edu.uniquindio.proyecto;

import co.edu.uniquindio.proyecto.modelo.entidades.Usuario;
import co.edu.uniquindio.proyecto.servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Usuario> create(@RequestBody Usuario usuario) {
        Usuario newUsuario = usuarioService.save(usuario);
        return new ResponseEntity<>(newUsuario, HttpStatus.CREATED);
    }
}
