package base;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.swing.JOptionPane;

/**
 * 
 * @author ely
 * 
 *
 */
public class Janela1 {

	public static void main(String[] args) 
			throws IOException, InterruptedException, LineUnavailableException {

		String frequency=JOptionPane.showInputDialog(
				null, "Qual Frequencia?", "...", JOptionPane.PLAIN_MESSAGE); 
		
		String tempo=JOptionPane.showInputDialog(
				null, "Qual tempo?", "...", JOptionPane.PLAIN_MESSAGE); 
		
		int frequencyInt=Integer.parseInt(frequency);
		int tempoInt = Integer.parseInt(tempo);
		tempoInt = tempoInt * 1000;
		
		if (5000 > frequencyInt && frequencyInt > 100) {
			SoundUtils.tone(frequencyInt,tempoInt);
			Thread.sleep(50);
			System.out.println("deu som");
		} else {
			System.out.println("nao deu som");
		}
	}
}
