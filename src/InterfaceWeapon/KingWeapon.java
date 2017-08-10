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
public class KingWeapon {

    public static void main(String[] args) {
        King king = new King();
        System.out.println(king.getKingNmae());
        king.fight();
    }
}
