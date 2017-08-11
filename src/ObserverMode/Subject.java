/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverMode;

/**
 *
 * @author riitei
 */
public interface Subject { // 具體
    
    public void registerObserver(Observer oberver); // 註冊觀察者
    public void removeObserver(Observer observer); // 移除觀察者
    public void notifyObservers(); // 通知觀察者
}
