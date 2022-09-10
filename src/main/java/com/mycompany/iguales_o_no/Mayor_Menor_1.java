
package com.mycompany.iguales_o_no;

import java.util.Scanner;


public class Mayor_Menor_1 {
     public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        
            System.out.println("INGRESE EL PRIMER NUMERO");
            int num = mm.nextInt();
            
            System.out.println("INGRESE EL SEGUNDO NUMERO");
            int num2 = mm.nextInt();
            
                if(num>num2){
                    System.out.println(num+" y "+num2);
                }
                else{
                    System.out.println(num2+" y "+num);
                }
    }
}
