public class functions {
	
	private int speedOfRover;
	private int costOfSpeed;
	private int researchTime;
	private boolean isResearching;
	private int costOfRT;
	
	private int batteryLife;
	private int amountOfTires;
	private int directionOfRover;
	private int lifeOfRover = 100;
	
	public functions() {
		speedOfRover = 10;
		costOfSpeed = 1;
		researchTime = 0;
		costOfRT = 0;
		batteryLife = 100;
		amountOfTires = 4;
		directionOfRover = 1;
		isResearching = false;
	}
	
	public int getSetSpeedOfRover(boolean get, int ifSetSpeed) {
		if(get == false) {
			speedOfRover = ifSetSpeed;
			costOfSpeed = costEquation(speedOfRover);
		}
		return speedOfRover;
	}
	
	public int getSetResearchTime(boolean get, int ifResearching) {
		if(get == false) {
			researchTime = ifResearching;
			costOfRT = costEquation(ifResearching);
		}
		return researchTime;
	}

	public int getSetBatteryLife(boolean get, int ifChange) {
		if(get == false) {
			batteryLife =- ifChange;
		}
		return batteryLife;
	}

	public boolean getSetResearching(boolean get, boolean researching) {
		if(get == false) {
			 
		}
		return isResearching;
	}
	
	public int costEquation(int cost) {
		int lostCost = cost;
		if(lostCost < 25) {return 1;}
		else if(lostCost >= 25 && lostCost < 50) {return 2;}
		else if(lostCost >= 50 && lostCost < 75) {return 3;}
		else if(lostCost >= 75 && lostCost < 100) {return 4;}
		return 4;
	}

	
	public String getSetCurrentCondition(boolean get, int life) {
		if(get == false) {
			lifeOfRover =- life;
		}
		switch(lifeOfRover / 10) {
		case 1: 
		case 2:	return "CRITICAL";
		case 3:	return "BADLY DAMAGED";
		case 4: 
		case 5: return "DAMAGED";
		case 6: 
		case 7: 
		case 8: return "SLIGHT DAMAGE";
		case 9:
		case 10: return "LITTLE DAMAGE";
		}
		return "";
	}
}
