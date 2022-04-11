/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.daddo.agenda.logic.exceptions;

/**
 *
 * @author Anna
 */
public class EmptyFieldException extends LoginException {

    public EmptyFieldException(LoginField field) {
        super(LoginError.FIELD_EMPTY, field, "campo mancante: "+field);
    }
    
}
