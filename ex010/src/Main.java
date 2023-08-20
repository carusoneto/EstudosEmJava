import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*String[] frutas = {"maça","banan","uva"};
        int tamanho = frutas.length;
        for(int i = 0; i < frutas.length ; i++)
        {
            System.out.println(frutas[i]);
        }*/
        System.out.println("\t PREÇOS");
        //System.out.println(" \n [1] - banana \n [2] - maçã \n [3] - uva");
        //System.out.print("escolha qual a fruta que voce quer saber o preço : ");
        System.out.print("digite o nome do produto : ");
        Scanner escolhaScanner = new Scanner(System.in);
        String escolha = escolhaScanner.next().toLowerCase();
        switch (escolha)
        {
            case "banana":
                System.out.println("o preço da banana é : 2,00");
            break;
            case "maçã":
                System.out.println("o preço da maçã é : 5,00");
            break;
            case "uva":
                System.out.println("o preço da uva é : 10,00");
            break;
            default:
                System.out.println("opção não validada");
        }
    }
}