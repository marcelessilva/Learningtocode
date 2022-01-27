package exercicios.facil;

import util.Util;

public class Exercicios1 {

    public static void main(String[] args) {
        calcularLitrosGasolina();

    }

    /*
     1 - Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um algoritmo para ler o
        preço do litro da gasolina e o valor do pagamento, e exibir quantos litros ele conseguiu colocar no
        tanque.
     */
    static void calcularLitrosGasolina(){
        System.out.println("Digite o preço do litro da gasolina: ");
        String precoGasolinaTexto = Util.readTextFromUser();
        precoGasolinaTexto = precoGasolinaTexto.replaceAll(",",".");
        precoGasolinaTexto = precoGasolinaTexto.replaceAll("R\\$","");
        precoGasolinaTexto = precoGasolinaTexto.trim();
        float precoDaGasolina = Float.parseFloat(precoGasolinaTexto);
        System.out.println("Digite quanto você irá abastecer: " );
        float valorDoAbastecimento = Util.readDecimalNumberFromUser();
        System.out.println("Nº de Litros abastecidos: " +valorDoAbastecimento/precoDaGasolina+ " L");

    }

    /*
    2 -  Um tonel de refresco é feito com 8 partes de água mineral e 2 partes de suco de maracujá.
    Faça um algoritmo para calcular quantos litros de água e de suco são necessários para se fazer X
    litros de refresco (informados pelo usuário).
     */
    static void calcularIngredientesSuco(){

    }

    /*
    3 - Para doar sangue é necessário ter entre 18 e 67 anos.
    Faça um programa que pergunte a idade de uma pessoa e diga se ela pode doar sangue ou não.
     */
    static void doarSangue(){


    }

    /*
    4 - Num evento os participantes receberão um crachá com um número x por ordem de chegada no seguinte formato "[x]".
    Usando while imprima todos os crachás necessários para a quantidade de participantes a ser informada pelo usuário.
    EX: para 3 participantes, imprimir
    [1]
    [2]
    [3]
     */
    static void imprimirCracha(){

    }

}
