package br.edu.infnet.model.exception;

public class MedicoInvalidoException extends Exception {
    public MedicoInvalidoException(String msg) {
        System.out.println(msg);
    }
}
