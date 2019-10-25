package tarea6_alessandroreyes_11911224;

public class Maestro extends Persona{
    private int Codigo;
    private String Facultad;

    public Maestro() {
        super();
    }

    public Maestro(int codigo, String facultad) {
        this.Codigo = codigo;
        this.Facultad = facultad;
    }
    public Maestro(int Codigo, String Facultad, int id, String nombre) {
        super(id, nombre);
        this.Codigo = Codigo;
        this.Facultad = Facultad;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getFacultad() {
        return Facultad;
    }

    public void setFacultad(String Facultad) {
        this.Facultad = Facultad;
    }

    @Override
    public String toString() {
        return super.toString()+"Maestro{" + "Codigo=" + Codigo + ", Facultad=" + Facultad + '}';
    }
    
    
}
