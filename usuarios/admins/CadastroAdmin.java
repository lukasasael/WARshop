package usuarios.admins;

public class CadastroAdmin {
    private RepositorioUsuarioAdminInterface lista;

    public CadastroAdmin(boolean tipo) {
        if (tipo) {
            this.lista = new RepositorioUsuarioAdminLista();
        } else {
            this.lista = new RepositorioUsuarioAdminArray();
        }
    }

    public void cadastrar(UsuarioAdmin admin) throws ExceptionLimiteAtingidoAdmin, ExceptionAdminJaExiste {
        this.lista.inserir(admin);
    }

    public void remover(String cpf) throws ExceptionAdminNaoExiste {
        this.lista.deletar(cpf);
    }

    public UsuarioAdmin procurar(String cpf) throws ExceptionAdminNaoExiste {
        return this.lista.procurar(cpf);
    }

    public boolean existe(String cpf) {
        return this.lista.existe(cpf);
    }


    public void atualizaNome(String CPF, String nome) throws ExceptionAdminNaoExiste {
        this.lista.atualizaNome(CPF, nome);
    }

    public void atualizaIdade(String CPF, int idade) throws ExceptionAdminNaoExiste {
        this.lista.atualizaIdade(CPF, idade);
    }

    public void atualizaTelefone(String CPF, String telefone) throws ExceptionAdminNaoExiste {
        this.lista.atualizaTelefone(CPF, telefone);
    }

    public void atualizaCEP(String CPF, String CEP) throws ExceptionAdminNaoExiste {
        this.lista.atualizaCEP(CPF, CEP);
    }

    public void atualizaCodigoFuncionario(String CPF, String codigo) throws ExceptionAdminNaoExiste {
        this.lista.atualizaCodigoFuncionario(CPF, codigo);
    }
}

