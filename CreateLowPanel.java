package MineSweeper;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;


public class CreateLowPanel extends JPanel{
	int bombNumber = 10;
	int gridColumn = 9;
	int gridRow = 9;
	int width = getWidth()/gridColumn;
	int height = getHeight()/gridRow;
	BombButtons[][] buttons;
	
	public CreateLowPanel(){
		
		this.setSize(new Dimension(gridColumn*width,gridRow*height));
		this.setLayout(new GridLayout(gridColumn, gridRow));
		buttons = new BombButtons[gridColumn][gridRow];
		this.addButtons();
		
		ActionListener taskPerformer = new ActionListener() {  
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
            };
            
        Timer timer = new Timer( 100 , taskPerformer);
        timer.setRepeats(false);
        timer.start();
        
        repaint();
	}
	
	public void addButtons(){
		for(int i=0; i<gridColumn; i++){
			for(int j=0; j<gridRow; j++){
				buttons[i][j] = new BombButtons();
				buttons[i][j].setPreferredSize(new Dimension(width, height));
				this.add(buttons[i][j]);
			}
		}
	}
	
	/*
	public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(Color.black);
        
        int linesInCloumn = this.gridColumn;
        int linesInRow = this.gridRow;
        
        int linesWitdhInColumn = this.getWidth()/linesInCloumn;
        int linesHeightInRow = this.getHeight()/linesInRow;
        
        for(int i = 0; i < linesInRow; i++){
       		 g2d.drawLine(0, i*linesHeightInRow, getWidth(), i*linesHeightInRow);
       		 for(int j = 0; j< linesInCloumn; j++){
       			 g2d.drawLine(j*linesWitdhInColumn, 0, j*linesWitdhInColumn, getHeight());
       		 }
        }
        
    }
    */
	
}
