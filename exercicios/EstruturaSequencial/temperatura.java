import java.util.Scanner;

/**
 * 9 - Faça um Programa que peça a temperatura em graus Fahrenheit, 
 * transforme e mostre a temperatura em graus Celsius. C = 5 * ((F-32) / 9).
 */

public class temperatura {

    public static void main(String[] args) {
    float C, F;

    Scanner input = new Scanner(System.in);

    System.out.println("Informe a temperatura em Fahrenheit: ");
    F = input.nextFloat();

    C = 5 * ((F-32) / 9);

    System.out.println("A temperatura em graus Celsius é: " + C);
    }
    
}
