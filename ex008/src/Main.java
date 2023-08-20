
import java.text.NumberFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.print("digite o seu nome : ");
        Scanner nomeScanner = new Scanner(System.in);
        String nome = nomeScanner.next();
        System.out.println("seja muito bem vindo " + nome);
        System.out.print("digite o valor do seu salario : ");
        Scanner valorSalarioScanner = new Scanner(System.in);
        String valorSalario = valorSalarioScanner.next();
        double aumentoSalario = Double.parseDouble(valorSalario) + 50.5;

        System.out.println("o valor do seu salario com o almento é : " + Math.round(aumentoSalario));
    }
}