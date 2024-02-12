public class Aula05SwitchExercicio {
    public static void main(String[] args) {
        //Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        //Considerando 1 como Domingo
        byte day = 3;
        switch (day){
            case 1:
            System.out.println("Não é dia útil");
                break;
            case 2:
                System.out.println("É dia útil");
                break;
            case 3:
                System.out.println("É dia útil");
                break;
            case 4:
                System.out.println("É dia útil");
                break;
            case 5:
                System.out.println("É dia útil");
                break;
            case 6:
                System.out.println("É dia útil");
                break;
            case 7:
                System.out.println("Não é dia útil");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
