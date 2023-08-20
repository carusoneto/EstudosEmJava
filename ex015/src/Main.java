import java.util.Scanner;

class Numero
{
    private int num1;
    private int num2;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum2() {
        return num2;
    }
    int mult()
    {
        return num1 * num2;
    }
    float divi()
    {
        return (float) num1 / (float) num2;
    }
}



public class Main
{
    public static void main(String[] args)
    {
        Numero opcpesaritimeticas = new Numero();
        opcpesaritimeticas.setNum1(5);
        opcpesaritimeticas.setNum2(20);
        System.out.println("o meu atributo numero1 tem um valor de : " + opcpesaritimeticas.getNum1());
        System.out.println("o meu atributo numero2 tem um valor de : " + opcpesaritimeticas.getNum2());
        System.out.println("e agora vamos chamar dois metodos aritimeticos para fazer calculos");
        System.out.print("numero1 que é igual a : " + opcpesaritimeticas.getNum1() + " multiplicado por ");
        System.out.println("numero2 que igual a : " + opcpesaritimeticas.getNum2() + " é : " + opcpesaritimeticas.mult());
        System.out.print("numero1 que igual a : " + opcpesaritimeticas.getNum1() + " dividido por ");
        System.out.println("numero2 que igual a : " + opcpesaritimeticas.getNum2() + " é : " + opcpesaritimeticas.divi());
        System.out.println("agora quero que voce me digite dois novos numeros ");
        System.out.print("me digite o primeiro numero novo : ");
        Scanner numero3scanner = new Scanner(System.in);
        int numero3 = numero3scanner.nextInt();
        System.out.print("me digite o segundo numero novo : ");
        Scanner numero4scanner = new Scanner(System.in);
        int numero4 = numero4scanner.nextInt();
        Numero opcpesaritimeticas2 = new Numero();
        int soma = numero3 + numero4;
        System.out.print("o primeiro numero novo que é : " + numero3 + " somado ao segundo numero novo que é : ");
        System.out.println(numero4 + " é : " + soma);
        ;
    }

}