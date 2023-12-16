package com.proyecto.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.proyecto.entity.Mesa;

public interface MesaRepository extends JpaRepository<Mesa, Integer> {
  List<Mesa> findByEstado(String estado);
}
