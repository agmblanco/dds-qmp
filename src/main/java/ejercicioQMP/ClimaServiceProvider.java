package ejercicioQMP;

import java.sql.Timestamp;

public class ClimaServiceProvider {
  private static ClimaServiceProvider INSTANCE = new ClimaServiceProvider();

  private static int cacheTimeout = 600; //En segundos

  private ServicioClimatico servicio;
  private Timestamp ultimaConsulta = new Timestamp(0);

  private ClimaServiceProvider(){
    this.servicio = new //TODO
  }

  private
}
