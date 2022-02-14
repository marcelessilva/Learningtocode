package Array;

public class ArrayEFor {
    public static void main(String[] args) {
        String[] nomes = new String[5];
        int[] idade = new int[5];
        nomes[0] = "Marcele";
        nomes[1] = "Wiliam";
        nomes[2] = "Amy";
        nomes[3] = "Manezão";
        nomes[4] = "Gata Preta";
        idade[0] = 34;
        idade[1] = 35;
        idade[2] = 9;
        idade[3] = 8;
        idade[4] = 7;

        //System.out.println( "A pessoa " + nomes[0] + " tem "+ idade[0] + " anos");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        for (int indice = 0; indice < nomes.length; indice++) {
            System.out.println("A pessoa " + nomes[indice] + " tem " + idade[indice] + " anos");
        }

        //for de for
        String[] semanas = new String[]{"Semana 1", "Semana 2", "Semana 3", "Semana 4"};
        String[] diasDaSemana = new String[]{"Segunda", "Terça", "Quarta", "Quinta", "Sexta"};
        for (int i = 0; i < semanas.length; i++) {
            System.out.println(semanas[i]);
            for (int j = 0; j < diasDaSemana.length; j++) {
                System.out.println("   " + diasDaSemana[j]);
                //System.out.println("i = " + i + " j=" + j);
            }
        }


    }

}
