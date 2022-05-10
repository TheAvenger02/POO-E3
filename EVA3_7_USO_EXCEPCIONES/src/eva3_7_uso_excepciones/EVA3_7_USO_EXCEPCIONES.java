    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_7_uso_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author emiliomurillo
 */
public class EVA3_7_USO_EXCEPCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
        boolean datoErroneo = true; //El usuario siempre se equivoca
     do{
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese su edad (número entero): ");
            int iEdad = sc.nextInt();
            System.out.println("Su edad es: " + iEdad);
            datoErroneo = false;
        }catch(InputMismatchException i){
            System.out.println(" El dato introducido no es un número válido");
        }
     }while(datoErroneo);
    }   
}