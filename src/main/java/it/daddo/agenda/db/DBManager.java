/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.daddo.agenda.db;

import it.daddo.agenda.logic.User;
import java.util.List;

/**
 *
 * @author Anna
 */
public class DBManager {
    private static DBManager _instance = null;
    
    public static DBManager getInstance() {
        if (_instance == null) {
            _instance = new DBManager();
        }
        return _instance;
    }
    
    private DBManager() {
        super();
    }
    
    public List<User> getAllUsers(){
        
        return List.of(new User("mario","trapanatore","Mario","Trapo"),new User("luca", "corcvore","Luca","Cora"));
    }
    
}
