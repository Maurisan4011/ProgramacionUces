package EjemplosClases;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class CentDecUni {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		InputStreamReader input= new InputStreamReader(System.in);
		BufferedReader buffer= new BufferedReader(input);
		
	//SOLUCION 1:
		int num, cent, dec, uni;//declaro todas las variables como enteros para despreciar los decimales al realizar las cuentas.

		System.out.println("\nIngrese un número de 3 cifras. El programa lo separara en centenas, decenas y unidades:");
		num= Integer.parseInt(buffer.readLine());

		cent=num/100; // Dado el numero ABC, al dividirlo dara A,BC. Al ser un entero se tomara SoLO el valor de A.
		dec=(num-(cent*100))/10; //Dado el numero ABC, se resta Ax100 para que quede BC. Se divide por 10, quedando B,C. Al ser un entero, C se desprecia.
		uni=num-cent*100-dec*10; // Dado el numero ABC, se resta Ax100 y Bx10, quedando s�lo C.
		
		System.out.println("\n"+num+" = "+cent*100+" + "+dec*10+" + "+uni+"\nO bien: \n"+num+" = "+cent+" centenas + "+dec+" decenas + "+uni+" unidades.");

/*
		//SOLUCION 2:
		int num, cent, dec, uni, num1, uni1, dec1, cent1;
		System.out.println("\nIngrese un n�mero de 3 cifras. El programa lo separara en centenas, decenas y unidades:");
		num = Integer.parseInt(buffer.readLine());
		num1=num;//Guardo el n�mero ingresado para mostrarlo al final

		uni=num%10; //Dado el numero ABC, al dividirlo por 10, el resto ser� C.
		
		num=num/10; //Dado el numero ABC, al dividirlo por 10, el resultado sera AB,C. Como es un entero, C se desprecia.
		dec= num %10;//Dado el numero AB, al dividirlo por 10, el resto ser� B.
		
		num=num/10;//Heredado el numero AB, al dividirlo por 10, el resultado ser� A,B. Como es un entero, B se desprecia.
		cent=num%10;//Dado el numero A, al dividirlo por 10, el resto ser� A.
		
		uni1=(int)(uni*Math.pow(10, 0)); //Casteo de DOUBLE a INT. 
		dec1=(int)(dec*Math.pow(10, 1));
		cent1=(int)(cent*Math.pow(10, 2));
		
		System.out.println("\n"+num1+" = "+cent1+" + "+dec1+" + "+uni1+"\nO bien: \n"+num1+" = "+cent+" centenas + "+dec+" decenas + "+uni+" unidades.");
		*/
		

	}

}
