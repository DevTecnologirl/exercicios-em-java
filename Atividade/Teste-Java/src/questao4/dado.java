package questao4;

import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class dado {

	public static void main(String[] args) 
	{
		Random r = new Random(); 
		int dados[] = new int[6];
		int lancamentos = Integer.parseInt(JOptionPane.showInputDialog("Lançamento de dados:"));
		for(int x = 0; x < lancamentos; x += 1) {
			int face = r.nextInt(6);
			dados[face] += 1;
		}
		String saida = "Face\tOcorrências\tPercentual";
		for(int x = 0; x <6; x += 1) {
			double percentual = 100 * dados[x];
			percentual /= lancamentos;
			saida += "\n" + (x + 1) + "\t" + dados[x] + "\t" + String.format("%.2f", percentual) + "%";
		}
		saida += "\n\nTotal de Lançamentos: " + lancamentos + "\t";
		JTextArea output = new JTextArea();
		output.setText(saida);
		output.setEditable(false);
		JOptionPane.showMessageDialog(null, output, "Lançamento de Dado", JOptionPane.INFORMATION_MESSAGE);
		

	}

}
