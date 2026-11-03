import java.util.Scanner;

public class Practica3 {

     static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Introduce el multiplicando (3 cifras): ");
        int numero = in.nextInt();

        System.out.print("Introduce el multiplicador (3 cifras): ");
        int numero2 = in.nextInt();
        if (numero > 99 && numero < 1000 && numero2 > 99 && numero2 < 1000){

            String numint = Integer.toString(numero2);

            String c1 = numint.substring(0, 1);
            String c2 = numint.substring(1, 2);
            String c3 = numint.substring(2, 3);

            int n_c1 = Integer.parseInt(c1);
            int n_c2 = Integer.parseInt(c2);
            int n_c3 = Integer.parseInt(c3);

            System.out.println("El producto de la multiplicación es: " + numero * numero2);
            System.out.println("El proceso es:");
            System.out.println("   " + numero);
            System.out.println("x  " + numero2);
            System.out.println("-------");
            System.out.println("   " + numero * n_c3);
            System.out.println("  " + numero * n_c2 + "x");
            System.out.println(" " + numero * n_c1 + "xx");
            System.out.println("-------");
            System.out.println("   " + numero * numero2);
        }
        else {
            System.out.println(" Alguno de los números no tiene 3 cifras");
        }
}}