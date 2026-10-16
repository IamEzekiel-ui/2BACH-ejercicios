import java.util.Scanner;

 public class A {

   static void main(){

       Scanner teclado = new Scanner(System.in);


    System.out.println("¿Cómo te llamas?");
    String name = teclado.next();

       teclado.nextLine();

    System.out.println("¿A qué curso vas?");
    String curso = teclado.nextLine();

    System.out.println("Hola " + name + ", bienvenido a " + curso);

    System.out.println(" inserta un número... ");
    int num1 = teclado.nextInt();
    System.out.println(" inserta un número... ");
    int num2 = teclado.nextInt();

    //variable resultado
    System.out.println(" El resultado es: " + (num1+num2));

    //variable resultado
       int resultado = num1+num2;
       System.out.println(" El resultado es: " + resultado);

   }
 }
