import util.Util;

public class DoWhile {
    public static void main(String[] args) {

       /* int num = 3;
        do{
            System.out.println("AAAAAAAAAAA");
            num = num -1;
        }while (num > 0);*/

        boolean preencheuCerto = false;
        do {
            try {
                System.out.println("Digite sua idade: ");
                int idade = Util.readWholeNumberFromUser();
                preencheuCerto = true;
            } catch (Exception e) {
                System.out.println("Valor invalido, sua mula. Tente de novo");
                preencheuCerto = false;
            }
            //se der certo pula pra cá e não vai no catch
        }while (!preencheuCerto);
    }
}
