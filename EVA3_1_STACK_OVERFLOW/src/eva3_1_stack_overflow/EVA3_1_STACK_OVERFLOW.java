/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_1_stack_overflow;

/**
 *
 * @author emiliomurillo
 */
public class EVA3_1_STACK_OVERFLOW {

    /**
     * @param args the command line arguments
     */
    public static int c = 0;
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 10;
        terminarStack();
    }
    //Stack es la memoria para variables locales y llamadas a función
    //Stack Overflow -> Desbordamiento de pila (stack)
    //ERROR -> Fatales al programa, generados por el sistema operativo
    //Excepciones: Del programa, desviación del comportamiento normal del programa, controlables.
    public static void terminarStack(){
        c++;
        System.out.println(c);
        terminarStack();
    }
}
