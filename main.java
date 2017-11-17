public class main {
	private static boolean gameStillRunning = true;
	
	public static void main(String[] args) {
		
		while(gameStillRunning) {
			//Do something
			textConsole();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				Thread.currentThread().interrupt();
				e.printStackTrace();
			}
		}
	}

	public static void textConsole() {
		functions Rover1 = new functions();
		System.out.println("\tUPDATE:");
		System.out.println("Rover Battery Life - " + Rover1.getSetBatteryLife(true, 0));
		System.out.println("Current Speed of Rover - " + Rover1.getSetSpeedOfRover(true, 0));
		System.out.println("Currently Researching - " + Rover1.getSetResearching(true, false) );
		System.out.println("Current Condition - " + Rover1.getSetCurrentCondition(true, 100) + "\n");
		// Random Function that presents the player with a option or event (can be "Nothing")
	}
}
