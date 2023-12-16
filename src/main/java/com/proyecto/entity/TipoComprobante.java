package com.proyecto.entity;

import java.util.*;
import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;

@Entity
@Table(name = "TIPO_COMPROBANTE")
public class TipoComprobante {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String tipo;

  public TipoComprobante() {
  }

  public TipoComprobante(String tipo) {
    this.tipo = tipo;
  }

  @OneToMany(mappedBy = "tipoComprobante")
  @JsonIgnore
  private List<Comprobante> listaComprobante;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public List<Comprobante> getListaComprobante() {
    return listaComprobante;
  }

  public void setListaComprobante(List<Comprobante> listaComprobante) {
    this.listaComprobante = listaComprobante;
  }
}
