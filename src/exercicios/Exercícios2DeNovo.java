package exercicios;

import util.Util;

public class Exercícios2DeNovo {
    public static void main(String[] args) {
        calcularRendaPerCapita();

    }

    /*
     1 - Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
      dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
     */
    static void calcularIdadeEmDias() {
        System.out.println(" Escreva quantos anos você tem");
        int anos = Util.readWholeNumberFromUser();
        System.out.println("Meses ");
        int meses = Util.readWholeNumberFromUser();
        System.out.println("Dias");
        int dias = Util.readWholeNumberFromUser();

        int anosEmDias = anos * 365;
        int mesesEmdias = meses * 30;
        int soma = anosEmDias + mesesEmdias + dias;

        System.out.println("Você tem " + soma + " dias de vida");


    }

    /*
     2 -   Escreva um programa que pergunte o raio de uma circunferência,
      e sem seguida mostre o diâmetro, perimetro e área da circunferência
     */
    static void calcularMedidasCircunferencia() {

        System.out.println("Qual o raio da cincunferência?");
        float raio = Util.readDecimalNumberFromUser();
        float diametro = 2 * raio;
        double pi = Math.PI;
        double perimetro = 2 * pi * raio;
        double area = pi * (raio * raio);
        System.out.println("As medidas da cincunferência são " + diametro + " de diâmetro" + perimetro + " de perímetro" + area + " de área");


    }

    /*
     3 - O álcool tem uma eficiência 30% menor do que a gasolina, baseado nisso faça um programa que leia os preços do litro
      do álcool e da gasolina e indique ao usuário qual melhor combustível para abastecer o carro.
     */
    static void decidirEntreAlcoolGasolina() {
        System.out.println("Preço do litro do álcool");
        float alcool = Util.readDecimalNumberFromUser();
        System.out.println("Preço da gasolina");
        float gasolina = Util.readDecimalNumberFromUser();
        float eficiencia = alcool / gasolina;

        if (eficiencia < 0.7) {
            System.out.println(" Álcool é mais vantajoso que gasolina ");
        } else if (eficiencia > 0.7) {
            System.out.println(" Gasolina é mais vaontajoso que álcool");
        } else {
            System.out.println("Você está enrolado, meu filho");
        }

    }

    /*
     4 - Faça um programa que leia um número inteiro do usuário e usando while imprima a sua tabuada.
     */
    static void calcularTabuada() {
        System.out.println("Digite um número de 1 a 10");
        int num = Util.readWholeNumberFromUser();
        int x = 1;
        while (x <= 10) {
            System.out.println(num * x);
            x++;
        }

    }

    /*
     5 - Usando while faça um programa que leia a renda de todos os integrantes de uma familia,
      calcule e imprima a renda familiar per capita.
    */
    static void calcularRendaPerCapita() {

        float rendaIndividual = 0;
        float somaDasRendas = 0;
        float numRendas = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Digite a renda de um integrante da família e assim sucessivamente, quando terminar digite 0");
            rendaIndividual = Util.readDecimalNumberFromUser();
            if (rendaIndividual == 0) {
                continuar = false;
            } else {
                somaDasRendas = somaDasRendas + rendaIndividual;
                numRendas = numRendas + 1;
            }
        }

        float rendaPerCapta = somaDasRendas/numRendas;
        System.out.println( rendaPerCapta);


    }
}
