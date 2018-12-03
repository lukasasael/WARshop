package servicos;

public class ExceptionServicoJaExiste extends Exception {
    public ExceptionServicoJaExiste() {
        super("Este servico ja se encontra no sistema!");
    }
}
