package animation;

import java.awt.Dimension;

import javax.swing.JFrame;

public class MainClass {
	
	private static final int EXIT_ON_CLOSE = 0;
	public static void main(String[] args) {
		
		MyVillage azaz=new MyVillage();
		JFrame frame=new JFrame("Animation");
		
		//frame.setResizable(false);
		frame.setContentPane(azaz);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}

}
