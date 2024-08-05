package Curso.jv.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int [][] arrayInt = new int [3][3];
        int cont = 0;
        for (int []arrbase: arrayInt)  {
            for (int num: arrbase) {
                arrayInt[num][num] = cont;
                cont ++;
                System.out.println(num + "");
            }
        }
    }
}
