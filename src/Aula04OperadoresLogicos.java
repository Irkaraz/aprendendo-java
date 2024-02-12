public class Aula04OperadoresLogicos {
    public static void main(String[] args) {

    /* < ; >  ; <= ; >= - sempre darão um valor "booleano", ou seja,
     true or false. */
    /* LEMBRETE:variáveis BOOLEAN SEMPRE são perguntas, então deve-se
     usar o "is" antes de nomear a variável*/
        boolean isTenBiggerThanTwenty = 10 > 20;
        System.out.println(isTenBiggerThanTwenty);

        boolean isTenLessThanTwenty = 10 < 20;
        System.out.println(isTenLessThanTwenty);
    /*Se quiser que sua pergunta saia no resultado para que não se perca,
     é só colocar em string o nome da variável*/
        System.out.println("isTenBiggerThanTwenty " + isTenBiggerThanTwenty);

        boolean isFiveBiggerThanOrEqualToTwenty = 5 >= 20;
        System.out.println("isFiveBiggerThanOrEqualToTwenty " + isFiveBiggerThanOrEqualToTwenty);

        boolean isFiveLessThanOrEqualToTen = 5 <= 10;
        System.out.println("isFiveLessThanOrEqualToTen " + isFiveLessThanOrEqualToTen);

    /* == - é o nosso igual, quando queremos comparar e não atribuir
     um valor a uma variável, usamos este símbolo.*/
        boolean isFiveEqualToFive = 5 == 5;
        System.out.println("isFiveEqualToFive " + isFiveEqualToFive);

        /* != - significa diferente. */
        boolean isFourDifferentForTwenty = 4 != 20;
        System.out.println("isFourDifferentForTwenty " + isFourDifferentForTwenty);


        /* && = conjunção aditiva "e"(AND) em português.*/
        int age = 49;
        double payment = 4800.0;
        boolean isInTheLawBiggerThanThirty = age >= 30 && payment >= 4612;
        boolean isInTheLawLessThanThirty = age < 30 && payment <= 3381;
     /*No Intellij você pode colocar um break point na linha de cima e
      apertar SHIFT+F9 para analisar cada umos retornos e ver
      se realmente todos são falsos, ou se um é verdadeiro e o outro
      falso. Acontece que para o boolean quando compara tudo, se um
      dos retornos forem falsos, ele interpretará que tudo na linha
      de retorno é falso. */
        System.out.println("isInTheLawBiggerThanThirty " + isInTheLawBiggerThanThirty);
        System.out.println("isInTheLawLessThanThirty " + isInTheLawLessThanThirty);

        /* || = conjunção coordenativa alternativa "ou"(OR);*/
        double chekingtAccount = 53.01;
        double savingsAccount = 00.00;
        double ccxp = 2000.50;
        boolean isCCXPTicketPurchasable = ccxp < chekingtAccount || ccxp < savingsAccount;
        System.out.println("isCCXPTicketPurchasable " + isCCXPTicketPurchasable);


        /* ! = Operador lógico NÃO (The logical NOT). */

    }
}
