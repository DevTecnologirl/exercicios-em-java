package questao3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class economia {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		float kmpdia = 0, precoplitro = 0, kmplitro = 0, taxaspdia = 0 , pedagio = 0;
		float gastoTotal, gastoPercapita;
		
		System.out.printf("Quilômetros totais dirigidos por dia: ");
		kmpdia = input.nextFloat();
		System.out.printf("Preço por litro de gasolina: ");
		precoplitro = input.nextFloat();
		System.out.printf("Quilômetros médios por litro:  ");
		kmplitro = input.nextFloat();
		System.out.printf("Taxas de estacionamento por dia:");
		taxaspdia = input.nextFloat();
		System.out.printf("Pedágio por dia:");
		pedagio = input.nextFloat();
		
		gastoTotal = (kmpdia / kmplitro) * (precoplitro + taxaspdia + pedagio);
		
		 System.out.printf("Custo por dia = %.2f\n",gastoTotal);
		}
		
	
	}


