public class ProbarQueue {
    public static void main(String[] args) {
        ColaConPrioridadAcotada banco = new ColaConPrioridadAcotada<Cliente>(5);
        banco.encolar(4, new Cliente("Amy",11000));
        banco.encolar(4, new Cliente("Diana", 2000));
        banco.encolar(5, new Cliente("Michelle", 0) );
        banco.encolar(5, new Cliente("Luna", 0) );
        banco.encolar(5, new Cliente("Lilith", 0) );
        banco.encolar(1, new Cliente("Eris", 1000000));
        System.out.println(banco.toString());
        Cliente temp = (Cliente) banco.frente(1);
        temp.setBalance(temp.getBalance()-10000);
        System.out.println(banco.frente(1));
        banco.encolar(3, new Cliente("Any", 100000));
        banco.encolar(2, new Cliente("Eli", 100000));
        banco.desEncolar(2);
        System.out.println(banco.toString());
        System.out.println(banco.longitud());
        int aux = banco.longitud();
        for (int i = 0; i < aux; i++) {
            for (int j = 0; j < banco.getMaxPrioridad() + 1; j++) {
                banco.desEncolar(j);
            }
        }
        System.out.println(banco.toString());
    }
}