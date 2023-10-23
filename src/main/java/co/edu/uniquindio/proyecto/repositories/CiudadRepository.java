package co.edu.uniquindio.proyecto.repositories;

import co.edu.uniquindio.proyecto.modelo.entidades.Ciudad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CiudadRepository extends CrudRepository<Ciudad, Long> {
}