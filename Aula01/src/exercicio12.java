import java.util.Scanner;
import java.text.DecimalFormat;
public class exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Digite um valor em dólares: ");
        double dolar = Double.parseDouble(scanner.nextLine().replace(',', '.')); //converte pontos para vírgulas
        System.out.println("Você deseja converter para reais (R$) ou euros (€)? Digite 1 para reais ou 2 para euros: ");
        int moeda = Integer.parseInt(scanner.nextLine());
        System.out.println("Pesquise e digite o câmbio atual do U$ para a moeda escolhida: ");
        double cambio = Double.parseDouble(scanner.nextLine().replace(',', '.'));
        double conversao = dolar * cambio;

        if (moeda == 1) { //imprime a seleção do usuário na moeda escolhida
            System.out.println("\nU$" + df.format(dolar) + " em reais são R$" + df.format(conversao));
        } else if (moeda == 2) {
            System.out.println("\nU$" + df.format(dolar) + " em euro são €" + df.format(conversao));
        } else {
            System.out.println("Moeda desconhecida.");
        }
    }
}