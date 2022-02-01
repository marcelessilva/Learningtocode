package exercicios.facil;

import util.Util;

public class Testes {
    public static void main(String[] args) {
        // o usuário irá informar dois números e o algoritmo irá definir o maior número.

        System.out.println("Digite um número inteiro: ");
        int x = Util.readWholeNumberFromUser();
        System.out.println("Digite outro número inteiro: ");
        int y = Util.readWholeNumberFromUser();

        if (x > y) {
            System.out.println(" Número " + x + " é maior que número " + y);
        }
        if (y > x) {
            System.out.println(" Número " + y + " é maior que número " + x);
        }
    }
}
