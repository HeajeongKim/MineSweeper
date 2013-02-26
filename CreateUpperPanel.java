package MineSweeper;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

public class CreateUpperPanel extends JPanel implements ActionListener {

	int index = 0;
	int bombNumber = 10;
	int gridColumn = 9;
	int gridRow = 9;

	public CreateUpperPanel() {
		String[] options = { "10 bombs(9*9)", "40 bombs(16*16)",
				"99 bombs(16*30)" };

		JComboBox list = new JComboBox(options);
		list.setSelectedIndex(0);
		list.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JComboBox cb = (JComboBox) e.getSource();
		int newSelection = cb.getSelectedIndex();

		switch (newSelection) {
		case 0:
			bombNumber = 10;
			gridColumn = 9;
			gridRow = 9;
			break;
		case 1:
			bombNumber = 40;
			gridColumn = 16;
			gridRow = 16;
			break;
		case 2:
			bombNumber = 99;
			gridColumn = 16;
			gridRow = 30;
			break;
		}
		
	}

}
