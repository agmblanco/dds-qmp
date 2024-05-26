package ejercicioQMP;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Usuario {
  public int edad;
  //TODO: Inicializar guardarropas vacío en vez de lista vacía
  private List<Guardarropas> guardaGuardarropas = new ArrayList<Guardarropas>();
  private List<Guardarropas> guardarropasAjenos = new ArrayList<Guardarropas>();

  public List<Prenda> getPrendas() {
    return this.guardaGuardarropas.stream().flatMap(guardarropas -> guardarropas.obtenerPrendas().stream()).collect(Collectors.toList());
  }

  public int getEdad() {
    return edad;
  }

  public List<Atuendo> generarSugerencias() {
    return MotorServiceProvider.getInstance().getMotor().generarSugerencias(this);
  }

  public void agregarGuardarropasAjeno(Guardarropas guardarropas) {
    if (guardaGuardarropas.contains(guardarropas)) {
      throw new IllegalArgumentException("No te podes compartir el guardarropas con vos mismo");
    }
    if (guardarropasAjenos.contains(guardarropas)) {
      throw new IllegalArgumentException("Ya agregaste este guardarropas");
    }
    guardarropasAjenos.add(guardarropas);
  }

  public List<SugerenciaModa> obtenerSugerencias() {
    return this.guardaGuardarropas.stream().flatMap(guardarropas
        -> guardarropas.obtenerSugerencias().stream()).collect(Collectors.toList());
  }
}
