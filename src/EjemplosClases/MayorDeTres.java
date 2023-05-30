package EjemplosClases;

/* * Programa que lee tres números distintos y nos dice cuál de ellos es el mayor*/

import java.util.Scanner;

public class MayorDeTres {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("Introduzca primer número: ");
        a = sc.nextInt();
        System.out.print("Introduzca segundo número: ");
        b = sc.nextInt();
        System.out.print("Introduzca tercer número: ");
        c = sc.nextInt();

        if (a > b) {

            if (a > c) {

                System.out.println("El mayor es a: " + a);

            } else {

                System.out.println("el mayor es c: " + c);

            }
        } else {

            if (b > c) {

                System.out.println("el mayor es: " + b);

            } else {

                System.out.println("el mayor es: " + c);

            }
        }
    }
}
