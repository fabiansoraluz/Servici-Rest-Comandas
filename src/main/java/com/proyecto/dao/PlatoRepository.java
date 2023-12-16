package com.proyecto.dao;

import java.util.List;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import com.proyecto.entity.Plato;

public interface PlatoRepository extends JpaRepository<Plato, Integer> {
  @Query("SELECT p FROM Plato p  inner join CategoriaPlato c on p.categoriaPlato.id = c.id where c.id = :idCategoria")
  List<Plato> findPlatoByCategoriaId(@Param("idCategoria") Integer idCategoria);
}
