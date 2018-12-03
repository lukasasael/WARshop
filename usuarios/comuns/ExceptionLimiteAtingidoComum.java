package usuarios.comuns;

public class ExceptionLimiteAtingidoComum extends Exception {
    public ExceptionLimiteAtingidoComum(){
        super("O limite de usuarios cadastrados foi atingido");
    }
}
