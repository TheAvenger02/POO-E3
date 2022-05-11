/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_12_usar_throw;

import java.util.InputMismatchException;
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
        int iEdad = 0;
        boolean datoErroneo = true; //El usuario siempre se equivoca
        Scanner sc = new Scanner(System.in);

        do{
            try{
                System.out.println("Introduce tu edad (valor entero positivo): ");
                iEdad = sc.nextInt();
                if(iEdad < 0)
                   throw new Exception("El valor " + iEdad + " no es una edad válida");
                System.out.println("Tu edad es: " + iEdad);
                datoErroneo = false;

                }catch(InputMismatchException i){
                    System.out.println("Edad no válida");
                }catch(Exception e){
                    e.printStackTrace();
                }
                
        }while(datoErroneo);
    }
}
