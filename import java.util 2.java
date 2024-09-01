import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Graus Celsius: ");
        int temperatura = scanner.nextInt();

        System.out.println("A temperatura altual é "+ temperatura);

        if (temperatura > 30){
            System.out.println("A temperatura está quente");
        } else {
            System.out.println("A temperatura está fria.");
        }

        scanner.close();

    }
}