import java.util.Scanner;

public class Ejerciciodelratón {

    static void main(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("¡Bienvenido al ratón juguetón!");
        System.out.println("Introduce tu altura en cm: ");

        int altura = teclado.nextInt();
        System.out.println("Leyendo altura...");

        if(altura < 140) {
            int alturaquefalta = 140 - altura;
            System.out.println("LO SIENTO, NO PUEDES MONTAR EN LA ATRACCIÓN, TE FALTAN " + alturaquefalta + " cm");}
        else {
            if(altura >= 230) {
                System.out.println("ERROR DE LECTURA, BAJA DE LA BÁSCULA Y VUELVE A SUBIR...");
            }else{
                System.out.println("Ahora introduce tu peso en kg: ");
            }
            int peso = teclado.nextInt();
            System.out.println("Leyendo peso...");

            int pesomínimo = altura * 2/8;
            System.out.println("PESO MÍNIMO CALCULADO: " + pesomínimo + " KG");
            if(peso <= (altura * 2/8)){
            System.out.println("LO SIENTO, ESTÁS POR DEBAJO DE TU PESO MÍNIMO, NO PUEDES SUBIR, TE FALTAN " + (pesomínimo - peso) + " KG");}
            else {
                if(peso > 120) {
                System.out.println("LO SIENTO, SOBREPASAS " + (peso - 120) + " KG EL PESO DE LA ATRACCIÓN");
                }else {
                    System.out.println("Pesas " + peso + " KG y mides " + altura + " cm " + ". ¡SUBE A LA ATRACCIÓN!");}



            }


        }
    }
}