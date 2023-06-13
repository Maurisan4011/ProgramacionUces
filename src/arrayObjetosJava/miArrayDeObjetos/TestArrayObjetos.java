package arrayObjetosJava.miArrayDeObjetos;

public class TestArrayObjetos {
    public static void main(String[] args) {
        ArrayDeObjetos miArrayDeObjetos = new ArrayDeObjetos(5); // Creación de un objeto ArrayDeObjetos con un tamaño de 5

        MiClase objeto1 = new MiClase(); // Creación de objetos de la clase MiClase
        objeto1.nombre = "kjasdhkasd";
        MiClase objeto2 = new MiClase();
        objeto2.apellido = "dududud ";

        miArrayDeObjetos.asignarElemento(0, objeto1); // Asignación de objetos al array
        miArrayDeObjetos.asignarElemento(1, objeto2);

        MiClase elemento = miArrayDeObjetos.obtenerElemento(0); // Obtención de un elemento del array

        miArrayDeObjetos.recorrerArray(); // Recorrido del array utilizando un bucle for
        miArrayDeObjetos.recorrerArrayForEach(); // Recorrido del array utilizando un bucle foreach
    }
}
