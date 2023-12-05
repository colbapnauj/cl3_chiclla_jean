package net.pe.eivicorp.cl3_chiclla_jean.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "Categoria")
@Entity
@Getter
@Setter
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategoria;
    private String descripcion;
}
