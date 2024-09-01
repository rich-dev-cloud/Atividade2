import java.util.Scanner;

public class ProcessaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita a entrada do usuário
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();
        
        // 1. Número de caracteres da string
        int numCaracteres = input.length();
        


        String stringMaiuscula = input.toUpperCase();
        
        // 3. Número de vogais na string
        int numVogais = contarVogais(input);
        
        // 4. Verificar se a string começa com "UNI" (ignorando maiúsculas/minúsculas)
        boolean comecaComUni = stringMaiuscula.startsWith("UNI");
        
        // 5. Verificar se a string termina com "RIO" (ignorando maiúsculas/minúsculas)
        boolean terminaComRio = stringMaiuscula.endsWith("RIO");
        
        // Exibir os resultados
        System.out.println("Número de caracteres: " + numCaracteres);
        System.out.println("String em maiúsculo: " + stringMaiuscula);
        System.out.println("Número de vogais: " + numVogais);
        System.out.println("Começa com 'UNI': " + comecaComUni);
        System.out.println("Termina com 'RIO': " + terminaComRio);
        
        scanner.close();
    }
    
    // Função para contar o número de vogais na string
    public static int contarVogais(String str) {
        int count = 0;
        String vogais = "aeiouAEIOU";
        
        for (int i = 0; i < str.length(); i++) {
            if (vogais.indexOf(str.charAt(i)) != -1) {
                count++;
            }
        }
        
        return count;
    }
}