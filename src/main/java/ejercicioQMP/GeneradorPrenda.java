package ejercicioQMP;

public class GeneradorPrenda {
  private TipoPrenda tipo;
  private Color colorPrimario;
  private Color colorSecundario;
  private Material material;
  private TramaMaterial trama = TramaMaterial.LISA;
  private NivelDeFormalidad nivelDeFormalidad;
  private Double temperaturaMaximaAceptable;

  public void asignarTipo(TipoPrenda tipo){
    if(tipo == null){
      throw new IllegalArgumentException("El tipo de la prenda no puede ser null");
    }
    this.tipo = tipo;
  }

  public void asignarMaterial(Material material){
    if(material == null){
      throw new IllegalArgumentException("El material de la prenda no puede ser null");
    }
    if(this.tipo == null){
      throw new RuntimeException("Antes de asignar un material se debe especificar el tipo de prenda");
    }
    this.tipo.validarPosibleMaterial(material);
    this.material = material;
  }

  public void asignarColorPrimario(Color color){
    if(color == null){
      throw new IllegalArgumentException("El color primario no puede ser null");
    }
    this.colorPrimario = color;
  }

  public void asignarColorSecundario(Color color){
    this.colorSecundario = color;
  }

  public void asignarTrama(TramaMaterial trama){
    if (trama == null){
      throw new IllegalArgumentException("La trama no puede ser null");
    }
    this.trama = trama;
  }

  public void asignarTemperaturaMaxima(Double temeratura){
    this.temperaturaMaximaAceptable = temeratura;
  }

  public void asignarFormalidad(NivelDeFormalidad nivel){
    this.nivelDeFormalidad = nivel;
  }

  private void verificarQueSeaValida(){
    if(this.tipo == null){
      throw new RuntimeException("Debe seleccionar un tipo de prenda");
    }
    if(this.material == null){
      throw new RuntimeException("Debe seleccionar un material para la prenda");
    }
    if(this.colorPrimario == null){
      throw new RuntimeException("Debe seleccionar un color primario");
    }
    if(this.nivelDeFormalidad == null){
      throw new RuntimeException("Debe seleccionar un nivel de formalidad");
    }
    if(this.temperaturaMaximaAceptable == null){
      throw new RuntimeException("Debe seleccionar una temperatura maxima aceptable");
    }
  }

  public Prenda guardarPrenda(){
    this.verificarQueSeaValida();
    return new Prenda(this.tipo, this.material, this.colorPrimario, this.colorSecundario, this.nivelDeFormalidad, this.temperaturaMaximaAceptable);
  }
}
