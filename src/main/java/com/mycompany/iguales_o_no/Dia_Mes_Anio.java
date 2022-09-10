
package com.mycompany.iguales_o_no;

import java.util.Scanner;


public class Dia_Mes_Anio {
    public static void main(String[] args) {
        Scanner dma = new Scanner(System.in);
        
        int dia, mes, anio;
            System.out.println("INGRESE EL MES: \n");
            mes = dma.nextInt();
           
           if(mes>=1 && mes<=12){
               if(mes ==2){         //INICIO MES FEBRERO
                    System.out.println("INGRESE EL DIA: \n");
                    dia = dma.nextInt();
                   if(dia>=1 && dia <=28){
                       
                       System.out.println("INGRESE EL AÑO: \n");
                       anio = dma.nextInt();
                       if(anio>=1000 && anio<=2050){
                           System.out.println("LA FECHA INGRESADA ES: \n"+dia+" - "+mes+" - "+anio);
                       }
                       else{
                           System.out.println("EL AÑO NO ES VALIDO.");
                       }
                   }
                   else{
                       System.out.println("EL DIA NO ES VALIDO.");
                   }
               }                //FIN MES FEBRERO
               else{            //INICIO 31 DIAS
                   System.out.println("INGRESE EL DIA: \n");
                   dia = dma.nextInt();
                   
                    if(dia>=1 && dia<=31){      //INICIO IF DIA
                       System.out.println("INGRESE EL AÑO: \n");
                       anio = dma.nextInt();
                       if(anio>=1000 && anio<=2050){        //INICIO IF AÑO
                           System.out.println("LA FECHA INGRESADA ES: \n"+dia+" - "+mes+" - "+anio);
                       }
                       else{                                //INCIIO ELSE AÑO
                           System.out.println("EL AÑO NO ES VALIDO.");
                       }
                   }                            //FIN IF DIA
                    else{                       //INICIO ELSE DIA
                        System.out.println("EL DIA NO ES VALIDO.");
                    }
               }
           }
            
            
            } 
}

            