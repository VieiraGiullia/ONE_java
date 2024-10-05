import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String nome = "Alyson Rafael";
        String tipoConta = "Conta Corrente";
        double saldo = 0;
        
        System.out.println("***********************************");
        System.out.println("Nome do cliente: \n" + nome);
        System.out.println("Tipo da conta: \n" + tipoConta);
        System.out.println("Saldo atual da conta: \n" + saldo);
        System.out.println("***********************************\n");

        String menu;

        menu = """
               ***********************************
               Digite uma opção:
               
               1 - consultar saldo  
               2 - depositar
               3 - transferir
               4 - sair
               ***********************************
               """;
        
        System.out.println(menu);
        int opcao = sc.nextInt();

        while (opcao != 4) {
            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual da conta: " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor do depósito: ");
                    double deposito = sc.nextDouble();
                    saldo += deposito;
                    System.out.println("Depósito realizado com sucesso!");
                    break;
                case 3:
                    System.out.println("Digite o valor da transferência: ");
                    double transferencia = sc.nextDouble();
                    if (saldo >= transferencia) {
                        saldo -= transferencia;
                        System.out.println("Transferência realizada com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            System.out.println(menu);
            opcao = sc.nextInt();
        }
        sc.close();
    }
}
