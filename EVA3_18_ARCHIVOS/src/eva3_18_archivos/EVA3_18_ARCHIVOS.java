/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_18_archivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author emiliomurillo
 */
public class EVA3_18_ARCHIVOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            try {
            //RUTA:
            //FileInputStream
            FileInputStream archivo = new FileInputStream("/Users/emiliomurillo/Documents/Archivos/archivo1.txt");
            //Leer todo el archivo:
            int caracter = archivo.read();
            while(caracter != -1){
                System.out.print((char)caracter);
                caracter = archivo.read();
            }
        } catch (FileNotFoundException ex){
                ex.printStackTrace();
        } catch (IOException ex){
                ex.printStackTrace();
        }
    }
}
//Stream -> Flujo de bytes (texto, binarios)