package Operadores;

public class Operadores {
    public static void main(String[] args) {
        // igual = atribuir um valor numa variavel ex: int x = 3;
        // igual igual == comparar dois valores primitivos, 2 == 2 resultado true, 2 == 3 resultado false
        // diferente != comparar dois valores primitivos, 2 != 2 resultado false, 2 != 3 resultado true
        // maior ou igual >= comparar dois valores se o primeiro valor é maior ou igual ao segundo valor
        // 3 >= 3 é true, 3 >= 2 é true, 3 >= 4 é false
        // menor ou igual <= comparar dois valores se o primeiro valor é menor ou igual ao segundo valor
        // 3 <= 3 é true, 3 <= 2 é false, 3 <= 4 é true
        // ê && compara se dois valores são true, 1 == 1 && 2 == 2 é true, 1 == 1 && 1 == 2 é false
        // ou || compara se entre dois valores pelo menos um deles é true
        // 1 == 1 || 1 == 2 é true, 1 == 2 || 2 == 2 é true, 1 == 2 || 2 > 4 é false
        // resto % retorna o resto da divisão entre dois inteiros, 4%2 é igual a 0, 3%2 é igual a 1
        // resto de 5 pra ver se é multiplo de 5, 25%5 igual a 0, 28%5 é igual a 3
        // ++ adiciona mais 1 numa variavel e retorna o valor atual antes de adicionar, x++
        // -- diminui 1 duma variavel, x--
        // ++x adiciona mais 1 numa variavel e retorna o valor modificado
        // += adiciona o valor a direita a uma variavel, x = 5; x += 2; x igual a 7 pois somou o valor atual de x que era 5 mais o valor a direita que e 2
        int x = 2;
        System.out.println(x++);
        System.out.println(x);
        int y = 2;
        System.out.println(++y);
        System.out.println(y);

        //While é usado quando não tem número de instruções definidas;
        //For é usado quando tem um número definido de instruções;
        //for > faça a instrução para n numero de vezes
        // for ( i = 0 (primeira posição do array); i condição (<= ou >=) ultima posição do array; i ++ ou -- (ou outra instrução)
        // OBS: o primeiro i deve ser "rodado" na segundo i e deve ser verdadeira a condição
    }
}
