
package calculadora;


public class TestPGA {
    
    public static void main(String[] args) {
        MaquinaPGA alumno= new MaquinaPGA();
        alumno.ingresodatos();
        System.out.println("Su pga es "+alumno.calcularPGA());
        

    
    }
    
    
}
