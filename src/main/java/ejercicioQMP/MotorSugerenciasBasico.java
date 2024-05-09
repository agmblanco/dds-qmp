package ejercicioQMP;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class MotorSugerenciasBasico implements MotorDeSugerencias{
  public Stream<Prenda> obtenerPrendas(Usuario usuario) {
    return usuario.getPrendas().stream();
  }

  public Stream<Prenda> obtenerPrendasSuperiores(Usuario usuario){
    return this.obtenerPrendas(usuario).filter((prenda -> prenda.getCategoria() == CategoriaPrenda.PARTE_SUPERIOR));
  }

  public Stream<Prenda> obtenerPrendasInferiores(Usuario usuario){
    return this.obtenerPrendas(usuario).filter((prenda -> prenda.getCategoria() == CategoriaPrenda.PARTE_INFERIOR));
  }

  public Stream<Prenda> obtenerCalzados(Usuario usuario){
    return this.obtenerPrendas(usuario).filter((prenda -> prenda.getCategoria() == CategoriaPrenda.CALZADO));
  }

  public List<Atuendo> generarSugerencias(Usuario usuario) {
    List<Atuendo> atuendos = new ArrayList<>();
    this.obtenerPrendasSuperiores(usuario).forEach((prendaSuperior -> {
      this.obtenerPrendasInferiores(usuario).forEach(prendaInferior -> {
        this.obtenerCalzados(usuario).forEach(calzado -> {
          atuendos.add(new Atuendo(prendaSuperior, prendaInferior, calzado));
        });
      });
    }));
    return atuendos;
  }
}
