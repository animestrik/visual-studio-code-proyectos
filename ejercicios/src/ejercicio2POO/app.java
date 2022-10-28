package ejercicio2POO;

import java.util.ArrayList;
import java.util.List;

public class app {
    public static void apartado2() {
        List<Jugador> jugadores = new ArrayList<Jugador> ();
        Jugador a = new Jugador("Víctor", 25, 400);
        Jugador b = new Jugador("Javi", -26, -500);
        Jugador c = new Jugador("Alejandro", 34, 800);
        Jugador d = new Jugador("Diego", 31, 950);

        jugadores.add(a);
        jugadores.add(b);
        jugadores.add(c);
        jugadores.add(d);
        jugadores.add(2, null);
        jugadores.add(3, null);

        for(Jugador jugador : jugadores) { 
            if (jugador!=null)
            System.out.println(jugador); 
        }
    }

    public static void main(String[] args) throws Exception {
        apartado2();
    }
}
