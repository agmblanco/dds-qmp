package ejercicioQMP;

import java.sql.Timestamp;
import java.util.*;

public class ClimaServiceProvider {
  private static ClimaServiceProvider INSTANCE =
      new ClimaServiceProvider(new AccuweatherConnector());

  private static int cacheTimeout = 600000; //En milisegundos

  private ServicioClimatico servicio;
  private Timestamp ultimaConsulta = new Timestamp(0);
  private Double temperatura;

  private ClimaServiceProvider(ServicioClimatico servicio){
    this.servicio = servicio;
  }

  public Double obtenerTemperatura(){
    if((new java.util.Date().getTime()) - ultimaConsulta.getTime() > cacheTimeout ) {
      this.temperatura = this.servicio.obtenerTemperaturaLocal();
    }
    return this.temperatura;
  }

  public static ClimaServiceProvider getInstance() {
    return INSTANCE;
  }

  public void cambiarServicio(ServicioClimatico nuevoServicio){this.servicio = nuevoServicio;}
}
