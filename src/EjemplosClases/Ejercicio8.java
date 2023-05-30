package EjemplosClases;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Ejercicio8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		double num,prom,suma;
		suma=0;
		InputStreamReader input= new InputStreamReader(System.in);
		BufferedReader buffer= new BufferedReader(input);
		
		System.out.println("Ingresando 4 n�meros se calcular� el promedio. Pueden contener decimales (utilice punto [.] para separar la parte entera)");
		
		for(int i=1;i<=4;i++){
		System.out.println("\n- Ingrese el "+i+"� n�mero y presione ENTER:");
		
		num=Double.parseDouble(buffer.readLine());
		suma=suma+num;
		}
		
		prom=suma/4;
		
		System.out.println("\n----\nEl promedio de los 4 n�meros ingresados es: "+prom);
		
		
		
		

	}

}
