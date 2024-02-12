/*
  Prática
  Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

  Eu <name>, morando no endereço <address>,
  confirmo que recebi o salário de <payment>, na data <date>.
 */

    public class Aula03TiposPrimitivosExercicio{
        public static void main(String[] args) {
            String name = "Jéssica Santos de Andrade, ";
            String address = "R. Dr. Freud, N°265, ap.96, ";
            double payment = 1400.0;
            String date = "16 de janeiro de 2024.";

            System.out.println ("Eu, " + name + "morando no endereço " + address + "confirmo que recebi o salário de " + payment + " reais na data " + date);
        }
    }

