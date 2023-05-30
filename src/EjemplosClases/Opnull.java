package EjemplosClases;public class Opnull {
    public static void main(String args[]){

        promptUser();

    }
    private static void promptUser() {//metodo que ejecuta si el valor entrado es null o vacio

        String name = " "; //si dejo las “ ” sin argumento dira no entro su nombre (no colocar null)
        int edad = 22;

        if (edad <=17  ) { //funcion trim().isEmpty()
            System.out.println("Usted es menor de edad");
        } else {
            System.out.println("Usted es mayor de edad");
        }
    }
}
