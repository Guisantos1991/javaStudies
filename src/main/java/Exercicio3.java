/*
Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e
escolhe entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial)
no intervalo de números informados, incluindo os números informados e em ordem decrescente;
 */


import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite outro número maior que o anterior: ");
        int n2 = scanner.nextInt();

        // Valida se n2 é maior que n1
        if (n2 <= n1) {
            System.out.println("O segundo número deve ser maior que o primeiro.");
            return;
        }

        System.out.print("Selecione (par ou impar): ");
        String tipo = scanner.next();


        System.out.println("\nNúmeros " + tipo + " no intervalo [" + n1 + ", " + n2 + "] em ordem decrescente:");

        for (int i = n2; i >= n1; i--) {
            if (tipo.equalsIgnoreCase("par") && i % 2 == 0) {
                System.out.print(i + " ");
            } else if (tipo.equalsIgnoreCase("impar") && i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}

