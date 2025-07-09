/*
Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão, números menores que o primeiro número devem ser ignorados
 */


import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número inicial: ");
        int n1 = scanner.nextInt();

        while (true) {
            System.out.print("Digite outro número: ");
            int n2 = scanner.nextInt();

            // Ignorar números menores que n1
            if (n2 < n1) {
                System.out.println("Número ignorado (menor que o número inicial).");
                continue;
            }

            // Verifica se o número não é múltiplo de n1
            if (n2 % n1 != 0) {
                System.out.println("Número inválido: " + n2 + " não é múltiplo de " + n1);
                System.out.println("Encerrando o programa.");
                break;
            }

            // Mostra o número válido
            System.out.println("Número válido: " + n2);
        }

        scanner.close();
    }
}
