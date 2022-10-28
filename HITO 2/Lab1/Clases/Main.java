package Campeonato.Clases;

public class Main {
    public static void main(String[] args){
        System.out.println("Programa Jugador");
        Jugador jug1 = new Jugador("Andres" , "Quiroga" , "23LP" , 24);
    //    jug1.mostrarJugador();

        Jugador jug2 = new Jugador("Popeye" , "Espinaca" , "29Cbb" , 69);

        Jugador[] jugadores = new Jugador[2];
        jugadores[0] = jug1;
        jugadores[1] = jug2;

        Equipo eq1 = new Equipo("Club Coquitos" , "Masculino" , jugadores);

        Equipo[] equipos = new Equipo[1];
        equipos[0] = eq1;

        Campeonato camp1 = new Campeonato("Relampago" , equipos);
        camp1.mostrarCampeonato();
    }
}
