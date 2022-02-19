import java.util.Scanner;
/****************************************************************
* Tabuleiro de damas = 64 casas
* Primeiro quadrado = 1 grão (1200)
* Quadrados subsequentes o dobro do anterior
* O programa recebe o número de quadrados a serem usados
* Apresenta a quatidade de kg de trigo correspondente
* A cada 12 graos corresponde a uma grama
* O cálculo deverá caber em um valor inteiro de 64 bits sem sinal
*****************************************************************/
public class desafio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();//numero de quadrados a serem usados
		
		for(int i=0 ; i<n ; i++) {
			int x = sc.nextInt();
			System.out.println(((long) Math.pow(2, x - 2)) / 3000 + " kg");   //Complete o código aqui.
      }
    sc.close();
  }
}