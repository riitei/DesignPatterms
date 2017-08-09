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
public abstract class Duck {

    FlyBehavior flyBehavior; // 介面 飛的行為 
    QuackBehavior quackBehavior; // 介面 呱呱的行為

    public Duck() {

    }

    public void display() {
    }

    public void performFly() { // 演出 飛
        flyBehavior.fly();
    }

    public void performQuack() { // 演出 呱呱
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys!!");
    }
}
