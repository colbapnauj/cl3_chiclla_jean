package net.pe.eivicorp.cl3_chiclla_jean.service;

import net.pe.eivicorp.cl3_chiclla_jean.model.Producto;

import java.util.List;

public interface ProductoService {
    Producto guardarProducto(Producto producto);

    Producto actualizarProducto(Producto producto);

    void eliminarProducto(Long id);

    Producto obtenerProducto(Long id);

    List<Producto> listarTodosLosProductos();
}
