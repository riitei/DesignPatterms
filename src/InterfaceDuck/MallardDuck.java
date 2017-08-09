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
public class MallardDuck extends Duck{
    public MallardDuck(){
        
//            FlyBehavior flyBehavior; // 介面 飛的行為 
//    QuackBehavior quackBehavior; // 介面 呱呱的行為
        quackBehavior = new  Quack();
         flyBehavior = new FlyWithWings(); // 飛的行為
    }
}
