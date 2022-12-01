package Manejo_de_Colas.Manejo_de_Numeros;

import Hito3.PilaNumeros;

public class Main {
    public static void main(String[] args) {
        Numeros colaNumeros = new Numeros(100);

        Numeros num1 = new Numeros(10);
        num1.adicionar(10);
        num1.adicionar(100);
        num1.adicionar(200);
        num1.adicionar(400);
        num1.adicionar(500);

//        num1.mostrar();
        determinarmenor(colaNumeros);
    }

    public static void determinarmenor(Numeros cola){
        Numeros aux = new Numeros(10);
        int menor = 1000;
        int valorExtraidodelaPila = 0;

        while (cola.esVacia() == false) {
            valorExtraidodelaPila = cola.eliminar();
            if (valorExtraidodelaPila < menor) {
                menor = valorExtraidodelaPila;
            }
            cola.adicionar(valorExtraidodelaPila);
        }
        cola.vaciar(aux);

        System.out.println("El numero menor de la cola es: " + menor);
    }
}
