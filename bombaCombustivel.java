import java.util.Scanner;
public class bombaCombustivel {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double litrosVendidos, valorDoLitro, valorComprado;
    System.out.println("Digite a quantidade de litros de gasolina solicitado: ");
    litrosVendidos = scanner.nextDouble();
    System.out.println("Digite o valor do litro de gasolina: ");
    valorDoLitro = scanner.nextDouble();
    scanner.close();
    valorComprado = litrosVendidos * valorDoLitro;
    System.out.printf("O valor a ser pago é %.2f", valorComprado);

}
    
}
