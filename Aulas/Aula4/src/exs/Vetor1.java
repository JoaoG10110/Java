package exs;
import java.util.Scanner;
public class Vetor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double notas[] = new double[5];
        
        for(int i=0; i<notas.length; i++){
            System.out.println("Digite a nota: ");
            notas [i] = sc.nextDouble();
        }
        
        for(int i=0; i<notas.length; i++){
            System.out.println("A nota "+ (i+1)+" é: "+ notas[i]);
        }
        
    }
    
}
