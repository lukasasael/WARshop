package fachada;

import compras.*;
import fornecedores.*;
import produtos.produto.*;
import servicos.*;
import usuarios.admins.*;
import usuarios.comuns.*;


public class Fachada {
    private CadastroAdmin admin;
    private CadastroUsuario usuario;
    private CadastroFornecedor fornecedor;
    private CadastroServico servico;
    private CadastroCompras compras;

    public Fachada(boolean tipo) {
        usuario = new CadastroUsuario(tipo);
        admin = new CadastroAdmin(tipo);
        fornecedor = new CadastroFornecedor(tipo);
        servico = new CadastroServico(tipo);
        compras = new CadastroCompras(tipo);
    }

    public void cadastrarUsuario(UsuarioComum user) throws ExceptionLimiteAtingidoComum, ExceptionUsuarioJaExiste {
        this.usuario.cadastrar(user);
    }

    public void removerUsuario(String CPF) throws ExceptionUsuarioNaoExiste {
        this.usuario.remover(CPF);
    }

    public UsuarioComum procurarUsuario(String CPF) throws ExceptionUsuarioNaoExiste {
        return this.usuario.procurar(CPF);
    }

    public boolean existeUsuario(String CPF) {
        return this.usuario.existe(CPF);
    }

    public void atualizarNomeUsuario(String CPF, String nome) throws ExceptionUsuarioNaoExiste {
        this.usuario.atualizaNome(CPF, nome);
    }

    public void atualizaIdadeUsuario(String CPF, int idade) throws ExceptionUsuarioNaoExiste {
        this.usuario.atualizaIdade(CPF, idade);
    }

    public void atualizaTelefoneUsuario(String CPF, String telefone) throws ExceptionUsuarioNaoExiste {
        this.usuario.atualizaTelefone(CPF, telefone);
    }

    public void atualizaCEPUsuario(String CPF, String CEP) throws ExceptionUsuarioNaoExiste {
        this.usuario.atualizaCEP(CPF, CEP);
    }

    public void atualizaNumeroCartao(String CPF, String numeroCartao) throws ExceptionUsuarioNaoExiste {
        this.usuario.atualizaNumeroCartao(CPF, numeroCartao);
    }

    public void cadastrarAdmin(UsuarioAdmin user) throws ExceptionLimiteAtingidoAdmin, ExceptionAdminJaExiste {
        this.admin.cadastrar(user);
    }

    public void removerAdmin(String CPF) throws ExceptionAdminNaoExiste {
        this.admin.remover(CPF);
    }

    public UsuarioAdmin procurarAdmin(String CPF) throws ExceptionAdminNaoExiste {
        return this.admin.procurar(CPF);
    }

    public boolean existeAdmin(String CPF) {
        return this.admin.existe(CPF);
    }

    public void atualizarNomeAdmin(String CPF, String nome) throws ExceptionAdminNaoExiste {
        this.admin.atualizaNome(CPF, nome);
    }

    public void atualizaIdadeAdmin(String CPF, int idade) throws ExceptionAdminNaoExiste {
        this.admin.atualizaIdade(CPF, idade);
    }

    public void atualizaTelefoneAdmin(String CPF, String telefone) throws ExceptionAdminNaoExiste {
        this.admin.atualizaTelefone(CPF, telefone);
    }

    public void atualizaCEPAdmin(String CPF, String CEP) throws ExceptionAdminNaoExiste {
        this.admin.atualizaCEP(CPF, CEP);
    }

    public void atualizarCodigoFuncionarioAdmin(String CPF, String codigo) throws ExceptionAdminNaoExiste {
        this.admin.atualizaCodigoFuncionario(CPF, codigo);
    }

    public void inserirFornecedor(Fornecedor fornecedor) throws ExceptionLimiteAtingidoFornecedor, ExceptionFornecedorJaCadastrado {
        this.fornecedor.inserir(fornecedor);
    }

    public void deletarFornecedor(String marca) throws ExceptionFornecedorNaoExiste {
        this.fornecedor.deletar(marca);
    }

    public Fornecedor procurarFornecedor(String marca) throws ExceptionFornecedorNaoExiste {
        return this.fornecedor.procurar(marca);
    }

    public void atualizaMarcaFornecedor(String marca, String novaMarca) throws ExceptionFornecedorNaoExiste {
        this.fornecedor.atualizaMarca(marca, novaMarca);
    }

    public void atualizaContatoFornecedor(String marca, String contato) throws ExceptionFornecedorNaoExiste {
        this.fornecedor.atualizaContato(marca, contato);
    }

    public void atualizaTipoProdutoFornecedor(String marca, String tipoProduto) throws ExceptionFornecedorNaoExiste {
        this.fornecedor.atualizaTipoProduto(marca, tipoProduto);
    }

    public void atualizaDisponibilidadeFornecedor(String marca, boolean disponibilidade) throws ExceptionFornecedorNaoExiste {
        this.fornecedor.atualizaDisponibilidade(marca, disponibilidade);
    }

    public void cadastrarServico(Servico servico) throws ExceptionServicoJaExiste, ExceptionLimiteAtingidoServico {
        this.servico.cadastrar(servico);
    }

    public void removerServico(String nome) throws ExceptionServicoNaoExiste {
        this.servico.remover(nome);
    }

    public Servico procurarServico(String nome) throws ExceptionServicoNaoExiste {
        return this.servico.procurar(nome);
    }

    public boolean existeServico(String nome) {
        return this.servico.existe(nome);
    }

    public void atualizaNomeServico(String nome, String decricao) throws ExceptionServicoNaoExiste {
        this.servico.atualizaNome(nome, decricao);
    }

    public void atualizaDescricaoServico(String descricao, String nome) throws ExceptionServicoNaoExiste {
        this.servico.atualizaDescricao(descricao, nome);
    }

    public void atualizaValorServico(double valor, String nome) throws ExceptionServicoNaoExiste {
        this.servico.atualizaValor(valor, nome);
    }

    public void atualizaEntregaServico(int dias, String nome) throws ExceptionServicoNaoExiste {
        this.servico.atualizaEntrega(dias, nome);
    }

    public void adicionarItem(Produto produto) throws ExceptionLimiteAtingidoCompras {
        this.compras.adicionarItem(produto);
    }

    public void removerItem(String nome) throws ExceptionItemNaoEstaNoCarrinho {
        this.compras.removerItem(nome);
    }

    public Produto procurarItem(String nome) throws ExceptionItemNaoEstaNoCarrinho {
        return this.compras.procurarItem(nome);
    }

    public boolean existeItem(String nome) {
        return this.compras.existe(nome);
    }

    public int inserirCupom(int codCupom) {
        return this.compras.inserirCupom(codCupom);
    }

    public int calcularFrete(int cep) {
        return this.compras.calcularFrete(cep);
    }
}