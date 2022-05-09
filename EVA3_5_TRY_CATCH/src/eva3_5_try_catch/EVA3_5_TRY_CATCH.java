/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_5_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author emiliomurillo
 */
public class EVA3_5_TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // EXCEPCIONES --> OBJETOS
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad (número entero): ");
        int iEdad = 0;
        try{
            iEdad = sc.nextInt();
        }catch(InputMismatchException i){
            //i.printStackTrace();
            System.out.println("¡Falló la captura!");
        }
        System.out.println("Su edad es: " + iEdad);
    }
}