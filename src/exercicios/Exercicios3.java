package exercicios;

import util.Util;

import java.text.NumberFormat;

public class Exercicios3 {

    public static final float desconto1 = 0.03f;
    public static final float desconto2 = 0.05f;
    public static final float desconto3 = 0.1f;

    public static void main(String[] args) {

       /* int num = 1;


        while (num <11) {
            System.out.println(num++);
        }*/

        /*boolean continuar = true;
        int contador = 0;
        int num = Util.readWholeNumberFromUser();

        while (continuar) {
            System.out.println("Banana");
            contador++;

            if (num == 5) {
                continuar = false;
            }
            if (contador == 3) {
                continuar = false;
            }
        }*/


        //avaliarCarro2();
        //imprimirNumerosComWhile();
        //imprimirNumerosComFor();
        //jogarAdivinhação();
        inverterArray();


    }

    /**
     * Leia o valor total de compras do cliente e aplique o desconto da seguinte forma:
     * até R$200,00 3%
     * entre R$200,00 e R$700,00 5%
     * acima de R$700,00 10%
     * printar o desconto aplicado e o valor com desconto
     */
    static void calcularDesconto() {

        System.out.println("Digite o valor da compra");

        float valorDaCompra = Util.readDecimalNumberFromUser();
        float desconto = 0;

        if (valorDaCompra < 200) {
            desconto = valorDaCompra * desconto1;
        } else if (valorDaCompra >= 200 && valorDaCompra < 700) {
            desconto = valorDaCompra * desconto2;
        } else {
            desconto = valorDaCompra * desconto3;
        }

        float valorComDesconto = valorDaCompra - desconto;

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String descontoFormatado = formatter.format(desconto);
        String valorComDescontoFormat = formatter.format(valorComDesconto);

        System.out.println("O desconto é de " + descontoFormatado);
        System.out.println("O valor total da sua compra é de " + valorComDescontoFormat);

    }

    /**
     * Faça um programa que avalie se um carro corresponde com as exigências do cliente.
     * Exigências:
     * Carro branco ou cinza
     * ano minimo 2012
     * ter ar condicionado
     * O programa deve ler as informações de um carro e imprimir se o carro corresponde as exigências do cliente.
     * if && || variaveis string, int e boolean
     */
    static void avaliarCarro() {

        int somaDosSim = 0;

        System.out.println("O carro é branco ou cinza?");
        String corDoCarro = Util.readTextFromUser();
        if (corDoCarro.equals("Sim")) {
            somaDosSim = somaDosSim + 1;
        }
        System.out.println("O ano mínimo do carro é 2012?");
        String anoDoCarro = Util.readTextFromUser();
        if (anoDoCarro.equals("Sim")) {
            somaDosSim = somaDosSim + 1;
        }
        System.out.println(" O carro tem ar condicionado?");
        String arCondicionado = Util.readTextFromUser();
        if (arCondicionado.equals("Sim")) {
            somaDosSim = somaDosSim + 1;
        }

        if (somaDosSim == 3) {
            System.out.println("O carro atende as expectativas do cliente");
        } else {
            System.out.println("O carro não atende as expectativas do cliente");
        }

    }

    static void avaliarCarro2() {

        int somaDosOK = 0;

        System.out.println("Qual o cor do carro?");
        String corDoCarro = Util.readTextFromUser();
        if (corDoCarro.equalsIgnoreCase("branco") || corDoCarro.equalsIgnoreCase("cinza")) {
            somaDosOK = somaDosOK + 1;
        }
        System.out.println("Qual o ano do carro?");
        int anoDoCarro = Util.readWholeNumberFromUser();
        if (anoDoCarro >= 2012) {
            somaDosOK = somaDosOK + 1;
        }
        System.out.println("O carro tem ar condiocionado? Responda com Sim ou Não");
        String arCondicionado = Util.readTextFromUser();
        if (arCondicionado.equalsIgnoreCase("sim")) {
            somaDosOK = somaDosOK + 1;
        }
        if (somaDosOK == 3) {
            System.out.println("O carro corresponde às expectativas do cliente");
        } else {
            System.out.println("O carro não corresponde às expectativas do cliente");
        }
    }

    /**
     * Usando while imprima os numeros de 1 a 10
     */
    static void imprimirNumerosComWhile() {
        int num = 1;
        while (num < 11) {
            System.out.println(num);
            num = num + 1;
        }

    }

    /**
     * Jogo de adivinhação
     * Sorteie um número inteiro de 1 a 10.
     * Pergunte ao usuário qual foi o número sorteado, tendo 3 chances de adivinhar
     * Se adivinhar printar vencedor senão perdedor
     * Dicas: variável contadora, While, variável boolean para terminar o while, if
     */
    static void jogarAdivinhação() {
        int numeroSorteado = (int) (Math.random() * 10);

        int num = 3;
        int numUsuario = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println(" Digite um número de 0 a 10:");
            numUsuario = Util.readWholeNumberFromUser();

            if (numUsuario == numeroSorteado) {
                System.out.println("Vencedor");
                continuar = false;
            }

            num = num - 1;

            if (num == 0) {
                System.out.println("Perdedor");
                continuar = false;
            }
        }


    }

    /**
     * Usando for imprima os numeros de 1 a 10
     */
    static void imprimirNumerosComFor() {

        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

    }

    /**
     * crie um array de int de 5 posições e use um for para preencher esse array com números fornecidos pelo usuário
     * use outro for para imprimir esse mesmo array na ordem inversa
     */
    static void inverterArray() {
        int num[] = new int[5];

        for (int i = 0; i < num.length; i++ ) {
            num[i] = Util.readWholeNumberFromUser();
        }

        for (int i = 4; i >= 0; i--) {
            System.out.println(num [i]);
        }

    }
}
