package servicos;

public abstract class Servico {
    protected String nomeServico;
    protected String descricaoServico;
    protected double valorServico;
    protected int diasEntrega;

    public Servico(String servico, String acessorio, double preco, int prazo) {
        this.setNomeServico(servico);
        this.setDescricaoServico(acessorio);
        this.setValorServico(preco);
        this.setDiasEntrega(prazo);
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public String getDescricaoServico() {
        return descricaoServico;
    }

    public void setDescricaoServico(String descricaoServico) {
        this.descricaoServico = descricaoServico;
    }

    public double getValorServico() {
        return valorServico;
    }

    public void setValorServico(double valorServico) {
        this.valorServico = valorServico;
    }

    public int getDiasEntrega() {
        return diasEntrega;
    }

    public void setDiasEntrega(int diasEntrega) {
        this.diasEntrega = diasEntrega;
    }

}
