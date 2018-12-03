package usuarios.comuns;

public class ExceptionUsuarioJaExiste extends Exception {
    public ExceptionUsuarioJaExiste() { super("O usuário já existe"); }
}
