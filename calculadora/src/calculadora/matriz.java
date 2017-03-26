
package calculadora;


public class matriz {
    Calculadora objeto1=new Calculadora(); 
    int[][]matriz={{1000,5000,4000,1000,30000},{}};
    
    public void agregarcantidad(int cantidad){
       
       for(int i=1;i<2;i++){
           for(int j=0;j<5;j++){
               
           objeto1.setn1(cantidad);
           matriz[i][j]=objeto1.getn1();
           }
           
           
       }   
    
    }
    
    public int calculartotal(int posicionproducto){
       
       for(int i=0;i<matriz.length;i++){
          
          for(int j=0;j<matriz.length;j++){
          objeto1.setn1(precios[posicionproducto-1]);
          objeto1.setn2(cant[j]);
          objeto1.setn1(objeto1.multiplicar());
          objeto1.setn2(suma);
          objeto1.sumar();
          objeto1.setn1(objeto1.sumar());
         
          
          
          }
           
          
            
            
          
       }
    return objeto1.getn1(); 
   }
}