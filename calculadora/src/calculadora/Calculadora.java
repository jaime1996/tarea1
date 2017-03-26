
package calculadora;



public class Calculadora {
    float n1;
    float n2;
    float sumar(){
        return n1+n2;
    }
    
    float restar(){
        
    return n1-n2;
    
    }
    
    float multiplicar(){
       
    return n1*n2;
    
    }
    
    float dividir(){
        
    return n1/n2;
    
    }
    
    public void mostrar1(){
        System.out.println("la suma es "+ sumar());
        System.out.println("la resta es "+ restar());
        System.out.println("la multiplicacion es "+ multiplicar());
        System.out.println("la division es "+ dividir());
    }
    
    public void setn1(float newn1){
        n1=newn1;
    }
    
    public void setn2(float newn2){
         n2=newn2;
    }
    
    public float getn1(){
    return this.n1;
    }
    
    public float getn2(){
    return this.n2;
    }
    
   
   
   
}

