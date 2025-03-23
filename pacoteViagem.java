import java.util.Scanner;
public class pacoteViagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantPessoasAlemanha, quantPessoasPortugal, quantPessoasItalia;
        double valorPassagemAlemanha, valorPassagemPortugal, valorPassagemItalia;
        double totalViagemAlemanha, totalViagemPortugal, totalViagemItalia, totalEourotrip;

        System.out.println("Digite o valor da passagem aérea para a Alemanha: ");
        valorPassagemAlemanha = scanner.nextDouble();
        System.out.println("Digite a quantidade de pessoas que viajará para a Alemanha: ");
        quantPessoasAlemanha = scanner.nextInt();
        totalViagemAlemanha = quantPessoasAlemanha*valorPassagemAlemanha;

        System.out.println("Digite o valor da passagem aérea para Portugal: ");
        valorPassagemPortugal = scanner.nextDouble();
        System.out.println("Digite a quantidade de pessoas que viajará para Portugal: ");
        quantPessoasPortugal = scanner.nextInt();
        totalViagemPortugal = quantPessoasPortugal*valorPassagemPortugal;

        System.out.println("Digite o valor da passagem aérea para Itália: ");
        valorPassagemItalia = scanner.nextDouble();
        System.out.println("Digite a quantidade de pessoas que viajará para Itália: ");
        quantPessoasItalia = scanner.nextInt();
        totalViagemItalia = quantPessoasItalia*valorPassagemItalia;

        scanner.close();

        totalEourotrip = totalViagemAlemanha + totalViagemPortugal + totalViagemItalia;
       

        System.out.printf("O valor total da viagem é R$%.2f", totalEourotrip);
    }    
}
