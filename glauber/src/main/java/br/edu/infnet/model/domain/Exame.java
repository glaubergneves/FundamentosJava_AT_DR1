package br.edu.infnet.model.domain;

import br.edu.infnet.model.exception.TipoInvalidoException;

public class Exame extends Servico {
    private String tipo;
    private String laudo;
    private String preparacao;

    public Exame(String descricao, String sala, String tipo) {
        super(descricao, sala, tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) throws TipoInvalidoException {
        if (tipo == null) {
            throw new TipoInvalidoException("Não é possível um exame ter tipo vazio.");
        }
        this.tipo = tipo;
    }

    public String getLaudo() {
        return laudo;
    }

    public void setLaudo(String laudo) {
        this.laudo = laudo;
    }

    public String getPreparacao() {
        return preparacao;
    }

    public void setPreparacao(String preparacao) {
        this.preparacao = preparacao;
    }

    @Override
    public String completarDescricao() {
        return "Como preparacao para o exame temos: " + getPreparacao();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(tipo + ";")
                .append(laudo + ";")
                .append(preparacao + ";")
                .append(completarDescricao());
        return sb.toString();
    }
}
