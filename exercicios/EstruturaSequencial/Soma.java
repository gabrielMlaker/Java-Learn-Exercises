import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, b;

        System.out.println("Informe um número:");
        a = ler.nextInt();

        System.out.println("Informe outro número:");
        b = ler.nextInt();
        
        int soma = a + b;

        System.out.printf("A soma dos dois números é: %d + %d = %d \n" , a , b , soma); 
    }
    
}
