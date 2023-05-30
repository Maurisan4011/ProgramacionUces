package EjemplosClases;

import java.util.Scanner;

public class MatrizFilaColumna {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca n� de filas: ");
		int FILA = sc.nextInt();
		System.out.println("Introduzca n� de columnas: ");
		int COLUMNA = sc.nextInt();
		
		int num[][] = new int[FILA][COLUMNA];

        Matriz1.introvalor(sc, FILA, COLUMNA, num);

    }

}
