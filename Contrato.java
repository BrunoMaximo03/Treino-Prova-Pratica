import java.util.Scanner;

public class Contrato {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        
        int valorRetirar = var.nextInt();
        String preco = var.next();

        while (valorRetirar != 0 || !preco.equals("0")) { // Continua enquanto não for "0 0"
            retornaValor(valorRetirar, preco);

            valorRetirar = var.nextInt();
            preco = var.next();
        }

        var.close(); // Fecha o scanner ao final
    }

    public static void retornaValor(int valorRetirar, String preco) {
        char removeDigito = (char) (valorRetirar + '0'); // Converte o número para char
        StringBuilder novaString = new StringBuilder();

        // Percorre a string preco e remove o dígito indesejado
        for (int i = 0; i < preco.length(); i++) {
            if (preco.charAt(i) != removeDigito) {
                novaString.append(preco.charAt(i));
            }
        }

        // Se a string resultante estiver vazia, retorna "0"
        String resultado = (novaString.length() == 0) ? "0" : novaString.toString();
        System.out.println(resultado);
    }
}
