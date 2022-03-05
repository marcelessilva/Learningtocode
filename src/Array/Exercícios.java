package Array;

import util.Util;

public class Exercícios {
    public static void main(String[] args) {

        //somaEMedia();
        //numeroAoCubo();
        tabuada();


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

        /*int soma = 0;
        for ( int i = 1; i <=10; i++) {
            soma = soma + i;
        }
        System.out.println(soma);*/

    }

   /* private static void digiteUmNumeroEMultiplicaPor2() {
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            num[i] = Util.readWholeNumberFromUser();
        }

        for (int i = 0; i < num.length; i++) {
            int num2 = 2 * num[i];
            System.out.println(num2); }*/


    //receba 5 numeros do usuario, mostre a soma e a média deles

    /*public static void somaEMedia() {

        int[] num = new int[5];
        int plus = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = Util.readWholeNumberFromUser();
            plus = plus + num [i];
        }
        System.out.println(plus);
        System.out.println(plus / 5);

    }*/

    //usando for receba um número do usuario e mostre o seu cubo

    /*public static void numeroAoCubo() {


        int numUsuario = Util.readWholeNumberFromUser();
        int num  = numUsuario;
        for (int i = 1; i <= 2; i++) {

            num = num * numUsuario;
        }
        System.out.println(num);
    }*/

    //use for para mostrar a tabuada de um número

    public static void tabuada() {

        int num = Util.readWholeNumberFromUser();

        for (int i = 1; i <11; i++) {
            System.out.println( num * i);
        }
    }

}


