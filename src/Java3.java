import java.util.Scanner;

public class Java3 {

    static void main(){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número");
        //
        double n1 = teclado.nextFloat();

        if (n1 > 0){
        System.out.println(" Es positivo ");
        }else {
            if (n1 < 0)
            System.out.println( " Es negativo");
            else
                System.out.println (" Es neutral");

            }}


    }

