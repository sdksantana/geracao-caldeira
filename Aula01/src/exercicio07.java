import java.util.Scanner;
import java.text.DecimalFormat;
public class exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("####");
        double salarioUsuario = -1;
        int idadeUsuario = -1;

        do {
            System.out.println("Digite sua idade: ");
            if (scanner.hasNextInt()) {
                idadeUsuario = scanner.nextInt();
                if (idadeUsuario < 0) {
                    System.out.println("Idade Inválida! Por favor, digite um número positivo.\n");
                }
            } else {
                System.out.println("Idade Inválida! Por favor, digite apenas números.\n");
                scanner.next();
                scanner.nextLine();
            }
        } while (idadeUsuario < 0);

        do {
            System.out.println("Digite seu salário: ");
            if (scanner.hasNextDouble()) {
                salarioUsuario = scanner.nextDouble();
                if (salarioUsuario < 0) {
                    System.out.println("Salário inválido! Por favor, digite um número positivo.\n");
                }
            } else {
                System.out.println("Salário inválido! Por favor, digite apenas números.\n");
                scanner.next();
                scanner.nextLine();
            }
        } while (salarioUsuario < 0);

        if (idadeUsuario >= 18 && salarioUsuario >= 2000) {
            System.out.println("Você tem " + idadeUsuario + " anos e recebe R$" + df.format(salarioUsuario) + ". Você pode adquirir um automóvel.");
        } else {
            System.out.println("Desculpe, idade ou salário insuficiente para adquirir automóvel.");
        }
    }
}
