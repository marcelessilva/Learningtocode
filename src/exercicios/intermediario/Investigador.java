package exercicios.intermediario;

import util.Util;

public class Investigador {
    /*
    Faça um programa que faça 5 perguntas para uma pessoa sobre um crime.
    As perguntas são:
        “Telefonou para a vítima? “
        “Esteve no local do crime?”
        “Mora perto da vítima? “
        “Devia para a vítima? “
        “Já trabalhou com a vítima? “

    O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
    Se a pessoa responder positivamente a 2 questões ela deve ser classificada como “Suspeita”,
    entre 3 e 4 como “Cúmplice”
    e 5 como “Assassino“.
    Caso contrário, ele será classificado como “Inocente“.
    */

    public static void main(String[] args) {
        dica();
        //Control + clique pra ver a dica

        //Desenvolver a solução aqui na main


        int somaDosSim = 0;

        System.out.println("Telefonou para a vítima? Digite Sim ou Não");
        String resposta1 = Util.readTextFromUser();
        if (resposta1.equals("Sim")) {
            somaDosSim = somaDosSim + 1;
        }

        System.out.println("Esteve no local do crime? Digite Sim ou Não");
        String resposta2 = Util.readTextFromUser();
        if (resposta2.equals("Sim")) {
            somaDosSim = somaDosSim + 1;
        }

        System.out.println("Mora perto da vítima? Digite Sim ou Não");
        String resposta3 = Util.readTextFromUser();
        if (resposta3.equals("Sim")) {
            somaDosSim = somaDosSim + 1;
        }

        System.out.println("Devia para a vítima? Digite Sim ou Não");
        String resposta4 = Util.readTextFromUser();
        if (resposta4.equals("Sim")) {
            somaDosSim = somaDosSim + 1;
        }

        System.out.println("Já trabalhou com a vítima? Digite Sim ou Não");
        String resposta5 = Util.readTextFromUser();
        if (resposta5.equals("Sim")) {
            somaDosSim = somaDosSim + 1;
        }


        if (somaDosSim == 2) {
            System.out.println("Suspeita");
        } else if (somaDosSim > 2 && somaDosSim < 5) {
            System.out.println("Cúmplice");
        } else if (somaDosSim == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
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

    static void dica(){
        /*
         criar uma variável string para cada pergunta
         ler do usuário a resposta para cada pergunta e guardar na respectiva variável
         fazer if pra cada resposta pra verificar se a resposta é "sim", .equals()
         criar uma variável pra contar o total de quantas perguntas a pessoa respondeu como sim
         acrescentar mais um (+= ou ++) na variável de total dentro de cada if
         fazer ifs para definir o resultado conforme o valor da variável total
         printar o resultado dentro de cada if,
         if(total == 5){
            System.out.println("Asssasino");
         }
         */
    }
}
