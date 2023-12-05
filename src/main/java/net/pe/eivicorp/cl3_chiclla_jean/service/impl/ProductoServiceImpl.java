package net.pe.eivicorp.cl3_chiclla_jean.service.impl;

import net.pe.eivicorp.cl3_chiclla_jean.model.Producto;
import net.pe.eivicorp.cl3_chiclla_jean.repository.ProductoRepository;
import net.pe.eivicorp.cl3_chiclla_jean.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Producto guardarProducto(Producto producto) {
        validarProducto(producto);
        return productoRepository.save(producto);
    }

    @Override
    public Producto actualizarProducto(Producto producto) {
        validarProducto(producto);
        if (!productoRepository.existsById(producto.getIdProducto())) {
            throw new IllegalArgumentException("El producto con el ID especificado no existe.");
        }
        return productoRepository.save(producto);
    }

    @Override
    public void eliminarProducto(Long id) {
        if (!productoRepository.existsById(id)) {
            throw new IllegalArgumentException("El producto con el ID especificado no existe.");
        }
        productoRepository.deleteById(id);
    }

    @Override
    public Producto obtenerProducto(Long id) {
        // return productoRepository.findById(id).orElse(null);
        Optional<Producto> producto = productoRepository.findById(id);
        if (producto.isEmpty()) {
            throw new IllegalArgumentException("El producto con el ID especificado no existe.");
        }
        return producto.get();
    }

    @Override
    public List<Producto> listarTodosLosProductos() {
        return (List<Producto>)productoRepository.findAll();
    }

    private void validarProducto(Producto producto) {
        if (producto.getDescripcion() == null || producto.getDescripcion().trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del producto no puede estar vacío.");
        }

    }
}
