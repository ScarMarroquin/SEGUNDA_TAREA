
package com.mycompany.iguales_o_no;

import java.util.Scanner;


public class Mayor_Menor_2 {
    public static void main(String[] args) {
        Scanner mm2 = new Scanner(System.in);
        
            System.out.println("INGRESE EL PRIMER NUMERO:");
            int num1 = mm2.nextInt();
            
            System.out.println("INGERSE EL SEGUNDO NUMERO:");
            int num2 = mm2.nextInt();
            
            System.out.println("INGRESE EL TERCER NUMERO:");
            int num3 = mm2.nextInt();
            
            if((num1>num2)&&(num2>num3)){
                System.out.println("ORDEN: "+num1+" - "+num2+" - "+num3);
            }
            else if((num1>num3)&&(num3>num2))
            {
                System.out.println("ORDEN: "+num1+" - "+num3+" - "+num2);
            }
            else if((num2>num1)&&(num1>num3))
            {
                System.out.println("ORDEN: "+num2+" - "+num1+" - "+num3);
            }
            else if((num2>num3)&&(num3>num1))
            {
                System.out.println("ORDEN: "+num2+" - "+num3+" - "+num1);
            }
            else if((num3>num1)&&(num1>num2))
            {
                System.out.println("ORDEN: "+num3+" - "+num1+" - "+num2);
            }
            else
            {
                System.out.println("ORDEN: "+num3+" - "+num2+" - "+num1);
            }
            
    }
}
