package usuarios.admins;

public class RepositorioUsuarioAdminLista implements RepositorioUsuarioAdminInterface {
    UsuarioAdmin admin;
    RepositorioUsuarioAdminLista prox;

    public RepositorioUsuarioAdminLista() {
    }

    public void inserir(UsuarioAdmin admin) throws ExceptionAdminJaExiste {
        if (this.admin == null) {
            this.admin = admin;
            this.prox = new RepositorioUsuarioAdminLista();
        } else if (this.admin.getCPF() == admin.getCPF()) {
            throw new ExceptionAdminJaExiste();
        } else {
            this.prox.inserir(admin);
        }
    }

    public UsuarioAdmin procurar(String CPF) throws ExceptionAdminNaoExiste {
        if (this.admin.getCPF() != null) {
            if (this.admin.getCPF().equals(CPF)) {
                return this.admin;
            } else {
                return this.prox.procurar(CPF);
            }
        } else {
            throw new ExceptionAdminNaoExiste();
        }
    }

    public void deletar(String CPF) throws ExceptionAdminNaoExiste {
        if (this.admin.getCPF() != null) {
            if (this.admin.getCPF().equals(CPF)) {
                this.admin = this.prox.admin;
                this.prox = this.prox.prox;
            } else {
                this.prox.deletar(CPF);
            }
        } else {
            throw new ExceptionAdminNaoExiste();
        }
    }

    public boolean existe(String CPF) {
        if (this.admin.getCPF() != null) {
            if (this.admin.getCPF().equals(CPF)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public void atualizaNome(String CPF, String nome) throws ExceptionAdminNaoExiste {
        if (this.admin.getCPF() != null) {
            if (this.admin.getCPF().equals(CPF)) {
                this.admin.setNome(nome);
            } else {
                this.prox.atualizaNome(CPF, nome);
            }
        } else {
            throw new ExceptionAdminNaoExiste();
        }
    }

    public void atualizaIdade(String CPF, int idade) throws ExceptionAdminNaoExiste {
        if (this.admin.getCPF() != null) {
            if (this.admin.getCPF().equals(CPF)) {
                this.admin.setIdade(idade);
            } else {
                this.prox.atualizaIdade(CPF, idade);
            }
        } else {
            throw new ExceptionAdminNaoExiste();
        }
    }

    public void atualizaTelefone(String CPF, String telefone) throws ExceptionAdminNaoExiste {
        if (this.admin.getCPF() != null) {
            if (this.admin.getCPF().equals(CPF)) {
                this.admin.setTelefone(telefone);
            } else {
                this.prox.atualizaTelefone(CPF, telefone);
            }
        } else {
            throw new ExceptionAdminNaoExiste();
        }
    }

    public void atualizaCEP(String CPF, String CEP) throws ExceptionAdminNaoExiste {
        if (this.admin.getCPF() != null) {
            if (this.admin.getCPF().equals(CPF)) {
                this.admin.setCEP(CEP);
            } else {
                this.prox.atualizaCEP(CPF, CEP);
            }
        } else {
            throw new ExceptionAdminNaoExiste();
        }
    }

    public void atualizaCodigoFuncionario(String CPF, String codigoFuncionario) throws ExceptionAdminNaoExiste {
        if (this.admin.getCPF() != null) {
            if (this.admin.getCPF().equals(CPF)) {
                this.admin.setCodigoFuncionario(codigoFuncionario);
            } else {
                this.prox.atualizaCodigoFuncionario(CPF, codigoFuncionario);
            }
        } else {
            throw new ExceptionAdminNaoExiste();
        }
    }
}
