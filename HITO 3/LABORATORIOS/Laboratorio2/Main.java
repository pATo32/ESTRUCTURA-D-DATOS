package Hito3;

public class Main {
    public static void main(String[] args) {
        PilaNumeros pila1 = new PilaNumeros(6);
        pila1.adicionar(4);
        pila1.adicionar(5);
        pila1.adicionar(23);
        pila1.adicionar(7);
        pila1.adicionar(12);
        pila1.adicionar(100);

        pila1.mostrarPilaNumeros();
        determinarNumeroMayor(pila1);
        determinarNumeroMenor(pila1);
        determinarNumeroParoImpar(pila1);
        nuevaPosicion(pila1 , 100);

    }
    //    este metodo permite obtener el mayor de la pila de numeros
    public static void determinarNumeroMayor(PilaNumeros pila) {
        PilaNumeros aux = new PilaNumeros(10);
        int mayor = -1;
        int valorExtraidodelaPila = 0;

        while (pila.esVacio() == false) {
            valorExtraidodelaPila = pila.eliminar();
            if (valorExtraidodelaPila > mayor) {
                mayor = valorExtraidodelaPila;
            }
            aux.adicionar(valorExtraidodelaPila);
        }
        pila.vaciar(aux);

        System.out.println("El numero mayor de la pila es: " + mayor);
    }

    public static void determinarNumeroMenor(PilaNumeros pila){
        PilaNumeros aux = new PilaNumeros(10);
        int menor = 1000;
        int valorExtraidodelaPila= 0;

        while (pila.esVacio() == false){
            valorExtraidodelaPila = pila.eliminar();
            if (valorExtraidodelaPila < menor){
                menor = valorExtraidodelaPila;
            }
            aux.adicionar(valorExtraidodelaPila);
        }
        pila.vaciar(aux);

        System.out.println("El numero menor de la pila es: " + menor);
    }

    public static void determinarNumeroParoImpar(PilaNumeros pila){
        PilaNumeros aux = new PilaNumeros(10);
        int par = 0;
        int impar = 0;
        int valorExtraidodelaPila = 0;

        while (pila.esVacio() == false){
            valorExtraidodelaPila = pila.eliminar();
            if (valorExtraidodelaPila % 2 == 0){
                par = par + 1;
            } else {
                impar = impar +1;
            }
            aux.adicionar(valorExtraidodelaPila);
        }
        pila.vaciar(aux);

        System.out.println("Cantidad Pares: " + par);
        System.out.println("Cantidad Impares: " + impar);
    }

    public static void nuevaPosicion(PilaNumeros pila , int elemento){
        PilaNumeros aux = new PilaNumeros(10);
        int valorExtraidodelaPila = 0;

        while (pila.esVacio() == false){
            valorExtraidodelaPila = pila.eliminar();

            if (valorExtraidodelaPila != elemento){
                aux.adicionar(valorExtraidodelaPila);
            }
        }
        pila.vaciar(aux);
        pila.adicionar(elemento);
        pila.mostrarPilaNumeros();
    }

    public static void nuevoElemento(PilaNumeros pila, int elemento) {
        PilaNumeros aux = new PilaNumeros(10);
        int valorExtraidodelaPila = 0;
        while (pila.esVacio() == false) {
            if (valorExtraidodelaPila != elemento) {
                aux.adicionar(valorExtraidodelaPila);
            }
        }
        pila.vaciar(aux);
        pila.adicionar(elemento);
        pila.mostrarPilaNumeros();
    }
}

