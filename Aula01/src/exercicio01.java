import java.util.Scanner;
public class exercicio01 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");

        String userName = myObj.nextLine();
        System.out.println("Seu nome é: " + userName);
    }
}