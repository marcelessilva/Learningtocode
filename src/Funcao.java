import java.text.NumberFormat;

import static util.Util.formatCurrency;

public class Funcao {


    public static void main(String[] args) {

        //System.out.println(sum(2, 8));
        //printHelloWorld();
        //defineNumberPositiveNegative(10);
        //defineNumberPositiveNegative(-25);
        //defineNumberPositiveNegative(0);

        calcularValorIR(4000);

    }


    static float sum(float celula1, float celula2) {
        float resultado = celula1 + celula2;
        return resultado;
    }


    static void printHelloWorld() {
        System.out.println("Hello World");
    }

    static void defineNumberPositiveNegative(int numero) {
        if (numero > 0) {
            System.out.println("O Número " + numero + " é positivo");
        } else if (numero == 0) {
            System.out.println("O Número é neutro");
        } else {
            System.out.println("O Número " + numero + " é negativo");
        }

    }


    static void calcularValorIR(float salario) {

        float aliquota = 0;
        float deducao = 0;

        if (salario <= 1903.98) {
            System.out.println("Não haverá descontos referente ao IR no seu salário.");
            return;
        } else if (salario >= 1903.99 && salario <= 2826.65) {
            aliquota = 7.5f;
            deducao = 142.80f;

        } else if (salario >= 2826.66 && salario <= 3751.05) {
            aliquota = 15f;
            deducao = 354.80f;

        } else if (salario >= 3751.06 && salario <= 4664.68) {
            aliquota = 22.5f;
            deducao = 636.13f;
        } else {
            aliquota = 27.5f;
            deducao = 869.36f;
        }
        float valorDescontado = salario * aliquota / 100 - deducao;
        float salarioLiquido = salario - valorDescontado;
        System.out.println("Alíquota: " + aliquota + "%");
        System.out.println("Valor Descontado: " + formatCurrency(valorDescontado));
        System.out.println("Salário Líquido " + formatCurrency(salarioLiquido));

    }
}
