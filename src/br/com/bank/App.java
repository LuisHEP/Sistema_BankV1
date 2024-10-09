package br.com.bank;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account("0001","1234", "Luis");

        while(true) {
            System.out.println("O que deseja fazer? D = Deposito, S = Saque, E = Sair da conta");
            String op = scanner.nextLine();
            if (op.equals("D")) {
                System.out.println("Qual valor deseja depositar?");
                double value = scanner.nextDouble();
                account.deposit(value);
            } else if (op.equals("S")) {
                System.out.println("Qual o valor deseja sacar?");
                double value = scanner.nextDouble();
                if (!account.withDraw(value)) {
                    System.out.println("Ops! Não foi possível sacar o valor de R$ " + value);
                }
            } else if (op.equals("E")) {
                break;
            } else {
                System.out.println("Comando inválido, tente novamente!");
            }

            scanner = new Scanner(System.in);
        }
    }
}
