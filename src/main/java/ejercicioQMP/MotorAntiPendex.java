package ejercicioQMP;

import java.util.stream.Stream;

public class MotorAntiPendex extends MotorSugerenciasBasico {
  public Stream<Prenda> obtenerPrendas(Usuario usuario) {
    if(usuario.getEdad() >= 55){
      return usuario.getPrendas().stream().filter(
          prenda -> prenda.getNivelDeFormalidad() != NivelDeFormalidad.INFORMAL
      );
    }
    return usuario.getPrendas().stream();
  }
}
