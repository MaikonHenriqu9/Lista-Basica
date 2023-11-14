package Exercicios;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        /* Informar um saldo e imprimir o saldo com reajuste de 1%. */
        double salario, percentual_reajuste, reajuste, reajuste_salario;

        Scanner valor = new Scanner(System.in);

        System.out.print("Informe o valor do seu salário: ");
        salario = valor.nextDouble();

        percentual_reajuste = 1.0;
        reajuste = salario * (percentual_reajuste/100);
        reajuste_salario = salario + reajuste;

        System.out.println("Valor do salário reajustado: R$"+ reajuste_salario);

    }
}
