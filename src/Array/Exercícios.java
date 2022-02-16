package Array;

import util.Util;

public class Exercícios {
    public static void main(String[] args) {
        //digiteUmNumeroEMultiplicaPor2();

        int[] x = new int[]{5, 10, 15, 20, 25};
        for (int i = 4; i >= 0; i--) {
            System.out.println(x[i]);
        }


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
