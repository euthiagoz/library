import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Library {
    String titulo;
    String autor;
    boolean disponivel;
    private LocalDate dataEmprestimo;

    private LocalDate dataDevolucao;


    public Library(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println();

            dataEmprestimo = LocalDate.now();
            dataDevolucao = dataEmprestimo.plusDays(14);

            System.out.println("Seu prazo de devolução é na data " + dataDevolucao);
        }else {
            System.out.println("Livro indisponível " + titulo);
        }
    }

    public void devolver() {
        disponivel = true;
        System.out.println("Livro devolvido " + titulo);
    }
}
