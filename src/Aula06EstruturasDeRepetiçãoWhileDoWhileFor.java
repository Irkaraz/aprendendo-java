public class Aula06EstruturasDeRepetiçãoWhileDoWhileFor {
    public static void main(String[] args) {
        // Repetição: while (booleano), do while, for
        int count = 0;
        while (count < 20){
            count += 1; // ou sout (++count)
            System.out.println(count);
        }

    //While, sendo um booleano, só executa se a condição for verdadeira
    //Caso tenhamos uma condição falsa e mesmo assim seja necessário que retorne
    //algo, usamos o DO WHILE
         int count2 = 21;
         do {
             System.out.println("do while " + ++count2);
         } while (count2 < 10);

         // O for é uma ferramenta de índice
        // O "i" na fórmula é de "incrementador"
         for (int i=0; i < 30; i++){
             System.out.println("For" +i);

         }

    }

}
