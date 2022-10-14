package textos;
public class texto {
    public static void red(){

    String texto = "Hola";
    String texto2 = "tony";
    String texto3= "";
    texto3= " como estas " . concat ( texto2 );
    System.out.println("texto3: "+texto3);
        System.out.println("nro de letras texto1:" + texto.length());
        System.out.println("saca 5 letras: " + texto3.substring(5,10));
        System.out.println("saca 5 letras: " + texto3.toUpperCase());
        String texto4="este es un texto\n muy largo de unas varias\n lineas de texto";
            System.out.println(texto4);
        String s1="abc";
        String s2="ABC";
        //compareTO compara en codigo ASCII
        System.out.println(s1.compareTo(s2));
        //equals comapara los 2 textos
        System.out.println(s1.equals(s2));   
        String correo="12345@gmail.com.pe";
        String nombres= "pepe maloso";
        //busca la posicion de un caracter
        System.out.println("posicion: "+correo.indexOf("@"));
        System.out.println("nombre: "+nombres.substring(0,nombres.indexOf(" ")));        
    }
    
}
