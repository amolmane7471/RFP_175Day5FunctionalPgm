package com.Bridgelabz.FunctionalProgramming;

public class WindChill {
	public double CalculateWindChill(double temperature, double windspeed) {
		double a, windChill, b, c;
		a = 0.6215 * temperature;
		b = 0.4275 * temperature;
		c = b - 35.75;
		windChill = 35.74 + a + c * (Math.pow(windspeed, 0.16));
		windChill = Math.abs(windChill);
		return windChill;
		}	
	
	public static void main(String[] args) {
		WindChill wind = new WindChill();
		double windspeed, temperatureInFahrenheit = 0, windChill;
		temperatureInFahrenheit = Double.parseDouble("60");
		windspeed = Double.parseDouble("70");
		windChill = wind.CalculateWindChill(temperatureInFahrenheit, windspeed);
		System.out.println("By Calculating wind chill is: " + windChill);
	}

}
