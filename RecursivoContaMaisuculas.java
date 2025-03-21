import java.util.Scanner;

public class RecursivoContaMaisuculas {

    public static int retornaMaiusculo(String palavra, int contador) {
        if(contador >= palavra.length()) {
            return 0;
        }
        if(Character.isUpperCase(palavra.charAt(contador))) {
            return 1 + retornaMaiusculo(palavra, contador + 1);
        }
        return retornaMaiusculo(palavra, contador + 1);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String palavra = "";

        while (!(palavra = entrada.nextLine()).equals("FIM")) {
            System.out.println(retornaMaiusculo(palavra, 0));
        }

        entrada.close();
    }
}
