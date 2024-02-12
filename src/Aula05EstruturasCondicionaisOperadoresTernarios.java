public class Aula05EstruturasCondicionaisOperadoresTernarios {

    public static void main(String[] args) {
        double payment = 4500;
        String donation = "Irei doar 10% do meu salário para causas nobres";
        String notDonation = "Ainda não consigo doar 10% do meu salário para causas nobres, mas um dia conseguirei!";
        // Operador Ternário: (condição) ? verdadeiro : falso
        String resultation = (payment > 3000) ? donation : notDonation;
        System.out.println(resultation);
    }
}
