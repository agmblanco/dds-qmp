package ejercicioQMP;

public class Alerta {
  private TipoAlerta tipo;
  public Alerta(TipoAlerta tipo){
    this.tipo = tipo;
  }
  public TipoAlerta obtenerTipo(){
    return tipo;
  }
}
