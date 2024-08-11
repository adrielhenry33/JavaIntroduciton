package Curso.jv.javacore.FmodificadoresEstatico.Teste;

import Curso.jv.javacore.FmodificadoresEstatico.Dominio.ConversorTemperatura;
public class ConversaoTeste01 {
    public static void main(String[] args) {
        double celsius = 25.0;
        double fahrenheit = ConversorTemperatura.celsiusParaFahrenhei(celsius);
        System.out.println(celsius + " °C = " + fahrenheit + " °F");

        double novoCelsius = ConversorTemperatura.fahrenheitParaCelsius(fahrenheit);
        System.out.println(fahrenheit + " °F = " + novoCelsius + " °C");
    }
}
