import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;

public class CalculoLucro {

    public static void main(String[] args) {
        try {
            String nome;
            float receita = 0;
            float despesas = 0;
            float resultado;

            //ler o nome do usuario
            System.out.println("Por favor preencha seu nome");
            //nome = readTextFromUser();
            nome = "Zé";
            System.out.println("Usuario logado: " + nome);
            try {
                System.out.println("Por favor preencha suas receitas (somente números)");
                //receita = 150000;
                receita = readDecimalNumberFromUser();

            } catch (Exception e) {
                System.out.println("Deu Ruim");
                System.out.println("Por favor preencha suas receitas somente com números");
                receita = readDecimalNumberFromUser();
            }
            try {
                System.out.println("Por favor preencha suas despesas (somente números)");
                despesas = readDecimalNumberFromUser();
                //despesas=100000;
            } catch (Exception e) {
                System.out.println("Deu Ruim");
                System.out.println("Por favor preencha suas despesas somente com números");
                despesas = readDecimalNumberFromUser();
            }
            resultado = receita - despesas;
            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            String resultadoformatado = formatter.format(resultado);

            if (resultado < 0) {
                System.out.println("Prejuízo " + resultadoformatado);
            }
            if (resultado == 0) {
                System.out.println("Zero a zero " + resultadoformatado);
            }
            if (resultado > 0) {
                System.out.println("Lucro " + resultadoformatado);
            }
        }catch (Exception e) {
            System.out.println("Tente mais tarde");
        }

    }


    static String readTextFromUser() {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        try {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    static int readWholeNumberFromUser() {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        try {
            return Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    static float readDecimalNumberFromUser() {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        try {
            return Float.parseFloat(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

}
