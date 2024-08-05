package Curso.jv.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int [][] dias = new int [4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                dias [i][j] = i;
                System.out.println("" + dias [i][j]);
            }
        }

        for (int [] arrbase:dias){
            for (int num: arrbase){
                System.out.println(num);
            }
        }
    }
}
