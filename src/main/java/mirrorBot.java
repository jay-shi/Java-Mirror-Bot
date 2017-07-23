import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import org.jnativehook.mouse.NativeMouseEvent;
import org.jnativehook.mouse.NativeMouseInputListener;

public class MirrorBot implements NativeKeyListener{
	
	public void nativeKeyPressed(NativeKeyEvent event){
		
		System.out.println("Key Pressed: " + NativeKeyEvent.getKeyText(event.getKeyCode()));

		if (event.getKeyCode() == NativeKeyEvent.VC_ESCAPE) {
			try {
				GlobalScreen.unregisterNativeHook();
			} catch (NativeHookException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void nativeKeyReleased(NativeKeyEvent event) {
		System.out.println("Key Released: " + NativeKeyEvent.getKeyText(event.getKeyCode()));
	}

	public static void main(String[] args) {
		try{
			
			GlobalScreen.registerNativeHook();
		}catch(NativeHookException error){
			
			System.err.println("failed registering native hook");
			System.err.println(error.getMessage());
			
			System.exit(2);
		}
		
		GlobalScreen.addNativeKeyListener(new MirrorBot());
		
		
		
	}

	public void nativeKeyTyped(NativeKeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
