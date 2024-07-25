import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Por favor, Digite o seu Nome:");
        String nome = scanner.nextLine();

        System.out.println("Por favor, Digite sua Agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, Digite o seu número:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, Digite o seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta com nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque");
                
    }
    
}
