package ejercicioQMP;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
  public int edad;
  private List<Prenda> prendas = new ArrayList<>();
  public List<Prenda> getPrendas(){
    return this.prendas;
  }
  public int getEdad(){
    return edad;
  }

  public List<Atuendo> generarSugerencias(){
    return MotorServiceProvider.getInstance().getMotor().generarSugerencias(this);
  }
}
