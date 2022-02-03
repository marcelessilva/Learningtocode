package exercicios.facil;

import util.Util;

public class Exercicios2 {

    public static void main(String[] args) {
        calcularMedidasCircunferencia();

    }

    /*
     1 - Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
      dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
     */
    static void calcularIdadeEmDias(){
        System.out.println("Escreva  quantos anos, meses e dias você tem de vida, inicialmente escreva os anos");
        int anos = Util.readWholeNumberFromUser();
        System.out.println(" Escreva os meses");
        int meses = Util.readWholeNumberFromUser();
        System.out.println("Escreva os dias");
        int dias = Util.readWholeNumberFromUser();
        int transfAnosEmDias = anos*365;
        int transfMesesemDias = meses*30;
        int diasDeVida = transfAnosEmDias+transfMesesemDias+dias;
        System.out.println("Você tem "+ diasDeVida + " dias de vida");

    }

    /*
     2 -   Escreva um programa que pergunte o raio de uma circunferência,
      e sem seguida mostre o diâmetro, perimetro e área da circunferência
     */
    static void calcularMedidasCircunferencia(){
        double numeroPi = Math.PI;
        System.out.println("Escreva o raio da circunferência");
        float raio = Util.readDecimalNumberFromUser();
        float diametro = 2*raio;
        double perimetro = 2*numeroPi*raio;
        double area = numeroPi * (raio*raio);
        System.out.println(String.format("Diâmetro %f \nPerímetro %f \nÁrea da Circunferência %f \n ", diametro,
                perimetro, area ));




    }

    /*
     3 - O álcool tem uma eficiência 30% menor do que a gasolina, baseado nisso faça um programa que leia os preços do litro
      do álcool e da gasolina e indique ao usuário qual melhor combustível para abastecer o carro.
     */
    static void decidirEntreAlcoolGasolina(){


    }

    /*
     4 - Faça um programa que leia um número inteiro do usuário e usando while imprima a sua tabuada.
     */
    static void calcularTabuada(){

    }

    /*
     5 - Usando while faça um programa que leia a renda de todos os integrantes de uma familia,
      calcule e imprima a renda familiar per capita.
    */
    static void calcularRendaPerCapita(){

    }

}
