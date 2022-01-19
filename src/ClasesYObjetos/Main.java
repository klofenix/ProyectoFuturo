
package ClasesYObjetos;

/**
 *
 * @author klofenix
 */
public class Main {
    public static void main(String args[]){
        
       
        String name = args[0];
        String x = (args[1]);
        String y = (args[2]);
        
        System.out.println("El estudiante "+ name+" : ");
        System.out.println(Estudiante.veredicto(x,y));
        
        
        
    }
    
}
