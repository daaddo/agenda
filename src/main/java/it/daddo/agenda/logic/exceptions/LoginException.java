/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.daddo.agenda.logic.exceptions;

/**
 *
 * @author Anna
 */
public abstract class LoginException extends Exception{
    private LoginError error;
    private LoginField field;

    public LoginException(LoginError error, LoginField field, String message) {
        super(message);
        this.error = error;
        this.field = field;
    }

    public LoginError getError() {
        return error;
    }

    public LoginField getField() {
        return field;
    }
    
}
