import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner lerMedia = new Scanner (System.in);
        
        double media, nota1, nota2, nota3, nota4;
        
        System.out.println("Nota do primeiro bimestre:");
        nota1 = lerMedia.nextDouble();
        
        System.out.println("Nota do segundo bimestre:");
        nota2 = lerMedia.nextDouble();
        
        System.out.println("Nota do terceiro bimestre:");
        nota3 = lerMedia.nextDouble();
        
        System.out.println("Nota do quarto bimestre:");
        nota4 = lerMedia.nextDouble();
        
        media = (nota1 + nota2 + nota3 + nota4)/4;
        
        System.out.println("Sua média anual é: " + media);

    }
    
}
