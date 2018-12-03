package usuarios.admins;

public class RepositorioUsuarioAdminArray implements RepositorioUsuarioAdminInterface {
    private UsuarioAdmin[] arrayAdmin = new UsuarioAdmin[1000];

    @Override
    public void inserir(UsuarioAdmin user) throws ExceptionLimiteAtingidoAdmin, ExceptionAdminJaExiste {
        for (int i = 0; i < arrayAdmin.length; i++) {
            if (arrayAdmin[i].getNome() == user.getNome()) {
                throw new ExceptionAdminJaExiste();
            } else if (arrayAdmin[i] == null) {
                this.arrayAdmin[i] = user;
                break;
            } else if (i == arrayAdmin.length) {
                if (arrayAdmin[i] == null) {
                    this.arrayAdmin[i] = user;
                    break;
                } else {
                    throw new ExceptionLimiteAtingidoAdmin();
                }
            }
        }
    }

    @Override
    public UsuarioAdmin procurar(String CPF) throws ExceptionAdminNaoExiste {
        for (int i = 0; i < arrayAdmin.length; i++) {
            if (arrayAdmin[i].getNome().equals(CPF)) {
                return arrayAdmin[i];
            } else if (arrayAdmin[i] == null) {
                throw new ExceptionAdminNaoExiste();
            }
        }
        return null;
    }

    @Override
    public void deletar(String CPF) throws ExceptionAdminNaoExiste {
        for (int i = 0; i < arrayAdmin.length; i++) {
            if (arrayAdmin[i].getCPF().equals(CPF)) {
                int posicaoEncontrada = i;
                for (int j = posicaoEncontrada; j < arrayAdmin.length; j++) {
                    if (arrayAdmin[j] != null) {
                        arrayAdmin[j] = arrayAdmin[j + 1];
                    } else {
                        break;
                    }
                }
            } else if (arrayAdmin[i] == null) {
                throw new ExceptionAdminNaoExiste();
            }
        }
    }

    @Override
    public boolean existe(String CPF) {
        for (int i = 0; i < arrayAdmin.length; i++) {
            if (arrayAdmin[i].getNome().equals(CPF)) {
                return true;
            } else if (arrayAdmin[i] == null) {
                return false;
            }
        }
        return false;
    }


    @Override
    public void atualizaNome(String CPF, String nome) throws ExceptionAdminNaoExiste {
        for (int i = 0; i < arrayAdmin.length; i++) {
            if (arrayAdmin[i].getCPF().equals(CPF)) {
                arrayAdmin[i].setNome(nome);
            } else if (arrayAdmin[i] == null) {
                throw new ExceptionAdminNaoExiste();
            }
        }
    }

    @Override
    public void atualizaIdade(String CPF, int idade) throws ExceptionAdminNaoExiste {
        for (int i = 0; i < arrayAdmin.length; i++) {
            if (arrayAdmin[i].getCPF().equals(CPF)) {
                arrayAdmin[i].setIdade(idade);
            } else if (arrayAdmin[i] == null) {
                throw new ExceptionAdminNaoExiste();
            }
        }
    }

    @Override
    public void atualizaTelefone(String CPF, String telefone) throws ExceptionAdminNaoExiste {
        for (int i = 0; i < arrayAdmin.length; i++) {
            if (arrayAdmin[i].getCPF().equals(CPF)) {
                arrayAdmin[i].setTelefone(telefone);
            } else if (arrayAdmin[i] == null) {
                throw new ExceptionAdminNaoExiste();
            }
        }
    }

    @Override
    public void atualizaCEP(String CPF, String CEP) throws ExceptionAdminNaoExiste {
        for (int i = 0; i < arrayAdmin.length; i++) {
            if (arrayAdmin[i].getCPF().equals(CPF)) {
                arrayAdmin[i].setCEP(CEP);
            } else if (arrayAdmin[i] == null) {
                throw new ExceptionAdminNaoExiste();
            }
        }
    }

    @Override
    public void atualizaCodigoFuncionario(String CPF, String codigoFuncionario) throws ExceptionAdminNaoExiste {
        for (int i = 0; i < arrayAdmin.length; i++) {
            if (arrayAdmin[i].getCPF().equals(CPF)) {
                arrayAdmin[i].setCodigoFuncionario(codigoFuncionario);
            } else if (arrayAdmin[i] == null) {
                throw new ExceptionAdminNaoExiste();
            }
        }
    }
}
