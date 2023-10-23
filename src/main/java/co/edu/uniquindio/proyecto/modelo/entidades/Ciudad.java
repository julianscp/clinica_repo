package co.edu.uniquindio.proyecto.modelo.entidades;

import jakarta.persistence.*;


import java.util.List;

@Entity
@Table(name = "ciudad")
public class Ciudad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(name = "nombre_ciudad")
    private String nombre;

    @OneToMany(mappedBy = "ciudad", fetch = FetchType.LAZY)
    private List<Usuario> usuarios;

    // Constructor, getters y setters
}