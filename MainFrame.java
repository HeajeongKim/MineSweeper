package MineSweeper;
import java.awt.*;

import javax.swing.*;

public class MainFrame {
	
public static void createNewFrame(){
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(new Dimension(170,100));
	
	MainPanel panel = new MainPanel();
	frame.getContentPane().add(panel);
	frame.setJMenuBar(panel.createFileMenu());
	
	frame.pack();
	frame.setVisible(true);
}

public static void main(String[] args){
	javax.swing.SwingUtilities.invokeLater(new Runnable(){
		@Override
		public void run() {
			createNewFrame();
		}
	});
}

}
