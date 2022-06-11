package br.edu.infnet.model.test;

import java.util.Date;

import br.edu.infnet.model.domain.Paciente;

public class PacienteTest {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Robert", "555.222.111-63", new Date());
        System.out.println(paciente);
    }
}
