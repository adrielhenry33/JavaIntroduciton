package Curso.jv.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int [] numeros = new int [3];
        //outra forma de declarar
        int [] numeros2 = {1,2,3,4,5};
        for (int i = 0; i < numeros2.length; i++){
            numeros2[i] = i;
            System.out.println(numeros2[i]);
        }

        //for each
        for(int num : numeros2){
            System.out.println(num);
        }
    }
}
