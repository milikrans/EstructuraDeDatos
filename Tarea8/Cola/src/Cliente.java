public class Cliente {
    private String nombre;
    //private int prioridad;
    private int balance;

    public Cliente(){
        this.nombre = null;
        //this.prioridad = 0;
        this.balance = 0;
    }

    public Cliente (String nombre, int balance){
        this.nombre = nombre;
        //this.prioridad = prioridad;
        this.balance = balance;
    }

    public String getNombre() {
        return nombre;
    }

    public int getBalance() {
        return balance;
    }
    /*
        public int getPrioridad() {
            return prioridad;
        }
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    /*
        public void setPrioridad(int prioridad) {
            this.prioridad = prioridad;
        }
    */
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                //", prioridad=" + prioridad +
                ", balance=" + balance +
                '}';
    }
}
