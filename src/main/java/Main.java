import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    var scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro lado:");
        int lado = scanner.nextInt();
        System.out.println("Digite o segundo lado:");
        int lado2 = scanner.nextInt();

        var result = lado * lado2;

        System.out.printf("O tamanho da area é de %s", result);


    }
}