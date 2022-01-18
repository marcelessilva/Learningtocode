import com.sun.org.apache.bcel.internal.generic.ARETURN;

import static util.Util.*;

public class Funcao {


    public static final float LIMITE_SALARIO_FAMILIA = 1503.25f;
    public static final float SALARIO_FAMILIA = 51.27f;
    public static final float SALARIO_MINIMO = 1212f;
    public static final float INSS_MIN_FAIXA_2 = 1212.01f;
    public static final float INSS_MAX_FAIXA_2 = 2427.79f;
    public static final float INSS_MIN_FAIXA_3 = 2427.80f;
    public static final float INSS_MAX_FAIXA_3 = 3641.69f;
    public static final float INSS_MIN_FAIXA_4 = 3641.70f;
    public static final float INSS_MAX_FAIXA_4 = 7088.50f;
    public static final float INSS_ALIQUOTA_FAIXA_1 = 7.5f / 100f;
    public static final float INSS_ALIQUOTA_FAIXA_2 = 9 / 100f;
    public static final float INSS_ALIQUOTA_FAIXA_3 = 12 / 100f;
    public static final float INSS_ALIQUOTA_FAIXA_4 = 14 / 100f;
    public static final float IR_MAX_FAIXA_1 = 1903.98f;
    public static final float IR_MIN_FAIXA_2 = 1903.99f;
    public static final float IR_MAX_FAIXA_2 = 2826.65f;
    public static final float IR_MIN_FAIXA_3 = 2826.66f;
    public static final float IR_MAX_FAIXA_3 = 3751.05f;
    public static final float IR_MIN_FAIXA_4 = 3751.06f;
    public static final float IR_MAX_FAIXA_4 = 4664.68f;
    public static final float IR_ALIQUOTA_FAIXA_2 = 7.5f / 100f;
    public static final float IR_ALIQUOTA_FAIXA_3 = 15f / 100f;
    public static final float IR_ALIQUOTA_FAIXA_4 = 22.5f / 100f;
    public static final float IR_ALIQUOTA_FAIXA_5 = 27.5f / 100f;
    public static final float IR_DEDUCAO_FAIXA_2 = 142.80f;
    public static final float IR_DEDUCAO_FAIXA_3 = 354.80f;
    public static final float IR_DEDUCAO_FAIXA_4 = 636.13f;
    public static final float IR_DEDUCAO_FAIXA_5 = 869.36f;


    public static void main(String[] args) {

        System.out.println("Por favor preencha o nome do funcionário: ");
        String nome = readTextFromUser();
        System.out.println("Por favor preencha o salário do funcionário: ");
        float salario = readDecimalNumberFromUser();
        System.out.println("Por favor preencha o número de filhos menores que 14 anos: ");
        int filhosElegiveisSalarioFamilia = readWholeNumberFromUser();

        float salarioFamilia = calcularSalarioFamilia(salario, filhosElegiveisSalarioFamilia);
        float descontoINSS = calcularDescontoINSS(salario);
        float salarioBaseIr = calcularSalarioBaseIR(salario, descontoINSS);
        float aliquotaIr = determinarAliquota(salarioBaseIr);
        float descontoIR = calcularDescontoIR(salarioBaseIr, aliquotaIr);
        float descontosSalario = calcularDescontosSalario(descontoINSS, descontoIR);
        float remuneracao = calcularRemuneracao(salario, salarioFamilia);
        float salarioLiquido = calcularSalarioLiquido(remuneracao, descontosSalario);


        System.out.println(String.format("Salário Família %f \n Remuneração %f \n Desconto INSS %f \n " +
                        "Salário Base IR %f \n Alíquota IR %f \n Desconto IR %f \n Descontos Salário %f \n Salário Líquido %f",
                salarioFamilia, remuneracao, descontoINSS, salarioBaseIr, aliquotaIr, descontoIR, descontosSalario,
                salarioLiquido));


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


    static float determinarAliquota(float salarioBaseIR) {

        if (salarioBaseIR <= IR_MAX_FAIXA_1) {
            return 0;
        } else if (salarioBaseIR >= IR_MIN_FAIXA_2 && salarioBaseIR <= IR_MAX_FAIXA_2) {
            return IR_ALIQUOTA_FAIXA_2;
        } else if (salarioBaseIR >= IR_MIN_FAIXA_3 && salarioBaseIR <= IR_MAX_FAIXA_3) {
            return IR_ALIQUOTA_FAIXA_3;
        } else if (salarioBaseIR >= IR_MIN_FAIXA_4 && salarioBaseIR <= IR_MAX_FAIXA_4) {
            return IR_ALIQUOTA_FAIXA_4;
        } else {
            return IR_ALIQUOTA_FAIXA_5;
        }
    }

    static float calcularDescontoIR(float salariobaseIR, float aliquota) {
        if (aliquota == 0) {
            return 0;
        } else if (aliquota == IR_ALIQUOTA_FAIXA_2) {
            return salariobaseIR * aliquota - IR_DEDUCAO_FAIXA_2;
        } else if (aliquota == IR_ALIQUOTA_FAIXA_3) {
            return salariobaseIR * aliquota - IR_DEDUCAO_FAIXA_3;
        } else if (aliquota == IR_ALIQUOTA_FAIXA_4) {
            return salariobaseIR * aliquota - IR_DEDUCAO_FAIXA_4;
        } else {
            return salariobaseIR * aliquota - IR_DEDUCAO_FAIXA_5;
        }
    }


    static float calcularDescontoINSS(float salario) {
        final float valorDescontoMaximoFaixa1 = SALARIO_MINIMO * INSS_ALIQUOTA_FAIXA_1;
        final float valorDescontoMaximoFaixa2 = (INSS_MAX_FAIXA_2 - SALARIO_MINIMO) * INSS_ALIQUOTA_FAIXA_2;
        final float valorDescontoMaximoFaixa3 = (INSS_MAX_FAIXA_3 - INSS_MAX_FAIXA_2) * INSS_ALIQUOTA_FAIXA_3;
        final float valorDescontoMaximoFaixa4 = (INSS_MAX_FAIXA_4 - INSS_MAX_FAIXA_3) * INSS_ALIQUOTA_FAIXA_4;

        if (salario <= SALARIO_MINIMO) {
            return valorDescontoMaximoFaixa1;
        } else if (salario >= INSS_MIN_FAIXA_2 && salario <= INSS_MAX_FAIXA_2) {
            return ((salario - INSS_MIN_FAIXA_2) * INSS_ALIQUOTA_FAIXA_2) + valorDescontoMaximoFaixa1;
        } else if (salario >= INSS_MIN_FAIXA_3 && salario <= INSS_MAX_FAIXA_3) {
            return ((salario - INSS_MIN_FAIXA_3) * INSS_ALIQUOTA_FAIXA_3 + valorDescontoMaximoFaixa2 + valorDescontoMaximoFaixa1);
        } else if (salario >= INSS_MIN_FAIXA_4 && salario <= INSS_MAX_FAIXA_4) {
            return ((salario - INSS_MIN_FAIXA_4) * INSS_ALIQUOTA_FAIXA_4) + valorDescontoMaximoFaixa3 + valorDescontoMaximoFaixa2 + valorDescontoMaximoFaixa1;
        } else {
            return valorDescontoMaximoFaixa4 + valorDescontoMaximoFaixa3 + valorDescontoMaximoFaixa2 + valorDescontoMaximoFaixa1;
        }
    }

    static float calcularSalarioBaseIR(float salario, float descontoINSS) {
        return salario - descontoINSS;
    }

    static float calcularSalarioFamilia(float salario, int numFilhosElegiveis) {
        if (salario <= LIMITE_SALARIO_FAMILIA && numFilhosElegiveis > 0) {
            return numFilhosElegiveis * SALARIO_FAMILIA;

        }
        return 0;
    }

    static float calcularDescontosSalario(float descontoINSS, float descontoIR) {
        return descontoINSS + descontoIR;
    }

    static float calcularRemuneracao(float salario, float salarioFamilia) {
        return salario + salarioFamilia;
    }

    static float calcularSalarioLiquido(float remuneracao, float descontosSalario) {
        return remuneracao - descontosSalario;
    }


}