package usuarios.comuns;

public class RepositorioUsuarioComumLista implements RepositorioUsuarioComumInterface {
    UsuarioComum user;
    RepositorioUsuarioComumLista prox;

    public RepositorioUsuarioComumLista() {
    }

    @Override
    public void inserir(UsuarioComum user) throws ExceptionUsuarioJaExiste {
        if (this.user == null) {
            this.user = user;
            this.prox = new RepositorioUsuarioComumLista();
        } else if (this.user.getCPF() == user.getCPF()) {
            throw new ExceptionUsuarioJaExiste();
        } else {
            this.prox.inserir(user);
        }
    }

    @Override
    public UsuarioComum procurar(String CPF) throws ExceptionUsuarioNaoExiste {
        if (this.user.getCPF() != null) {
            if (this.user.getCPF().equals(CPF)) {
                return this.user;
            } else {
                return this.prox.procurar(CPF);
            }
        } else {
            throw new ExceptionUsuarioNaoExiste();
        }
    }

    @Override
    public void deletar(String CPF) throws ExceptionUsuarioNaoExiste {
        if (this.user.getCPF() != null) {
            if (this.user.getCPF().equals(CPF)) {
                this.user = this.prox.user;
                this.prox = this.prox.prox;
            } else {
                this.prox.deletar(CPF);
            }
        } else {
            throw new ExceptionUsuarioNaoExiste();
        }
    }

    public boolean existe(String CPF) {
        if (this.user.getCPF() != null) {
            if (this.user.getCPF().equals(CPF)) {
                return true;
            } else {
                return this.prox.existe(CPF);
            }
        } else {
            return false;
        }
    }

    @Override
    public void atualizaNome(String CPF, String nome) throws ExceptionUsuarioNaoExiste {
        if (this.user.getCPF() != null) {
            if (this.user.getCPF().equals(CPF)) {
                this.user.setNome(nome);
            } else {
                this.prox.atualizaNome(CPF, nome);
            }
        } else {
            throw new ExceptionUsuarioNaoExiste();
        }
    }

    @Override
    public void atualizaIdade(String CPF, int idade) throws ExceptionUsuarioNaoExiste {
        if (this.user.getCPF() != null) {
            if (this.user.getCPF().equals(CPF)) {
                this.user.setIdade(idade);
            } else {
                this.prox.atualizaIdade(CPF, idade);
            }
        } else {
            throw new ExceptionUsuarioNaoExiste();
        }
    }

    @Override
    public void atualizaTelefone(String CPF, String telefone) throws ExceptionUsuarioNaoExiste {
        if (this.user.getCPF() != null) {
            if (this.user.getCPF().equals(CPF)) {
                this.user.setTelefone(telefone);
            } else {
                this.prox.atualizaTelefone(CPF, telefone);
            }
        } else {
            throw new ExceptionUsuarioNaoExiste();
        }
    }

    @Override
    public void atualizaCEP(String CPF, String CEP) throws ExceptionUsuarioNaoExiste {
        if (this.user.getCPF() != null) {
            if (this.user.getCPF().equals(CPF)) {
                this.user.setCEP(CEP);
            } else {
                this.prox.atualizaCEP(CPF, CEP);
            }
        } else {
            throw new ExceptionUsuarioNaoExiste();
        }
    }

    @Override
    public void atualizaNumeroCartao(String CPF, String numeroCartao) throws ExceptionUsuarioNaoExiste {
        if (this.user.getCPF() != null) {
            if (this.user.getCPF().equals(CPF)) {
                this.user.setNumeroCartao(numeroCartao);
            } else {
                this.prox.atualizaNumeroCartao(CPF, numeroCartao);
            }
        } else {
            throw new ExceptionUsuarioNaoExiste();
        }
    }
}
