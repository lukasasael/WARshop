package fornecedores;

public class RepositorioFornecedorArray implements RepositorioFornecedorInterface {
    private Fornecedor arrayFornecedor[] = new Fornecedor[140];

    @Override
    public void inserir(Fornecedor marca) throws ExceptionFornecedorJaCadastrado, ExceptionLimiteAtingidoFornecedor {
        for (int i = 0; i < arrayFornecedor.length; i++) {
            if (arrayFornecedor[i] == null) {
                this.arrayFornecedor[i] = marca;
            } else if (arrayFornecedor[i].marca.equals(marca)) {
                throw new ExceptionFornecedorJaCadastrado();
            } else if (i == arrayFornecedor.length) {
                if (arrayFornecedor[i] == null) {
                    this.arrayFornecedor[i] = marca;
                    i = arrayFornecedor.length;
                } else {
                    throw new ExceptionLimiteAtingidoFornecedor();
                }
            }
        }
    }

    @Override
    public Fornecedor procurar(String marca) throws ExceptionFornecedorNaoExiste {
        for (int i = 0; i < arrayFornecedor.length; i++) {
            if (arrayFornecedor[i].getMarca().equals(marca)) {
                return arrayFornecedor[i];
            } else if (arrayFornecedor[i] == null) {
                throw new ExceptionFornecedorNaoExiste();
            }
        }
        return null; // Caso base.
    }

    @Override
    public void deletar(String marca) throws ExceptionFornecedorNaoExiste {
        for (int i = 0; i < arrayFornecedor.length; i++) {
            if (arrayFornecedor[i].getMarca().equals(marca)) {
                for (int j = i; j < arrayFornecedor.length; j++) {
                    if (arrayFornecedor[j] != null) {
                        arrayFornecedor[j] = arrayFornecedor[j + 1]; // Sai do laco.
                    } else {
                        j = arrayFornecedor.length;
                    }
                }
            } else if (arrayFornecedor[i] == null) {
                throw new ExceptionFornecedorNaoExiste();
            }
        }
    }

    @Override
    public void atualizaMarca(String marca, String novaMarca) throws ExceptionFornecedorNaoExiste {
        for (int i = 0; i < arrayFornecedor.length; i++) {
            if (arrayFornecedor[i].getMarca().equals(marca)) {
                arrayFornecedor[i].setMarca(novaMarca);
            } else if (arrayFornecedor[i] == null) {
                throw new ExceptionFornecedorNaoExiste();
            }
        }
    }

    @Override
    public void atualizaContato(String marca, String contato) throws ExceptionFornecedorNaoExiste {
        for (int i = 0; i < arrayFornecedor.length; i++) {
            if (arrayFornecedor[i].getMarca().equals(marca)) {
                arrayFornecedor[i].setContato(contato);
            } else if (arrayFornecedor[i] == null) {
                throw new ExceptionFornecedorNaoExiste();
            }
        }
    }

    @Override
    public void atualizaTipoProduto(String marca, String tipoProduto) throws ExceptionFornecedorNaoExiste {
        for (int i = 0; i < arrayFornecedor.length; i++) {
            if (arrayFornecedor[i].getMarca().equals(marca)) {
                arrayFornecedor[i].setTipoProduto(tipoProduto);
            } else if (arrayFornecedor[i] == null) {
                throw new ExceptionFornecedorNaoExiste();
            }
        }
    }

    @Override
    public void atualizaDisponibilidade(String marca, boolean disponibilidade) throws ExceptionFornecedorNaoExiste {
        for (int i = 0; i < arrayFornecedor.length; i++) {
            if (arrayFornecedor[i].getMarca().equals(marca)) {
                arrayFornecedor[i].setDisponibilidade(disponibilidade);
            } else if (arrayFornecedor[i] == null) {
                throw new ExceptionFornecedorNaoExiste();
            }
        }
    }
}