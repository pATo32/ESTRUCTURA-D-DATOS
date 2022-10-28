package Campeonato.Clases;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Main3");

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Datos del Jugador");

        String nombreCompleto , apellidos , ci;
        int edad, i , nJugadores = 2;

        Jugador[] jugadores = new  Jugador[nJugadores];

        for ( i=0; i < 2; i++ ){
            System.out.println("Ingrese el Nombre del Jugador:" + (i + 1) + ": " );
            nombreCompleto = leer.next();

            System.out.println("Ingrese el Apellido del Jugador:" + (i + 1) + ": " );
            apellidos = leer.next();

            System.out.println("Ingrese el Ci del Jugador:" + (i + 1) + ": " );
            ci = leer.next();

            System.out.println("Ingrese la Edad del Jugador:" + (i + 1) + ": " );
            edad = leer.nextInt();


//            Jugador jug2 = new Jugador(nombreCompleto , apellidos , ci , edad);
//            jug2.mostrarJugador();

            Jugador jug = new Jugador();
            jug.setNombreCompleto(nombreCompleto);
            jug.setApellidos(apellidos);
            jug.setCi(ci);
            jug.setEdad(edad);
            jugadores[i] = jug;
        }

        Equipo equ1 = new  Equipo();
        equ1.mostrarEquipo();
    }
}
