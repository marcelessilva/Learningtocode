package exercicios.facil;

import util.Util;

public class MaiorNumero {

    public static void main(String[] args) {

        // O usuário irá informar dois números e o programa irá imprimir o maior destes dois números

        System.out.println("Digite um número");
        int x = Util.readWholeNumberFromUser();
        System.out.println("Digite outro número");
        int y = Util.readWholeNumberFromUser();

        if (x>y) {
            System.out.println("Este é maior número: " + x);
        }
        if (y>x) {
            System.out.println("Este é maior número: " + y);
        }
        if (y==x) {
            System.out.println("Números iguais");
        }
    }
}
