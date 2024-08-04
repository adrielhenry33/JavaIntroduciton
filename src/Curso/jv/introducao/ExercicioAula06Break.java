package Curso.jv.introducao;

public class ExercicioAula06Break {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condicao valor Parcela >=1000

        double valor = 53532;
        int numeroParcelas  = 0;

        for (int i = 1; i<=valor; i++){
            double valorParcela = valor / i;
            if (valorParcela < 1000 ){
                break;
            } else {
                numeroParcelas++;
            }
        }
        System.out.println("O numero de parcelas possiveis para divir o valor do carro e: " +numeroParcelas);
    }
}
