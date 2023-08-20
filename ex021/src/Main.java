import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("digite um numero um operador e outro numero : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        char op = sc.next().charAt(0);
        int num2 = sc.nextInt();
        if (op == '+')
            System.out.println(num1 + num2);
        else if (op == '-')
            System.out.println(num1 - num2);
        }
}