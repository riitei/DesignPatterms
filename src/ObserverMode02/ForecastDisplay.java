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
    private WeatherData weatherData;

    public ForecastDisplay(Observable observable) { // 被觀察者
        weatherData = (WeatherData) observable;

        weatherData.addObserver(this);// 註冊 觀察者(公布欄)
    }


    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData) {
            // 測試 WeatherData 是不是 observable 的子類別或是實作介面
            lastPresure = currentPresure;
            currentPresure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        //
    }

}
