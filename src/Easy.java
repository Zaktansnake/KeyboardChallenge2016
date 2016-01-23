import org.jnativehook.keyboard.NativeKeyEvent;

import com.sun.glass.events.KeyEvent;

import java.awt.AWTException;
import java.awt.Robot;

public class Easy {

	public static void process(int keyEvent) {
		switch(keyEvent) {
			case NativeKeyEvent.VC_0:
				System.out.print("0");
				try {
					Robot robot = new Robot();
					robot.keyPress(KeyEvent.VK_1);
				} catch (AWTException e) {
					e.printStackTrace();
				}
				break;
			
			case NativeKeyEvent.VC_1:
				System.out.print("1");
				break;
			
			case NativeKeyEvent.VC_2:
				break;
			
			case NativeKeyEvent.VC_3:
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
	}
	
}
