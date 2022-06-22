package br.edu.infnet.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import br.edu.infnet.model.exception.ValorInvalidoException;

public class Consulta {
    private float valor;
    private String medico;
    private Paciente paciente;
    private LocalDateTime dataHora;
    private List<Servico> servicos;

    public Consulta() {
        this.dataHora = LocalDateTime.now();
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) throws ValorInvalidoException {
        if (valor <= 0) {
            throw new ValorInvalidoException("O valor da consulta não pode ser negativa ou nula.");
        }
        this.valor = valor;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return String.format("%.2f;%s;%s;%s;%d", valor, medico, dataHora.format(formato), paciente, servicos.size());
    }
}
