import java.io.PrintStream;

public class Sistema {
    public static void main(String[] args) {
        Library livro1 = new Library("O Livro Do Ego", "Osho");
        Library livro2 = new Library("O Livro das Crianças", "Osho");

        Client client1 = new Client("Thiago");

        client1.pegarEmprestado(livro1);
        client1.pegarEmprestado(livro2);

        client1.devolverLivro(livro1);
    }
}
