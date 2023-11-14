package Exercicios;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        /*
            Escrever um algoritmo que lê:
            - a porcentagem do IPI a ser acrescido no valor das peças
            - o código da peça 1, valor unitário da peça 1, quantidade de peças 1
            - o código da peça 2, valor unitário da peça 2, quantidade de peças 2
            O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
            Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
         */

        double ipi, valor_peca1, valor_peca2, preco_total;
        int cod_peca1, quantidade_peca1, cod_peca2, quantidade_peca2;

        Scanner scanner = new Scanner (System.in);

        System.out.println("======== Loja do seu Zé ========");
        System.out.print("Informe o valor do IPI: ");
        ipi = scanner.nextDouble();

        /* Informações da primeira peça */
        System.out.println("\n======= Primeira peça =======");
        System.out.print("Informe o código da primeira peça: ");
        cod_peca1 = scanner.nextInt();
        System.out.print("Informe o valor unitário da peça: R$");
        valor_peca1 = scanner.nextDouble();
        System.out.print("Informe a quantidade de peças: ");
        quantidade_peca1 = scanner.nextInt();

        /* Informações da segunda peça */
        System.out.println("\n======= Segunda peça =======");
        System.out.print("Informe o código da segunda peça: ");
        cod_peca2 = scanner.nextInt();
        System.out.print("Informe o valor unitário da peça: R$");
        valor_peca2 = scanner.nextDouble();
        System.out.print("Informe a quantidade de peças: ");
        quantidade_peca2 = scanner.nextInt();

        preco_total = ((valor_peca1 * quantidade_peca1) + (valor_peca2 * quantidade_peca2)) * (ipi/100 + 1);

        System.out.printf("\nPreço total a ser pago: R$%.2f", preco_total);
    }
}
