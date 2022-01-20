import java.util.HashMap;
import java.util.Map;

public class Sorteio {

    public static void main(String[] args) {
        /*double random = Math.random();
        double multiplica = random * 10;
        long round = Math.round(multiplica);
        if (round == 0 | round == 2 | round == 3 | round == 6 | round == 9) {
            System.out.println("Wiliam");
        } else {
            System.out.println("Marcele");
        }*/

        System.out.println("-----DO WHILE------");
        //do while
        String resultado = "Gata Preta";
        do {
            resultado = sortearPortariaComMap();
            System.out.println(resultado);
        } while (!resultado.equals("Gata Preta"));


        System.out.println("-----WHILE------");
        String outroResultado = "Gata Preta";
        //while
        while(outroResultado.equals("Gata Preta")){
            outroResultado = sortearPortariaComMap();
            System.out.println(outroResultado);
        }

    }

    static void sortearPortaria() {
        int numeroSorteado = (int) (Math.random() * 10);
        if (numeroSorteado % 2 == 0) {
            System.out.println("Wiliam");
        } else {
            System.out.println("Marcele");
        }
    }

    static String sortearPortariaComMap() {
        Map<Integer, String> pessoas = new HashMap<>();
        pessoas.put(0, "Wiliam");
        pessoas.put(1, "Marcele");
        pessoas.put(2, "Manezao");
        pessoas.put(3, "Gata Preta");
        pessoas.put(4, "Amy");

        int numeroSorteado = (int) (Math.random() * 5);
        return pessoas.get(numeroSorteado);
    }
}
