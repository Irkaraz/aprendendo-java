public class Aula06EstruturasDeRepetiçãoBreakExercícios {
    //Dado um valor de um carro, descubra em quantas parcelas ele pode ser parcelado
    // Condição valorParcela >= 1000
    public static void main(String[] args) {
        double draculauraFreakDuChic = 2500;
        for (int parcelamento = 1; parcelamento <= draculauraFreakDuChic ; parcelamento++) {
            double valorParcela = draculauraFreakDuChic / parcelamento;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcelas " + parcelamento + " R$" + valorParcela);
        }
    }
}
