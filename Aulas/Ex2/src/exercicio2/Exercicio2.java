package exercicio2;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        
        System.out.println("Digite as duas notas: ");
        double n1 = entrada.nextDouble();
        double n2 = entrada.nextDouble();
        
        double media = (n1+n2)/2;
        
        System.out.println("Prezado " + nome + " sua média é: " + media);
        entrada.close();
    }
    
}
