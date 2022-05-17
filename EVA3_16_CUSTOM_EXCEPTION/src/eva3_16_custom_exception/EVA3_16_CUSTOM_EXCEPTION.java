/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_16_custom_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author emiliomurillo
 */
public class EVA3_16_CUSTOM_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ExcepcionDeCaptura {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Captura la edad");
        int valor = 0;
        try{
            valor = sc.nextInt();
        }catch(InputMismatchException ex){
            throw new ExcepcionDeCaptura("Introdujiste una cadena de texto, no es un número válido.");
        }
        
    }
    
}

//Excepción personalizada
//Heredar de Exception
class ExcepcionDeCaptura extends Exception{

    public ExcepcionDeCaptura() {
    }

    public ExcepcionDeCaptura(String message) {
        super(message);
    }
    
}