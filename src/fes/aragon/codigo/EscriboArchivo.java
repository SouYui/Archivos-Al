/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sou Akiyama
 */
public class EscriboArchivo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fo = null;
        try {
            File archivo = new File(System.getProperty("user.dir") + "/archivo");
            fo = new FileOutputStream(archivo, true);
            ObjectOutput ou = new ObjectOutputStream(fo);
            
            ou.writeObject(new Alumno("Lucinda Elaene", "Suárez", "Pérez", "316317911", 29));
            ou.writeObject(new Alumno("Marco", "Marínez", "Mercader", "315316318", 20));
            ou.writeObject(new Alumno("Lucinda", "Marínez", "Pérez", "316318988", 28));
            ou.writeObject(new Alumno("Elaene", "Suárez", "Sánches", "989898316", 27));
            ou.close();
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fo.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
