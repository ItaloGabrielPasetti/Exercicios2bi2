package br.com.ItaloGabrielPasetti.Exercicios2bi;

import java.util.Scanner;

public class Exercicio01
{
    public static String gerarLinha (char simbolo, int tamanho)
    {
        String linha = "";

        for (int i = 0; i < tamanho; i++)
        {
            linha += simbolo;
        }
        return linha;
    }
    public static void desenharTriangulo(int altura)
    {
        for (int i = 1; i <= altura; i++)
        {
            System.out.println(gerarLinha('*', i));
        }
    }
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);

        int[] altura = new int[3];

        for (int i = 0; i < 3; i++)
        {
            System.out.println("qual a altura do triangulo " + (i + 1) + ":");
            altura[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++)
        {
            desenharTriangulo(altura[i]);
            if (i < 2)
            {
                System.out.println();
            }
        }
    }
}

