import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String agencia =getInput("Por favor, digite o número da Agência", scanner);
        String nome  = getInput("Qual o seu nome? ", scanner);
        int numero =  Integer.valueOf(getInput("Qual o número de seu banco? ", scanner));
        double saldo = Double.valueOf(getInput("Qual o saldo? ", scanner));
        
        printData(agencia, nome, numero, saldo);
    }
    public static void printData(String agencia, String nome, int numero, double saldo){
        System.out.println("Olá ".concat(nome).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia).concat(", conta ").concat(String.valueOf(numero)).concat(" e seu saldo ").concat(Double.toString(saldo)).concat(" já está disponível para saque"));
    }

    public static String getInput(String prompt, Scanner scanner){
        
        System.out.println(prompt);
        return scanner.nextLine();
    }

}
