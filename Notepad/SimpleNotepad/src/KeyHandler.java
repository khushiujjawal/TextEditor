import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{
	GUI gui;
	public KeyHandler(GUI gui) {
		this.gui=gui;
	}
	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.isControlDown()&& e.getKeyCode()==KeyEvent.VK_S)
		{
			gui.file.save();
		}
		if(e.isShiftDown() &&e.isControlDown()&& e.getKeyCode()==KeyEvent.VK_S)
		{
			gui.file.saveAs();
		}
		if(e.isControlDown()&& e.getKeyCode()==KeyEvent.VK_Z)
		{
			gui.edit.undo();
		}
		if(e.isControlDown()&& e.getKeyCode()==KeyEvent.VK_Y)
		{
			gui.edit.redo();
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
	
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		 
		
	}

	
}
