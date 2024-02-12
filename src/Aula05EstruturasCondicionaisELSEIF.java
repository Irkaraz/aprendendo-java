public class Aula05EstruturasCondicionaisELSEIF {
    public static void main(String[] args){

 /*Agora utilizaremos o "else if", que não e nada mais que a linha de código ""if (!isCompletelyFormedBrain){".
  Porém, para fazer de uma forma mais fácil e sem usar o ! (NOT), ultizaremos o "elseif".*/
        int age = 20;
        if (age >= 21) {
            System.out.println ("Completely Formed Brain");
        }else{
            System.out.println ("Isn't a Completely Formed Brain");
        }
        /*Mas e se eu tiver um caso com mais de duas condições? O que fazer?*/
        int age2 = 8;
        if (age2 < 15){
            System.out.println ("They speaks infantile");
        }else if (age2 >= 15){
            System.out.println ("They speaks Adolescent");
        }else{
            System.out.println ("They speaks Adult");
        }

    /*Porém, é bem claro como nosso código está poluído, portanto, podemos refazê-lo de uma
    forma mais limpa atribuindo os "if, else if e else" a uma String*/

        int age3 = 69;
        String voice;
        if (age3 < 15){
            voice = "They speaks infantile";
        }else if (age3 >= 15 && age3 < 18){
            voice = "They speaks Adolescent";
        }else{
            voice = "They speaks Adult";
        }
        System.out.println (voice);
    }
}
