package aplicacion_2;
import java.util.Scanner;
public class ejercicio_4 {
    public static void ded(){
        
    Scanner in = new Scanner(System.in);
    System.out.println("ingresa tu nombre: ");
    String nombre=in.next();
    System.out.println("ingresa tu edad: ");
    String edad=in.next();
    System.out.println(nombre + ", tu edad(entero) : " +edad);
    System.out.println("ingrese nota1:");
    float nota1= in.nextFloat();
    boolean pregunta = nota1>=10.5;
    if(pregunta)
        System.out.println("estas aprobado");
    else
        System.out.println("estas desaprobado");
    }
    
}
