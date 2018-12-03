package usuarios.comuns;

public class ExceptionUsuarioNaoExiste extends Exception{
    public ExceptionUsuarioNaoExiste(){
        super("O usuário não existe");
    }
}
