package Exs;
import java.util.Scanner;
public class JoaoGabrielDeMaioMota_125111349844_ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Insira o maior tempo em segundos: ");
        int tempoM = sc.nextInt();
        System.out.println("Insira o menor tempo em segundos: ");
        int tempoN = sc.nextInt();
        int mmc;
        if(tempoN<tempoM){
            mmc = tempoM;
        }else{
            mmc = tempoN;
            tempoN = tempoM;
            tempoM = mmc;
        }
        while(mmc % tempoN != 0){
            mmc = mmc + tempoM;
        }
        System.out.println("O tempo mínimo para eles se encontrarem é de "+ mmc+" segundos.");

    }
}
