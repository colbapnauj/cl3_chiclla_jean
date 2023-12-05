package net.pe.eivicorp.cl3_chiclla_jean.controller;

import net.pe.eivicorp.cl3_chiclla_jean.model.Categoria;
import net.pe.eivicorp.cl3_chiclla_jean.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<Categoria> listarTodosLosCategorias() {
        return categoriaService.listarTodosLosCategorias();
    }

    @GetMapping("/{id}")
    public Categoria obtenerCategoria(Long id) {
        return categoriaService.obtenerCategoria(id);
    }

    @PostMapping
    public Categoria guardarCategoria(Categoria categoria) {
        return categoriaService.guardarCategoria(categoria);
    }

    @PutMapping("/{id}")
    public Categoria actualizarCategoria(Long id, Categoria categoria) {
        categoria.setIdCategoria(id);
        return categoriaService.actualizarCategoria(categoria);
    }

    @DeleteMapping("/{id}")
    public void eliminarCategoria(Long id) {
        categoriaService.eliminarCategoria(id);
    }

}
