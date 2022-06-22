package br.edu.infnet.model.test;

import br.edu.infnet.model.domain.Exame;
import br.edu.infnet.model.exception.TipoInvalidoException;

public class ExameTest {
    public static void main(String[] args) {
        try {
            Exame exame = new Exame("Exame de sangue", "E02", "Exame");
            exame.setLaudo("Hemacias em milhões/mm³: 4,4");
            exame.setPreparacao("Jejum");
            exame.setTipo("Hemograma");
            System.out.println(exame + exame.completarDescricao());
        } catch (TipoInvalidoException e) {
            System.out.println("[ERRO]" + e.getMessage());
        }
    }
}
