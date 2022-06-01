/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_22_serializable_arreglos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author emiliomurillo
 */
public class EVA3_22_SERIALIZABLE_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Persona> miListaPerso = new ArrayList(); //Mecanismo para almacenar información del mismo tipo, Collections <Tipos de datos genéricos>
        miListaPerso.add(new Persona("Emilio","Murillo"));
        miListaPerso.add(new Persona("Mayela","Murillo"));
        miListaPerso.add(new Persona("Rodolfo","Murillo"));
        escribirObj(miListaPerso);
        leerObj();
    }
    //Guardar objetos
    public static void escribirObj(Object obj){
        try {
            FileOutputStream abrirArch = new FileOutputStream("/Users/emiliomurillo/Documents/Archivos/archivo4.obj");
            ObjectOutputStream guardarObj = new ObjectOutputStream(abrirArch);
            guardarObj.writeObject(obj);
            guardarObj.flush();
            guardarObj.close();
        } catch (FileNotFoundException ex) {
                ex.printStackTrace();
        } catch (IOException ex) {
                ex.printStackTrace();
        }
    }
    //Leer objetos
    public static void leerObj(){
        try {
            FileInputStream abrirArch = new FileInputStream("/Users/emiliomurillo/Documents/Archivos/archivo4.obj");
            ObjectInputStream leerObj = new ObjectInputStream(abrirArch);
            ArrayList<Persona> miListaPerso = (ArrayList<Persona>)leerObj.readObject(); //Object (Class Object)
            for(int i = 0; i < miListaPerso.size(); i++){
                Persona persona = miListaPerso.get(i);
                System.out.println("Nombre: " + persona.getNombre() + " " + persona.getApellido());
            }
            leerObj.close();
        } catch (FileNotFoundException ex) {
                ex.printStackTrace();
        } catch (IOException ex) {
                ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
        }
    }  
}

class Persona implements Serializable{
    private String nombre;
    private String apellido;

    public Persona() {
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    } 
}
//Serializable -> Mandar información bit x bit