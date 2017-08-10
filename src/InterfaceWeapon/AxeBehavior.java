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
public class AxeBehavior implements WeaponBehavior{
    // 實作斧頭批砍
    @Override
    public void useWeapon() {
        System.out.println(" AxeBehavior ");
    }
    
}
