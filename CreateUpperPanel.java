package MineSweeper;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class CreateUpperPanel extends JPanel{

	public CreateUpperPanel() {
		this.setLayout(new GridLayout(3,1));
		
	}


	private JComponent createSmileButton(){
		BufferedImage buttonIcon = null;
		try {
			buttonIcon = ImageIO.read(new File("smile.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JButton button = new JButton(new ImageIcon(buttonIcon));
		return button;
	}
	
}
