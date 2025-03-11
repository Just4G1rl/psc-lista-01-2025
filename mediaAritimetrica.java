import java.util.Scanner;

public class mediaAritimetrica {
   public static void main (String[] args){
    double notaUm, notaDois, media;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a primeira nota: ");
    notaUm = scanner.nextDouble();
    System.out.println("Digite a segunda nota: ");
    notaDois = scanner.nextDouble();

    scanner.close();

    media = (notaUm + notaDois) / 2;
    System.out.printf("A média das notas é: %.2f\n", media);

    if(media >= 7){
        System.out.printf("O aluno está APROVADO");
    }else{
        System.out.printf("O aluno está REPROVADO");

    }

   } 
}   