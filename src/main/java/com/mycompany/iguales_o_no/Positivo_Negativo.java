
package com.mycompany.iguales_o_no;

import java.util.Scanner;


public class Positivo_Negativo {
     public static void main(String[] args) {
        Scanner pn = new Scanner(System.in);
        
        System.out.println("INGRESE UN NUMERO");
        int num = pn.nextInt();
        
            if(num>0){
                System.out.println("EL NUMERO INGRESADO ES POSITIVO");
            }
            else
            {
                System.out.println("EL NUMERO INGRESADO ES NEGATIVO");
            }
}
}
