package br.edu.infnet.model.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.edu.infnet.model.domain.Cirurgia;
import br.edu.infnet.model.domain.Consulta;
import br.edu.infnet.model.domain.Exame;
import br.edu.infnet.model.domain.Internacao;
import br.edu.infnet.model.domain.Paciente;
import br.edu.infnet.model.domain.Servico;
import br.edu.infnet.model.exception.HospitalInvalidoException;
import br.edu.infnet.model.exception.MedicoInvalidoException;
import br.edu.infnet.model.exception.TipoInvalidoException;
import br.edu.infnet.model.exception.ValorInvalidoException;

public class ConsultaTest {
    public static void main(String[] args) {
        try {
            List<Servico> servicos = new ArrayList<Servico>();
            Consulta consulta = new Consulta();
            Paciente paciente = new Paciente("Robert", "555.222.111-63", new Date());
            Exame exame = new Exame("Exame de sangue", "E02", "Exame");
            Cirurgia cirurgia = new Cirurgia("Cirurgia apendicite", "C01", "Cirurgia");
            Internacao internacao = new Internacao("Recuperação", "I07", "Internação");
            exame.setLaudo("Hemacias em milhões/mm³: 4,4");
            exame.setPreparacao("Jejum");
            exame.setTipo("Hemograma");
            cirurgia.setDuracao("1 hora");
            cirurgia.setEmergencia(true);
            cirurgia.setMedico("Roberto");
            internacao.setDuracao("7 dias");
            internacao.setHospital("Hospital HCB");
            internacao.setPaciente(paciente);
            servicos.add(exame);
            servicos.add(cirurgia);
            servicos.add(internacao);
            consulta.setValor(500);
            consulta.setPaciente(paciente);
            consulta.setMedico("Gilson");
            System.out.println(consulta);
        } catch (TipoInvalidoException | HospitalInvalidoException | MedicoInvalidoException | ValorInvalidoException e) {
            System.out.println("[ERRO]" + e.getMessage());
        }
    }
}
