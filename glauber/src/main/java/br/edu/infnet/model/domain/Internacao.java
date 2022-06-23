package br.edu.infnet.model.domain;

import br.edu.infnet.model.exception.HospitalInvalidoException;

public class Internacao extends Servico {
    private String duracao;
    private String hospital;

    public Internacao(String descricao, String sala, String tipo) {
        super(descricao, sala, tipo);
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) throws HospitalInvalidoException {
        if (hospital.isBlank()) {
            throw new HospitalInvalidoException("Deve ter um hospital.");
        }
        this.hospital = hospital;
    }

    @Override
    public String completarDescricao() {
        return "No hospital " + hospital;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(duracao + ";")
          .append(hospital + ";")
          .append(completarDescricao());
        return sb.toString();
    }
}
