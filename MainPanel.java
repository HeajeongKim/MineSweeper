package MineSweeper;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class MainPanel extends JPanel{
	CreateUpperPanel upperPanel;
	JPanel lowPanel; 
	
	public MainPanel(){
		upperPanel = new CreateUpperPanel();
		lowPanel = new JPanel();
		
		
	}
	
	
	
	private void createLowPanel(){
		
	}

}