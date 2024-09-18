public class ProbarQueue {
    public static void main(String[] args) {
        ColaADT farmacia = new ColaADT<>();
        farmacia.encolar(new Paciente("Eli",26,"oftalmologo"));
        farmacia.encolar(new Paciente("Diana",19,"psiquiatra"));
        farmacia.encolar(new Paciente("Amy",19,"endocrinologo"));
        System.out.println(farmacia.toString());
        System.out.println(farmacia.frente());
        farmacia.desEncolar();
        System.out.println(farmacia.toString());
        farmacia.encolar(new Paciente("Ariel",19,"psicologo"));
        farmacia.encolar(new Paciente("Ander",23,"medico general"));
        farmacia.desEncolar();
        System.out.println(farmacia.toString());
    }
}
