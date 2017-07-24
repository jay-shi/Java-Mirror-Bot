import java.awt.AWTException;
import java.awt.Robot;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import org.jnativehook.mouse.NativeMouseEvent;
import org.jnativehook.mouse.NativeMouseInputListener;


public class MirrorBot implements NativeKeyListener, NativeMouseInputListener{
	
	public void nativeKeyPressed(NativeKeyEvent event){
		
		System.out.println("Key Pressed: " + NativeKeyEvent.getKeyText(event.getKeyCode()));

		if (event.getKeyCode() == NativeKeyEvent.VC_ESCAPE) {
			try {
				
				GlobalScreen.unregisterNativeHook();
				
				System.out.println("Stop tracking");
				
				
			} catch (NativeHookException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void nativeKeyReleased(NativeKeyEvent event) {
		
		System.out.println("Key Released: " + NativeKeyEvent.getKeyText(event.getKeyCode()));
		System.out.println(event.getKeyCode());
		
		

		
	}
	
	
	

	public static void main(String[] args) throws AWTException {
		try{
			
			GlobalScreen.registerNativeHook();
		}catch(NativeHookException error){
			
			System.err.println("failed registering native hook");
			System.err.println(error.getMessage());
			
			System.exit(2);
		}
		
		MirrorBot input = new MirrorBot();
		
		GlobalScreen.addNativeKeyListener(new MirrorBot());
		GlobalScreen.addNativeMouseListener(input);
		
		// Get the logger for "org.jnativehook" and set the level to off.
		Logger logger = Logger.getLogger(GlobalScreen.class.getPackage().getName());
		logger.setLevel(Level.OFF);

		// Don't forget to disable the parent handlers.
		logger.setUseParentHandlers(false);
		
		//initiate robot as test
		Robot robot = new Robot();
		
		robot.mouseMove(0, 0);
		
		
	}

	public void nativeKeyTyped(NativeKeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void nativeMouseClicked(NativeMouseEvent arg0) {
		Robot robot;
		
		try {
			robot = new Robot();
			
			robot.keyPress(83);
			System.out.println("sdkj");
			robot.keyRelease(83);
			
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public void nativeMousePressed(NativeMouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void nativeMouseReleased(NativeMouseEvent event) {
		
		System.out.println("Mouse Released: " + event.getButton());
		
	}

	public void nativeMouseDragged(NativeMouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void nativeMouseMoved(NativeMouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
