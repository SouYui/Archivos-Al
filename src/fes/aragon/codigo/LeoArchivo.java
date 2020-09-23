/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sou Akiyama
 */
public class LeoArchivo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fi = null;
        try {
            File archivo = new File(System.getProperty("user.dir") + "/archivo");
            fi = new FileInputStream(archivo);
            ObjectInputStream oi = new ObjectInputStream(fi);
            Alumno ob = null;
            
            do {                
                ob = (Alumno) oi.readObject();
                System.out.println(ob.toString());
            } while (true);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fi.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
