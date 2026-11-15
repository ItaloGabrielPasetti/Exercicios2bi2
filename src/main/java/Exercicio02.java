package br.com.ItaloGabrielPasetti.Exercicios2bi;

    import java.util.Scanner;

    public class Exercicio02
    {

        public static double calculaIMC (double peso, double altura)
        {
            return peso / (altura * altura);
        }
        public static String classeIMC(double imc)
        {
            if (imc < 18.5)
            {
                return "abaixo do peso!";
            }
            else if (imc < 25)
            {
                return "peso normal!";
            }
            else if (imc < 30)
            {
                return "acima do peso";
            }
            else
            {
                return "OBESO";
            }
        }
        public static void relatorio(double[] peso, double[] altura)
        {
            for (int i = 0; i < 4; i++)
            {
                double imc = calculaIMC(peso[i], altura[i]);
                System.out.printf("Pessoa %d: IMC %.2f - %s%n", (i + 1), imc, classeIMC(imc));
            }
        }
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);

            double[] peso = new double[4];
            double[] altura = new double[4];

            for (int i = 0; i < 4; i++)
            {
                System.out.println("Diga o peso " + (i + 1) + ":");
                peso[i] = sc.nextDouble();

                System.out.println("Diga a altura " + (i + 1) + ":");
                altura[i] = sc.nextDouble();
            }
            relatorio(peso, altura);
        }
    }
