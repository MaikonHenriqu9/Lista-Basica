package Exercicios;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        /*
            Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
            mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
            (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.
        */

        int idade, meses, dias, dias_total;

        Scanner numero = new Scanner(System.in);

        System.out.print("Informe a sua idade: ");
        idade = numero.nextInt();
        System.out.print("Informe sua idade em meses: ");
        meses = numero.nextInt();
        System.out.print("Informe sua idade em dias: ");
        dias = numero.nextInt();

        dias_total = (idade * 365) + (meses * 30) + dias;

        System.out.println("Sua idade em dias é  "+ dias_total);

    }
}
