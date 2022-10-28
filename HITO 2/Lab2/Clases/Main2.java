package Campeonato.Clases;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Datos de Jugadores");

        String nombreCompleto1, apellidos1, ci1;
        int edad1;


        System.out.println("ingrese Nombre del Jugador");
        nombreCompleto1 = leer.next();

        System.out.println("Ingrese Apellido del Jugador");
        apellidos1 = leer.next();

        System.out.println("Ingrese ci del Jugador");
        ci1 = leer.next();

        System.out.println("Ingrese la Edad del Jugador");
        edad1 = leer.nextInt();

//        Jugador jug1 = new Jugador(nombreCompleto1 , apellidos1 , ci1 , edad1);
//        jug1.mostrarJugador();


        Jugador jug1 = new Jugador();
        jug1.setNombreCompleto(nombreCompleto1);
        jug1.setApellidos(apellidos1);
        jug1.setCi(ci1);
        jug1.setEdad(edad1);

        String nombreCompleto2 , apellidos2 , ci2;
        int edad2;

        System.out.print("Ingrese nombre del Jugador2");
        nombreCompleto2 = leer.next();


        System.out.println("Ingrese Apellido del Jugador2");
        apellidos2 = leer.next();


        System.out.println("Ingrese el ci del Jugador2");
        ci2 = leer.next();


        System.out.println("Ingrese la Edad del Jugador2");
        edad2 = leer.nextInt();


//        Jugador jug2 = new Jugador(nombreCompleto2 , apellidos2 , ci2 , edad2);
//        jug2.mostrarJugador();

        Jugador jug2  = new Jugador();
        jug2.setNombreCompleto(nombreCompleto2);
        jug2.setApellidos(apellidos2);
        jug2.setCi(ci2);
        jug2.setEdad(edad2);
        jug1.mostrarJugador();
        jug2.mostrarJugador();
    }
}
