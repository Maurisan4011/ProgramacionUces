package EjemplosClases;
import java.util.LinkedList;

public class ColasClase {

	public static void main(String[] args) {

		/***VARIACION DE LISTAS ENLAZADAS**/
		//EN COLAS SE OBTIENE EL PRIMERO QUE FUE INTRODUCIDO EN ESTE CASO 
		//DE 0 A 5  EL PRIMER DATO ES CERO 0 EN UNA PILA SERA EL ULTIMO 5
		//OFFER : A�ADE UN DATO
		//POLL : PARA OBTENER UN DATO
		
		LinkedList<Integer> cola = new LinkedList<Integer>();
		
		for (int i = 0; i < 90; i++) {
			
			cola.offer(i);
		}
		
		while (cola.peek()!= null) {
		
			System.out.print(cola.poll()+" , ");
		}

	}

}
