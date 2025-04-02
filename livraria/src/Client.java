import java.util.ArrayList;
import java.util.List;

public class Client {
    String nome;
    List<Library> livrosEmprestados;

    public Client(String nome) {
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<>();
    }

    public void pegarEmprestado(Library library) {
        if (library.disponivel) {
            library.emprestar();
            livrosEmprestados.add(library);
        } else {
            System.out.println("O livro já está emprestado.");
        }
    }

    public void devolverLivro(Library library) {
        if (livrosEmprestados.contains(library)) {
            library.devolver();
            livrosEmprestados.remove(library);
        } else {
            System.out.println("Este livro não foi emprestado por este usuário.");
        }
    }
}
