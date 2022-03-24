package exercicios;

import com.sun.xml.internal.ws.api.model.WSDLOperationMapping;
import util.Util;

public class Testes {
    public static void main(String[] args) {
        boolean continuar = true;
        int contador = 1;

        while (continuar){
            System.out.println("digita o numero, zero pra sair");
            int num = Util.readWholeNumberFromUser();

            if(num == 0){
                continuar = false;
            } else {
                System.out.println(num * 5);
            }

            contador++;
            if(contador > 10){
                continuar = false;
            }
        }
        //soma, acumular valor numa variável
      /*  int soma = 0;
        for (int i = 1; i < 5; i++) {
            soma = soma + i;
        }
        System.out.println("Soma = "+ soma);*/

      /*  String[] nomesBebe = new String[10];

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
*/

        /*boolean continuar = true;

        while (continuar){
            System.out.println("digita o numero, zero pra sair");
            int num = Util.readWholeNumberFromUser();

            if(num == 0){
                continuar = false;
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

        /* int num = 1;


        while (num <11) {
            System.out.println(num++);
        }*/

        /*boolean continuar = true;
        int contador = 0;
        int num = Util.readWholeNumberFromUser();

        while (continuar) {
            System.out.println("Banana");
            contador++;

            if (num == 5) {
                continuar = false;
            }
            if (contador == 3) {
                continuar = false;
            }
        }*/
    }
}
