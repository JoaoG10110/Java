import java.util.Scanner;
public class ExemploIF2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = entrada.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = entrada.nextInt();
        System.out.println("Digite outro número: ");
        int num3 = entrada.nextInt();
        
        if(num1>num2){
            if(num1>num3){
                System.out.println("o maior é "+num1);
            }
            else{
                System.out.println("o maior eh "+num3);
            }
        }
        else{
            if(num2>num3){
                System.out.println("o maior eh "+num2);
            }
            else{
                System.out.println("o maior eh "+num3);
            }
        }
    }
}
