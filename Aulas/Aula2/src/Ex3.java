import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float acumulador = 0;
        int i;
        
        for(i=0; i<5; i++){
            System.out.println("Digite a nota:");
            acumulador += entrada.nextFloat();
        }
        System.out.println("O valor total das notas é: "+ acumulador);
        System.out.println("A média das notas é: "+ acumulador/i);
    }
    
}
