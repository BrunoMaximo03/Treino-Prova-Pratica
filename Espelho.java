import java.util.Scanner;

public class Espelho {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (entrada.hasNextInt()) { // Enquanto houver números para ler
            int inicio = entrada.nextInt();
            int fim = entrada.nextInt();
        
            String concatena = "";

            for (int i = inicio; i <= fim; i++) {
                concatena += i;
            }

            String espelho = "";

            for (int i = concatena.length() - 1; i >= 0; i--) {
                espelho += concatena.charAt(i);
            }

            System.out.println(concatena + espelho);
        }
        
        entrada.close();
    }
}
