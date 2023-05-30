package EjemplosClases.IfForWhile;

public class PreincrePost {

    public static void main(String args[]) {

        //PRE_INCREMENTO O INCREMENTA ANTES

        int contadorPre = 0; //incrementa antes dando (1)
        /*contadorPre = contadorPre + 1;
        int salidaPre = contadorPre;*/

        int contadorPre1 = ++contadorPre; //tipo (++contadorPre)

        //POST_INCREMENTO O INCREMENTA DESPUES

        int contadorPost = 0; //incrementa despues dando (0)
        /*int salidaPost = contadorPost;
        contadorPost = contadorPost + 1;*/

        int contadorPost1 = contadorPost++; //tipo (contadorPost++)

        System.out.println("[" + contadorPre1 + "]"); //pre_incrementa en uno pasa de 0 a 1
        //System.out.println("Soy preincremento: ["+salidaPre+"]");
        System.out.println("[" + contadorPost1 + "] "); //post_incremento comienza en cero 0
        //System.out.println("Soy postincremento: ["+salidaPost+"]");

    }
}
