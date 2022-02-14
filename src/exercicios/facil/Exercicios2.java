package exercicios.facil;

import util.Util;

public class Exercicios2 {

    public static void main(String[] args) {
        calcularRendaPerCapita();
    }

    /*
     1 - Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
      dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
     */
    static void calcularIdadeEmDias() {
        System.out.println("Escreva  quantos anos, meses e dias você tem de vida, inicialmente escreva os anos");
        int anos = Util.readWholeNumberFromUser();
        System.out.println(" Escreva os meses");
        int meses = Util.readWholeNumberFromUser();
        System.out.println("Escreva os dias");
        int dias = Util.readWholeNumberFromUser();
        int transfAnosEmDias = anos * 365;
        int transfMesesemDias = meses * 30;
        int diasDeVida = transfAnosEmDias + transfMesesemDias + dias;
        System.out.println("Você tem " + diasDeVida + " dias de vida");

    }

    /*
     2 -   Escreva um programa que pergunte o raio de uma circunferência,
      e sem seguida mostre o diâmetro, perimetro e área da circunferência
     */
    static void calcularMedidasCircunferencia() {
        double numeroPi = Math.PI;
        System.out.println("Escreva o raio da circunferência");
        float raio = Util.readDecimalNumberFromUser();
        float diametro = 2 * raio;
        double perimetro = 2 * numeroPi * raio;
        double area = numeroPi * (raio * raio);
        System.out.println(String.format("Diâmetro %f \nPerímetro %f \nÁrea da Circunferência %f \n ", diametro,
                perimetro, area));


    }

    /*
     3 - O álcool tem uma eficiência 30% menor do que a gasolina, baseado nisso faça um programa que leia os preços do litro
      do álcool e da gasolina e indique ao usuário qual melhor combustível para abastecer o carro.
     */
    static void decidirEntreAlcoolGasolina() {
        System.out.println("Digite o preço do litro da Gasolina");
        float gasolina = Util.readDecimalNumberFromUser();
        System.out.println("Digite o preço do litro do álcool");
        float alcool = Util.readDecimalNumberFromUser();
        float eficiencia = alcool / gasolina;
        if (eficiencia < 0.7f) {
            System.out.println("Álcool é mais vantajoso que gasolina");
        } else if (eficiencia > 0.7f) {
            System.out.println("Gasolina é mais vantajoso que álcool");
        } else {
            System.out.println("Tanto álcool quanto gasolina estão caros");
        }
    }

    /*
     4 - Faça um programa que leia um número inteiro do usuário e usando while imprima a sua tabuada.
     */
    static void calcularTabuada() {
        System.out.println("Digite um número inteiro de 1 a 9");
        int numInt = Util.readWholeNumberFromUser();
        int numBase = 1;
        while (numBase <= 10) {
            System.out.println(numInt * numBase);
            numBase = numBase + 1;
        }
    }

    /*
     5 - Usando while faça um programa que leia a renda de todos os integrantes de uma familia,
      calcule e imprima a renda familiar per capita.
    */
    static void calcularRendaPerCapita() {
        float rendaIndividual = 0;
        int numDeRendas = 0;
        float totalDeRendas = 0;
        boolean naoAcabou = true;

        while (naoAcabou) {
            System.out.println("Digite a renda do integrante ou 0 para sair");
            rendaIndividual = Util.readDecimalNumberFromUser();

            if(rendaIndividual != 0){
                numDeRendas = numDeRendas + 1;
                totalDeRendas = totalDeRendas + rendaIndividual;
            } else {
                naoAcabou = false;
            }
        }
        System.out.println(numDeRendas);
        float rendaPerCapita = totalDeRendas / numDeRendas;
        System.out.println(rendaPerCapita);

    }

}
