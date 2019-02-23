/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author robin
 */
public class ejercico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int dato = 0;
        String comodin = "";
        String salida = "";
        System.out.print("INGRESE EL NUMERO.");
        dato = Integer.valueOf(entrada.next());
        if(dato >= 0 && dato <=9999){
            int longitud = String.valueOf(dato).length();
            comodin = String.valueOf(dato);
            for(int i = (longitud); i-1 >= 0 ; i--){
                //System.out.println(dato);
                //System.out.print(comodin.subSequence(i-1, i));    
                salida = salida + (comodin.subSequence(i-1, i));
                
            }
            System.out.println(salida);
            
            
        }else{
            System.out.println("solo digitos entre 0 y 9999");
        }
    }
    
}
