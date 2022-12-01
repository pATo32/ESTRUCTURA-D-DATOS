package Manejo_de_Colas.Manejo_de_Numeros;

import Hito3.PilaNumeros;

public class Main {
    public static void main(String[] args) {
        Numeros colaNumeros = new Numeros(100);

        Numeros num1 = new Numeros(100);
        num1.adicionar(45);
        num1.adicionar(78);
        num1.adicionar(34);
        num1.adicionar(10);
        num1.adicionar(2);
        num1.adicionar(2);

//        num1.mostrar();
//        numeroMenor(num1);
            muevealFinal(num1);
    }

    public static void numeroMenor(Numeros numeros) {
        Numeros aux = new Numeros(100);
        int menor = 100;
        int valorExtraidoDeLaPila = 0;
        while (!numeros.esVacia()) {
            valorExtraidoDeLaPila = numeros.eliminar();
            if (valorExtraidoDeLaPila < menor) {
                menor = valorExtraidoDeLaPila;
            }
            aux.adicionar(valorExtraidoDeLaPila);
        }
        numeros.vaciar(aux);
        System.out.println("\nEl numero menor es: " +menor);
    }
// Mover el menor elemento al principio
    public static int muestraMenorElemento(Numeros cola) {
        Numeros aux = new Numeros(100);
        int menor = 100;
        int valorExtraidoDeLaPila = 0;
        while (!cola.esVacia()) {
            valorExtraidoDeLaPila = cola.eliminar();
            if (valorExtraidoDeLaPila < menor) {
                menor = valorExtraidoDeLaPila;
            }
            aux.adicionar(valorExtraidoDeLaPila);
        }
        cola.vaciar(aux);
        return valorExtraidoDeLaPila;
    }

    public static void menorValoralPrincipio(Numeros cola){
        int menorValor = muestraMenorElemento(cola);
        int valorEliminadodelaCola;
        Numeros aux = new Numeros(100);

        while (cola.esVacia() == false){
            valorEliminadodelaCola = cola.eliminar();
            if (menorValor != valorEliminadodelaCola){
                aux.adicionar(valorEliminadodelaCola);
            }
        }
        cola.adicionar(menorValor);
        cola.vaciar(aux);
        cola.mostrar();
    }

    public static int obtieneMayorElemento(Numeros cola) {
        Numeros aux = new Numeros(100);
        int mayor = cola.eliminar();
        int valorExtraidoDeLaPila = 0;
        while (!cola.esVacia()) {
            valorExtraidoDeLaPila = cola.eliminar();
            if (valorExtraidoDeLaPila > mayor) {
                mayor = valorExtraidoDeLaPila;
            }
            aux.adicionar(valorExtraidoDeLaPila);
        }
        cola.vaciar(aux);
        return mayor;
    }

    public static void muevealFinal(Numeros cola){
        int mayorValor = obtieneMayorElemento(cola);
        int valorEliminadodelaCola;
        Numeros aux = new Numeros(100);

        while (cola.esVacia() == false){
            valorEliminadodelaCola = cola.eliminar();
            if (mayorValor != valorEliminadodelaCola){
                aux.adicionar(valorEliminadodelaCola);
            }
        }
        cola.vaciar(aux);
        cola.adicionar(mayorValor);
        cola.mostrar();
    }

    public static void obtieneIguales (Numeros cola){
        Numeros aux = new Numeros(100);
        int iguales = cola.eliminar();
        int valorExtraidoDeLaPila = 0;

        while (cola.esVacia() == false){
            valorExtraidoDeLaPila = cola.eliminar();

            if (valorExtraidoDeLaPila == iguales){

            }
        }
    }
}

