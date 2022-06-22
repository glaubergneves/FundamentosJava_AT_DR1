package br.edu.infnet.model.test;

import br.edu.infnet.model.domain.Cirurgia;
import br.edu.infnet.model.exception.MedicoInvalidoException;

public class CirurgiaTest {
    public static void main(String[] args) {
        try {
            Cirurgia cirurgia = new Cirurgia("Cirurgia apendicite", "C01", "Cirurgia");
            cirurgia.setDuracao("1 hora");
            cirurgia.setEmergencia(true);
            cirurgia.setMedico("Roberto");
            System.out.println(cirurgia + cirurgia.completarDescricao());
        } catch (MedicoInvalidoException e) {
            System.out.println("[ERRO]" + e.getMessage());
        }
    }
}
