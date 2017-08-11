/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverMode02;

import ObserverMode.Observer;

/**
 *
 * @author riitei
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement{

    private float temperature; // 溫度
    private float humidity; // 濕度

    @Override
    public void update(float temperature, float humidity, float pressure) {

    }

    @Override
    public void display() {


    }
}
