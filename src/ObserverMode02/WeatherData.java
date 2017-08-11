/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverMode02;

import java.util.Observable;

/**
 *
 * @author riitei
 */
public class WeatherData extends Observable { // 氣象資料 主題

    private float temperature; // 溫度
    private float humidity; // 濕度
    private float pressure; // 氣壓

    public WeatherData() {

    }

    public void measurementsChanged() {  // 測量 改變 
        setChanged();
        // 在呼叫  notifyObservers()之前，要呼叫setChanged()紀錄狀態已經改變的事實
        notifyObservers();
        // 注意：我們沒利用  notifyObservers() 傳送資料物件，這表示我們採用的做法是“垃取”
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }
    
    public float getHumidity(){
        return humidity;
    }    
    
    public float getPressure(){
        return pressure;
         
    }
}
