package servicos;

public class ExceptionServicoNaoExiste extends Exception {
    public ExceptionServicoNaoExiste() {
        super("Este servico nao esta disponivel!");
    }
}