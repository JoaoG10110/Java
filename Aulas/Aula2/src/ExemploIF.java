import java.util.Scanner;
public class ExemploIF {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        /*
            INT = nextInt();
            FLOAT = nextFloat();
            DOUBLE = nextDouble();
            BOOLEAN = nextBoolean();
            STRING = nextLine();
            CHAR = next.charAt(0);
        */
        System.out.println("Digite um número: ");
        int num1 = entrada.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = entrada.nextInt();
        
        if(num1==num2)
            System.out.println("os numeros são iguais!!");
        else{
            if(num1>num2){
                System.out.println(num1+" eh maior que "+num2);
            }
            else{
                System.out.println(num2+" eh maior que "+num1);
            }
        }
    }
    
}
