package Array;

import util.Util;

public class Exercícios {
    public static void main(String[] args) {
        //digiteUmNumeroEMultiplicaPor2();

        /*int[] x = new int[]{5, 10, 15, 20, 25};
        for (int i = 4; i >= 0; i--) {
            System.out.println(x[i]);
        }*/

        //Escrever de 1 a 10 usando for

        /*for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }*/

        //mostrar a soma dos numeros de 1 a 10 usando for

        int soma = 0;
        for ( int i = 1; i <=10; i++) {
            soma = soma + i;
        }
        System.out.println(soma);

        //receba 5 numeros do usuario, mostre a soma e a média deles

        //usando for receba um número do usuario e mostre o seu cubo

        //use for para mostrar a tabuada de um número
    }

    private static void digiteUmNumeroEMultiplicaPor2() {
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            num[i] = Util.readWholeNumberFromUser();
        }

        for (int i = 0; i < num.length; i++) {
            int num2 = 2 * num[i];
            System.out.println(num2);
        }
    }
}
