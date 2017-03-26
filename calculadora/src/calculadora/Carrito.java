
 
package calculadora;

import java.util.Scanner;


public class Carrito {
   Calculadora objeto1=new Calculadora();
   int[] precios={0,1,2,3,4};
   int[]cant=new int[5];
   int[]resultado=new int[5];
   public void agregarcantidad(){
      
       Scanner leer= new Scanner(System.in);
       int x=0;
       int cantidad;
       int posicionproducto;
       
        
        
        
        for(int i=0;i<cant.length;i++){
          System.out.println("Seleccione producto");
          posicionproducto=leer.nextInt();
        
          System.out.println("Seleccione cantidad del producto");
          cantidad=leer.nextInt();  
          
          
          cant[i]=cantidad;
                    
           
        }
            
            
            
               
        
       }
       
       
        
   public int calculartotal(){
       
        int acumulador=0;
        int suma=0;
        
            
              for(int j=0;j<cant.length;j++){
                
                resultado[j]=precios[j]*cant[j];
                acumulador=resultado[j]+acumulador;
                
                
                
                
                
                
          
          
          
            }
      
        
   return acumulador;     
   } 
 
   }
   
   
        
       
           
   
   
   
   
    
      
      
      
      
      
       
   
  
  
   

