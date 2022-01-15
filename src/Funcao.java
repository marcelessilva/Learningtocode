import static util.Util.formatCurrency;

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
            return;
        } else if (salario >= 1903.99 && salario <= 2826.65) {
            aliquota = 7.5f /100f;
            deducao = 142.80f;

        } else if (salario >= 2826.66 && salario <= 3751.05) {
            aliquota = 15f /100f;
            deducao = 354.80f;

        } else if (salario >= 3751.06 && salario <= 4664.68) {
            aliquota = 22.5f / 100f;
            deducao = 636.13f;
        } else {
            aliquota = 27.5f /100f;
            deducao = 869.36f;
        }
        float valorDescontado = salario * aliquota - deducao;
        float salarioLiquido = salario - valorDescontado;
        System.out.println("Valor Descontado: " + formatCurrency(valorDescontado));
        System.out.println("Salário Líquido " + formatCurrency(salarioLiquido));


    }

    static float calcularDescontoINSS(float salario) {
        final float valorDescontoMaximoFaixa1 = SALARIO_MINIMO * INSS_ALIQUOTA_FAIXA_1;
        final float valorDescontoMaximoFaixa2 = INSS_MAX_FAIXA_2 * INSS_ALIQUOTA_FAIXA_2;
        final float valorDescontoMaximoFaixa3 = INSS_MAX_FAIXA_3 * INSS_ALIQUOTA_FAIXA_3;
        final float valorDescontoMaximoFaixa4 = INSS_MAX_FAIXA_4 * INSS_ALIQUOTA_FAIXA_4;

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


}