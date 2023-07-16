import models.Pessoa;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(args[0]);
        System.out.println("Olá " + pessoa.getNome() + " seja bem vindo.");
    }
}
