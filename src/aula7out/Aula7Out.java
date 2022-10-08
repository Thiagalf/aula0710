package aula7out;

import java.util.Scanner;

public class Aula7Out {

    static double salarioBruto;
    static int faltas;

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos funcionários trabalham na empresa? ");
        int numFuncionarios = teclado.nextInt();
        double[] p = new double[numFuncionarios];
        int[] f = new int[numFuncionarios];
        double[] salario = new double[numFuncionarios];

        Saudacao();
        //laço for pra ler os salários e armazená-los no vetor p
        for (int i = 0; i < p.length; i++) {
            System.out.print("Digite o salário bruto do funcionário " + (i + 1) + " : ");
            p[i] = salarioBruto = teclado.nextDouble();

        }
        //laço for pra ler as faltas e armazená-las no vetor f
        for (int i = 0; i < f.length; i++) {
            System.out.print("Digite as fatas do funcionário " + (i + 1) + " : ");
            f[i] = faltas = teclado.nextInt();

        }
        System.out.println(" ");
        //laço for pra aplicar o método Calcular() em todos os índices do vetor salario
        for (int i = 0; i < salario.length; i++) {
            salario[i] = Calcular(p[i], f[i]);
            System.out.println("* O salário líquido do funcionário " + (i + 1) + " é: R$" + salario[i]);
            System.out.println(" ");
        }

        Saudacao();
    }

    static double Calcular(double salarioBruto, int faltas) {
        double salarioLiquido = salarioBruto - (salarioBruto / 30 * faltas);
        return salarioLiquido;
    }

    static void Saudacao() {
        System.out.println(" ");
        System.out.println("Programa de calculo do salário líquido");
        System.out.println("Desenvolvido pela turma de TI");
        System.out.println("Disciplina de Fundamentos da Programação");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
    }
}
