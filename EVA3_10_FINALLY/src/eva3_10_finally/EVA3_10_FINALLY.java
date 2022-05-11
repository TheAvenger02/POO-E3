/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_10_finally;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author emiliomurillo
 */
public class EVA3_10_FINALLY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce un dato entero: ");
            int valor = sc.nextInt();
            System.out.println("El valor es: + " + valor);
        }catch(InputMismatchException i){
            i.printStackTrace();
        }finally{
        System.out.println("ESTA LÍNEA SIEMPRE DEBE EJECUTARSE");
        }
        System.out.println("FIN DEL PROGRAMA");
    }
    
}
/*try{

}catch(){ //se pueden o no ejecutar (dependen de una excepción)

}catch(){

}...múltiples bloque catch
finally{ //siempre se ejecuta

}
*/