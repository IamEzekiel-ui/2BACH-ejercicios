import java.util.Scanner;

public class Java7 {

    static void main(){
        Scanner teclado = new Scanner(System.in);

       System.out.println( "¿Tienes tomate?");
       String a = teclado.next();

       System.out.println( "¿Tienes aceite?");
       String b = teclado.next();

       System.out.println( "¿Tienes jamón?");
       String c = teclado.next();

       if((a.equals("no")) || (b.equals("no")) || (c.equals("no"))){
           System.out.println(" ve a comprar "); }
       else{
           System.out.println(" no es necesario ir a comprar ");
       }


    }
}