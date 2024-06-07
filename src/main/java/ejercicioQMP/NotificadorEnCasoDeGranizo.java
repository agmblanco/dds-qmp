package ejercicioQMP;

public class NotificadorEnCasoDeGranizo implements ObservadorAlertaMeteorologica {
  private Usuario usuario;

  public NotificadorEnCasoDeGranizo(Usuario usuario){
    this.usuario = usuario;
  }

  public void recibirAlerta(Alerta alerta){
    if(alerta.obtenerTipo() == TipoAlerta.GRANIZO){
      this.usuario.enviarNotificacion("No uses el auto, mejor abollate la cabeza!");
    }
  }

}
