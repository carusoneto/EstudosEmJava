
class Numero
{
    int num1;
    int num2;
    int soma()
    {
       return num1 + num2;
    }
}

class Pessoa
{
    String nome;
    int idade;
    void mostrardados()
    {
        System.out.println("o meu nome é : " + nome + " e a minha idade é : " + idade + " anos ");
    }
}



public class Main
{
    public static void main(String[] args)
    {
        Numero opcpes = new Numero();
        opcpes.num1 = 10;
        opcpes.num2 = 20;
        System.out.println(opcpes.soma());

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "junior";
        pessoa1.idade = 18;
        pessoa1.mostrardados();
    }
}