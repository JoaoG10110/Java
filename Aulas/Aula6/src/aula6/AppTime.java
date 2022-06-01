package aula6;
import java.util.Scanner;
public class AppTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor da hora: ");
        int hora = in.nextInt();
        System.out.println("Digite o valor do minuto: ");
        int minuto = in.nextInt();
        System.out.println("Digite o valor do segundo: ");
        int segundo = in.nextInt();
        
        Time evento = new Time(hora, minuto, segundo);
        
        System.out.println("HORA UNIVERSAL: "+evento.visualizarHoraUniversal());
        System.out.println("HORA AM PM: "+evento.visualizarHoraAmPm());
    }
    
}
