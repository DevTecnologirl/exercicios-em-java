package questao5;

import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class combustivel {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		float qdirigidos, quantLitros, consumo;
		
		System.out.printf("Número de quilômetros dirigidos: ");
		qdirigidos = input.nextInt();
		System.out.printf("Quantidade de litros obtidos a cada abastecimento: ");
		quantLitros = input.nextInt();
		
		consumo = qdirigidos/quantLitros;
		System.out.printf("Consumo atual = %.2f\n",consumo);
	
	}

}
