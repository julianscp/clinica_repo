package co.edu.uniquindio.proyecto.servicios;
import co.edu.uniquindio.proyecto.modelo.entidades.Ciudad
import co.edu.uniquindio.proyecto.repositories.CiudadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CiudadService {

    @Autowired
    private CiudadRepository ciudadRepository;

    public List<Ciudad> findAll() {
        return ciudadRepository.findAll();
    }

    // Más métodos del servicio
}