package managers;

public class AboutUsManager {

	public void saveSettings() {
		LoggingManager logMan = new LoggingManager();
		
		logMan.appendToFile("AboutUs");
		
	}
}
