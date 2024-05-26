package ejercicioQMP;


import java.util.*;

public class AccuweatherConnector implements ServicioClimatico{
  @Override
  public Double obtenerTemperaturaLocal() {
    AccuWeatherAPI apiClima = new AccuWeatherAPI();
    Map<String, Object> datosTemperatura = (Map<String, Object>) apiClima
        .getWeather("Buenos Aires, Argentina").get(0).get("Temperature");
    return datosTemperatura.get("Unit") == "C"
        ? Double.parseDouble((String) datosTemperatura.get("Value"))
        : this.fahrenheitToCelcious(Double.parseDouble((String) datosTemperatura.get("Value")));
  }

  private Double fahrenheitToCelcious(Double temp){
    return (temp - 32) / 1.8;
  }
}
