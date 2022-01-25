import util.Util;

public class EstruturaDeRepeticao {

    public static void main(String[] args) {
        //simularArCondicionado();

        //int numero = Util.readWholeNumberFromUser();
        //boolean par = numero%2 ==0;



        /*int num = 1;
        while (num <= 10){
            System.out.println(num);
            num = num + 1;
        }*/

       /* int x = 0;
        System.out.println(x);
        x= 5;
        System.out.println(x);
        x = x+1;
        System.out.println(x);
        x += 1;*/

        int num = 1;
       /* while (num < 11) {
            System.out.println(num++);
            //num = num +1;
        }*/

        num = 11;
        /*while (num<10) {
            if (num %2 ==0) {
                System.out.println(num);
            }
            num = num+1;
        }*/
        num =1;
        System.out.println("Digite um número");
        int numDigitado = Util.readWholeNumberFromUser();

        while (num <= numDigitado) {
            if (num%2 ==0) {
                System.out.println(num);
            }
            num = num+1;
        }



    }

    private static void simularArCondicionado() {
        boolean estaQuente = false;
        int temperatura = 30;

        estaQuente = verificarSeEstaQuente(temperatura);
        System.out.println("Temperatura antes do while: "+temperatura);

        while (estaQuente){
            temperatura = reduzirTemperaturaEm1Grau(temperatura);
            System.out.println("diminuiu a temperatura para: "+temperatura);
            estaQuente = verificarSeEstaQuente(temperatura);
        }

        if (estaQuente) {
            System.out.println("Hoje está quente " + temperatura);
        } else {
            System.out.println("Está bom " + temperatura);
        }
    }


    //static retorno nome                     parametros
    static int reduzirTemperaturaEm1Grau(int temperatura) {//corpo
        return temperatura - 1;
    }

    static boolean verificarSeEstaQuente(int temperatura) {
        return temperatura > 25;
    }
}
