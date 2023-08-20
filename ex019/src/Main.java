import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] array1 =
        {
          8632,9842,62132,157,33278,12863,34,4652
        };
        String[] array2 =
        {
                "python",
                "java",
                "php",
                "c",
                "c#",
                "javascripty"
        };

        Arrays.sort(array1);
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}