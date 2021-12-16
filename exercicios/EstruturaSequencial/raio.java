import java.util.Scanner;

public class raio {
    public static void main(String[] args) {
        
        Double r, A;
        
        Scanner lerRaio  = new Scanner(System.in);
        
        System.out.println("Digite o Raio do circulo: ");
        r = lerRaio.nextDouble();
        
        A = 3.14 * Math.pow(r, 2); 
        System.out.println("A area do circulo é: " + A);


    }
}
