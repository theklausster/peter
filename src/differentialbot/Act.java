package differentialbot;

import lejos.nxt.Motor;
import lejos.robotics.navigation.DifferentialPilot;

public class Act {
	private DifferentialPilot pilot;
	
	public Act(){
		pilot = new DifferentialPilot(DifferentialPilot.WHEEL_SIZE_NXT2, 12.5, Motor.B, Motor.C);
	}

	 
	public void forward(){
		pilot.forward();
		pilot.setTravelSpeed(100);
	}
	public void smallRotateRight() {
		pilot.rotate(10);
	}
	public void smallRotateLeft() {
		pilot.rotate(-20);
	}
	public void stop() {
		pilot.stop();
	}
	public void bigRotateRight() {
		pilot.rotate(175);
	}
	public void bigRotateLeft() {
		pilot.rotate(-350);
	}

	
}
