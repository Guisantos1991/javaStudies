import java.util.Scanner;

public class VerificadorNumeros {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();
        if (numero > 0 && numero <= 10 && numero % 2 == 0) {
            System.out.printf("O número: %s, digitado está entre 0 e 10 e é par! ", numero);
        } else if(numero > 10) {
            System.out.println("Número inválido!");
        } else {
            System.out.println("Seu número é ímpar!");

        }

    }
}
