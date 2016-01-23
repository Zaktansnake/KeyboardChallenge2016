import org.jnativehook.keyboard.NativeKeyEvent;

public class Easy {

	public static void process(int keyEvent) {
		switch(keyEvent) {
			case NativeKeyEvent.VC_Q:
				System.out.print("Q");
				break;
				
		}
	}
	
}
