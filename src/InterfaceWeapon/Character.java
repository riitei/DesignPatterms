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
public abstract class Character { // 角色
    WeaponBehavior weaponBehavior; //武器行為

   
    public void fight(){ // 打鬥
        weaponBehavior.useWeapon();
    } 
    
    public void setWeapon(WeaponBehavior weapon){
        this.weaponBehavior = weapon ;
    }
}
