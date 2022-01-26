package exercicios.facil;

import util.Util;

public class DiaDaSemana {

    /*
    Faça um Programa que leia um número e exiba o dia correspondente da semana. (1- Domingo , 2- Segunda, etc.)
    se digitar outro valor deve aparecer “valor inválido)
    */

    public static void main(String[] args) {
        //Control + clique pra ver a dica
        dica();

        //Desenvolver a solução aqui na main


        System.out.println("Digite um número de 1 a 7");
        int numDigitado= Util.readWholeNumberFromUser();

        if (numDigitado == 1) {
            System.out.println("Domingo");
        }
        else if (numDigitado == 2) {
            System.out.println("Segunda-feira");
        }
        else if (numDigitado == 3) {
            System.out.println("Terça-Feira");
        }
        else if (numDigitado == 4) {
            System.out.println("Quarta-feira");
        }
        else if (numDigitado == 5) {
            System.out.println("Quinta-feira");
        }
        else if (numDigitado == 6) {
            System.out.println("Sexta-feira");
        }
        else if (numDigitado == 7) {
            System.out.println("Sábado");
        }
        else {
            System.out.println("Número Inválido");
        }


    }

    /** SPOILER ALERT
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     */

    static void dica() {
        /*

         */
    }
}
