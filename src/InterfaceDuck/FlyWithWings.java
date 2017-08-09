/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceDuck;

/**
 *
 * @author riitei
 */
//public interface FlyBehavior {
//    public void fly();
//}
public class FlyWithWings implements FlyBehavior{// 飛 與 翅膀

    @Override
    public void fly() { // 實做飛行
        System.out.println("I'm flying!!");
    }
}
