import java.util.Scanner;
public class salaCorreta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sala, resposta;
        System.out.println("Escreva qual sua sala");
        sala = scanner.nextLine();
        scanner.close();
        resposta = "307B";
        if (sala.equals(resposta)) {       
            
            System.out.println("Você está no caminho certo!");

        } else {
            System.out.println("Seu caminho está errado!");

        }

    }
}