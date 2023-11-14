package Exercicios;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){
        /* Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
            antecessor e seu sucessor. */

        int num, antecessor, sucessor;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um valor inteiro: ");
        num = scanner.nextInt();

        antecessor = num - 1;
        sucessor = num + 1;

        System.out.print("Valor informado: "+ num);
        System.out.print("\nSeu antecessor é: "+ antecessor);
        System.out.println("\nSeu sucessor é: "+ sucessor);
    }
}
