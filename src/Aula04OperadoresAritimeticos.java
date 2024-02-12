public class Aula04OperadoresAritimeticos {
    /* + = SOMA
       - = SUBTRAÇÃO
       * = MULTIPLICAÇÃO
       / = DIVISÃO
    */

    public static void main(String [] args) {
        int numero01 = 35;
        int numero02 = 49;
        System.out.println(numero01-numero02);
        System.out.println(numero01+numero02);
      /*Porém, caso eu coloque uma sting na impressão, ele ira concatenar
      os valores e não realizara operação aritmética*/
        System.out.println("Valor da soma" + numero01+numero02);
        //Nesse caso podemos fazer dessa forma
        System.out.println(numero01+numero02 + " Valor da soma" );
        //Ou desta, para que a String fique antes do valor
        System.out.println("Valor da soma " + (numero01 + numero02));
      /*Também podemos criar uma variável com o resultado da soma das
      primeiras variáveis*/
        int valorDaSoma = numero01 + numero02;
        System.out.println(valorDaSoma);

      /*Sobre divisão, se o resultado da divisão dos números for fracionado, é necessário
      que a variável seja uma double, não uma int, pois números inteiros não podem ser
      fracionados*/
        int numero03 = 15;
        double numero04 = 30;
        double valorDaDivisao = numero03 / numero04;
        System.out.println(valorDaDivisao);
        /*Mas também há possibilidade de fazer o tão famoso "casting"*/
        int numero05 = 30;
        double valorDaDivisao2 = numero03 / (double)numero05;
        System.out.println(valorDaDivisao2);
    }
}

