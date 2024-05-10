package ejercicioQMP;

import java.sql.Timestamp;

public class ProveedorDeClima {
  private static ProveedorDeClima INSTANCE = new ProveedorDeClima();
  private ServicioClimatico servicio;
  private Timestamp ultimaConsulta = new Timestamp(0);
  private ProveedorDeClima(){
    
  }
}
