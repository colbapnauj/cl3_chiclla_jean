package net.pe.eivicorp.cl3_chiclla_jean.repository;

import net.pe.eivicorp.cl3_chiclla_jean.model.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long> {


}
