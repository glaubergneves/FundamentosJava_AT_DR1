package br.edu.infnet.model.test;

import java.util.Date;

import br.edu.infnet.model.domain.Internacao;
import br.edu.infnet.model.domain.Paciente;
import br.edu.infnet.model.exception.HospitalInvalidoException;

public class InternacaoTest {
    public static void main(String[] args) {
        try {
            Paciente paciente = new Paciente("Lucas", "515.515-54", new Date());
            Internacao internacao = new Internacao("Recuperação", "I07", "Internação");
            internacao.setDuracao("7 dias");
            internacao.setHospital("Hospital HCB");
            internacao.setPaciente(paciente);
            System.out.println(internacao + internacao.completarDescricao());
        } catch (HospitalInvalidoException e) {
            System.out.println("[ERRO]" + e.getMessage());
        }
    }
}
