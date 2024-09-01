import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        float x = scanner.nextFloat();

        System.out.println("Digite o segundo número: ");
        float y = scanner.nextFloat();

        if(x > y){
            System.out.println("O primeiro valor");
        }else if (x ==y ) {
            System.out.println("Os números são iguais");
        }else{
            System.out.println("O segundo valor é maior");
        }

        scanner.close();
    }
}