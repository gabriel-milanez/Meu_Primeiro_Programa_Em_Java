import java.util.Scanner;

public class aula1 {
    
    public static void main(String[] args) {

        System.out.println("___Olá, seja bem vindo___");
        System.out.println("           Banco         ");
        System.out.println("Digite 1 para sacar");
        System.out.println("Digite 2 para depositar");
        System.out.println("Digite 3 para ver o estrato");
        System.out.println("Digite 4 para sair");

        Scanner banco = new Scanner(System.in);
        System.out.println("Qual opção você deseja usar?");
        int opcao = banco.nextInt();

        double conta = 2000.00;

        if (opcao == 1){
            System.out.println("Quanto você deseja sacar?");
            double saque = banco.nextDouble();
            double operacao = conta - saque;
            System.out.println("Saldo atual: " + operacao);
        }else if (opcao == 2){
            System.out.println("Quanto você deseja depositar?");
            double deposito = banco.nextDouble();
            double operacao = conta + deposito;
            System.out.println("Saldo atual: " + operacao);
        }else if (opcao == 3){
            System.out.println("Seu estrato atual é: " + conta);
        }else if (opcao == 4){
            System.out.println("Obrigado pela preferência, volte sempre.");
        }

    }
}
