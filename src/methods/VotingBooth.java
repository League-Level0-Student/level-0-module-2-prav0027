package methods;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String years = JOptionPane.showInputDialog("How old are you?");
		int num = Integer.parseInt(years);
		if (num < 18) {
			JOptionPane.showMessageDialog(null, "Nobody cares what you think!");
		}
		if (num > 17) {
			JOptionPane.showInputDialog("Who do you think should be president?");
		}
	}
}
