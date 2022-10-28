package ejercicioejemplo1;
public class Jugador {
    
    private String nombre;
    private int edad;
    private double sueldo;


    public Jugador(String nombre, int edad, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }


    /**
     * Constructor de copia
    */ 
    public Jugador(Jugador p) {
        this.nombre = p.nombre;
        this.edad = p.edad;
        this.sueldo = p.sueldo;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        if(edad < 0) {
            this.edad = 0;
           }else {
            this.edad = edad;
           }
    }


    public double getSueldo() {
        return sueldo;
    }


    public void setSueldo(double sueldo) {
        if(sueldo < 0) {
            this.sueldo = sueldo;
        } else {
            this.sueldo = 0;
        }
    }


    @Override
    public String toString() {
        return "Jugador [nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo + "]";
    }

}
