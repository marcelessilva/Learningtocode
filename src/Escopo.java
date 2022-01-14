public class Escopo {

    static String nome = "Marcele";
    static float salario = 20;


    public static void main(String[] args) {
        printSalario();
        System.out.println(salario);
        calcularSalario();

    }

    static void printSalario() {
        //float salario = 1;
        System.out.println(salario + " Print Salário");
    }

    static void calcularSalario () {
        salario = 50;

    }
}
