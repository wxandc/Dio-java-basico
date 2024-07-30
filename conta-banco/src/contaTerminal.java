import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
                
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite sua conta");
        int conta = scanner.nextInt();

        System.out.println("Digite sua agencia");
        String agencia = scanner.next();

        System.out.println("Digite o nome do cliente");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque");
    }  
}
