
package Exs;
import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int comp1, comp2, voltas = 0;
        int comp1G = 0, comp2G = 1;

        System.out.println("Tempo 1: ");
        comp1 = entrada.nextInt();

        System.out.println("Tempo 2: ");
        comp2 = entrada.nextInt();

        while (comp1G != comp2G) {
            //Método para zerar a comp2G
            if (voltas == 0) {
                comp2G = 0;
            }

            //Método inicial para lancar o primeiro valor nas variaveis temporárias
            if (comp1G == 0 && comp2G == 0) {
                comp1G = comp1 + comp1G;

                comp2G = comp2 + comp2G;
            }

            if (comp1G > comp2G) {
                comp2G = comp2 + comp2G;
            } else if (comp1G == comp2G) {
                break;
            } else {
                comp1G = comp1 + comp1G;
            }

            voltas++;
        }

        System.out.println("O tempo necessário é " + comp1G + " segundos");

    }

}
}
