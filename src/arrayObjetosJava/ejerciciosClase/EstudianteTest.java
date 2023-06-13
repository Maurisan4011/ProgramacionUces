package arrayObjetosJava.ejerciciosClase;

public class EstudianteTest {
    public static void main(String[] args) {

        double [] calificacionesJose = {8.8,7.5,5.6};
        double [] calificacionesLuis = {9.8,8.0,7.6};
        double [] calificacionesEdu = {10.0,10.2,0};
        Estudiante[] estudiantes ={
                new Estudiante("Jose",20,calificacionesJose),
                new Estudiante("Luis",33,calificacionesLuis),
                new Estudiante("Eduardo",18,calificacionesEdu)
        };
        for(Estudiante estudiante :estudiantes){
            System.out.println("++++++++++++++");
            System.out.println("El estudiante: " + estudiante.getNombre()
            + " edad : " + estudiante.getEdad()
            + " tiene un promedio de : " + estudiante.calcularPromedio() );
            System.out.println("++++++++++++++");
        }


    }

}
