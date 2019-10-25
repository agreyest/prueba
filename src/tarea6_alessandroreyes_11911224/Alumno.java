package tarea6_alessandroreyes_11911224;

public class Alumno extends Persona{
    private int cuenta;
    private String Carrera;
    
    public Alumno() {
        super();
    }
    
    public Alumno(int cuenta, String Carrera) {
        this.cuenta = cuenta;
        this.Carrera = Carrera;
    }

    public Alumno(int cuenta, String Carrera, int id, String nombre) {
        super(id, nombre);
        this.cuenta = cuenta;
        this.Carrera = Carrera;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    @Override
    public String toString() {
        return super.toString()+"Alumno{" + "cuenta=" + cuenta + ", Carrera=" + Carrera + '}';
    }
    
}
