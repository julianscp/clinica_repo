package co.edu.uniquindio.proyecto.modelo.entidades;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Producto implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private String codigo;
    private String nombre;
    private TipoProducto tipoProducto;
    private int unidades;
    private float precio;
}