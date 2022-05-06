/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_3_division_cero;

import java.util.Scanner;

/**
 *
 * @author emiliomurillo
 */
public class EVA3_3_DIVISION_CERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero 1: ");
        int iEntero = sc.nextInt();
        
        System.out.println("Ingresa un número entero 2: ");
        int iEntero2 = sc.nextInt();
        
        System.out.println("División: " + (iEntero/iEntero2));
    }
    
    
}
