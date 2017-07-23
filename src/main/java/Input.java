import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import org.jnativehook.mouse.NativeMouseEvent;
import org.jnativehook.mouse.NativeMouseInputListener;

public class Input implements NativeMouseInputListener, NativeKeyListener {
	
	Input(){
		
		try{
			
			System.out.println("registering native hook");
			
			GlobalScreen.registerNativeHook();
			
			System.out.println("registering success");
			
		}catch(NativeHookException error){
			
			System.err.println("problem with registering the native hook ");
			System.err.println(error.getMessage());
			System.exit(1);
		}
		
		GlobalScreen.addNativeKeyListener(new Input());
	}
	
	public void nativeKeyPressed(NativeKeyEvent e){
		
		if(e.getKeyCode() == NativeKeyEvent.VC_ESCAPE)
			try {
				GlobalScreen.unregisterNativeHook();
			} catch (NativeHookException e1) {
				// TODO Auto-generated catch block
				System.err.println("problem with unregistering native hook");
				e1.printStackTrace();
			}
		
	}
	
	public void nativeKeyReleased(NativeKeyEvent e){
		
		System.out.println("jkey released: "+ NativeKeyEvent.getKeyText(e.getKeyCode()));
		System.out.println("jkey released: "+ e.getKeyCode());
	}
	
	public void nativeMousePressed(NativeMouseEvent e){
		
		
	}
	
	public void nativeMouseDragged(NativeMouseEvent e){
		
		
	}

	public void nativeMouseClicked(NativeMouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void nativeMouseReleased(NativeMouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void nativeMouseMoved(NativeMouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void nativeKeyTyped(NativeKeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
