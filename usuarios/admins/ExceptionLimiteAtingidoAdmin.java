package usuarios.admins;

public class ExceptionLimiteAtingidoAdmin extends Exception {
    public ExceptionLimiteAtingidoAdmin(){
        super("O limite de admins cadastrados foi atingido");
    }
}
