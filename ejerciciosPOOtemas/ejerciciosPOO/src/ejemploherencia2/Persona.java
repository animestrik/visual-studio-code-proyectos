package ejemploherencia2;

public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void hablar() {
        System.out.println("Hola, me llamo: " + nombre);
        
    }
}
