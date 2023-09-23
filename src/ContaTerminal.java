import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static <Int> void main(String[] args) {
        try (//criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {

            System.out.println("Digite numero da agencia!");
            String agencia = scanner.next();

            System.out.println("Digite seu nome!");
            String nomecliente = scanner.next();
                                  
            System.out.println("Digite numero da conta!");
            String numeroconta = scanner.next();
                        
            System.out.println("Digite o valor de deposito!");
            double saldo = scanner.nextDouble();
            
            //imprimindo os dados obtidos pelo usuario
            System.out.println("Ola," + nomecliente + " obrigado por criar uma conta em nosso banco, sua conta é " + numeroconta + " e agencia " + agencia + ",seu valor para saque é " + saldo );
            
        }
        
        
    }
}
