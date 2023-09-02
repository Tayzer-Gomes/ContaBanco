import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numero;
        String agencia, nomeCliente;
        double saldo;

        Scanner ler = new Scanner(System.in);
        System.out.print("Por favor! Digite o número da conta!");
        numero = ler.nextInt();

        System.out.print("Por favor! Digite a agência!");
        agencia = ler.next();

        System.out.print("Por favor! Digite o nome do cliente!");
        nomeCliente = ler.next();
        
        System.out.print("Por favor! Digite seu saldo!");
        saldo = ler.nextDouble();

        System.out.println("Olá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ".concat(agencia).concat(", conta ")).concat(Integer.toString(numero)).concat(" e seu saldo ").concat(Double.toString(saldo).concat(" já está disponível para saque.")));

    }
}
