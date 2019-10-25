package tarea6_alessandroreyes_11911224;

public class PersonalAdmi extends Persona{
    private String Puesto;
    private int Sueldo;
    
    public PersonalAdmi(){
        super();
    }

    public PersonalAdmi(String Puesto, int sueldo) {
        this.Puesto = Puesto;
        this.Sueldo = sueldo;
    }
    public PersonalAdmi(int Sueldo, String Puesto, int id, String nombre) {
        super(id, nombre);
        this.Sueldo = Sueldo;
        this.Puesto = Puesto;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    public int getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int Sueldo) {
        this.Sueldo = Sueldo;
    }

    @Override
    public String toString() {
        return super.toString()+"PersonalAdmi{" + "Puesto=" + Puesto + ", Sueldo=" + Sueldo + '}';
    }
    
}
