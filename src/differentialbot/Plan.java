package differentialbot;

public class Plan {
	
	private Act act;
	private Sense sense;
	private Thread thread;
	private String[] actMethods;
	
	public Plan() throws InterruptedException
	{
		sense = new Sense(); 
		act = new Act();
		// actMethods i en bestemt rækkefølge
		actMethods = new String[] {"stop", "smallRotateRight", "smallRotateLeft", "bigRotateRight", "bigRotateLeft"};
		startSenseing();
		Thread.sleep(1000); // sov lidt da vi har brugt for data til planning
		startPlanning();
	}
	
	// starter lightsensoren 
	private void startSenseing() { 
		thread = new Thread(sense);
		thread.start();
	}
	
	//hvis lightvalue er over 100 - kør frem, ellers kør "actMethods i en bestemt rækkefølge"
	private void startPlanning() {
		while(true)
		{
			for(String actMethod : actMethods){
				if(checkLightStatus() == true){
					startActing("forward");
					break;
				}
				else{
					startActing(actMethod);
				}
			}
		}
		
		}
	
		
		public void startActing(String actMethod){
			switch(actMethod){
			case "forward":
				act.forward();
				break;
			case "stop":
				act.stop();
				break;
			case "smallRotateRight":
				act.smallRotateRight();
				break;
			case "smallRotateLeft":
				act.smallRotateLeft();
				break;
			case "bigRotateRight":
				act.bigRotateRight();
				break;
			case "bigRotateLeft":
				act.bigRotateLeft();
				break;
			}
			
			
			
		}
		
		// hvis den er inden for stregen return true
		public boolean checkLightStatus(){
			if(sense.currentLightValue > 100) return true;
			return false;
		}
				
		
	}




