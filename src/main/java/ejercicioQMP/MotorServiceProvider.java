package ejercicioQMP;

public class MotorServiceProvider {
  private static MotorServiceProvider INSTANCE = new MotorServiceProvider();
  private MotorDeSugerencias motor;

  private MotorServiceProvider(){
    this.motor = new MotorSugerenciasBasico();
  }

  public static MotorServiceProvider getInstance(){
    return INSTANCE;
  }

  public void setMotor(MotorDeSugerencias motor){
    if(motor == null){
      throw new IllegalArgumentException("El motor asignado no puede ser null");
    }
    this.motor = motor;
  }

  public MotorDeSugerencias getMotor(){
    return this.motor;
  }
}
