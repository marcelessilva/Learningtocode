package exercicios;

import util.Util;

import java.text.NumberFormat;
import java.util.Random;

public class Exercicios3DeNovo {

    public static void main(String[] args) {


        //avaliarCarro();
        //calcularDesconto();
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

        float desconto1 = 0.03f;
        float desconto2 = 0.05f;
        float desconto3 = 0.1f;
        float desconto = 0;


        if (valorDaCompra < 200) {
            desconto = valorDaCompra * desconto1;
        } else if (valorDaCompra >= 200 && valorDaCompra <= 700) {
            desconto = valorDaCompra * desconto2;
        } else {
            desconto = valorDaCompra * desconto3;
        }

        float valorAPagar = valorDaCompra - desconto;

        System.out.println(" O valor do desconto é de R$ " + desconto);
        System.out.println(" o valor a pagar é de R$ " + valorAPagar);
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
        int numDeSins = 3;

        System.out.println(" Qual a cor do carro?");
        String corDoCarro = Util.readTextFromUser();
        if (corDoCarro.equals("branco") || corDoCarro.equals("cinza")) {
            somaDosSim++;
        }
        System.out.println(" Qual o ano do carro?");
        int anoDoCarro = Util.readWholeNumberFromUser();
        if (anoDoCarro >= 2012) {
            somaDosSim++;

        }
        System.out.println(" O carro tem ar condicionado?");
        String arCondicionado = Util.readTextFromUser();
        if (arCondicionado.equals("sim")) {
            somaDosSim++;
        }

        if (somaDosSim == numDeSins) {
            System.out.println("O carro corresponde às expectativas do cliente");
        } else {
            System.out.println(" O carro não serve");
        }

    }


    /**
     * Usando while imprima os numeros de 1 a 10
     */
    static void imprimirNumerosComWhile() {

        int num = 1;

        while (num <= 10) {
            System.out.println(num);
            num++;
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

        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(10) + 1;
        boolean continuar = true;

        int numDeTentativas = 1;
        while (continuar) {
            System.out.println("Qual foi o número sorteado?");
            int numDoJogador = Util.readWholeNumberFromUser();
            if (numDoJogador == valor) {
                System.out.println(" Vencedor");
                continuar = false;

            } else if (numDeTentativas < 3) {
                numDeTentativas++;
            } else if (numDoJogador == 5) {
                continuar = false;
                System.out.println("Perdedor");
            } else {
                continuar = false;
                System.out.println("Perdedor");
            }

        }


    }

    /**
     * Usando for imprima os numeros de 1 a 10
     */
    static void imprimirNumerosComFor() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


    }

    /**
     * crie um array de int de 5 posições e use um for para preencher esse array com números fornecidos pelo usuário
     * use outro for para imprimir esse mesmo array na ordem inversa
     */
    static void inverterArray() {
        int num[] = new int[5];
        num[0] = 1;


        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite 5 números");
            int numDoUsuario = Util.readWholeNumberFromUser();
            num[i] = numDoUsuario;
        }

        for (int i = 4; i >= 0; i--) {
            System.out.println(num [i]);
        }

    }


}





