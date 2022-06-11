package br.edu.infnet.model.domain;

import java.util.Date;

public class Consulta {
    private float valor;
    private String medico;
    private Date dataHora;
    private Paciente paciente;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return String.format("%.2f;%s;%s;%s", valor, medico, dataHora, paciente);
    }
}
