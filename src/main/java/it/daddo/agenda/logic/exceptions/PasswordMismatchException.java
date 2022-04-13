/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.daddo.agenda.logic.exceptions;

/**
 *
 * @author Anna
 */
public class PasswordMismatchException extends LoginException {

    public PasswordMismatchException() {
        super(LoginError.PASSWORD_WRONG, LoginField.PASSWORD, "password sbagliata");
    }
    
}
