package br.edu.infnet.model.domain;

public class Internacao extends Servico {
    private String duracao;
    private String hospital;
    private Paciente paciente;

    public Internacao(String descricao, String sala, String tipo) {
        super(descricao, sala, tipo);
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    @Override
    public String completarDescricao() {
        String descricaoCompleta = "No hospital" + hospital + " " + super.getDescricao();
        return descricaoCompleta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(duracao + ";")
          .append(hospital + ";")
          .append(paciente)
          .append(completarDescricao());
        return sb.toString();
    }
}
