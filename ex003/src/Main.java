import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        int[] numeros = {2,99,3,0,4,84,220};
        String[] car = {"ford","fiat","jeep"};
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(car));
        System.out.println("me diga o tamanho das strings : ");
        System.out.println("string dos numeros : " + numeros.length);
        System.out.println("string das strings : " + car.length);
        for(int i = 0; i < 5; i++)
        {
            System.out.println(i);
        }
    }
}