import java.util.Scanner;
public class calculadora {
    public static void main(String[] args) {
        int numero1, numero2, soma, subtracao, mutiplicacao, divisão;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        numero2 = scanner.nextInt();
        scanner.close();

        soma = numero1+numero2;
        System.out.println(numero1 + " + "+ numero2+ " = " + soma);
        subtracao = numero1-numero2;
        System.out.println(numero1 + " - "+ numero2+ " = " + subtracao);
        mutiplicacao = numero1 * numero2;
        System.out.println(numero1 + " + "+ numero2+ " = " + mutiplicacao);
        divisão = numero1 / numero2;
        System.out.println(numero1 + " / "+ numero2 +" = " + divisão);

    }
}
