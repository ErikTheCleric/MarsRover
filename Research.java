public class Research {
	// Helps figure out level and build of robot
	private int timerCurrent = 0;
	private int timerEnd = 0;
	private boolean timerStart = true;
	private boolean finishResearching = false;
	private int levelOfRM = 1; // Level of research machine
	private int amountResearched = 0;
	/*public enum Minerals {ROCK, RROCK, BROCK, WATERROCK, OILROCK}
	Minerals minerals;*/
	
	public Research() {
		// TODO Auto-generated constructor stub
	}
	
	public int researchAndLevel(int item, int precentage){
		return 1;
	}
	public void beginResearching(int item, int startTime, int multiplier) {
		timerEnd = itemTime(item);
		while(finishResearching == false) {
			timerCurrent++;
			amountResearched++;
			finishResearching = doneStudying(timerCurrent, timerEnd);
		}
	}
	public int itemTime(int item) {
		// The amount of time it takes to research the material, less is better
		switch(item) {
		case 0: return 10; // normal rock
		case 1: return 20; // red rock
		case 2: return 30; // blue rock
		case 3: return 40; // rock with resource (water)
		case 4: return 50; // rock with oil
		}
		return 0;
	}
	public boolean doneStudying(int timer, int timeEnd) {
		if(timer >= timeEnd) {
			return true;
		}
		return false;
	}


}
