package aplicacion_2;
import java.util.Scanner;
public class sad {
    
    public static void hola(){
        
        System.out.println("hola mundo");
    }
    public static void fer(){
        String v1, v2;
    int i=-3;
    byte b=5;
    float f=1e-10f;
    double d=3.14;
    boolean b1= i>b;
    boolean b2= i<b;
    boolean b3= b<=f;
    boolean b4= f>=d;
    boolean b5= d!=0;
    boolean b6= 1==f;

    System.out.println("b1:"+i+">"+i+"="+b1);
    System.out.println("b2:"+i+">"+i+"="+b2);
    System.out.println("b3:"+b+">"+i+"="+b3);
    System.out.println("b4:"+f+">"+i+"="+b4);
    System.out.println("b5:"+i+">"+i+"="+b5);
    System.out.println("b6:"+i+">"+i+"="+b6);
    v1 = "a";
    v2 = "b";
    boolean v3 = v1!=v2;
    System.out.println("v1 es mayor que v2: "+ v3);
    }
    
    public static void promedio(){
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese nota 1: ");
        int n1=leer.nextInt();
        if (n1<0 | n1>20)
            System.out.println("ingrese nota de 0 a 20: ");
            n1=leer.nextInt();
            
        System.out.println("Ingrese nota 2: ");        
        int n2=leer.nextInt();
            if (n2<0 | n2>20)
            System.out.println("ingrese nota de 0 a 20: ");
            n2=leer.nextInt();
            
        System.out.println("Ingrese nota 3: ");
        int n3=leer.nextInt();
        if (n3<0 | n3>20)
            System.out.println("ingrese nota de 0 a 20: ");
            n3=leer.nextInt();
            
        int promedio = (n1+n2+n3)/3;
        System.out.println("Promedio: "+promedio);
        if (promedio>=10.5)
            System.out.println("Aprobado");
        else
            System.out.println("Desaprobado");
        
    }
    
    public static void operadores(){
        int numero ;
        Object o;
        char f='A';
        numero =(int)f;
        o = (Object)f;
        System.out.println(" numero: " + numero + " o= " + o + " f= " + f);
        System.out.println("promedio="+Math.round((10+17+19)/3));
        //Redondea a dos decimales
        System.out.println(String.format("%10.3f",3.1415926));
        System.out.println("raiz cuadrada="+Math.sqrt(2));
        System.out.println("raiz cuadrada="+Math.min(15,3));
        System.out.println("raiz cuadrada="+Math.max(10.56,66.37));
    }
    
}
