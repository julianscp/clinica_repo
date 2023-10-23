package co.edu.uniquindio.proyecto.servicios;

import co.edu.uniquindio.proyecto.modelo.entidades.Usuario;
import co.edu.uniquindio.proyecto.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}