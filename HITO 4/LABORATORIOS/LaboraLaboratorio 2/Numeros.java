package Manejo_de_Colas.Manejo_de_Numeros;

public class Numeros {
    private int max;
    private int ini;
    private int fin;
    private int cNum[];

    public Numeros(int max){
        this.max = max;
        this.cNum = new int[this.max + 1];
        this.fin = 0;
        this.ini = 0;
    }

    public boolean esVacia(){
        if (ini == 0 && fin == 0)
            return true;
        return false;

    }

    public boolean esLlenar(){
        if (fin == max)
            return true;
        return false;
    }

    public int nroElem(){
        return fin - ini;
    }

    public void adicionar(int elemento){
        if (esLlenar() == false){
            fin++;
            cNum[fin] = elemento;
        } else{
            System.out.println("Cola de Numeros Llena");
        }
    }

    public int eliminar(){
        int elementoEliminado = 0;

        if (esVacia() == false){
            ini++;
            elementoEliminado = cNum[ini];
            if (ini == fin ){
                ini = 0;
                fin = 0;
            }
        } else {
            System.out.println("Cola Vacia!!!");
        }
        return elementoEliminado;
    }

    public void mostrar(){
        if (esVacia()){
            System.out.println("Cola Vacia , no hay elementos que mostrar");
        } else {
            int elementoEliminado = 0;
            System.out.println("Mostrando datos de la Cola");
            Numeros aux = new Numeros(max);

            while (esVacia() == false){
                elementoEliminado = eliminar();
                System.out.println("Valor = " + elementoEliminado);
                aux.adicionar(elementoEliminado);
            }
            vaciar(aux);
        }
    }

    public void vaciar(Numeros aux){
        while (aux.esVacia() == false)
            adicionar(aux.eliminar());
    }
}