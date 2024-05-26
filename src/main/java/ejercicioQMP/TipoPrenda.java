package ejercicioQMP;

import java.util.Collection;
import java.util.Collections;

public class TipoPrenda {
  private CategoriaPrenda categoria;
  private String nombre;
  private Collection<Material> materialesPosibles = Collections.emptyList();

  public TipoPrenda(String nombre, CategoriaPrenda categoria) {
    this.nombre = nombre;
    this.categoria = categoria;
  }

  public void agregarMaterialPosible(Material material) {
    materialesPosibles.add(material);
  }

  public void eliminarMaterialPosible(Material material) {
    if (!materialesPosibles.contains(material)) {
      throw new IllegalArgumentException("El material elegido no era posible para este tipo de prenda");
    }
    this.materialesPosibles.remove(material);
  }

  public void validarPosibleMaterial(Material material) {
    if (!this.materialesPosibles.contains(material)) {
      throw new RuntimeException("El material elegido no es válido para el tipo de prenda");
    }
  }

  public CategoriaPrenda getCategoria() {
    return this.categoria;
  }
}
