
package ClasesYObjetos;

/**
 *
 * @author klofenix
 */
public class Estudiante {
    
    static String veredicto(String valor1, String valor2){
    if (valor1.equals(valor2)){
        return "Bien. Pero una hora para cada módulo puede ser insuficiente";
    } if (Integer.valueOf(valor1)< Integer.valueOf(valor2)){
        return "Poco tiempo de estudio.Debes dedicar más tiempo";
    }
    return "Ideal. Trabajas los contenidos en casa";
    }

   
   

    
    
   
}
