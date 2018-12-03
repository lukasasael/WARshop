package usuarios.comuns;

public class RepositorioUsuarioComumArray implements RepositorioUsuarioComumInterface {
    private UsuarioComum[] arrayUsuarioComum = new UsuarioComum[1000];

    @Override
    public void inserir(UsuarioComum user) throws ExceptionLimiteAtingidoComum, ExceptionUsuarioJaExiste {
        for (int i = 0; i < arrayUsuarioComum.length; i++) {
            if (arrayUsuarioComum[i].getNome() == user.getNome()) {
                throw new ExceptionUsuarioJaExiste();
            } else if (arrayUsuarioComum[i] == null) {
                this.arrayUsuarioComum[i] = user;
                break;
            } else if (i == arrayUsuarioComum.length) {
                if (arrayUsuarioComum[i] == null) {
                    this.arrayUsuarioComum[i] = user;
                    break;
                } else {
                    throw new ExceptionLimiteAtingidoComum();
                }
            }
        }
    }

    @Override
    public UsuarioComum procurar(String CPF) throws ExceptionUsuarioNaoExiste {
        for (int i = 0; i < arrayUsuarioComum.length; i++) {
            if (arrayUsuarioComum[i].getNome().equals(CPF)) {
                return arrayUsuarioComum[i];
            } else if (arrayUsuarioComum[i] == null) {
                throw new ExceptionUsuarioNaoExiste();
            }
        }
        return null;
    }

    @Override
    public void deletar(String CPF) throws ExceptionUsuarioNaoExiste {
        for (int i = 0; i < arrayUsuarioComum.length; i++) {
            if (arrayUsuarioComum[i].getNome().equals(CPF)) {
                int posicaoEncontrada = i;
                for (int j = posicaoEncontrada; j < arrayUsuarioComum.length; j++) {
                    if (arrayUsuarioComum[j] != null) {
                        arrayUsuarioComum[j] = arrayUsuarioComum[j + 1];
                    } else {
                        break;
                    }
                }
            } else if (arrayUsuarioComum[i] == null) {
                throw new ExceptionUsuarioNaoExiste();
            }
        }
    }

    public boolean existe(String CPF) {
        for (int i = 0; i < arrayUsuarioComum.length; i++) {
            if (arrayUsuarioComum[i].getNome().equals(CPF)) {
                return true;
            } else if (arrayUsuarioComum[i] == null) {
                return false;
            }
        }
        return false;
    }

    @Override
    public void atualizaNome(String CPF, String nome) throws ExceptionUsuarioNaoExiste {
        for (int i = 0; i < arrayUsuarioComum.length; i++) {
            if (arrayUsuarioComum[i].getCPF().equals(CPF)) {
                arrayUsuarioComum[i].setNome(nome);
            } else if (arrayUsuarioComum[i] == null) {
                throw new ExceptionUsuarioNaoExiste();
            }
        }
    }

    @Override
    public void atualizaIdade(String CPF, int idade) throws ExceptionUsuarioNaoExiste {
        for (int i = 0; i < arrayUsuarioComum.length; i++) {
            if (arrayUsuarioComum[i].getCPF().equals(CPF)) {
                arrayUsuarioComum[i].setIdade(idade);
            } else if (arrayUsuarioComum[i] == null) {
                throw new ExceptionUsuarioNaoExiste();
            }
        }
    }

    @Override
    public void atualizaTelefone(String CPF, String telefone) throws ExceptionUsuarioNaoExiste {
        for (int i = 0; i < arrayUsuarioComum.length; i++) {
            if (arrayUsuarioComum[i].getCPF().equals(CPF)) {
                arrayUsuarioComum[i].setTelefone(telefone);
            } else if (arrayUsuarioComum[i] == null) {
                throw new ExceptionUsuarioNaoExiste();
            }
        }
    }

    @Override
    public void atualizaCEP(String CPF, String CEP) throws ExceptionUsuarioNaoExiste {
        for (int i = 0; i < arrayUsuarioComum.length; i++) {
            if (arrayUsuarioComum[i].getCPF().equals(CPF)) {
                arrayUsuarioComum[i].setCEP(CEP);
            } else if (arrayUsuarioComum[i] == null) {
                throw new ExceptionUsuarioNaoExiste();
            }
        }
    }

    @Override
    public void atualizaNumeroCartao(String CPF, String numeroCartao) throws ExceptionUsuarioNaoExiste {
        for (int i = 0; i < arrayUsuarioComum.length; i++) {
            if (arrayUsuarioComum[i].getCPF().equals(CPF)) {
                arrayUsuarioComum[i].setNumeroCartao(numeroCartao);
            } else if (arrayUsuarioComum[i] == null) {
                throw new ExceptionUsuarioNaoExiste();
            }
        }
    }
}
