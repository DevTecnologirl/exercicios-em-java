package questao1;
import java.util.Scanner;
public class circulo 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		int raio;
		float diametro, circ, area;
		
		System.out.printf("Informe o raio: ");
        raio = input.nextInt();
       
       diametro = 2*raio;
       circ = (float) (2*3.14159*raio);
       area = (float) (3.14159*(raio*raio));
        
        System.out.printf("Diametro do circulo = %.2f\n",diametro);
        System.out.printf("Circunferencia do circulo= %.2f\n",circ);
        System.out.printf("Area = %.2f", area);
	}

}
