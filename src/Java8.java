import java.util.Scanner;

public class Java8 {

    static void main(){

        Scanner teclado = new Scanner(System.in);

        System.out.println( "Introduce un lado 1");
        float l1 = teclado.nextFloat();

        System.out.println( "Introduce un lado 2");
        float l2 = teclado.nextFloat();

        System.out.println( "Introduce un lado 3");
        float l3 = teclado.nextFloat();

        if (l1 == l2 & l2 == l3 ){
            System.out.println( " Es equilátero" );}
            else{
                if (l1 == l2 & l2 != l3 || l1 == l3 & l3!= l2)
                    System.out.println( " Es isósceles " );
                else
                    System.out.println( " Es escaleno " );}
        }
        }

