package br.edu.infnet.model.domain;

public abstract class Servico {
    private String descricao;
    private String sala;
    private String tipo;

    public Servico(String descricao, String sala, String tipo) {
        this.descricao = descricao;
        this.sala = sala;
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getSala() {
        return sala;
    }

    public String getTipo() {
        return tipo;
    }

    public abstract String completarDescricao();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(descricao + ";")
          .append(sala + ";")
          .append(tipo + ";");
        return sb.toString();
    }
}
