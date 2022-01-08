import util.Util.*;

import static util.Util.readDecimalNumberFromUser;
import static util.Util.readTextFromUser;

public class BoletimEscolar {

    public static void main(String[] args) {
        String nome;
        float avaliacao1;
        float avaliacao2;
        float avaliacao3;
        float avaliacao4;
        final int PESO_AVALIACAO1=2;
        final int PESO_AVALIACAO2=2;
        final int PESO_AVALIACAO3=3;
        final int PESO_AVALIACAO4=3;
        final int SOMA_DOS_PESOS = PESO_AVALIACAO1+PESO_AVALIACAO2+PESO_AVALIACAO3+PESO_AVALIACAO4;
        final float MEDIA_PARA_PASSAR=6;
        float resultadoFinal;

        System.out.println("Por favor preencha seu nome");
        //nome = readTextFromUser();
        nome = "Zé";
        System.out.println("Usuario logado: " + nome);

        System.out.println("Por favor preencha sua nota da avaliação 1");
        avaliacao1=readDecimalNumberFromUser();
        //avaliacao1 = 5;

        System.out.println("Por favor preencha sua nota da avaliação 2");
        avaliacao2=readDecimalNumberFromUser();
        //avaliacao2 = 6.5f;


        System.out.println("Por favor preencha sua nota da avaliação 3");
        avaliacao3=readDecimalNumberFromUser();
        //avaliacao3 = 5;


        System.out.println("Por favor preencha sua nota da avaliação 4");
        avaliacao4=readDecimalNumberFromUser();
        //avaliacao4 = 7.5f;

        resultadoFinal = (PESO_AVALIACAO1* avaliacao1 + PESO_AVALIACAO2 * avaliacao2 + PESO_AVALIACAO3 * avaliacao3 + PESO_AVALIACAO4 * avaliacao4) / SOMA_DOS_PESOS;
        System.out.println("Sua média é: " + resultadoFinal);

        if (resultadoFinal >= MEDIA_PARA_PASSAR) {
            System.out.println("Você está aprovado!!! Parabéns!!!");
        } else {
            System.out.println("Você falhou!!!");
        }
    }
}
