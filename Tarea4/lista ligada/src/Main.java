import java.util.List;

public class Main {
    public static void main(String[] args) {

        Smartphone telefono1 = new Smartphone("iPhone 4", "IOS");
        Smartphone telefono2 = new Smartphone("Samsung Galaxy s24", "android");
        Smartphone telefono3 = new Smartphone("motorola razr 40", "android");
        Smartphone telefono4 = new Smartphone("iPhone 13" , "IOS");
        Smartphone telefono5 = new Smartphone("xiaomi 13T", "android");
        ListaLigada ll = new ListaLigada<>();
        ll.agregarAlFinal(telefono1);
        ll.agregarAlFinal(telefono2);
        ll.agregarAlFinal(telefono3);
        ll.agregarAlFinal(telefono4);
        ll.agregarAlFinal(telefono5);
        ll.transversal();
        ll.eliminar(2);
        ll.transversal();
        ll.actualizar(telefono3,new Smartphone("iPhone4s", "IOS"));
        ll.agregarAlInicio(new Smartphone("lumia", "Windows Phone"));
        ll.agregarAlFinal(new Smartphone("Honor 200","android"));
        ll.transversal();
        ll.eliminarElPrimero();
        ll.transversal();
    }
}