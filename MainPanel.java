package MineSweeper;
import java.awt.BorderLayout;
import java.awt.Graphics;
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
import javax.swing.border.Border;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class MainPanel extends JPanel{
	CreateUpperPanel upperPanel;
	CreateLowPanel lowPanel; 
	
	JMenuBar menuBar;
    JMenu menu, submenu;
    JMenuItem menuItem;
    
    public MainPanel(){
		upperPanel = new CreateUpperPanel();
		lowPanel = new CreateLowPanel();
		
		this.setLayout(new GridLayout(2,1));
		
		this.add(upperPanel);
		this.add(lowPanel);

	}
	
	public JMenuBar createFileMenu(){
		
        //Create the menu bar.
        menuBar = new JMenuBar();
 
        //Build the first menu.
        menu = new JMenu("File");
        menuBar.add(menu);
 
        //a group of JMenuItems
        menuItem = new JMenuItem("Open");
        menuItem.getAccessibleContext().setAccessibleDescription("Open an existing file");
        menu.add(menuItem);
 
        menuItem = new JMenuItem("Save");
        menuItem.getAccessibleContext().setAccessibleDescription("Save this file");
        menu.add(menuItem);
 
        menuItem = new JMenuItem("Exit");
        menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
        menuItem.getAccessibleContext().setAccessibleDescription("Exit the game");
        menu.add(menuItem);
        
 
        //Build second menu in the menu bar.
        menu = new JMenu("Select Game");
        menuBar.add(menu);
       
        
        submenu = new JMenu("Types");
        menuItem = new JMenuItem(TypeOfMenu.ONE.toString());
        menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lowPanel.bombNumber = 10;
				lowPanel.gridColumn = 9;
				lowPanel.gridRow = 9;	
			}
		});
        submenu.add(menuItem);
         
        menuItem = new JMenuItem(TypeOfMenu.TWO.toString());
        menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lowPanel.bombNumber = 40;
				lowPanel.gridColumn = 16;
				lowPanel.gridRow = 16;	
			}
		});
        submenu.add(menuItem);
        
        menuItem = new JMenuItem(TypeOfMenu.THREE.toString());
        menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lowPanel.bombNumber = 99;
				lowPanel.gridColumn = 16;
				lowPanel.gridRow = 30;
			}
		});
        submenu.add(menuItem);
        menu.add(submenu);
        
        return menuBar;
	}
}
