import java.util.Random;
import java.util.Scanner;

public class JogoAdvinha {
    // Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numAleatorio = new Random().nextInt(100); 
        int num = 0;
        int tentativa = 1; 
        boolean acertou = false;

        System.out.println(numAleatorio);
        System.out.println("Bem vindo ao jogo de advinhação, pronto para o desafio?\n");

        for (tentativa = 1; tentativa < 5; tentativa++) {
            System.out.println("Digite um número entre 0 e 100");
            num = sc.nextInt();
            
            if (num == numAleatorio) {
                System.out.println("Parabéns! Você acertou o número " + numAleatorio + " na tentativa " + tentativa + "!");
                acertou = true;
                break;
            } else if (num > numAleatorio) {
                    System.out.println("O número é menor");
                } else {
                    System.out.println("O número é maior");
                }
        }
        if (!acertou) {
            System.out.println("Que pena seu burro do k7 voce errou");
        }
    }
}
