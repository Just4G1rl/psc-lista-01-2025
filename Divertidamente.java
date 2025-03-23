import java.util.Scanner;
public class Divertidamente {
    public static void main(String[] args) {
    Scanner scr = new Scanner(System.in);
    int quantAmigos, exerciciosResolvidos, pontosAlegria, pontosTristeza;
    double notaA1, notaA2, notaA3, mediaProvas;
    pontosAlegria = 0;
    pontosTristeza = 0;    

    System.out.println("Informe a quantidade de amigos que Rilley fez na nova cidade: ");
    quantAmigos = scr.nextInt();
    if(quantAmigos > 0){
    pontosAlegria += quantAmigos * 10;
    }else{
        pontosTristeza += 30;
    }

    System.out.println("Informe o valor da nota A1:");
    notaA1 = scr.nextDouble();
    System.out.println("Informe o valor da nota A2:");
    notaA2 = scr.nextDouble();
    System.out.println("Informe o valor da nota A3:");
    notaA3 = scr.nextDouble();
    mediaProvas = (notaA1+notaA2+notaA3)/3;

    if (mediaProvas >= 7) {
        pontosAlegria += 50;
    }else{
        pontosTristeza += 50;
    }

    System.out.println("Quantos exercícios Rilley fez? ");
    exerciciosResolvidos = scr.nextInt();
    if(exerciciosResolvidos == 0){
        pontosTristeza += 10*10;
    } else if (exerciciosResolvidos > 0) {
        pontosAlegria += (exerciciosResolvidos * 10);
        pontosTristeza += ((exerciciosResolvidos-10)*10);
    }

    if(pontosAlegria > pontosTristeza){
        System.out.println("A mudança para a nova cidade foi uma experiência incrível para a Riley.");
    }else{
        System.out.println("A mudança para a nova cidade foi uma experiência desagradável para a Riley.");
    }
    scr.close();

    }
}
