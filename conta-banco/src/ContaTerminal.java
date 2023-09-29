import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
        public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println(" Olá cliente! Digite seu nome, por favor.");
            String nomecliente = scanner.next();
            
            System.out.println("Sua agência.");
            String agencia = scanner.next();

            System.out.println("Agora, digite o número da Agência ");
            int numero = scanner.nextInt();
            
            System.out.println("Digite seu saldo.");
            double saldo = scanner.nextDouble();

            
            //imprimindo os dados obtidos pelo usuario
            System.out.println("Ola" + nomecliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        }
        
    }
}