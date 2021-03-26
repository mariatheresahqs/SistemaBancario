package util;

import java.util.Scanner;

import entities.*;

public class Menu {
    Scanner sc = new Scanner(System.in);
    Conta conta;
    String nome, escolhaConta, nConta;
    double valor;
    Opcoes[] opcoes = Opcoes.values();

    Opcoes opcao = Opcoes.ABRIR; // Inicializando opcoes de menu
    
    public void mostrarMenu(){
        // do {
            System.out.println("Bem vindo a aplicação bancária \"Aqui Você Paga Mais\"");
            Opcoes.mostrarOpcoes();
        
        do{    
            System.out.print("Qual a operação que você deseja fazer:");
            int tmp = sc.nextInt();

            while (tmp < 1 || tmp > 5){
                System.out.print("Digite a operação que você deseja fazer: ");
                Opcoes.mostrarOpcoes();
                tmp = sc.nextInt();
            }
            opcao = opcoes[tmp-1];

            switch (opcao) {
                case ABRIR:
                    sc.nextLine();
                    System.out.println("Abrir conta com déposito inicial(Sim/Nao):");
                    escolhaConta = sc.nextLine();
                    System.out.print("Insira o nome do cliente: ");
                    nome  = sc.nextLine();
                    System.out.print("Insira o número da conta: ");
                    nConta = sc.nextLine();
                    if(escolhaConta.equals("Sim")){
                        System.out.print("Insira o deposito inicial: ");
                        valor = sc.nextDouble();
                        conta = new Conta(nConta, nome, valor);
                    }else{
                        conta = new Conta(nConta, nome);
                    }
                    break;
                case DEPOSITAR:
                    System.out.print("Digite o valor que deseja depositar: ");
                    valor = sc.nextDouble();
                    conta.depositar(valor);
                    break;
                case SACAR:
                    System.out.print("Digite o valor que deseja sacar: ");
                    valor = sc.nextDouble();
                    conta.sacar(valor);
                    break;
                case CONSULTAR:
                    System.out.println(conta.toString());
                    sc.nextLine();
                    System.out.println("Deseja alterar o nome do titular (Sim/Nao):");
                    escolhaConta = sc.nextLine();
                    if(escolhaConta.equals("Sim")){
                        System.out.print("Insira o novo nome: ");
                        nome  = sc.nextLine();
                        conta.setNome(nome);
                    }
                    break;
                case ENCERRAR:
                    System.out.println("\n\"Aqui Você Paga Mais\" agradece sua confiança!\nVolte Sempre!");
                    break;
            }
            System.out.println();
            // Opcoes para clientes já cadastrados
            if(tmp!=5){
                System.out.println(conta.toString());
                Opcoes.opcoesCliente();
            }
        } while (opcao != Opcoes.ENCERRAR);

    }
}
