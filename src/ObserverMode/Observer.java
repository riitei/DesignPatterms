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
public interface Observer { // 觀察者
    
    public void update(float temperature,float humidity,float pressure);
    // 溫度, 濕度, 氣壓
    
}
