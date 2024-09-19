import java.util.Arrays;

public class ColaConPrioridadAcotada<E> {
    private ColaADT<E> []colas;
    private int maxPrioridad;

    public int getMaxPrioridad() {
        return maxPrioridad;
    }

    public ColaConPrioridadAcotada(int maxPrioridad) {
        this.maxPrioridad = maxPrioridad;
        this.colas = new ColaADT[maxPrioridad +1];
        for (int i = 0; i < this.maxPrioridad +1; i++) {
            this.colas[i] = new ColaADT<>();
        }
    }

    public int longitud(){
        int total = 0;
        for (int i = 0; i < maxPrioridad+1; i++) {
            total += this.colas[i].longitud();
        }
        return total;
    }

    public boolean estaVacia(){ //
        return this.longitud() == 0;
    }

    public void encolar(int prioridad, E elemento){
        if (prioridad>= 1 && prioridad <= this.maxPrioridad){
            this.colas[prioridad].encolar(elemento);
        }
    }
    public void desEncolar(int prioridad){
        if (this.colas[prioridad].estVacia()){
            System.out.println("No hay mas elementos");
        }else {
            if (prioridad>= 1 && prioridad <= this.maxPrioridad){
                this.colas[prioridad].desEncolar();
            }
        }
    }

    public E frente(int prioridad){
        return this.colas[prioridad].frente();
    }

    @Override
    public String toString() {
        return "ColaConPrioridadAcotada{" +
                "colas=" + Arrays.toString(colas) +
                ", maxPrioridad=" + maxPrioridad +
                '}';
    }
}