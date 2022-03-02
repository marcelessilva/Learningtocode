package exercicios;

import util.Util;

public class PositivoNegativoParImpar {
    public static void main(String[] args) {

        System.out.println("Digite um número");
        int num = Util.readWholeNumberFromUser();

        if(num == 0){
            System.out.println("Número neutro");
        }
        else if (num > 0 && num%2 == 0 ) {
            System.out.println("Este número é positivo e par");
        }
        else if (num >0 && num%2 ==1) {
            System.out.println("Este número é positivo e ímpar");
        }
        else if (num <0 && num%2 ==0) {
            System.out.println("Este número é negativo e par");
        }
        else {
            System.out.println("Este número é negativo e ímpar");
        }
    }
}
