package MineSweeper;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BombButtons extends JButton implements MouseListener {

	public BombButtons() {
		this.addMouseListener(this);
	}

	private static BufferedImage resizeImage(BufferedImage originalImage,
			int type, Integer img_width, Integer img_height) {
		BufferedImage resizedImage = new BufferedImage(img_width, img_height,
				type);
		Graphics2D g = resizedImage.createGraphics();
		g.drawImage(originalImage, 0, 0, img_width, img_height, null);
		g.dispose();

		return resizedImage;
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		
			try {

				BufferedImage originalImage = ImageIO.read(getClass()
						.getResource("bomb.png"));
				BufferedImage resizeImageJpg = resizeImage(originalImage,
						BufferedImage.TYPE_INT_ARGB, 15, 15);

				this.setIcon(new ImageIcon(resizeImageJpg));
			} catch (IOException ex) {

			}
		

			try {

				BufferedImage originalImage = ImageIO.read(getClass()
						.getResource("flag.png"));
				BufferedImage resizeImageJpg = resizeImage(originalImage,
						BufferedImage.TYPE_INT_ARGB, 15, 15);

				this.setIcon(new ImageIcon(resizeImageJpg));
			} catch (IOException ex) {

			}
		

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// change the colour

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
