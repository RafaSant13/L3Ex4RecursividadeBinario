package view;
import javax.swing.JOptionPane;

import controller.BinarioControle;

public class Principal {

	public static void main(String[] args) {
		BinarioControle BC = new BinarioControle();
		int N = 25;
		if (N >2000)
		{
			JOptionPane.showMessageDialog(null, "Vari�vel estourou");
			System.exit(0);
		}
		
		System.out.println(N+" em bin�rio � "+BC.Binario(N));

	}

}
