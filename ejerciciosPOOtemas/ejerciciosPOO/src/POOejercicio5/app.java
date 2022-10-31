package POOejercicio5;

public class app {
    public static void main(String[] args) {
        Circulo ci = new Circulo(6);
        Cuadrado cu = new Cuadrado(6);

        System.out.println("------- Circulo (radio: " + ci.getRadio() + ") -------");
        System.out.printf("Area: %.2f\n", ci.getArea());
        System.out.printf("Perimetro: %2f\n", ci.getPerimetro());

        System.out.println("------- Cuadrado (lado: " + cu.getLado() + ") -------");
        System.out.printf("Área: %.2f\n", cu.getArea());
        System.out.printf("Perímetro: %.2f\n", cu.getPerimetro());
    }
}
