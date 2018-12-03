package servicos;

public class ExceptionLimiteAtingidoServico extends Exception {
    public ExceptionLimiteAtingidoServico() {
        super("Limite de servicos atingido!");
    }
}
