package Exs;
import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num;
        int count = 1;
        int i = 1;
        
        System.out.println("Digite um numero: ");
        num = sc.nextInt();
        
        while( i != 0){
            System.out.println(count);
            count = count * 2;
            if(count >= num){
                break;
            }
            
        }
        
    }
    
}
