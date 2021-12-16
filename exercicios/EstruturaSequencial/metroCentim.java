import java.util.Scanner;

public class metroCentim {
    public static void main(String[] args) {
        Scanner lerNum = new Scanner(System.in);
        double metro, centimetro;

        System.out.println("Informe o metro: ");
        metro = lerNum.nextDouble();

        centimetro = metro * 100;
        System.out.println("Em centimetros é: " + centimetro);
    }
}
