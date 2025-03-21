import java.util.Scanner;

public class ContaMaisculas {
    
    public static int retornaMaiusculo(String palavra) {
        int maisuculas = 0;
    
        for (int i = 0; i < palavra.length(); i++) {
            if (Character.isUpperCase(palavra.charAt(i))) {
                maisuculas++;
            }
        }
    
        return maisuculas;
    }
    

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String palavra ="";

        while (!(palavra = entrada.nextLine()).equals("FIM")) {
            System.out.println(retornaMaiusculo(palavra));
        }
        entrada.close();
    }
        
    
}