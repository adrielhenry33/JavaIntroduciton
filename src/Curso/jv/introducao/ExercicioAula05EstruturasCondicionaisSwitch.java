package Curso.jv.introducao;

public class ExercicioAula05EstruturasCondicionaisSwitch {
    public static void main(String []args) {
        //Dados os valores de  1 a 7, imprima se e dia util ou final de semana
        // considerando 1 como domingo
        byte dia = 1;

        switch (dia){
            default:
                System.out.println("Dia invalido");
                break;
            case 1:
                System.out.println("Final de semana");
                break;
            case 2:
                System.out.println("Dia 2 util");
                break;
            case 3:
                System.out.println("Dia 3 util");
                break;
            case 4:
                System.out.println("Dia 4 util");
                break;
            case 5:
                System.out.println("Dia 5 util");
                break;
            case 6:
                System.out.println("Dia 6 util");
                break;
            case 7:
                System.out.println("Final de semana");
                break;

        }
    }
}
