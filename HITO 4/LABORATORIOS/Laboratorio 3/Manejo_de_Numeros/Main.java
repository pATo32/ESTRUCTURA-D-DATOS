package Manejo_de_Colas.Manejo_de_Numeros;

import Hito3.PilaNumeros;

public class Main {
    public static void main(String[] args) {
            Numeros colaNumeros = new Numeros(100);

            Numeros num1 = new Numeros(100);
            num1.adicionar(10);
            num1.adicionar(5);
            num1.adicionar(50);
            num1.adicionar(37);
            num1.adicionar(100);
            num1.adicionar(50);

            Numeros num2 = new Numeros(100);
            num1.adicionar(10);
            num1.adicionar(5);
            num1.adicionar(50);
            num1.adicionar(37);
            num1.adicionar(200);
            num1.adicionar(50);

    //        num1.mostrar();
    //        numeroMenor(num1);
    //        muevealFinal(num1);
    //        eliminaRepetidos(num1);
//            eliminarRepetidosV3(num1);
              moverMaximoElemento(num1 , num2);
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
        System.out.println("\nEl numero menor es: " + menor);
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

    public static void menorValoralPrincipio(Numeros cola) {
        int menorValor = muestraMenorElemento(cola);
        int valorEliminadodelaCola;
        Numeros aux = new Numeros(100);

        while (cola.esVacia() == false) {
            valorEliminadodelaCola = cola.eliminar();
            if (menorValor != valorEliminadodelaCola) {
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

    public static void muevealFinal(Numeros cola) {
        int mayorValor = obtieneMayorElemento(cola);
        int valorEliminadodelaCola;
        Numeros aux = new Numeros(100);

        while (cola.esVacia() == false) {
            valorEliminadodelaCola = cola.eliminar();
            if (mayorValor != valorEliminadodelaCola) {
                aux.adicionar(valorEliminadodelaCola);
            }
        }
        cola.vaciar(aux);
        cola.adicionar(mayorValor);
        cola.mostrar();
    }

    public static void obtieneIguales(Numeros cola) {
        Numeros aux = new Numeros(100);
        int iguales = cola.eliminar();
        int valorExtraidoDeLaPila = 0;

        while (cola.esVacia() == false) {
            valorExtraidoDeLaPila = cola.eliminar();

            if (valorExtraidoDeLaPila == iguales) {

            }
        }
    }

    public static void eliminaRepetidos(Numeros cola) {
        int valorExtraidodelaCola = 0;
        int nroElementos = cola.nroElem();
        Numeros aux = new Numeros(100);

        for (int i = 1; i <= nroElementos; i++) {
            valorExtraidodelaCola = cola.eliminar();
            System.out.println("Cola Value: " + valorExtraidodelaCola);
            aux.adicionar(valorExtraidodelaCola);
        }
        cola.vaciar(aux);
        cola.mostrar();
    }

    // Camel Case = primera palabra en minuscula y la segunda mayuscula
    public static void eliminaRepetidosV2(Numeros cola) {
        int valorExtraidodelaCola = 0;
        int nroElementos = cola.nroElem();

        for (int i = 1; i <= nroElementos; i++) {
            valorExtraidodelaCola = cola.eliminar();
            System.out.println("Cola Value: " + valorExtraidodelaCola);
            cola.adicionar(valorExtraidodelaCola);
        }
        cola.mostrar();
    }



    public static void eliminarRepetidosV3(Numeros cola) {
        int valorExtraidodelaCola = 0;
        int nroElementos = cola.nroElem();

        for (int i = 1; i <= nroElementos; i++) {
            valorExtraidodelaCola = cola.eliminar();
            if (!verificarSiExisteUnoMas(valorExtraidodelaCola, cola)) {
                cola.adicionar(valorExtraidodelaCola);
            }
        }
        cola.mostrar();
    }

    public static boolean verificarSiExisteUnoMas(int numeroBuscar , Numeros cola){
        int valorExtraidoDeLaCola;
        int nroElementos = cola.nroElem();
        int repetidos = 0;

        for (int i=1; i<= nroElementos; i++) {
            valorExtraidoDeLaCola = cola.eliminar();
            if (numeroBuscar == valorExtraidoDeLaCola) {
                repetidos = repetidos + 1;
            } else {
                cola.adicionar(valorExtraidoDeLaCola);
            }
        }
        if (repetidos > 0){
            return true;
        } else {
            return false;
        }
    }

//    Intercambiar los numeros mayores de ambas colas

    public static int getMayorElemento(Numeros cola) {
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

    public static void moverMaximoElemento(Numeros colaA , Numeros colaB){
        int maxColaA = getMayorElemento(colaA);
        int maxColaB = getMayorElemento(colaB);
        int nroElemColaA = colaA.nroElem();
        int nroElemColaB = colaB.nroElem();
        int valorEliminado;

        for (int i=1; i<= nroElemColaA; i++){
            valorEliminado = colaA.eliminar();
            if (valorEliminado == maxColaA){
                colaA.adicionar(maxColaB);
            } else {
                colaA.adicionar(valorEliminado);
            }
        }

        for (int i=1; i<= nroElemColaB; i++){
            valorEliminado = colaB.eliminar();
            if (valorEliminado == maxColaB){
                colaB.adicionar(maxColaA);
            } else {
                colaB.adicionar(valorEliminado);
            }
        }
        colaA.mostrar();
        colaB.mostrar();
    }

    public static void intercambiarNumerosMayores(Numeros colaA, Numeros colaB ) {
        int maxColaA = getMayorElemento(colaA);
        int maxColaB = getMayorElemento(colaB);

        int nroElemColaA = colaA.nroElem();
        int nroElemColaB = colaB.nroElem();

        int valorEliminado;

        for(int i=1; i <= nroElemColaA; i++){
            valorEliminado = colaA.eliminar();
            if (valorEliminado == maxColaA){
                colaA.adicionar(maxColaB);
            }else{
                colaA.adicionar(valorEliminado);
            }
        }
        for(int i=1; i <= nroElemColaB; i++){
            valorEliminado = colaB.eliminar();
            if (valorEliminado == maxColaB){
                colaB.adicionar(maxColaA);
            }else{
                colaB.adicionar(valorEliminado);
            }
        }
        colaA.mostrar();
        colaB.mostrar();
    }
}



