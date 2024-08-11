package Curso.jv.javacore.FmodificadoresEstatico.Dominio;

public class Contador {
    private static int totalInstancias;

    public Contador(){
        totalInstancias++;
    }

    public static int getTotalInstancias(){
        return Contador.totalInstancias;
    }
}
