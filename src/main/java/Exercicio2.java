/**
 * Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:
 *
 * Se for menor ou igual a 18,5 "Abaixo do peso";
 * se for entre 18,6 e 24,9 "Peso ideal";
 * Se for entre 25,0 e 29,9 "Levemente acima do peso";
 * Se for entre 30,0 e 34,9 "Obesidade Grau I";
 * Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
 * Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
 */


import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Digite aqui sua altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.println("Digite aqui seu peso (em kg): ");
        double peso = scanner.nextDouble();

        double resultado = peso / (altura * altura);

        String imc = (resultado <= 18.5) ? "Abaixo do peso" :
                (resultado <= 24.9) ? "Peso ideal" :
                        (resultado <= 29.9) ? "Sobrepeso" :
                                (resultado <= 34.9) ? "Obesidade grau 1" :
                                        (resultado <= 39.9) ? "Obesidade grau 2" :
                                                "Obesidade grau 3";

        System.out.println("Seu IMC é: " + resultado);
        System.out.println("Classificação: " + imc);

        scanner.close();
    }
}