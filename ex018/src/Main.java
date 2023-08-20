import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

            System.out.print("digite um numero : ");
            Scanner numeroScanner = new Scanner(System.in);
            int numero = numeroScanner.nextInt();

            if (numero >= 0 && numero <= 9) {
                System.out.println("esse numero tem 1 digito");
            } else if (numero > 9 && numero <= 99) {
                System.out.println("esse numero tem 2 digitos");
            } else if (numero > 99 && numero <= 999) {
                System.out.println("esse numero tem 3 digitos");
            } else if (numero > 999 && numero <= 9_999) {
                System.out.println("esse numero tem 4 digitos");
            } else {
                System.out.println("esse numero tem 5 digitos ou mais");
            }
    }
}