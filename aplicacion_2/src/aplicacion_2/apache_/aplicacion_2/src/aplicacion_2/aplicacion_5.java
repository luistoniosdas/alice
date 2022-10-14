package aplicacion_2;
import java.util.Scanner;
public class aplicacion_5 {
    
    public static void ejercicio_15_instruccion_repetitiva(){
    Scanner in = new Scanner(System.in);
        System.out.println("ingrese numero");
    int num = in.nextInt();
    for(int i=1;i<=num;i++){
        System.out.println("Numero: "+i);
}
        System.out.println("numeros pares");
        for(int i=0;i<=num;i=i+2){
        System.out.println("Numero: "+i);
}
    }
    
}
