package Exs;
import java.util.Scanner;
public class NewClass1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Insira o tempo maior em segundos: ");
        int m = sc.nextInt();
        System.out.println("Insira o tempo menor em segundos: ");
        int n = sc.nextInt();
        int mmc;
        if(n<m){
            mmc = m;
        }else{
            mmc = n;
            n = m;
            m = mmc;
        }
        while(mmc % n != 0){
            mmc = mmc + m;
        }
        System.out.println("O tempo mínimo para eles se encontrarem é de "+ mmc+" segundos.");
    }
}
