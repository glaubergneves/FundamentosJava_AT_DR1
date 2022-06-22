package br.edu.infnet.model.domain;

import java.time.LocalDate;

public class Paciente {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    
    public Paciente(String nome, String cpf, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nome + ";")
          .append(cpf + ";")
          .append(dataNascimento);
        return sb.toString();
    }
}
