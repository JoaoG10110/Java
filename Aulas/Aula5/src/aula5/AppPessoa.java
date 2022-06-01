package aula5;
import java.util.Scanner;
public class AppPessoa {
    public static void main(String args[]){
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome: ");
        p1.nome = sc.next();
        System.out.println("digite a idade: ");
        p1.idade = sc.nextInt();
        System.out.println("digite seu sexo: ");
        p1.sexo = sc.next().charAt(0);
        
        p2.nome = "maria";
        p2.idade = 20;
        p2.sexo = 'f';
        
        p1.imprimir();
        p2.imprimir();
        
    }
}
