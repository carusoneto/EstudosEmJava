import java.util.*;

public class Main {
    public static void main(String[] args)
    {
         char resp = 's';
        while (resp == 's'){

            System.out.print("digite qualquer numero : ");
            Scanner sc = new Scanner(System.in);
            int numero = sc.nextInt();
            if (numero % 2 != 0)
                System.out.println(" o numero é impar  ");
            else if (numero >= 2 && numero <= 5)
                System.out.println(" o numero é par e está entre 2 e 5");
            else if (numero >= 6 && numero <= 20)
                System.out.println(" o numero é par e está entre  6 e 20");
            else
                System.out.println(" o numero é par e está acima de 20");
            System.out.print("voce deseja fazer a verificação novamente [s] [n] : ");
            Scanner respScanner = new Scanner(System.in);
            resp = respScanner.next().charAt(0);

        }
    }
}