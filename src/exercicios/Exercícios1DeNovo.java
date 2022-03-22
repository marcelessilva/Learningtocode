package exercicios;

import util.Util;

public class Exercícios1DeNovo {
    public static void main(String[] args) {
        imprimirCracha();
    }

    /*
     1 - Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um algoritmo para ler o
        preço do litro da gasolina e o valor do pagamento, e exibir quantos litros ele conseguiu colocar no
        tanque.
     */
    static void calcularLitrosGasolina(){
        System.out.println("Digite o preço do litro da gasolina");
        float precoDaGasolina = Util.readDecimalNumberFromUser();
        System.out.println("Digite o valor pago");
        float valorPago = Util.readDecimalNumberFromUser();
        float litrosDeGasolina = valorPago/precoDaGasolina;
        System.out.println(" O número de litros abastecidos será " + litrosDeGasolina + " L");
    }

    /*
    2 -  Um tonel de refresco é feito com 8 partes de água mineral e 2 partes de suco de maracujá.
    Faça um algoritmo para calcular quantos litros de água e de suco são necessários para se fazer X
    litros de refresco (informados pelo usuário).
     */


    static void calcularIngredientesSuco(){
        System.out.println("Digite quantos litros de suco");
        float litrosDeSuco = Util.readWholeNumberFromUser();
        float suco = 0.2f * litrosDeSuco;
        float agua = 0.8f * litrosDeSuco;
        System.out.println("Para fazer " + litrosDeSuco+ " litros de refresco, você precisará de " + suco + " litros de suco " + agua + " litros de água" );


    }

    /*
    3 - Para doar sangue é necessário ter entre 18 e 67 anos.
    Faça um programa que pergunte a idade de uma pessoa e diga se ela pode doar sangue ou não.
     */
    static void doarSangue() {
        System.out.println("Qual sua idade?");
        int idade = Util.readWholeNumberFromUser();

        if (idade>=18 & idade <=67) {
            System.out.println("Você poderá doar sangue");
        } else {
            System.out.println("Você não poderá doar sangue");
        }

        }


    /*
    4 - Num evento os participantes receberão um crachá com um número x por ordem de chegada no seguinte formato "[x]".
    Usando while imprima todos os crachás necessários para a quantidade de participantes a ser informada pelo usuário.
    EX: para 3 participantes, imprimir
    [1]
    [2]
    [3]
     */
    static void imprimirCracha() {
        System.out.println("Informe o número de participantes");
        int participantes = Util.readWholeNumberFromUser();
        int x = 1;

        while (x <= participantes) {
            System.out.println("[" + x + "]");
            x++;
        }

        }

    }


