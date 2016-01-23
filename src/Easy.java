import org.jnativehook.keyboard.NativeKeyEvent;

import com.sun.glass.events.KeyEvent;

import java.awt.AWTException;
import java.awt.Robot;

public class Easy {

	public static void process(int keyEvent) {
			try {
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_BACKSPACE);
				switch(keyEvent) {
					case NativeKeyEvent.VC_0:
						robot.keyPress(KeyEvent.VK_W);
						break;
				
					case NativeKeyEvent.VC_1:
						robot.keyPress(KeyEvent.VK_R);
						break;
					
					case NativeKeyEvent.VC_2:
						robot.keyPress(KeyEvent.VK_M);
						break;
				
					case NativeKeyEvent.VC_3:
						robot.keyPress(KeyEvent.VK_I);
						break;
				
					case NativeKeyEvent.VC_4:
						break;
				
					case NativeKeyEvent.VC_5:
						break;
				
					case NativeKeyEvent.VC_6:
						break;
				
					case NativeKeyEvent.VC_7:
						break;
				
					case NativeKeyEvent.VC_8:
						break;
				
					case NativeKeyEvent.VC_9:
						break;
				
					case NativeKeyEvent.VC_Q:
						break;	
				}
			} catch (AWTException e) {
				e.printStackTrace();
			}
	}
}
