import java.util.Scanner;

public class Medalhas {
    private String nome;
    int ouro;
    int prata;
    int bronze;

    public Medalhas(String pais, int ouro, int prata, int bronze) {
        this.nome = pais;
        this.prata = prata;
        this.ouro = ouro;
        this.bronze = bronze;
    }
 
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        int numeroPaises = n.nextInt();

        String pais = null;
        int ouro = 0;
        int prata = 0;
        int bronze = 0;

        Medalhas medalhas[] = new Medalhas[numeroPaises];

        for(int i = 0; i < numeroPaises; i++) {
            System.out.println("Nome Pais: ");
            pais = n.next();

            System.out.println("Ouro: ");
            ouro = n.nextInt();

            System.out.println("Prata: ");
            prata = n.nextInt();

            System.out.println("Bronze: ");
            bronze = n.nextInt();

            medalhas[i] = new Medalhas(pais, ouro, prata, bronze);
        }
        
        for(int i = 0; i < numeroPaises - 1; i++) {
            int maior = i;
            for(int j = i + 1; j < numeroPaises; j++) {
                if(medalhas[j].ouro > medalhas[maior].ouro ||
                 (medalhas[j].ouro == medalhas[maior].ouro && medalhas[j].prata > medalhas[maior].prata) || (medalhas[j].ouro == medalhas[maior].ouro && medalhas[j].prata == medalhas[maior].prata && 
                 medalhas[j].bronze > medalhas[maior].bronze) ||
                  (medalhas[j].ouro == medalhas[maior].ouro && medalhas[j].prata == medalhas[maior].prata && medalhas[j].bronze == medalhas[maior].bronze &&
                   medalhas[j].nome.compareTo(medalhas[maior].nome) < 0))  {
                    maior = j;
                }
            }
            swap(i,maior,medalhas);
        }
        for(int i = 0; i < numeroPaises; i++) {
            System.out.println(medalhas[i].nome + " " + medalhas[i].ouro + " " + medalhas[i].prata + " " + medalhas[i].bronze + " " );
        }
        n.close();
    }

    public static void swap(int i, int maior, Medalhas array[]) {
		Medalhas temp = array[i];
		array[i] = array[maior];
		array[maior] = temp;
	}



    
}
    