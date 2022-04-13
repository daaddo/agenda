/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.daddo.agenda.logic;

import it.daddo.agenda.db.DBManager;
import it.daddo.agenda.logic.exceptions.EmptyFieldException;
import it.daddo.agenda.logic.exceptions.LoginException;
import it.daddo.agenda.logic.exceptions.LoginField;
import it.daddo.agenda.logic.exceptions.NullFieldException;
import it.daddo.agenda.logic.exceptions.PasswordMismatchException;
import it.daddo.agenda.logic.exceptions.UserNotExistingException;
import java.util.List;

/**
 *
 * @author Anna
 */
public class LoginManager {
    private static LoginManager _instance = null;
    
    public static LoginManager getInstance() {
        if (_instance == null) {
            _instance = new LoginManager();
        }
        return _instance;
    }
    
    private LoginManager() {
        super();
    }
    
    public User login(String username,String password) throws LoginException{
        if(username==null){
            throw new NullFieldException(LoginField.USER);
        }
        if(password==null){
            throw new NullFieldException(LoginField.PASSWORD);
        }
        if(username.isBlank()){
            throw new EmptyFieldException(LoginField.USER);
        }
        if(password.isBlank()){
            throw new EmptyFieldException(LoginField.PASSWORD);
        }
        List<User> users = DBManager.getInstance().getAllUsers();
        for (User user : users) {
            if(username.equals(user.getUsername())){
                if(password.equals(user.getPassword())){
                    return user;
                }
                throw new PasswordMismatchException();
            }
        }
        throw new UserNotExistingException();
    }
}
