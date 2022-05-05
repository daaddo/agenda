/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.daddo.agenda.logic.items;

import javax.swing.Icon;

/**
 *
 * @author Anna
 */
public enum EventType {
    SQUOLA(new javax.swing.ImageIcon(EventType.class.getResource("/icons/settings32.png"))),
    LAVORO,
    AMICI,
    LOVE,
    CONTRABBANDO,
    GAME,
    GYM,
    FAMILY,
    CUSTOM;
    private Icon icon;

    private EventType(Icon icon) {
        this.icon = icon;
    }

    public Icon getIcon() {
        return icon;
    }
    
}
