import java.util.Scanner;
public class ContaTerminal {
    
    public static void main(String[] args) {
        // TODO: Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);

        //Exibir as mensagens para o usuário
        System.out.println("Digite o número da conta: ");
        int numero = sc.nextInt();

        System.out.println("Digite o número da agência: ");
        String agencia = sc.next();
        // limpeza crucial do buffer do teclado
        sc.nextLine();
        
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Digite o saldo da conta: ");
        double saldo = sc.nextDouble();

        //Exibir as informações da conta
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso");
        System.out.println("banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    
        sc.close();
    }

}
