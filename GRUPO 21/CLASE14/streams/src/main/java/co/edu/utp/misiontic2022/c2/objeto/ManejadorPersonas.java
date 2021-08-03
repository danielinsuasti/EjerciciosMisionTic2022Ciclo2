package co.edu.utp.misiontic2022.c2.objeto;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.*;

public class ManejadorPersonas {

    public void guardarPersonas() {
        String nombre = "Objetos.dat";
        try {
            var archivo = new FileOutputStream(nombre);
            var oos = new ObjectOutputStream(archivo);
            oos.writeObject(new Persona("999999", "Arpidio", "Escobar Jaramillo"));
            oos.writeObject(new Persona("552871883", "María", "Ruiz Ramos"));
            oos.writeObject(new Persona("403020104", "Juan", "González López"));
            oos.writeObject(new Persona("55555555", "Luisa", "Arroyave"));
            oos.close();
        } catch (FileNotFoundException e) {
            System.out.println("¡El fichero no existe!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void cargarPersonas() {
        var nombre = "Objetos.dat";
        try {
            var archivo = new FileInputStream(nombre);
            var ois = new ObjectInputStream(archivo);
            var p1 = (Persona) ois.readObject();
            var p2 = (Persona) ois.readObject();
            var p3 = (Persona) ois.readObject();
            var p4 = (Persona) ois.readObject();

            ois.close();
            System.out.println("Apellidos\t DNI\tNombre");
            System.out.println(p1.toString());
            System.out.println(p2.toString());
            System.out.println(p3.toString());
            System.out.println(p4.toString());

            // System.out.println(p1.getAtributos());
            // System.out.println(p2.getAtributos());
            // System.out.println(p3.getAtributos());
            // System.out.println(p4.getAtributos());
        } catch (FileNotFoundException e) {
            System.out.println("¡El fichero no existe!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        ;
    }

}
