/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_12_usar_throw;

import java.util.Scanner;

/**
 *
 * @author emiliomurillo
 */
public class EVA3_12_USAR_THROW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int iValor = 0;
        try {
            System.out.println("Introduce tu edad (número entero positivo): ");
            iValor = input.nextInt();
            if (iValor < 0)
            throw new Exception("El valor = " + iValor + " no es una edad valida.");       
        } catch (Exception e) {
        e.printStackTrace();
        }
        System.out.println("La edad capturada es: " + iValor);
    }
}