public class Paciente {
    private String nombre;
    private int edad;
    private String doctor;

    public Paciente(){
        this.doctor = null;
        this.edad = -1;
        this.nombre = null;
    }

    public Paciente(String nombre, int edad, String doctor){
        this.nombre = nombre;
        this.edad = edad;
        this.doctor = doctor;
    }

    public int getEdad() {
        return edad;
    }

    public String getDoctor() {
        return doctor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", doctor='" + doctor + '\'' +
                '}';
    }
}