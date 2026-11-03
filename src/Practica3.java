import java.util.Scanner;

public class Practica3 {

     static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Introduce el multiplicando (3 cifras): ");
        int numero = in.nextInt();

        System.out.print("Introduce el multiplicador (3 cifras): ");
        int numero2 = in.nextInt();

        String numint = Integer.toString(numero2);

        String c1 = numint.substring(0, 1);
        String c2 = numint.substring(1, 2);
        String c3 = numint.substring(2, 3);

        int n_c1 = Integer.parseInt(c1);
        int n_c2 = Integer.parseInt(c2);
        int n_c3 = Integer.parseInt(c3);

        int a = numero * n_c3;
        int b = numero * n_c2;
        int c = numero * n_c1;
        int total = numero * numero2;

        System.out.println("El producto de la multiplicación es: " + total);
        System.out.println("El proceso es:");
        System.out.println("   " + numero);
        System.out.println("x  " + numero2);
        System.out.println("-------");
        System.out.println("   " + a);
        System.out.println("  " + b + "x");
        System.out.println(" " + c + "xx");
        System.out.println("-------");
        System.out.println("   " + total);
    }
}