/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.daddo.agenda.logic.exceptions;

/**
 *
 * @author Anna
 */
public enum LoginError {
    FIELD_NULL,
    FIELD_EMPTY,
    USER_NOT_EXISTING,
    PASSWORD_WRONG,
    PASSWORD_TOO_SHORT,
    PASSWORD_TOO_LONG,
    PASSWORD_REQUIRES_NUMBER;
}
