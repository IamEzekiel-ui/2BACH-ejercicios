import java.util.Scanner;

public class Java2 {

    static void main(){

        Scanner teclado = new Scanner(System.in);

        System.out.println(" Introduzaca las horas: ");
        int horas = teclado.nextInt();

        System.out.println(" Introduzaca la tarifa por hora: ");
        int tarifa = teclado.nextInt();

        // variable resultado
        System.out.println(" Salario: " + (horas * tarifa));

        //variable resultado
        if (horas > 40){
        int resultado = horas * tarifa * 3/2;
        System.out.println(" El resultado es: " + resultado);}
        else{
            int resultado = horas * tarifa;
                System.out.println(" El resultado es: " + resultado);
            }

} }
