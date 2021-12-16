import java.util.Scanner;

/**
*8-Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas 
*no mês. 
*Calcule e mostre o total do seu salário no referido mês.
*/

public class salario {
  public static void main(String[] args) {

    double salarioHora, totalHora, totalMes;

    Scanner input = new Scanner(System.in);

    System.out.println("Informe o quanto ganha por hora: ");
    salarioHora = input.nextDouble();

    System.out.println("Informe o número de horas trabalhadas no mês: ");
    totalHora = input.nextDouble();
    
    totalMes = salarioHora * totalHora;

    System.out.println("O total referente ao mês é: " + totalMes);
      
  }  
}
