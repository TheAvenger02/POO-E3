/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_6_catch_zero;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author emiliomurillo
 */
public class EVA3_6_CATCH_ZERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero 1: ");
        int iEntero = 0, iEntero2 = 1;
        try{
        iEntero = sc.nextInt();
        
        System.out.println("Ingresa un número entero 2: ");
        iEntero2 = sc.nextInt();
        }catch(InputMismatchException i){
               //i.printStackTrace();
               System.out.println("¡Falló la captura!");
        }
        try{
        System.out.println("La división es: " + (iEntero/iEntero2));
        }catch(ArithmeticException a){
            //a.printStackTrace();
            System.out.println("No se puede dividir entre cero.");
        }    
        System.out.println("Fin del programa.");
    }
}