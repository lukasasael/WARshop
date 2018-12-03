package usuarios.admins;

public class ExceptionAdminJaExiste extends Exception{
    public ExceptionAdminJaExiste(){
        super("O admin já existe");
    }
}
