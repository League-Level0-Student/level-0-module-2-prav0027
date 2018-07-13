package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {
		int r = 0;
		Random gen = new Random();
		r = gen.nextInt(9);
		int a = 0;
		Random agen = new Random();
		a = agen.nextInt(9);
		int b = 0;
		Random bgen = new Random();
		b = bgen.nextInt(9);
		int c = 0;
		Random cgen = new Random();
		c = cgen.nextInt(9);
		int d = 0;
		Random dgen = new Random();
		d = dgen.nextInt(9);
		JOptionPane.showMessageDialog(null, r + " " + a + " " + b + " " + c + " " + d);
	}
}
