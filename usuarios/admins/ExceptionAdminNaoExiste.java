package usuarios.admins;

public class ExceptionAdminNaoExiste extends Exception{
    public ExceptionAdminNaoExiste(){
        super("O admin não existe");
    }
}
