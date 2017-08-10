/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceWeapon;

/**
 *
 * @author riitei
 */
public class King extends Character {// 國王

    public King() {
        
        weaponBehavior = new SwordBehavior();// 寶劍

    }

    public String getKingNmae() {
        return "King";
    }
}
