import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("digite o primeiro numero : ");
        Scanner scanner = new Scanner(System.in);
        int numero1 = scanner.nextInt();
        System.out.print("digite o segundo numero : ");
        // Scanner numero2scanner = new Scanner(System.in);
        int numero2 = scanner.nextInt();
        System.out.print("digite o terceiro numero : ");
        // Scanner numero3scanner = new Scanner(System.in);
        int numero3 = scanner.nextInt();
        System.out.println("os numeros digitados foram : " + numero1 + " " + numero2 + " " + numero3);
    }
}