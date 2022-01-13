import java.text.NumberFormat;

import static util.Util.formatCurrency;

public class Funcao {


    public static void main(String[] args) {

        //System.out.println(sum(2, 8));
        //printHelloWorld();
        //defineNumberPositiveNegative(10);
        //defineNumberPositiveNegative(-25);
        //defineNumberPositiveNegative(0);


        float descontoINSS = calcularDescontoINSS(5000);
        System.out.println(formatCurrency(descontoINSS));

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

    static float calcularDescontoINSS(float salario) {

        float aliquotaInss = 0f;
        float valorDescontoMaximoFaixa1 = 90.90f;
        float valorDescontoMaximoFaixa2 = 109.42f;
        float valorDescontoMaximoFaixa3 = 145.67f;
        float valorDescontoMaximoFaixa4 = 482.55f;
        float valorMinimoFaixa2 = 1212.01f;
        float valorMinimoFaixa3 = 2427.80f;
        float valorMinimoFaixa4 = 3641.70f;

        if (salario <= 1212) {
            aliquotaInss = 7.5f / 100f;
            return valorDescontoMaximoFaixa1;

        } else if (salario >= 1212.01 && salario <= 2427.79) {
            aliquotaInss = 9 / 100f;
            return ((salario - valorMinimoFaixa2) * aliquotaInss) + valorDescontoMaximoFaixa1;
//retorna o total de o salario - valor minimo faixa 2 * 9% + valor desconto maximo faixa 1

        } else if (salario >= 2427.80 && salario <= 3641.69) {
            aliquotaInss = 12 / 100f;
            return ((salario - valorMinimoFaixa3) * aliquotaInss + valorDescontoMaximoFaixa2 + valorDescontoMaximoFaixa1);
// retorna o total de o salario - valor minimo faixa 3 * 12% + valor desconto máximo faixa 2 + valor desconto maximo faixa 1

        } else if (salario >= 3641.70 && salario <= 7088.50) {
            aliquotaInss = 14 / 100f;
            return ((salario - valorMinimoFaixa4) * aliquotaInss) + valorDescontoMaximoFaixa3 + valorDescontoMaximoFaixa2 + valorDescontoMaximoFaixa1;
// retorna o total do salario - valor minimo faixa 4 *14% + valor desconto maximo faixa 3 + valor desconto máximo faixa 2 + valor desconto maximo faixa 1

        } else {
// valor desconto maximo faixa 4 + valor desconto maximo faixa 3 + valor desconto máximo faixa 2 + valor desconto maximo faixa 1
            return valorDescontoMaximoFaixa4 + valorDescontoMaximoFaixa3 + valorDescontoMaximoFaixa2 + valorDescontoMaximoFaixa1;
        }

    }

    static float calcularSalarioBaseIR(float salario, float descontoINSS) {
        return salario - descontoINSS;
    }
}