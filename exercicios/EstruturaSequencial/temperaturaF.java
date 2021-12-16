import java.util.Scanner;

/**
 * 10 - Faça um Programa que peça a temperatura em graus Celsius, 
 * transforme e mostre em graus Fahrenheit.
 * ( °F − 32) × 5/9 = °C
 * ( °C × 9/5) + 32 = °F
 * C = 5 * ((F-32) / 9)
 */

public class temperaturaF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float C, F;

        System.out.println("Informe a temperatura em Celsius: ");
        C = input.nextFloat();

        F = 32 + ( C * 9/5);

        System.out.println("A temperatura em graus Fahrenheit é: " + F);
        
    }
}
