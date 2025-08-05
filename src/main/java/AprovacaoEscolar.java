import java.util.Scanner;

public class AprovacaoEscolar {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota do aluno:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota do aluno:");
        double nota2 = scanner.nextDouble();

        double notaFinal = (nota1 + nota2)/2;
        double notaMedia = 7.0;

        System.out.printf("A média do aluno foi de: %s\n", notaFinal);

        if (notaFinal >= notaMedia) {
            System.out.println("Aprovado");
        } else if (notaFinal < notaMedia && notaFinal >= 4) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
