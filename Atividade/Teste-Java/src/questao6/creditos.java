package questao6;

import java.util.Scanner;

public class creditos {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		float limite, saldo, limite2 = 0;
		int conta;
		
		for(int controle=0; controle<4;controle++)
		{
		System.out.printf("\n\nNúmero de conta: ");
		conta = input.nextInt();
		System.out.printf("Limite de crédito antes da recessão: ");
		limite = input.nextFloat();
		System.out.printf("Saldo atual: ");
		saldo = input.nextFloat();
		
		if(limite==2000)
		{
			System.out.printf("\nNovo limite = R$1000,00 ");
			limite2=1000;
		}
		else
		{
			if(limite==5000)
			{
				System.out.printf("\nNovo limite = R$2500,00 ");
				limite2=2500;
			}
			else
			{
				System.out.printf("\nLimite inexistente ");
			}
		}
		if(saldo>limite2)
		{
			System.out.printf("\nSaldo superior ao novo ");
		}
		else
		{
			System.out.printf("\nSaldo inferior ao novo ");
		}
		}	

	}

}
