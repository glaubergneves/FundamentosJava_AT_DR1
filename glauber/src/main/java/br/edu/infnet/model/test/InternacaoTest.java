package br.edu.infnet.model.test;

import br.edu.infnet.model.domain.Internacao;
import br.edu.infnet.model.exception.HospitalInvalidoException;

public class InternacaoTest {
    public static void main(String[] args) {
        try {
            Internacao internacao = new Internacao("Recuperação", "I07", "Internação");
            internacao.setDuracao("7 dias");
            internacao.setHospital("HCB");
            System.out.println(internacao);
        } catch (HospitalInvalidoException e) {
            System.out.println("[ERRO]" + e.getMessage());
        }
    }
}
