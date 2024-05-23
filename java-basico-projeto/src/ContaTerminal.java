import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o usuário
        System.out.println("Por favor, digite o número da Agência !");
        //Obter pela scanner os valores digitados no terminal
        int numero = scanner.nextInt();

        //Exibir as mensagens para o usuário
        System.out.println("Por favor, digite a Agência !");
        //Obter pela scanner os valores digitados no terminal
        String  agencia = scanner.next();

        //Exibir as mensagens para o usuário
        System.out.println("Por favor, digite o seu nome !");
        //Obter pela scanner os valores digitados no terminal
        String nomeCliente = scanner.next();
        scanner.nextLine();

        //Exibir as mensagens para o usuário
        System.out.println("Por favor, digite o saldo !");
        //Obter pela scanner os valores digitados no terminal
        double saldo = scanner.nextDouble();

        //Exibir a mensagem da conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}