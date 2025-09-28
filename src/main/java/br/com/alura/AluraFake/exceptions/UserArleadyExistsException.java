package br.com.alura.AluraFake.exceptions;

public class UserArleadyExistsException extends RuntimeException {


    public UserArleadyExistsException(String message)  {
        super(message);
    }
}
