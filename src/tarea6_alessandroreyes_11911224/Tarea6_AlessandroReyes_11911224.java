package tarea6_alessandroreyes_11911224;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Tarea6_AlessandroReyes_11911224 {

    public static void main(String[] args) {
        ArrayList<Persona> lista = new ArrayList();
        char resp = 's';
        while (resp == 's') {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(""
                    
                    
                    + "0- Agregar administrativo"
                    + "\n1- Agregar Alumno"
                    + "\n2- Agregar Maestro"
                    + "\n3- Modificar Carrera de algun alumno"
                    + "\n4- Modificar la facultad de algun maestro"
                    + "\n5- Modificar el sueldo de algun administrativo"
                    + "\n6- Listar el personal administrativo"
                    + "\n7- Eliminar algun alumno"
                    + "\n8- salir"));
            switch (opcion) {
                case 0:
                    String nombre = JOptionPane.showInputDialog("Nombre del personal administrativo");
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de " + nombre));
                    String puesto = JOptionPane.showInputDialog("Cual es el puesto de " + nombre);
                    int sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sueldo de " + nombre));
                    PersonalAdmi pa = new PersonalAdmi(sueldo, puesto, id, nombre);
                    lista.add(pa);
                    break;
                case 1:
                    nombre = JOptionPane.showInputDialog("Nombre del estudiante");
                    id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de " + nombre));
                    String carrera = JOptionPane.showInputDialog("Cual es la carrera de " + nombre);
                    int cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cuenta de " + nombre));
                    Alumno A = new Alumno(cuenta, carrera, id, nombre);
                    lista.add(A);
                    break;
                case 2:
                    nombre = JOptionPane.showInputDialog("Nombre del maestro");
                    id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de " + nombre));
                    String facultad = JOptionPane.showInputDialog("A que facultad pertenece " + nombre);
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de " + nombre));
                    Maestro M = new Maestro(codigo, facultad, id, nombre);
                    lista.add(M);
                    break;
                case 3:
                    int pos = Integer.parseInt(JOptionPane.showInputDialog("Posicion del Alumno a modificar: "));
                    if (pos > lista.size() - 1) {
                        JOptionPane.showMessageDialog(null, "posicion incorrecta");
                    } else {
                        if (lista.get(pos) instanceof Alumno) {
                            carrera = JOptionPane.showInputDialog("Cual es la nueva carrera");
                            ((Alumno) lista.get(pos)).setCarrera(carrera);
                        } else {
                            JOptionPane.showMessageDialog(null, "EL seleccionado no es un Alumno");
                        }
                    }
                    break;
                case 4:
                    pos = Integer.parseInt(JOptionPane.showInputDialog("Posicion del Maestro a modificar: "));
                    if (pos > lista.size() - 1) {
                        JOptionPane.showMessageDialog(null, "posicion incorrecta");
                    } else {
                        if (lista.get(pos) instanceof Maestro) {
                            facultad = JOptionPane.showInputDialog("Cual es su nueva facultad ");
                            ((Maestro) lista.get(pos)).setFacultad(facultad);
                        } else {
                            JOptionPane.showMessageDialog(null, "EL seleccionado no es un Maestro");
                        }
                    }
                    break;
                case 5:
                    pos = Integer.parseInt(JOptionPane.showInputDialog("Posicion del personal admin a modificar: "));
                    if (pos > lista.size() - 1) {
                        JOptionPane.showMessageDialog(null, "posicion incorrecta");
                    } else {
                        if (lista.get(pos) instanceof PersonalAdmi) {
                            sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo sueldo"));
                            ((PersonalAdmi) lista.get(pos)).setSueldo(sueldo);
                        } else {
                            JOptionPane.showMessageDialog(null, "EL seleccionado no es del personal admin");
                        }
                    }
                    break;
                case 6:
                    String salida = " ";
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i) instanceof PersonalAdmi) {
                            salida += "" + lista.indexOf(i) + ") " + i + "\n";
                        }

                        JOptionPane.showMessageDialog(null, salida);
                    }

                    break;
                case 7:
                    pos = Integer.parseInt(JOptionPane.showInputDialog("Posicion del Alumno a modificar: "));
                    if (pos > lista.size() - 1) {
                        JOptionPane.showMessageDialog(null, "posicion incorrecta");
                    } else {
                        if (lista.get(pos) instanceof Alumno) {
                            lista.remove(pos);
                            JOptionPane.showMessageDialog(null, "ELIMINADO");
                        } else {
                            JOptionPane.showMessageDialog(null, "EL seleccionado no es un Alumno");
                        }
                    }
                    break;
                case 8:
                    resp = 'n';
                    break;
                default:
            }
        }
    }//fin del main

}//Fin del public
