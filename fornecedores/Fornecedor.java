package fornecedores;

public class Fornecedor {
    // Identificador para o usuario.
    protected String marca;
    // Identificador para o admin.
    protected String contato;
    // Tipo de produto que o fornecedor vende.
    protected String tipoproduto;
    // Se o fornecedor esta disposto a suprir nosso estoque.
    protected boolean disponibilidade;

    // Inicializadores.
    public Fornecedor(String marca, String contato, String tipoproduto, boolean disponibilidade) {
        this.marca = marca;
        this.contato = contato;
        this.tipoproduto = tipoproduto;
        // Construtor para true, ja que por razoes logicas, se um fornecedor esta sendo cadastrado
        // ele esta com estoque disponivel para negociar.
        this.disponibilidade = true;
    }

    // Getters e Setters.
    public String getMarca() {
        return marca;
    }

    public void setMarca (String marca) {
        this.marca = marca;
    }

    public String getContato() {
        return contato;
    }

    public void setContato (String contato) {
        this.contato = contato;
    }

    public String getTipoProduto() {
        return tipoproduto;
    }

    public void setTipoProduto (String tipoproduto) {
        this.tipoproduto = tipoproduto;
    }

    public boolean getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade (boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}