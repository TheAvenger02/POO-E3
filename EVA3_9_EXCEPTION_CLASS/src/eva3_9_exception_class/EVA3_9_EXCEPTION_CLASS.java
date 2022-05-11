/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_9_exception_class;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author emiliomurillo
 */
public class EVA3_9_EXCEPTION_CLASS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    try{ //Aquí va el código que puede fallar
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese un número entero 1: ");    
            int iEntero = sc.nextInt();

            System.out.println("Ingresa un número entero 2: ");
            int iEntero2 = sc.nextInt();
            System.out.println("La división es: " + (iEntero/iEntero2));

        }catch(Exception e){ //Acción remedial
               e.printStackTrace();
        }
        System.out.println("Fin del programa.");
    }
}