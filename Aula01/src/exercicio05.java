import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int segundosCorridos = 0;
        int segundosFaltantes = 86400; //Quantidade de segundos em um dia

        System.out.println("Digite as horas: ");
        int h = scanner.nextInt();
        while (h > 23) { //Impede que o usuário digite mais que 23 horas.
            System.out.println("Digite uma hora válida.");
            h = scanner.nextInt();
        }
        System.out.println("Digite os minutos: ");
        int m = scanner.nextInt();
        while (m > 59) { //Impede que o usuário digite mais que 59 minutos.
            System.out.println("Digite os minutos de forma válida.");
            m = scanner.nextInt();
        }
        System.out.println("Digite os segundos: ");
        int s = scanner.nextInt();
        while (s > 59) { //Impede que o usário digite mais que 59 segundos.
            System.out.println("Digite os segundos de forma válida.");
            s = scanner.nextInt();
        }
        String horas = String.format("%02d:%02d:%02d" , h , m , s); //Imprime o horário em formato hh:mm:ss
        System.out.println("Você digitou: " + horas + " horas");
        segundosCorridos = s + (m*60) + (h*60*60);
        segundosFaltantes = segundosFaltantes - segundosCorridos;
        System.out.println("Passaram-se " + segundosCorridos + " segundos desde a meia-noite do dia anterior.");
        System.out.println("Faltam " + segundosFaltantes + " segundos para meia-noite.");
            }
        }