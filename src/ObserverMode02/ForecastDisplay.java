/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverMode02;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author riitei
 */
public class ForecastDisplay implements Observer, DisplayElement {

    // 預測
    private float currentPresure = 29.f; // 當前 目前 氣壓
    private float lastPresure; // 最後 氣壓

    public ForecastDisplay(Observable observable) { // 被觀察者
        WeatherData weatherData = (WeatherData) observable;
        
        weatherData.addObserver(this);// 註冊 觀察者(公布欄)
    }
    
//
//    @Override
//    public void update(float temperature, float humidity, float pressure) {
//        this.temperature = temperature;
//        this.humidity = humidity;
//        display();
//    }
//
//    @Override
//    public void display() {
//        System.out.println("Forecast(預測) Conditions(條件 狀態)Display: " + temperature
//                + " C degrees(度) and " + humidity + " % humidity()");
//    }

    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
