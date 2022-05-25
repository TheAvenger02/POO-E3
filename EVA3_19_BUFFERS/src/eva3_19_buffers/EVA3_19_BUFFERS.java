/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_19_buffers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emiliomurillo
 */
public class EVA3_19_BUFFERS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Definir la ruta 
        Path ruta = Paths.get("/Users/emiliomurillo/Documents/Archivos/archivo1.txt");
        //-> Abrimos el archivo
        InputStream abrirArch; //Ouput -> Escribir
        //-> Leemos el archivo
        InputStreamReader leerArch;
        //-> Convertimos Bytes a Carácteres
        BufferedReader leerTexto;
        
        try {
            abrirArch = Files.newInputStream(ruta); //Abre el archivo
            leerArch = new InputStreamReader(abrirArch); //Lo lee en bytes
            leerTexto = new BufferedReader(leerArch); //Lo lee en texto
            String linea = leerTexto.readLine(); //Lee una línea de texto completa
            while(linea != null){
                System.out.println(linea); //Imprimimos la línea de texto
                linea = leerTexto.readLine(); //Volvemos a leer el archivo
            }
        } catch (IOException ex) {
            Logger.getLogger(EVA3_19_BUFFERS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
//Archivo -> InputStream -> InputStreamReader -> BufferedReader -> Programa
//URL -> Uniform Resource Locator, protocolo:ubicación. https://www.wikipedia.org/ ftp:// tel:contacto
//URI -> Uniform Resource Identifier