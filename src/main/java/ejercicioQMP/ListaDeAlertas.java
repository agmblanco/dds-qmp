package ejercicioQMP;

import java.util.List;

public class ListaDeAlertas {
  private List<Alerta> alertas;
  private List<ObservadorAlertaMeteorologica> suscriptores;

  public void agregarAlerta(Alerta alerta){
    this.alertas.add(alerta);
    this.suscriptores.forEach(suscriptor-> suscriptor.recibirAlerta(alerta));
  }

  public List<Alerta> obtenerAlertas(){
    return this.alertas.stream().toList();
  }

  public void agregarSuscriptorAlerta(ObservadorAlertaMeteorologica observador){
    this.suscriptores.add(observador);
  }

  public void eliminarSuscriptorAlerta(ObservadorAlertaMeteorologica observaror){
    if(!this.suscriptores.contains(observaror)){
      throw new IllegalArgumentException("El observador no se encuentra asociado a esta lista");
    }
    this.suscriptores.remove(observaror);
  }
}
