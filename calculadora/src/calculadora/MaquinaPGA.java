/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;


public class MaquinaPGA {
Calculadora objeto1=new Calculadora();
float promedios[];
int horas[];

    public void ingresodatos(){
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese el numero de asignaturas cursadas");
        int numero=leer.nextInt();
        promedios=new float[numero];
        horas=new int[numero];        
        
        for(int i=0;i<promedios.length;i++){
            System.out.println("Ingrese promedio de la asigantura "+(i+1));
            promedios[i]=leer.nextFloat();
            System.out.println("Ingrese las horas de la asignatura "+(i+1));
            horas[i]=leer.nextInt();
        }


    }
    
    public float calcularPGA(){
        float totalhoras=0;
        for(int i=0;i<horas.length;i++){
            objeto1.setn1(horas[i]);
            objeto1.setn2(totalhoras);
            objeto1.sumar();
            totalhoras=objeto1.sumar();
            objeto1.setn1(totalhoras);
        }
        float pga=0;
        for(int i=0;i<horas.length;i++){
            objeto1.setn1(horas[i]);
            objeto1.setn2(totalhoras);
            objeto1.dividir();
            
            objeto1.setn1(objeto1.dividir());
            objeto1.setn2(promedios[i]);
            objeto1.multiplicar();
            
            objeto1.setn1(objeto1.multiplicar());
            objeto1.setn2(pga);
            objeto1.sumar();
           
            pga=objeto1.sumar();
            objeto1.setn1(pga);
        }
        
    return objeto1.getn1();
    }
}
