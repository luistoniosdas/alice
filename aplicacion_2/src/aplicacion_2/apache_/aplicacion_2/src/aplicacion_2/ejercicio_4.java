package aplicacion_2;
import java.util.Scanner;
public class ejercicio_4 {
    public static void ejercicio_6(){
        
    Scanner in = new Scanner(System.in);
    System.out.println("ingresa tu nombre: ");
    String nombre=in.next();
    System.out.println("ingresa tu edad: ");
    String edad=in.next();
    System.out.println(nombre + ", tu edad(entero) : " +edad);
    System.out.println("ingrese nota1:");
    //ingresa valor decimal por teclado en consola
    float nota1= in.nextFloat();
    if(!(nota1>0 && nota1<21)){
        System.out.println("solo valotres de 0 a 20:");
        nota1=in.nextFloat();
    }
    //estructura condicional si 
    if(nota1>=10.5)
        System.out.println("estas aprobado");
    else
        System.out.println("estas desaprobado");
    }
    
    
    public static void ejercicio_7(){
        
    Scanner in = new Scanner(System.in);
    float Respuesta= 0;
    System.out.println("ingresa numero1: ");
    float num1=in.nextInt();
    System.out.println("ingresa numero2: ");
    float num2=in.nextInt();
    System.out.println("ingrese operador +,-,*,/");
    char operador=in.next().charAt(0);
    if(operador=='*')
        Respuesta=num1*num2;
    else if(operador=='/')
        Respuesta=num1/num2;
    else if(operador=='+')
        Respuesta=num1+num2;
    else if(operador=='-')
        Respuesta=num1-num2;
    else
        System.out.println("Operador no valido");
    System.out.println("Respuesta="+Respuesta);
    
            }
    
    public static void ejercicio_8(){
        
     Scanner in = new Scanner(System.in);
    float Respuesta= 0;
    System.out.println("ingresa tu nombre: ");
    String nombre=in.next();
    if(nombre.equals("Elvis"))
    System.out.println("tu nombre es famoso");
    else if(nombre.equals("Michael"))
        System.out.println("Tu nombre es de cantante");
    
    
    }
    public static void ejercicio_8_condicional_switch(){
        
    Scanner in = new Scanner(System.in);
    float Respuesta= 0;
    System.out.println("ingresa numero1: ");
    float num1=in.nextFloat();
    System.out.println("ingresa numero2: ");
    float num2=in.nextFloat();
    System.out.println("ingrese operador +,-,*,/");
    char operador=in.next().charAt(0);
    switch (operador){
        case '+':Respuesta=num1+num2;
            break;
        case '/':Respuesta=num1/num2;
            break;
        case '*':Respuesta=num1*num2;
            break;
        case '-':Respuesta=num1-num2;
        default : System.out.println("Operador no valido");
    
    }
        System.out.println("Respuesta="+Respuesta);
}
    public static void ejercicio_9_ventas(){
        
    Scanner in = new Scanner(System.in);
    float Respuesta= 0;
    System.out.println("ingresa numero de menbresia: ");
    int ventas = in.nextInt();
    
    switch (ventas){
        case 6:System.out.println("gana $1000");
        break;
        case 5:System.out.println("Gana samsung galaxy S12");
        break;
        case 4:System.out.println("Gana Laptop HP core i7");
        break;
        case 3:System.out.println("Gana iPOD");
        break;
        case 2:System.out.println("Gana tablet S7");
        break;
        case 1:System.out.println("Gana lavador");
        break;
    default : System.out.println("no tiene regalo");
    
    }

    }
    
    public static void ejercicio_10if_abreviado(){
    
    Scanner in = new Scanner(System.in);
        System.out.println("ingresa nota1: ");
        int nota1  = in.nextInt();
        String Respuesta = nota1>=10.5? " aprobado": "desaprobado";
        System.out.println("Respuesta: "+ Respuesta);
    }
    
    public static void ejercicio11_while(){
      Scanner in = new Scanner(System.in);
        System.out.println("ingresa nota: ");
        int nota  = in.nextInt();
        while (nota<0 || nota>20){
            System.out.println("solo nota de 0 a 20:");
            nota=in.nextInt();
        }
        String Respuesta = nota>=10.5? " aprobado": "desaprobado";
        System.out.println("Respuesta: "+ Respuesta);
}
    public static void ejercicio_12_(){
        
         Scanner in = new Scanner(System.in);
        System.out.println("ingrese palabra: ");
        String palabra = in.next();
        int Posicion1 =0;
        int PosicionUltima= palabra.length()-1;
        boolean esPalindromo = true;
        while (Posicion1<PosicionUltima){
            if (palabra.charAt(Posicion1)!= palabra.charAt(PosicionUltima))
                esPalindromo = false;
            Posicion1++;
            PosicionUltima--;
        }
        if (esPalindromo)
            System.out.println("Palabra es Palindromo");
        else
            System.out.println("palabra no es palindromo");
        
    }
    
    public static void ejercicion14_(){
    
        Scanner in = new Scanner(System.in);
        int nota=0;
        do{
         do{
         System.out.println("ingresa nota de 0 a 20: ");
         nota = (int) in.nextFloat();
        }while (nota<0 || nota>20);
        String Respuesta = nota>=10.5? " aprobado": "desaprobado";
        System.out.println("Respuesta: "+ Respuesta);
        }while(nota==-1);
        System.out.println("fin del programa");
        }
}
