package exercicios.dificil;

import util.Util;

public class TamanhoCasa {

    /*
    Faça um programa que calcule quantos metros quadrados tem uma casa e imprima a sua área.
    O usuário deverá informar o nome, a largura e o comprimento de cada cômodo, podendo informar N número de cômodos.
    O programa deverá então calcular a área de cada cômodo, imprimir as áreas calculadas de cada cômodo e a área total.
    */

    public static void main(String[] args) {
        //Control + clique pra ver a dica
        dica();

        //Desenvolver a solução aqui na main

    }

    /**
     * SPOILER ALERT
     */

    static void dica() {
        /*
        criar uma variavel string para o nome do cômodo, esta variável também será utilizada para finalizar o programa
        criar uma variavel float para armazenar a área total
        criar uma variável string para armazenar o resultado, ir concatenando os resultados nessa variável para imprimir no final
        o usuário vai informar o nome do cômodo e para finalizar o programa ao invés de digitar o nome de um cômodo vai digitar "sair"
        criar um while que verifica a variavel nome, continua enquanto a variavel nome for diferente de "sair"
        dentro do while
        -pedir pro usuario digitar o nome
        -fazer um if pra verificar se o nome é diferente de sair (condição igual a do while)
        -dentro do if
            --pedir pro usuario informar o comprimento e guardar numa variavel
            --fazer a mesma coisa para a largura
            --calcular a area do comodo e guardar numa variavel
            --somar a area calculada à variável da area total
            --adicionar um texto com o calculo da área do cômodo informado na variável resultado para imprimir no final,
             colocar \n no final para quebrar linha

         isso vai se repetir enquanto o usuário não digitar sair
         fora do while
         - adicionar texto com a area total na variavel resultado
         - imprimir o resultado

        Solução
        String nome = "";
        float areaTotal = 0;
        String resultado = "";
        while (!nome.equals("sair")) {
            System.out.println("Informe o nome do cômodo ou escreva sair para finalizar.");
            nome = Util.readTextFromUser();
            if(!nome.equals("sair")) {
                System.out.println("Informe o comprimento");
                float comprimento = Util.readDecimalNumberFromUser();
                System.out.println("Informe a largura");
                float largura = Util.readDecimalNumberFromUser();
                float area = comprimento * largura;
                areaTotal += area;
                resultado += nome + " - " + area + "m² \n";
            }
        }

        resultado += "Área total da casa - " + areaTotal+"m²";
        System.out.println(resultado);
         */
    }
}