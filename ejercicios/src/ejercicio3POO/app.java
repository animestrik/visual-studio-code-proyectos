package ejercicio3POO;

public class app {

    public static void apartado4() {
        Equipo e = new Equipo();

        e.addJugador(new Jugador("Jose", 23, 25000));
        e.addJugador(new Jugador("Maria", 25, 22000));
        e.addJugador(new Jugador("Fran", 26, 28000));
        e.addJugador(new Jugador("Alex", 28, 29000));

        e.deleteJugdor(0);

        for(int i = 0; i <e.getNumJugadores(); i++) {
            System.out.println(e.getJugador(i));
        }
        System.out.println("Total Sueldos: " + e.totalSueldos());
    }

    public static void main(String[] args) throws Exception {
        apartado4();
    }
}
