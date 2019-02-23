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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int dia = 0, mes = 0, anio = 0;
        System.out.println("INGRSE EL DIA:.");
        dia = Integer.valueOf(entrada.next());
        System.out.println("INGRESE EL MES.");
        mes = Integer.valueOf(entrada.next());
        System.out.println("INGRESE EL AÑO:.");
        anio = Integer.valueOf(entrada.next());
        
        if(anio > 0){
            if(mes > 0 && mes < 13){
                if(dia > 0 && dia < 30){
                    System.out.println("La fecha:."+dia+"-"+mes+"-"+anio+" es correcta");
                }else{
                    System.out.println("El dia es incorrecto");
                }
            }else{
                    System.out.println("El mes es incorrecto");
                }
        }else{
            System.out.println("El año es incorrecto:.");
        }
    }
    
}
