/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.daddo.agenda.logic.exceptions;

/**
 *
 * @author Anna
 */
public class UserNotExistingException extends LoginException{

    public UserNotExistingException() {
        super(LoginError.USER_NOT_EXISTING, LoginField.USER, "username non esistente");
    }
    
}
