public class Funcao {


    public static void main(String[] args) {

        //System.out.println(sum(2, 8));
        //printHelloWorld();
        defineNumberPositiveNegative(10);
        defineNumberPositiveNegative(-25);
        defineNumberPositiveNegative(0);


    }


    static float sum(float celula1, float celula2) {
        float resultado = celula1 + celula2;
        return resultado;
    }


    static void printHelloWorld() {
        System.out.println("Hello World");
    }

    static void defineNumberPositiveNegative(int numero) {
        if (numero > 0) {
            System.out.println("O Número " + numero + " é positivo");
        } else if (numero == 0) {
            System.out.println("O Número é neutro");
        } else {
            System.out.println("O Número " + numero + " é negativo");
        }

    }
}
