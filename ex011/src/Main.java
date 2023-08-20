public class Main {
    public static void main(String[] args) {
        //int[][] num = {{2,3},{4,0},{4,9}};
        for(int i = 0; i <= 100; i++)
        {
           if (i % 2 != 1)
               System.out.print(" [ " + i + " ] ");
           else
               System.out.print(i);
        }
    }
}