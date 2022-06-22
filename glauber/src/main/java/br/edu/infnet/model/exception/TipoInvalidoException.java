package br.edu.infnet.model.exception;

public class TipoInvalidoException extends Exception{
    public TipoInvalidoException(String msg) {
        System.out.println(msg);
    }
}