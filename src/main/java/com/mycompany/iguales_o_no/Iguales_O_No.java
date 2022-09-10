

package com.mycompany.iguales_o_no;

import java.util.Scanner;


public class Iguales_O_No {

    public static void main(String[] args) {
        
        
        Scanner num = new Scanner(System.in);
            
        System.out.println("INGRESE EL PRIMER NUMERO");
            int num1 = num.nextInt();
            
        System.out.println("INGRESE EL SEGUNDO NUMERO");
            int num2 = num.nextInt();
            
        if(num1 == num2){
                System.out.println("LOS NUMEROS SON IGUALES");
        }
        else{
            System.out.println("LOS NUMEROS NO SON IGUALES");
        }
                
    }
}
