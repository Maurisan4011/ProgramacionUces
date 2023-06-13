package arrayObjetosJava.miArrayDeObjetos;

public class ArrayDeObjetos {
    private MiClase[] miArray; // Declaración del array de objetos

    public ArrayDeObjetos(int tamano) {
        miArray = new MiClase[tamano]; // Creación del array de objetos con el tamaño especificado
    }

    public MiClase obtenerElemento(int indice) {
        return miArray[indice]; // Acceso a un elemento específico del array de objetos
    }

    public void asignarElemento(int indice, MiClase elemento) {
        miArray[indice] = elemento; // Asignación de un objeto a una posición del array de objetos
    }

    public void recorrerArray() {
        for (int i = 0; i < miArray.length; i++) {
            MiClase objeto = miArray[i]; // Acceso a un elemento mediante su índice
            // Realizar operaciones con el objeto
        }
    }

    public void recorrerArrayForEach() {
        for (MiClase objeto : miArray) {
            // Realizar operaciones con el objeto
        }
    }
}
