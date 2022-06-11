package br.edu.infnet.model.test;

import java.util.Date;

import br.edu.infnet.model.domain.Consulta;
import br.edu.infnet.model.domain.Paciente;

public class ConsultaTest {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Robert", "555.222.111-63", new Date());
        Consulta consulta = new Consulta();
        consulta.setValor(500);
        consulta.setPaciente(paciente);
        consulta.setMedico("Gilson");
        consulta.setDataHora(new Date());
        System.out.println(consulta);
    }
}
