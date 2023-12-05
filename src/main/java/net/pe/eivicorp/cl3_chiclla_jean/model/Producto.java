package net.pe.eivicorp.cl3_chiclla_jean.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "Producto")
@Entity
@Getter
@Setter
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;
    private String descripcion;
    private Double precio;
    private Integer stock;
    private Boolean estado;
    @OneToOne(cascade = CascadeType.ALL)
    private Categoria categoria;
}
