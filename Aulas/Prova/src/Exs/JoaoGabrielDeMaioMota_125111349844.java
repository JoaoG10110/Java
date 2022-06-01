package Exs;
import java.util.Scanner;
public class JoaoGabrielDeMaioMota_125111349844 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean teste = false;
        int numCadastrados [] = {72, 13, 33, 85, 97, 63, 60, 45};
        
        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        for (int i = 0; i<numCadastrados.length; i++){
            if(num == numCadastrados[i]){
                teste = true;
                break;
            }
        }
        if(teste == true){
            System.out.println("O número "+ num+" ESTÁ cadastrado.");
        }else{
            System.out.println("O número "+ num+" NÃO está cadastrado.");
        }
        sc.close();
    }
    
}