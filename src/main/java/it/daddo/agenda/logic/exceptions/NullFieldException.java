/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.daddo.agenda.logic.exceptions;

/**
 *
 * @author Anna
 */
public class NullFieldException extends LoginException {

    public NullFieldException(LoginField field) {
        super(LoginError.FIELD_NULL, field, "campo mancante");
    }
    
}
