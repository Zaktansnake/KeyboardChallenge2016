import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.jnativehook.keyboard.NativeKeyEvent;

import com.sun.glass.events.KeyEvent;

public class Hard {
	private ArrayList<Integer> solution;
	
	public Hard() {
		
		solution = new ArrayList<Integer>();
	
		for (int i=48; i <=57 ; i++) {
			solution.add(i);
		}
		for (int i=65; i <=90 ; i++) {
			solution.add(i);
		}
		
		Runnable shuffleRunnable = new Runnable() {
			public void run() {
				Collections.shuffle(solution);
			}
		};
		
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(shuffleRunnable, 0, 10, TimeUnit.SECONDS);
	}
	
	public void process(int keyEvent) {
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_BACKSPACE);
			switch(keyEvent) {
				case NativeKeyEvent.VC_ESCAPE:
					robot.keyPress(solution.get(0));
					break;
					
				case NativeKeyEvent.VC_0:
					robot.keyPress(solution.get(0));
					break;
			
				case NativeKeyEvent.VC_1:
					robot.keyPress(solution.get(1));
					break;
				
				case NativeKeyEvent.VC_2:
					robot.keyPress(solution.get(2));
					break;
			
				case NativeKeyEvent.VC_3:
					robot.keyPress(solution.get(3));
					break;
			
				case NativeKeyEvent.VC_4:
					robot.keyPress(solution.get(4));
					break;
			
				case NativeKeyEvent.VC_5:
					robot.keyPress(solution.get(5));
					break;
			
				case NativeKeyEvent.VC_6:
					robot.keyPress(solution.get(6));
					break;
			
				case NativeKeyEvent.VC_7:
					robot.keyPress(solution.get(7));
					break;
			
				case NativeKeyEvent.VC_8:
					robot.keyPress(solution.get(8));
					break;
			
				case NativeKeyEvent.VC_9:
					robot.keyPress(solution.get(9));
					break;
			
				case NativeKeyEvent.VC_A:
					robot.keyPress(solution.get(10));
					break;
					
				case NativeKeyEvent.VC_B:
					robot.keyPress(solution.get(11));
					break;
					
				case NativeKeyEvent.VC_C:
					robot.keyPress(solution.get(12));
					break;
					
				case NativeKeyEvent.VC_D:
					robot.keyPress(solution.get(13));
					break;
					
				case NativeKeyEvent.VC_E:
					robot.keyPress(solution.get(14));
					break;
					
				case NativeKeyEvent.VC_F:
					robot.keyPress(solution.get(15));
					break;
					
				case NativeKeyEvent.VC_G:
					robot.keyPress(solution.get(16));
					break;
					
				case NativeKeyEvent.VC_H:
					robot.keyPress(solution.get(17));
					break;
					
				case NativeKeyEvent.VC_I:
					robot.keyPress(solution.get(18));
					break;
					
				case NativeKeyEvent.VC_J:
					robot.keyPress(solution.get(19));
					break;
					
				case NativeKeyEvent.VC_K:
					robot.keyPress(solution.get(20));
					break;
					
				case NativeKeyEvent.VC_L:
					robot.keyPress(solution.get(21));
					break;
					
				case NativeKeyEvent.VC_M:
					robot.keyPress(solution.get(22));
					break;	
					
				case NativeKeyEvent.VC_N:
					robot.keyPress(solution.get(23));
					break;
					
				case NativeKeyEvent.VC_O:
					robot.keyPress(solution.get(24));
					break;	
					
				case NativeKeyEvent.VC_P:
					robot.keyPress(solution.get(25));
					break;
					
				case NativeKeyEvent.VC_Q:
					robot.keyPress(solution.get(26));
					break;	
					
				case NativeKeyEvent.VC_R:
					robot.keyPress(solution.get(27));
					break;	
					
				case NativeKeyEvent.VC_S:
					robot.keyPress(solution.get(28));
					break;
					
				case NativeKeyEvent.VC_T:
					robot.keyPress(solution.get(29));
					break;
					
				case NativeKeyEvent.VC_U:
					robot.keyPress(solution.get(30));
					break;
				
				case NativeKeyEvent.VC_V:
					robot.keyPress(solution.get(31));
					break;
					
				case NativeKeyEvent.VC_W:
					robot.keyPress(solution.get(32));
					break;
					
				case NativeKeyEvent.VC_X:
					robot.keyPress(solution.get(33));
					break;
					
				case NativeKeyEvent.VC_Y:
					robot.keyPress(solution.get(34));
					break;
					
				case NativeKeyEvent.VC_Z:
					robot.keyPress(solution.get(35));
					break;
			}
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
}
