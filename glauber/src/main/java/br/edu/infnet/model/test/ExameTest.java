package br.edu.infnet.model.test;

import br.edu.infnet.model.domain.Exame;

public class ExameTest {
    public static void main(String[] args) {
        Exame exame = new Exame("Exame de sangue", "E02", "Exame");
        exame.setLaudo("Hemacias em milhões/mm³: 4,4");
        exame.setPreparacao("Jejum");
        exame.setTipo("Hemograma");

        System.out.println(exame + exame.completarDescricao());
    }
}
