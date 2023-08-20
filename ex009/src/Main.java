import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {

        NumberFormat real = NumberFormat.getCurrencyInstance();
        String valor = real.format(100);
        System.out.println(valor);

    }
}