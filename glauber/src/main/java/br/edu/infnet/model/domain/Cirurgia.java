package br.edu.infnet.model.domain;

public class Cirurgia extends Servico {
    private boolean emergencia;
    private String duracao;
    private String medico;

    public Cirurgia(String descricao, String sala, String tipo) {
        super(descricao, sala, tipo);
    }

    public boolean isEmergencia() {
        return emergencia;
    }

    public void setEmergencia(boolean emergencia) {
        this.emergencia = emergencia;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    @Override
    public String completarDescricao() {
        String descricaoCompleta = "O médico: " + getMedico() + ", fará uma cirurgia em que " + super.getDescricao();
        return descricaoCompleta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(duracao + ";")
          .append(emergencia + ";")
          .append(medico)
          .append(completarDescricao());
        return sb.toString();
    }
}
