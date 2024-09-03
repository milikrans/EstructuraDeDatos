public class Smartphone {
    private String nombre;
    private String sistemaOperativo;
    public Smartphone(){
        this.nombre = null;
        this.sistemaOperativo = null;
    }
    public Smartphone(String nombre, String sistemaOperativo){
        this.nombre = nombre;
        this.sistemaOperativo = sistemaOperativo;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getSistemaOperativo(){
        return this.sistemaOperativo;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setSistemaOperativo(String sistemaOperativo){
        this.sistemaOperativo=sistemaOperativo;
    }
    @Override
    public String toString() {
        return "{" +
                 nombre + '\'' +
                ",SO=" + sistemaOperativo +
                '}';
    }
}