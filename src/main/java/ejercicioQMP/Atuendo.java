package ejercicioQMP;

public class Atuendo {
  private Prenda torso;
  private Prenda piernas;
  private Prenda pies;

  public Atuendo(Prenda torso, Prenda piernas, Prenda pies){
    if(torso == null){
      throw new IllegalArgumentException("La prenda para el torso no puede ser null");
    }
    if(piernas == null){
      throw new IllegalArgumentException("La prenda para las piernas no puede ser null");
    }
    if(pies == null){
      throw new IllegalArgumentException("La prenda para los pies no puede ser null");
    }
    this.torso = torso;
    this.piernas = piernas;
    this.pies = pies;
  }
}
