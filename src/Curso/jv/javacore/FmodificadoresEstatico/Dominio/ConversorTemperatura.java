package Curso.jv.javacore.FmodificadoresEstatico.Dominio;

public class ConversorTemperatura {

    public static double celsiusParaFahrenhei(double Celsius){

        return (Celsius * 9.0/5.0) + 32.0;
    }
    public static double fahrenheitParaCelsius (double fahrenheit){
        double conversao;
        conversao = (fahrenheit - 32) *  (5.0/9.0);
        return conversao;
    }
}
