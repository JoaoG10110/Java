package ex3;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int numero = entrada.nextInt();
        
        if(numero > 20){
            double num = numero;
            System.out.println("A metade de " + numero + " é: " + (num/2));
        }
        
    }
    
}
