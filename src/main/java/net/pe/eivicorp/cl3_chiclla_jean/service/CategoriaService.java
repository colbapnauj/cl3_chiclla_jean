package net.pe.eivicorp.cl3_chiclla_jean.service;

import net.pe.eivicorp.cl3_chiclla_jean.model.Categoria;

import java.util.List;

public interface CategoriaService {

    Categoria guardarCategoria(Categoria categoria);

    Categoria actualizarCategoria(Categoria categoria);

    void eliminarCategoria(Long id);

    Categoria obtenerCategoria(Long id);

    List<Categoria> listarTodosLosCategorias();
}
