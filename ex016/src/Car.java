import java.text.Format;

public class Car {
    private String marca;
    private String modelo;
    private int ano;
    private double valor;
    Car(String marca, String modelo, int ano, double valor)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
        System.out.println(marca +"\n" + modelo + "\n" + ano + "\n valor do veiculo : " + valor);
    }

    double getValor()
    {
        return valor;
    }

    double valorVenda()
    {
        double valorizacao = getValor() * 0.10;
        double vfinal = getValor() + valorizacao;
        return vfinal;
    }
}
