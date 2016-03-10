package differentialbot;

import lejos.nxt.ColorSensor;
import lejos.nxt.SensorPort;

public class Sense implements Runnable{

	public int currentLightValue;
	private ColorSensor sensor = new ColorSensor(SensorPort.S1);
	
	@Override
	public void run() {
		currentLightValue = sensor.getLightValue();
		System.out.println(currentLightValue + "");
		
	}

}

