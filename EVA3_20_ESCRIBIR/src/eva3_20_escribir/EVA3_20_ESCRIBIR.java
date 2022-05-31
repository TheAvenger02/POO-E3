/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_20_escribir;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emiliomurillo
 */
public class EVA3_20_ESCRIBIR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Definir la ruta 
        Path ruta = Paths.get("/Users/emiliomurillo/Documents/Archivos/archivo2.txt");
        //-> Abrimos el archivo
        OutputStream abrirArch; //Ouput -> Escribir
        //-> Escribimos el archivo
        OutputStreamWriter escribirArch;
        //-> Escribimos el texto
        BufferedWriter escribirTexto;
        
        try {
            abrirArch = Files.newOutputStream(ruta);
            escribirArch = new OutputStreamWriter(abrirArch);
            escribirTexto = new BufferedWriter(escribirArch);
            escribirTexto.write("Hola mundo!!");
            escribirTexto.newLine();
            escribirTexto.write("Escribiendo mi primer archivo");
            escribirTexto.flush(); //flush -> Hace los cambios permanantes
            escribirTexto.close(); // Siempre hay que cerrar el Stream
            
        } catch (IOException ex) {
            Logger.getLogger(EVA3_20_ESCRIBIR.class.getName()).log(Level.SEVERE, null, ex);
            //ex.printStackTrace();
        }
    }
    
}
