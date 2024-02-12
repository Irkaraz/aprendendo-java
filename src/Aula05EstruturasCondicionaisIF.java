public class Aula05EstruturasCondicionaisIF {
    public static void main(String[] args) {


    /* A estrutura da condicional "IF" (Se) é escrita
     da seguinte forma: if(true);
     * if só funciona se a condição booleana inserida nele for
     verdadeira;
     * Ele tem seu próprio bloco de seção.*/
        int age = 20;
        if (age >= 21) {
            System.out.println ("Completely Formed Brain");
            /*Não vai executar nem um retorno, pois neste caso a
             condição booleana é falsa, pois 20 não maior e nem
             igual a 21*/
        }
        int age2 = 24;
        if (age2 >= 21){
            System.out.println ("Completely Formed Brain");
        }
     /*Digamos que agora você quer colocar o fato negação, usaremos
       o logical NOT para obter algo como:
       "Se tiver menos que 21, não tem o cérebro formado por completo".*/
        int age3 = 14;
        boolean isCompletelyFormedBrain = age3 >= 21;
        if (!isCompletelyFormedBrain){ // também pode ser escrito assim: if (isCompletelyFormedBrain == false){
            System.out.println ("Isn't a Completely Formed Brain");
        }
    }
}
