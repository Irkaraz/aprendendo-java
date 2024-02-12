public class Aula05Switch {
    public static void main(String[] args) {
        //Vamos imprimir os dias da semana, considerando 1 como domingo
        byte day = 6;
        //Switch aceita apenas char, int, byte, short, enum, String
        switch (day) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
        }
        byte day2 = 9;
        //Usaremos o default para mostrar o que fazer quando inserimos uma opção inválida
        switch (day2) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida");
        }
        char sex = 'N';
        switch (sex){
            case 'M':
                System.out.println("Man");
                break;
            case 'F':
                System.out.println("Woman");
                break;
            case 'N':
                System.out.println("Non Binary");
                break;
            default:
                System.out.println("Inválido");
        }

    }
}
