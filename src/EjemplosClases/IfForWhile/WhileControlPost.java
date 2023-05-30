package EjemplosClases.IfForWhile;


public class WhileControlPost { //comienza en cero

    public static void main(String arags[]) {
        int contador = 0;
        int salida = 0;

        while (contador <= 3) {
            System.out.println("La iteracion es: [" + contador + "]");
            //salida = ++contador; //forma abreviada de contador = contador + 1
            salida = contador;
            contador = contador + 1;
        }
        System.out.println("La iteracion externa: [" + salida + "]");
    }
}