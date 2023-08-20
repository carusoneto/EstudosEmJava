import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] valores = {99,331,6452,7,0,2546,12,87};
        String[] linguagens = {"java","python","php","c","c#","c++"};
        // organização do array valores
        Arrays.sort(valores);
        System.out.println(Arrays.toString(valores));
        System.out.println("qual o tamanho desse array ? ");
        System.out.println("o tamanho do array valores é : " + valores.length);
        System.out.println("o valor que está no indicie 2 é : " + valores[2]);
        // organização do array linguagens

        Arrays.sort(linguagens);
        System.out.println(Arrays.toString(linguagens));
        System.out.println("o tamanho do array linguagens é : " + linguagens.length);


    }
}