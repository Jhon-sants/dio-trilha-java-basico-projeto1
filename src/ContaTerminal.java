import java.util.Locale;
import java.util.Scanner;

//Código do aluno Jonathan Nascimento Santos.

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o seu nome completo: ");
        String nomeCliente = entrada.next();

        System.out.print("Número de usuário: ");
        int numUsuario = entrada.nextInt();

        System.out.print("Agência: ");
        String numAgencia = entrada.next();

        System.out.print("Valor de depósito: ");
        double saldo = entrada.nextDouble();

        entrada.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + numAgencia + ", conta " + numUsuario + ". Seu saldo de " + saldo
                + " reais já está disponível para saque.");

    }
}
