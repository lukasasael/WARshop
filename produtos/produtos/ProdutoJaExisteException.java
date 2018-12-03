package produto;

public class ProdutoJaExisteException extends Exception{
    public ProdutoJaExisteException(){
        super("O acessório já existe no sistema");
    }
}
