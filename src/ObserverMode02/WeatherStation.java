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
public class WeatherStation {
    
    public static void main(String[] args) {
        
        WeatherData weatherData = new WeatherData();
        
        CurrentConditionsDisplay currentConditionsDisplay = 
            new CurrentConditionsDisplay(weatherData);// 當前 條件(狀態)顯示
        StatisticsDisplay statisticsDisplay =
                new StatisticsDisplay(weatherData); // 統計
        ForecastDisplay forecastDisplay = 
                new ForecastDisplay(weatherData);// 預測
        //
        weatherData.setMeasurements(5, 8, 0);
        currentConditionsDisplay.display();
        
    }
}
