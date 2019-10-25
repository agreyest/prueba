package tarea6_alessandroreyes_11911224;

public class Persona {
    private int id;
    private String nombre;
    
    public Persona(){
        super();
    }

    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
}
