package Exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        /* Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
            calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
            (1SM=R$788,00)
        */

        double salario_minimo, salario_usuario, quant_salario;
        salario_minimo = 788.00;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do seu salário: R$");
        salario_usuario = scanner.nextDouble();

        quant_salario = salario_usuario / salario_minimo;

        System.out.printf("Quantidade de salários mínimos que você recebe: %.2f", quant_salario);
    }
}
