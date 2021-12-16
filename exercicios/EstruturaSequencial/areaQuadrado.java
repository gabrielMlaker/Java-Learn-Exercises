import java.util.Scanner;

/**
 * areaQuadrado
 * Faça um Programa que calcule a área de um quadrado, 
 * em seguida mostre o dobro desta área para o usuário.
 */
public class areaQuadrado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double b, h, A, dobro;

        System.out.println("Informe b: ");
        b = input.nextDouble();

        System.out.println("Informe h: ");
        h = input.nextDouble();
        
        A = b * h;

        System.out.println("A área é: " + A);
        
        dobro = A * 2;

        System.out.println("O dobro da área é: " + dobro);

    }
}