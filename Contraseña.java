/**
 * La clase contraseña verificará si una contraseña introducida es correcta
 * @author José Antonio Diego Revilla
 * @version 1.1
 */
import java.util.*; //Importación de la librería util para ponder usar Scanner
public class Contraseña //Creación de la clase
{
    //Creación de una constante tipo String la cual será la contraseña
    private static String CONTRA = "Hola123";
    
    /**
     * Metodo para evaluar si una contraseña introducida es correcta o no
     */
    public static void contraseña(){ //Se abre el método
        int contador= 0; //Declaración de un contador de intentos fallidos
        Scanner s = new Scanner(System.in); //Declaración de un Scanner para leer el teclado
        
        //While que entra mientras el contador sea menor igual a 3
        while(contador <= 3){ 
        String j = s.next(); //Variable String que guarda lo que el Scanner leyó del teclado
        
        if(CONTRA.equals(j)){ //Compara si el String introducido es igual a la contraseña
            System.out.println( "La contraseña es correcta"); //Si es igual, imprime una respuesta
            return; //Return para romper el metodo
        }else System.out.println( "La contraseña es incorrecta");//Si el String no es igual, imprime una respuesta
        
        contador++; //Aumento en el contador de fallos
        if(contador == 3){ //Evalúa si el contador de fallos es igual a 3
            System.out.println("DEMASIADOS INTENTOS");//Si el contador es igual a 3, imrpime una respuesta
            return;//Return para romper el método
        }//Cierre del if
    }//Cierre del while
       
    }//Cierre del método
    
    public static void main(String [] args){ //Main que ejecuta una prueba del método
        contraseña(); //Lllamada al método contraseña()
    }//Cierre del main

}//Cierre de la clase
