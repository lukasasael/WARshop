package cadastros;

import usuarios.comuns.*;

public class CadastroUsuario {
    private RepositorioUsuarioComumInterface lista;

    public CadastroUsuario(boolean tipo) {
        if (tipo) {
            this.lista = new RepositorioUsuarioComumLista();
        } else {
            this.lista = new RepositorioUsuarioComumArray();
        }
    }

    public void cadastrar(UsuarioComum user) throws
            ExceptionLimiteAtingidoComum, ExceptionUsuarioJaExiste {
        this.lista.inserir(user);
    }

    public void remover(String cpf) throws ExceptionUsuarioNaoExiste {
        this.lista.deletar(cpf);
    }

    public UsuarioComum procurar(String cpf) throws ExceptionUsuarioNaoExiste {
        return this.lista.procurar(cpf);
    }

    public boolean existe(String cpf) {
        return this.lista.existe(cpf);
    }

    public void atualizaNome(String CPF, String nome) throws ExceptionUsuarioNaoExiste {
        this.lista.atualizaNome(CPF, nome);
    }

    public void atualizaIdade(String CPF, int idade) throws ExceptionUsuarioNaoExiste {
        this.lista.atualizaIdade(CPF, idade);
    }

    public void atualizaTelefone(String CPF, String telefone) throws ExceptionUsuarioNaoExiste {
        this.lista.atualizaTelefone(CPF, telefone);
    }

    public void atualizaCEP(String CPF, String CEP) throws ExceptionUsuarioNaoExiste {
        this.lista.atualizaCEP(CPF, CEP);
    }

    public void atualizaNumeroCartao(String CPF, String numero) throws ExceptionUsuarioNaoExiste {
        this.lista.atualizaNumeroCartao(CPF, numero);
    }
}
