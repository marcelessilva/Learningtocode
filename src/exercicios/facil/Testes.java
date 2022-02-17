package exercicios.facil;

import util.Util;

public class Testes {
    public static void main(String[] args) {

        String[] nomesBebe = new String[10];

        boolean sair = false;
        int indice = 0;
        while (!sair) {
            System.out.println("Sugira um nome para o bebe");
            String nome = Util.readTextFromUser();
            if (nome.equalsIgnoreCase("sair") || indice > 9) {
                sair = true;
            } else {
                nomesBebe[indice] = nome;
                indice++;
            }
        }


        /*boolean sair = false;

        while (!sair){
            System.out.println("digita o numero, zero pra sair");
            int num = Util.readWholeNumberFromUser();

            if(num == 0){
                sair = true;
            } else {
                System.out.println(num * 5);
            }
        }*/


        /*  // o usuário irá informar dois números e o algoritmo irá definir o maior número.

        System.out.println("Digite um número inteiro: ");
        int x = Util.readWholeNumberFromUser();
        System.out.println("Digite outro número inteiro: ");
        int y = Util.readWholeNumberFromUser();

        if (x > y) {
            System.out.println(" Número " + x + " é maior que número " + y);
        }
        if (y > x) {
            System.out.println(" Número " + y + " é maior que número " + x);
        }*/
    }
}
