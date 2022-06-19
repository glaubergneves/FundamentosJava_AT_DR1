package br.edu.infnet.model.test;

import br.edu.infnet.model.domain.Cirurgia;

public class CirurgiaTest {
    public static void main(String[] args) {
        Cirurgia cirurgia = new Cirurgia("Cirurgia apendicite", "C01", "Cirurgia");
        cirurgia.setDuracao("1 hora");
        cirurgia.setEmergencia(true);
        cirurgia.setMedico("Roberto");

        System.out.println(cirurgia + cirurgia.completarDescricao());
    }
}
