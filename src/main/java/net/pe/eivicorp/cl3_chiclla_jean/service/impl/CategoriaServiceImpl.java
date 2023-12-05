package net.pe.eivicorp.cl3_chiclla_jean.service.impl;

import net.pe.eivicorp.cl3_chiclla_jean.model.Categoria;
import net.pe.eivicorp.cl3_chiclla_jean.repository.CategoriaRepository;
import net.pe.eivicorp.cl3_chiclla_jean.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> listarTodosLosCategorias() {
        return (List<Categoria>) categoriaRepository.findAll();
    }

    @Override
    public Categoria guardarCategoria(Categoria categoria) {
        validarCategoria(categoria);
        return categoriaRepository.save(categoria);
    }

    @Override
    public Categoria actualizarCategoria(Categoria categoria) {
        validarCategoria(categoria);
        return categoriaRepository.save(categoria);
    }

    @Override
    public void eliminarCategoria(Long id) {
        categoriaRepository.deleteById(id);
    }

    @Override
    public Categoria obtenerCategoria(Long id) {

        Optional<Categoria> categoria = categoriaRepository.findById(id);
        if (categoria.isEmpty()) {
            throw new IllegalArgumentException("El departamento con el ID especificado no existe.");
        }
        return categoria.get();

    }

    private void validarCategoria(Categoria categoria) {
        if (categoria.getDescripcion() == null || categoria.getDescripcion().isEmpty()) {
            throw new RuntimeException("El nombre de la categoria es obligatorio");
        }
    }



}
