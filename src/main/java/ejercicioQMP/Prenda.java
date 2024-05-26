package ejercicioQMP;

public class Prenda {
  private Color colorPrimario;
  private Color colorSecundario;
  private TipoPrenda tipo;
  private Material material;
  private NivelDeFormalidad nivelDeFormalidad;
  private Double temperaturaMaximaAceptable;

  public Prenda(TipoPrenda _tipo,Material _material, Color _colorPrimario, Color _colorSecundario, NivelDeFormalidad _nivelDeFormalidad, Double _temperaturaMaximaAceptable){
    this.tipo = _tipo;
    this.material = _material;
    this.colorPrimario = _colorPrimario;
    this.colorSecundario = _colorSecundario;
    this.nivelDeFormalidad = _nivelDeFormalidad;
    this.temperaturaMaximaAceptable = _temperaturaMaximaAceptable;
  }

  public CategoriaPrenda getCategoria(){
    return this.tipo.getCategoria();
  }

  public NivelDeFormalidad getNivelDeFormalidad(){
    return this.nivelDeFormalidad;
  }

  public Double getTemperaturaMaxima(){ return this.temperaturaMaximaAceptable; }
}
