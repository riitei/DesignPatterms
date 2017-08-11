/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverMode;

import ObserverMode.DisplayElement;

/**
 *
 * @author riitei
 */
public class StatisticsDisplay implements Observer, DisplayElement {

    // 統計 顯示
    private float temperature; // 溫度
    private float humidity; // 濕度
    private Subject weatherData; // 主題 天氣資料 

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);// 註冊 觀察者(公布欄)

    }

    @Override
    public void update(float temperature, float humidity, float pressure) {

        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Statistics(當前)Display: " + temperature
                + " C degrees(度) and " + humidity + " % humidity()");
    }


}
