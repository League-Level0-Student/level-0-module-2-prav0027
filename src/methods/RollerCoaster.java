package methods;

import javax.swing.JOptionPane;

public class RollerCoaster {
	public static void main(String[] args) {
		String height = JOptionPane.showInputDialog("How tall are you, in inches?");
		int num = Integer.parseInt(height);
		if (num > 48) {
			JOptionPane.showMessageDialog(null, "You can go on the rollercoaster!");
		}
		if (num < 49) {
			JOptionPane.showMessageDialog(null, "You have to grow first, before you can go on the rollercaoster!");
		}

	}
}
