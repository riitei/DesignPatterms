/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverMode;

import java.util.ArrayList;

/**
 *
 * @author riitei
 */
public class WeatherData implements Subject { // 氣象資料 主題

    private ArrayList observers; // 觀察者
    private float temperature; // 溫度
    private float humidity; // 濕度
    private float pressure; // 氣壓

    public WeatherData() {

        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer oberver) { // 註冊(添加)觀察者
        observers.add(oberver);
    }

    @Override
    public void removeObserver(Observer observer) { // 移除 觀察者  
        int i = observers.indexOf(observer);
        if (i > 0) {
            observers.remove(observers);
        }
    }

    @Override
    public void notifyObservers() { // 通知觀察者
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i); //  Observer.java (interface)
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {  // 測量 改變 
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }
    // WeatherDate 還有一些其他的方法出現這裡
}
