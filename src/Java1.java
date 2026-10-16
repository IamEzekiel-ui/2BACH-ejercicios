import java.util.Scanner;

public class Java1 {

static void main(){

    Scanner teclado = new Scanner(System.in);

    System.out.println(" Introduzaca las horas: ");
    int horas = teclado.nextInt();

    System.out.println(" Introduzaca la tarifa por hora: ");
    int tarifa = teclado.nextInt();

    // variable resultado
    System.out.println(" Salario: " + (horas * tarifa));

    //variable resultado
    int resultado = horas * tarifa;
    System.out.println(" El resultado es: " + resultado);}
}
