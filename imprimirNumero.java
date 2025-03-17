import java.util.Scanner;
public class imprimirNumero {
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero = scanner.nextInt();
        scanner.close();
        System.out.println("O número digitado é: " + numero);
    }
    
}
