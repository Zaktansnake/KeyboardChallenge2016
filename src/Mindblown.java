import java.awt.AWTException;
import java.awt.Robot;
import java.util.Random;

import com.sun.glass.events.KeyEvent;

public class Mindblown {
	
	public static void process(int keyEvent) {
		try {
			Robot robot = new Robot();
			Random random = new Random();
			int randomizedNumber = random.nextInt(90);
			robot.keyPress(randomizedNumber);
		} catch(AWTException e) {
			e.printStackTrace();
		}
	}
}
