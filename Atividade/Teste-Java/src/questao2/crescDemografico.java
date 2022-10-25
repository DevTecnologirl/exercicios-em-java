package questao2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class crescDemografico 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		long populacao = (long) 7.8e9;
		float cresd = (float) 0.011;
		float um,dois,tres,quatro,cinco;
		
		um = (float) (populacao+(populacao*cresd));
		dois = (float) (um+(um*cresd));
		tres = (float) (dois+(dois*cresd));
		quatro = (float) (tres+(tres*cresd));
		cinco = (float) (quatro+(quatro*cresd));
		
		 System.out.printf("População mundial estimada depois de 1 ano = %.2f\n",um);
		 System.out.printf("População mundial estimada depois de 2 anos = %.2f\n",dois);
		 System.out.printf("População mundial estimada depois de 3 anos = %.2f\n",tres);
		 System.out.printf("População mundial estimada depois de 4 anos = %.2f\n",quatro);
		 System.out.printf("População mundial estimada depois de 5 anos = %.2f\n",cinco);
	}
	

}
