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
					case NativeKeyEvent.VC_ESCAPE:
						robot.keyPress(KeyEvent.VK_ESCAPE);
						break;
						
					case NativeKeyEvent.VC_0:
						robot.keyPress(KeyEvent.VK_W);
						System.out.println("helloasdf");
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
						robot.keyPress(KeyEvent.VK_5);
						break;
				
					case NativeKeyEvent.VC_5:
						robot.keyPress(KeyEvent.VK_N);
						break;
				
					case NativeKeyEvent.VC_6:
						robot.keyPress(KeyEvent.VK_9);
						break;
				
					case NativeKeyEvent.VC_7:
						robot.keyPress(KeyEvent.VK_X);
						break;
				
					case NativeKeyEvent.VC_8:
						robot.keyPress(KeyEvent.VK_7);
						break;
				
					case NativeKeyEvent.VC_9:
						robot.keyPress(KeyEvent.VK_J);
						break;
				
					case NativeKeyEvent.VC_A:
						robot.keyPress(KeyEvent.VK_3);
						break;
						
					case NativeKeyEvent.VC_B:
						robot.keyPress(KeyEvent.VK_O);
						break;
						
					case NativeKeyEvent.VC_C:
						robot.keyPress(KeyEvent.VK_E);
						break;
						
					case NativeKeyEvent.VC_D:
						robot.keyPress(KeyEvent.VK_P);
						break;
						
					case NativeKeyEvent.VC_E:
						robot.keyPress(KeyEvent.VK_4);
						break;
						
					case NativeKeyEvent.VC_F:
						robot.keyPress(KeyEvent.VK_K);
						break;
						
					case NativeKeyEvent.VC_G:
						robot.keyPress(KeyEvent.VK_6);
						break;
						
					case NativeKeyEvent.VC_H:
						robot.keyPress(KeyEvent.VK_B);
						break;
						
					case NativeKeyEvent.VC_I:
						robot.keyPress(KeyEvent.VK_1);
						break;
						
					case NativeKeyEvent.VC_J:
						robot.keyPress(KeyEvent.VK_S);
						break;
						
					case NativeKeyEvent.VC_K:
						robot.keyPress(KeyEvent.VK_U);
						break;
						
					case NativeKeyEvent.VC_L:
						robot.keyPress(KeyEvent.VK_A);
						break;
						
					case NativeKeyEvent.VC_M:
						robot.keyPress(KeyEvent.VK_T);
						break;	
						
					case NativeKeyEvent.VC_N:
						robot.keyPress(KeyEvent.VK_F);
						break;
						
					case NativeKeyEvent.VC_O:
						robot.keyPress(KeyEvent.VK_0);
						break;	
						
					case NativeKeyEvent.VC_P:
						robot.keyPress(KeyEvent.VK_V);
						break;
						
					case NativeKeyEvent.VC_Q:
						robot.keyPress(KeyEvent.VK_H);
						break;	
						
					case NativeKeyEvent.VC_R:
						robot.keyPress(KeyEvent.VK_C);
						break;	
						
					case NativeKeyEvent.VC_S:
						robot.keyPress(KeyEvent.VK_G);
						break;
						
					case NativeKeyEvent.VC_T:
						robot.keyPress(KeyEvent.VK_Y);
						break;
						
					case NativeKeyEvent.VC_U:
						robot.keyPress(KeyEvent.VK_8);
						break;
						
					case NativeKeyEvent.VC_W:
						robot.keyPress(KeyEvent.VK_Q);
						break;
						
					case NativeKeyEvent.VC_X:
						robot.keyPress(KeyEvent.VK_Z);
						break;
						
					case NativeKeyEvent.VC_Y:
						robot.keyPress(KeyEvent.VK_D);
						break;
						
					case NativeKeyEvent.VC_Z:
						robot.keyPress(KeyEvent.VK_L);
						break;
				}
			} catch (AWTException e) {
				e.printStackTrace();
			}
	}
}
