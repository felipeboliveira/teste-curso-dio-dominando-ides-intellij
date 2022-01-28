package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor valor: ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        double dividir = dividir(a, b);

        /*Inicialmente projeto feito para testar Debug, todas variaveis inseridas como INT,
        logo após o termino do Debug foi inserido a variavel "DOUBLE" que permite a entrega
        de numeros decimais.
         */

        System.out.println("somar: " + somar);
        System.out.println("subt: " + subtrair);
        System.out.println("mult " + multiplicar);
        System.out.println("div " + dividir);


    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }
}
