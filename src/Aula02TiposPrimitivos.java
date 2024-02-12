public class Aula02TiposPrimitivos {

    //psvm+tab digita esse código automaticamente
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int ageLeleco = 23;
        //sout+tab digita esse código automaticamente
        System.out.println(ageLeleco);
        //Mas, caso coloque a variável em aspas duplas, o programa irá entender que é uma String
        System.out.println("ageLeleco");
        System.out.println("A idade de Leleco é " + ageLeleco + " anos");

       /* São usados para números decimais e a única diferença é que
       no float cabem 4bytes e no double cabem 8bytes */
        double paymentDouble = 2000.0;
        float paymentFloat = 2500.0F;

        byte ageByte = 127;
        short ageShort = 32767;

       /*Iremos fazer algo chamado "casting", que é baiscamente
       fazer uma variável caber dentro de outra menor que ela,
       porém não é uma boa prática*/
        long numberLong = 2147483647;
        int numberLongInt = (int) 2147483647L;
        System.out.println(numberLongInt);

        boolean verdadeiro = true;
        System.out.println(verdadeiro);
        boolean falso = false;
        System.out.println(falso);

       /* O char possue 2bytes por conta dos kanjis;
          Além de imprimir a letra que inserir, ele também funciona através da tabela ASCII
          ou através da tabela Unicode*/
        char aLetterChar = 'A';
        System.out.println(aLetterChar);
        char aASCIIChar = 65;
        System.out.println(aASCIIChar);
        char aUnicodeChar = '\u0041';
        System.out.println(aUnicodeChar);

       /*Iremos falar agora sobre Strings.
         Strings não são variáveis , mas sim um estilo de referência.
         Ela deve ser escrita sempre com a primeira letra maisucula*/
        String rose = " são cheirosas";
        System.out.println("rosas" + rose);
    }

}
