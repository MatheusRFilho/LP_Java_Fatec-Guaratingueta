
import java.util.Scanner;
class exer22{
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
		int maior=0,valor=0,codigo=0; 
		double valortotal=0;

		
			
		for(int contador=1;contador<=15;contador++)
		{
				System.out.println("Digite o codigo");
				codigo=scanner.nextInt();
				System.out.println("Digite o valor");
				valor=scanner.nextInt();

				if(valor>maior)
				{
					maior=valor;
				}
				valortotal+=valor;
		}
		valortotal=valortotal/15;
		System.out.println("O maior numero e "+maior);
		System.out.println("A media  e "+valortotal);
}
}