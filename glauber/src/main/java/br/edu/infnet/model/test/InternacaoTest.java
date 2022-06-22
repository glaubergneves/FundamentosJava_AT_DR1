package br.edu.infnet.model.test;

import java.time.LocalDate;

import br.edu.infnet.model.domain.Internacao;
import br.edu.infnet.model.domain.Paciente;
import br.edu.infnet.model.exception.HospitalInvalidoException;

public class InternacaoTest {
    public static void main(String[] args) {
        try {
            Paciente paciente = new Paciente("Lucas", "515.515-54", LocalDate.parse("1984-04-06"));
            Internacao internacao = new Internacao("Recuperação", "I07", "Internação");
            internacao.setDuracao("7 dias");
            internacao.setHospital("HCB");
            internacao.setPaciente(paciente);
            System.out.println(internacao);
        } catch (HospitalInvalidoException e) {
            System.out.println("[ERRO]" + e.getMessage());
        }
    }
}
