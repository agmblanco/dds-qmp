package ejercicioQMP;

import java.util.Collection;

public class Prenda {
  private Color colorPrimario;
  private Color colorSecundario;
  private TipoPrenda tipo;
  private Material material;

  public Prenda(TipoPrenda _tipo,Material _material, Color _colorPrimario, Color _colorSecundario){
    this.tipo = _tipo;
    this.material = _material;
    this.colorPrimario = _colorPrimario;
    this.colorSecundario = _colorSecundario;
  }
}
