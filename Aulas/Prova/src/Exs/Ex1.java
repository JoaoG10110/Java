package Exs;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int temp1=0, temp2=1, i = 0;
        System.out.println("Insira o tempo do piloto 1 em segundos: ");
        int tempoPiloto1 = sc.nextInt();
        System.out.println("Insira o tempo do piloto 2 em segundos: ");
        int tempoPiloto2 = sc.nextInt();
        
        while (temp1 != temp2) {
            if (i == 0) {
                temp2 = 0;
            }
            if (temp1 == 0 && temp2 == 0) {
                temp1 = tempoPiloto1 + temp1;
                temp2 = tempoPiloto2 + temp2;
            }
            if (temp1 > temp2) {
                temp2 = tempoPiloto2 + temp2;
            } else if (temp1 == temp2) {
                break;
            } else {
                temp1 = tempoPiloto1 + temp2;
            }
            i++;
        }

        System.out.println("O tempo necessário é " + temp1 + " segundos");

    }
}
