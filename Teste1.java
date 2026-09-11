import java.util.Scanner;
import java.util.ArrayList;

public class Teste1 {

    public static void main(String[] args) {
        ArrayList<String> carrinho = new ArrayList<>();
        carrinho.add("Notebook");
        carrinho.add("Mouse");
        carrinho.add("Teclado");
        carrinho.add("Monitor");
        carrinho.add("Caixa de som");
        carrinho.add("Energético");
        carrinho.add("Controle");
        carrinho.add("Mousepad");
        carrinho.add("Placa de video");
        carrinho.add("SSD");

        System.out.println("Bem vindo a loja!");
        System.out.println("O que você deseja fazer?");
        System.out.println("Digite 1 para ver seu carrinho atual");
        System.out.println("Digite 2 para saber quantos produtos você tem em seu carrinho");
        System.out.println("Digite 3 para ver algum produto especifico");

        Scanner compras = new Scanner(System.in);
        System.out.println("Qual opção você deseja usar?");
        int opcao = compras.nextInt();

        if (opcao == 1){
            System.out.println(carrinho);
        }else if (opcao ==2){
            System.out.println("Você tem essa quantidade de items em seu carrinho: " + carrinho.size());
        }else if (opcao == 3){
            System.out.println("Esses são os seus produtos");

            System.out.println("Opção 1");
            System.out.println("Opção 2");
            System.out.println("Opção 3");
            System.out.println("Opção 4");
            System.out.println("Opção 5");
            System.out.println("Opção 6");
            System.out.println("Opção 7");
            System.out.println("Opção 8");
            System.out.println("Opção 9");
            System.out.println("Opção 10");

            Scanner compras = new Scanner(System.in);
            System.out.println("Qual produto você deseja ver?");
            int opcao = compras.nextInt();

            if (opcao == 1){
                System.out.println("Esse é o seu primeiro produto: " + carrinho.get(0));
            }else if (opcao == 2){
                System.out.println("Esse é o seu segundo produto: " + carrinho.get(1));
            }else if (opcao == 3){
                System.out.println("Esse é o seu Terceiro produto: " + carrinho.get(2));
            }else if (opcao == 4){
                System.out.println("Esse é o seu quarto produto: " + carrinho.get(3));
            }else if (opcao == 5){
                System.out.println("Esse é o seu quinto produto: " + carrinho.get(4));
            }else if (opcao == 6){
                System.out.println("Esse é o seu sexto produto: " + carrinho.get(5));
            }else if (opcao == 7){
                System.out.println("Esse é o seu setimo produto: " + carrinho.get(6));
            }else if (opcao == 8){
                System.out.println("Esse é o seu segundo produto: " + carrinho.get(7));
            }else if (opcao == 9){
                System.out.println("Esse é o seu nono produto: " + carrinho.get(8));
            }else if (opcao == 10){
                System.out.println("Esse é o seu decimo produto: " + carrinho.get(9));
            }
        }
    }
}
