package Exs;
import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int volume;
        int totalVolume= 0;
        float preco;
        float totalPreco = 0;
        int i = 1;
        
        while(i != 0){
            System.out.println("Digite o volume: ");
            volume = sc.nextInt();
            totalVolume = totalVolume + volume;
            if(volume == 0){
                break;
            }
            
            System.out.println("Digite o valor do produto: ");
            preco = sc.nextFloat();
            totalPreco = totalPreco + (preco*volume);
        }
        
        System.out.println("Total: " + totalPreco + "\n" + "Quantidade: " + totalVolume);
        
    }
}
