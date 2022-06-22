package br.edu.infnet.model.test;

import java.time.LocalDate;

import br.edu.infnet.model.domain.Paciente;

public class PacienteTest {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Robert", "555.222.111-63", LocalDate.parse("1984-04-06"));
        System.out.println(paciente);
    }
}
